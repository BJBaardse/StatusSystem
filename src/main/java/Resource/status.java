package Resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("check")

public class status {


    @GET
    public Response all() {
        return Response.ok("Op deze manier kun je wel data returnen", MediaType.APPLICATION_JSON).build();
    }

}
