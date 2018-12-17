package com.bitctrl.bccms.json.api;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

@Path("/servicepoints")
public interface Servicepoints {
  /**
   */
  @GET
  @Produces("application/json")
  GetServicepointsResponse getServicepoints(@QueryParam("offset") @DefaultValue("0") int offset,
      @QueryParam("limit") @DefaultValue("0") int limit);

  /**
   */
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  PostServicepointsResponse postServicepoints(@Valid ServicePoint entity);

  /**
   */
  @GET
  @Path("/{id}")
  @Produces("application/json")
  GetServicepointsByIdResponse getServicepointsById(@PathParam("id") String id);

  /**
   */
  @DELETE
  @Path("/{id}")
  DeleteServicepointsByIdResponse deleteServicepointsById(@PathParam("id") String id);

  /**
   */
  @GET
  @Path("/filter")
  @Produces("application/json")
  GetServicepointsFilterResponse getServicepointsFilter(
      @QueryParam("fromDate") @Valid Date fromDate, @QueryParam("toDate") @Valid Date toDate,
      @QueryParam("offset") @DefaultValue("0") int offset,
      @QueryParam("limit") @DefaultValue("0") int limit);

  class PostServicepointsResponse extends ResponseDelegate {
    private PostServicepointsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostServicepointsResponse(Response response) {
      super(response);
    }

    public static PostServicepointsResponse respond200WithApplicationJson(ServicePoint entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostServicepointsResponse(responseBuilder.build(), entity);
    }

    public static PostServicepointsResponse respond201WithApplicationJson(ServicePoint entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new PostServicepointsResponse(responseBuilder.build(), entity);
    }

    public static PostServicepointsResponse respond403() {
      Response.ResponseBuilder responseBuilder = Response.status(403);
      return new PostServicepointsResponse(responseBuilder.build());
    }
  }

  class GetServicepointsResponse extends ResponseDelegate {
    private GetServicepointsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetServicepointsResponse(Response response) {
      super(response);
    }

    public static GetServicepointsResponse respond200WithApplicationJson(
        List<ServicePoint> entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      GenericEntity<List<ServicePoint>> wrappedEntity = new GenericEntity<List<ServicePoint>>(entity){};
      responseBuilder.entity(wrappedEntity);
      return new GetServicepointsResponse(responseBuilder.build(), wrappedEntity);
    }
  }

  class GetServicepointsByIdResponse extends ResponseDelegate {
    private GetServicepointsByIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetServicepointsByIdResponse(Response response) {
      super(response);
    }

    public static GetServicepointsByIdResponse respond200WithApplicationJson(ServicePoint entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetServicepointsByIdResponse(responseBuilder.build(), entity);
    }
  }

  class DeleteServicepointsByIdResponse extends ResponseDelegate {
    private DeleteServicepointsByIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private DeleteServicepointsByIdResponse(Response response) {
      super(response);
    }

    public static DeleteServicepointsByIdResponse respond204() {
      Response.ResponseBuilder responseBuilder = Response.status(204);
      return new DeleteServicepointsByIdResponse(responseBuilder.build());
    }

    public static DeleteServicepointsByIdResponse respond403() {
      Response.ResponseBuilder responseBuilder = Response.status(403);
      return new DeleteServicepointsByIdResponse(responseBuilder.build());
    }
  }

  class GetServicepointsFilterResponse extends ResponseDelegate {
    private GetServicepointsFilterResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetServicepointsFilterResponse(Response response) {
      super(response);
    }

    public static GetServicepointsFilterResponse respond200WithApplicationJson(
        List<ServicePoint> entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      GenericEntity<List<ServicePoint>> wrappedEntity = new GenericEntity<List<ServicePoint>>(entity){};
      responseBuilder.entity(wrappedEntity);
      return new GetServicepointsFilterResponse(responseBuilder.build(), wrappedEntity);
    }
  }
}
