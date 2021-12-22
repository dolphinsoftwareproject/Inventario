package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;


@Path("recurso")
public class Recurso {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        return "Hola mundo desde API-RECURSO";
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
    }    
    
}
