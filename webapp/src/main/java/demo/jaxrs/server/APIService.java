/*
 * Copyright 2011-2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package demo.jaxrs.server;

import java.util.*;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.api.APIProvider;
import org.wso2.carbon.apimgt.api.model.*;
import org.wso2.carbon.apimgt.impl.APIManagerFactory;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.wso2.carbon.apimgt.impl.utils.APIUtil;

@Path("/apis")
public class APIService {
    APIProvider provider;
    private static final Log log = LogFactory.getLog(APIService.class);

    public APIService() {
        try {
            provider = APIManagerFactory.getInstance().getAPIProvider("admin");
        } catch (Exception e) {
            System.out.println("Error while initializing API provider");
        }
    }

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAPI(@PathParam("id") String id) {
        log.info("Retrieving API for API-Id : " + id);
        String name = id.substring(0, id.indexOf("-"));
        String version = id.substring(id.indexOf("-") + 1, id.lastIndexOf("-"));
        String providerName = id.substring(id.lastIndexOf("-") + 1, id.length());
        APIIdentifier idAPI = new APIIdentifier(providerName, name, version);
        API apiToReturn = null;
        String swagger = "";
        try {
            apiToReturn = provider.getAPI(idAPI);
        } catch (APIManagementException e) {
            log.error("Error while getting API" + e.toString());
        }
        try {
            swagger = APIUtil.createSwaggerJSONContent(apiToReturn);
        } catch (APIManagementException e) {
            log.error("Error while generating swagger JSON from API" + e.toString());
        }
        return Response.ok(swagger).build();
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addAPI(API api) {
        try {
            provider.addAPI(api);
        } catch (Exception e) {
            System.out.print("Error while adding API");
        }
        return Response.ok(api).build();
    }

}