package io.swagger.api;

import io.swagger.model.*;

import com.wordnik.swagger.annotations.*;
import com.sun.jersey.multipart.FormDataParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/applications")
@Api(value = "/applications", description = "the applications API")
public class ApplicationsApi {
  
  @GET
  
  
  
  // Void
  @ApiOperation(value = "", notes = "Get a list of Applications created", response = Void.class)
  @ApiResponses(value = {  })

  public Response applicationsGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  
  
  
  // Void
  @ApiOperation(value = "", notes = "Create a new Application", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsPost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{applicationId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get Application details", response = Void.class)
  @ApiResponses(value = {  })

  public Response applicationsApplicationIdGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @PUT
  @Path("/{applicationId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Update application details", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsApplicationIdPut()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @DELETE
  @Path("/{applicationId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Remove and application", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsApplicationIdDelete()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{applicationId}/subscriptions")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get subscription list", response = Void.class)
  @ApiResponses(value = {  })

  public Response applicationsApplicationIdSubscriptionsGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  @Path("/{applicationId}/subscriptions")
  
  
  // Void
  @ApiOperation(value = "", notes = "Add a new subscription", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsApplicationIdSubscriptionsPost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{applicationId}/subscriptions/{subscriptionId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get subscription details", response = Void.class)
  @ApiResponses(value = {  })

  public Response applicationsApplicationIdSubscriptionsSubscriptionIdGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @PUT
  @Path("/{applicationId}/subscriptions/{subscriptionId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Update subscription details", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsApplicationIdSubscriptionsSubscriptionIdPut()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @DELETE
  @Path("/{applicationId}/subscriptions/{subscriptionId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Remove subscription", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response applicationsApplicationIdSubscriptionsSubscriptionIdDelete()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
