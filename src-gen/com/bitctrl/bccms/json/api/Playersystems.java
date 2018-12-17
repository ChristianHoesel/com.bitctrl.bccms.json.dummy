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

@Path("/playersystems")
public interface Playersystems {
  /**
   */
  @GET
  @Produces("application/json")
  GetPlayersystemsResponse getPlayersystems(@QueryParam("offset") @DefaultValue("0") int offset,
      @QueryParam("limit") @DefaultValue("0") int limit);

  /**
   */
  @GET
  @Path("/{id}")
  @Produces("application/json")
  GetPlayersystemsByIdResponse getPlayersystemsById(@PathParam("id") String id);

  class GetPlayersystemsResponse extends ResponseDelegate {
    private GetPlayersystemsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetPlayersystemsResponse(Response response) {
      super(response);
    }

    public static GetPlayersystemsResponse respond200WithApplicationJson(
        List<PlayerSystem> entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      GenericEntity<List<PlayerSystem>> wrappedEntity = new GenericEntity<List<PlayerSystem>>(entity){};
      responseBuilder.entity(wrappedEntity);
      return new GetPlayersystemsResponse(responseBuilder.build(), wrappedEntity);
    }
  }

  class GetPlayersystemsByIdResponse extends ResponseDelegate {
    private GetPlayersystemsByIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetPlayersystemsByIdResponse(Response response) {
      super(response);
    }

    public static GetPlayersystemsByIdResponse respond200WithApplicationJson(PlayerSystem entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetPlayersystemsByIdResponse(responseBuilder.build(), entity);
    }
  }
}
