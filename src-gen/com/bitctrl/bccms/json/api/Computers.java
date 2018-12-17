package com.bitctrl.bccms.json.api;

import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

@Path("/computers")
public interface Computers {
  /**
   */
  @GET
  @Produces("application/json")
  GetComputersResponse getComputers(@QueryParam("offset") @DefaultValue("0") int offset,
      @QueryParam("limit") @DefaultValue("0") int limit);

  /**
   */
  @GET
  @Path("/{id}")
  @Produces("application/json")
  GetComputersByIdResponse getComputersById(@PathParam("id") String id);

  class GetComputersResponse extends ResponseDelegate {
    private GetComputersResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetComputersResponse(Response response) {
      super(response);
    }

    public static GetComputersResponse respond200WithApplicationJson(List<Computer> entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      GenericEntity<List<Computer>> wrappedEntity = new GenericEntity<List<Computer>>(entity){};
      responseBuilder.entity(wrappedEntity);
      return new GetComputersResponse(responseBuilder.build(), wrappedEntity);
    }
  }

  class GetComputersByIdResponse extends ResponseDelegate {
    private GetComputersByIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetComputersByIdResponse(Response response) {
      super(response);
    }

    public static GetComputersByIdResponse respond200WithApplicationJson(Computer entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetComputersByIdResponse(responseBuilder.build(), entity);
    }
  }
}
