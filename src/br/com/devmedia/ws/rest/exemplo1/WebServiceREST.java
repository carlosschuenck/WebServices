package br.com.devmedia.ws.rest.exemplo1;

import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("restws")
public class WebServiceREST {
	
    @Context
    private UriInfo context;

    public WebServiceREST() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of WebServiceREST
     * @return an instance of String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getXml() {
        // TODO return proper representation object
        return "MEU_PRIMEIRO_TESTE_REST";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("digaOla/{nome}")
    public String digaOla(@PathParam(value="nome") String nome) {
        return "Ola, "+nome;
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
    

}