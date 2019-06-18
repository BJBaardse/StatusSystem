package Services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.webkit.WebPage;
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
            returned = new data("Registreren - ", true, jsonResponse.getStatus(), jsonResponse.getBody().toString(), "http://192.168.25.110:8081/");
        } catch (UnirestException e) {
            e.printStackTrace();
            returned = new data("Registreren", false, 403, "Internal Exception, system could not be pinged", "http://192.168.25.110:8081/");
        }

        return returned;
    }
    public data statusFronendRegistreren(){
        data returned;
        try {
            HttpResponse<String> jsonResponse = Unirest.get("http://192.168.25.110:8081/").asString();
            returned = new data("Registreren - frontend", true, jsonResponse.getStatus(), jsonResponse.getBody().toString(), "http://192.168.25.110:8081/");
        } catch (UnirestException e) {
            e.printStackTrace();
            returned = new data("Registreren", false, 403, "Internal Exception, system could not be pinged", "http://192.168.25.110:8081/");
        }

        return returned;
    }
    public data statusSimulatie(){
        data returned;
        try {
            HttpResponse<String> jsonResponse = Unirest.get("http://192.168.25.110:8081/").asString();
            returned = new data("Simulatie", true, jsonResponse.getStatus(), jsonResponse.getBody().toString(), "http://192.168.25.110:8083/");
        } catch (UnirestException e) {
            e.printStackTrace();
            returned = new data("Registreren", false, 403, "Internal Exception, system could not be pinged", "http://192.168.25.110:8083/");
        }

        return returned;
    }
    public data statusVerplaatsingsysteem(){
        data returned;
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("http://192.168.25.110:8080/VerplaatsingSysteem/status").asJson();
            returned = new data("Verplaatsing registratie ", true, jsonResponse.getStatus(), jsonResponse.getBody().toString(), "http://192.168.25.110:8082/");
        } catch (UnirestException e) {
            e.printStackTrace();
            returned = new data("Verplaatsing registratie ", false, 403, "Internal Exception, system could not be pinged", "http://192.168.25.110:8082/");
        }

        return returned;
    }

}
