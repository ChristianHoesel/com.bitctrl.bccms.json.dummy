package com.bitctrl.bccms.json.api;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

@Path("/playersystemtyps")
public interface Playersystemtyps {
  /**
   */
  @GET
  @Produces("application/json")
  GetPlayersystemtypsResponse getPlayersystemtyps();

  /**
   */
  @GET
  @Path("/{id}")
  @Produces("application/json")
  GetPlayersystemtypsByIdResponse getPlayersystemtypsById(@PathParam("id") String id);

  class GetPlayersystemtypsResponse extends ResponseDelegate {
    private GetPlayersystemtypsResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetPlayersystemtypsResponse(Response response) {
      super(response);
    }

    public static GetPlayersystemtypsResponse respond200WithApplicationJson(
        List<PlayerSystemTyp> entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      GenericEntity<List<PlayerSystemTyp>> wrappedEntity = new GenericEntity<List<PlayerSystemTyp>>(entity){};
      responseBuilder.entity(wrappedEntity);
      return new GetPlayersystemtypsResponse(responseBuilder.build(), wrappedEntity);
    }
  }

  class GetPlayersystemtypsByIdResponse extends ResponseDelegate {
    private GetPlayersystemtypsByIdResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetPlayersystemtypsByIdResponse(Response response) {
      super(response);
    }

    public static GetPlayersystemtypsByIdResponse respond200WithApplicationJson(
        PlayerSystemTyp entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
      responseBuilder.entity(entity);
      return new GetPlayersystemtypsByIdResponse(responseBuilder.build(), entity);
    }
  }
}
