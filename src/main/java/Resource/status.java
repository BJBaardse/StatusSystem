package Resource;

import Services.ServiceCommunication;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("check")

public class status {

    @Inject
    private ServiceCommunication serviceCommunication;

    @GET
    public Response all() {
        return Response.ok(serviceCommunication.statusRegistreren(), MediaType.APPLICATION_JSON).build();
    }

}
