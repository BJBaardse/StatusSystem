package Resource;

import Services.ServiceCommunication;
import models.data;
import org.apache.avro.generic.GenericData;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("check")

public class status {

    @Inject
    private ServiceCommunication serviceCommunication;

    @GET
    public Response all() {
        List<data> datalist = new ArrayList<>(); //aanmaken lijst van statussen
        datalist.add(serviceCommunication.statusRegistreren()); // toevoegen lijst registreren
        datalist.add(serviceCommunication.statusFronendRegistreren());
        datalist.add(serviceCommunication.statusSimulatie());
        datalist.add(serviceCommunication.statusVerplaatsingsysteem());
        return Response.ok(datalist, MediaType.APPLICATION_JSON).build();
    }

}
