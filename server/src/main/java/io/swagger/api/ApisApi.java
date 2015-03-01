package io.swagger.api;

import io.swagger.model.*;

import com.wordnik.swagger.annotations.*;
import com.sun.jersey.multipart.FormDataParam;

//import io.swagger.model.Object;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/apis")
@Api(value = "/apis", description = "the apis API")
public class ApisApi {
  
  @GET
  
  
  
  // Object
  @ApiOperation(value = "", notes = "Get a list of available APIs", response = Object.class, responseContainer = "List")
  @ApiResponses(value = {  })

  public Response apisGet(@ApiParam(value = "Size of array",required=true) @QueryParam("size") Double size)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  
  
  
  // Void
  @ApiOperation(value = "", notes = "Create a new API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisPost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{apiId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get details of an API", response = Void.class)
  @ApiResponses(value = {  })

  public Response apisApiIdGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @PUT
  @Path("/{apiId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Update an existing API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdPut()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @DELETE
  @Path("/{apiId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Delete an existing API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdDelete()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  @Path("/{apiId}/copy")
  
  
  // Void
  @ApiOperation(value = "", notes = "Create a new API by coping and existing", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdCopyPost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{apiId}/documents")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get a list of documents belonging to an API", response = Void.class)
  @ApiResponses(value = {  })

  public Response apisApiIdDocumentsGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  @Path("/{apiId}/documents")
  
  
  // Void
  @ApiOperation(value = "", notes = "Add a new document to an API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdDocumentsPost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @GET
  @Path("/{apiId}/documents/{documentId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Get the document details of an API", response = Void.class)
  @ApiResponses(value = {  })

  public Response apisApiIdDocumentsDocumentIdGet()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @PUT
  @Path("/{apiId}/documents/{documentId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Update document details", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdDocumentsDocumentIdPut()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @DELETE
  @Path("/{apiId}/documents/{documentId}")
  
  
  // Void
  @ApiOperation(value = "", notes = "Delete a document of an API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdDocumentsDocumentIdDelete()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
  @POST
  @Path("/{apiId}/lifecycle")
  
  
  // Void
  @ApiOperation(value = "", notes = "Change the lifecycle of an API", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid request or validation error") })

  public Response apisApiIdLifecyclePost()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
