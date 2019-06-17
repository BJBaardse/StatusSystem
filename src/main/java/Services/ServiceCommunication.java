package Services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.data;

import javax.ejb.Stateless;

@Stateless
public class ServiceCommunication {
    public ServiceCommunication(){

    }
    public data statusRegistreren(){
        data returned;
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("http://192.168.25.110:8080/Registreren/status").asJson();
            returned = new data("Registreren", true, jsonResponse.getStatus(), jsonResponse.getRawBody().toString());
        } catch (UnirestException e) {
            e.printStackTrace();
            returned = new data("Registreren", false, 403, "Internal Exception, system could not be pinged");
        }

        return returned;
    }

}
