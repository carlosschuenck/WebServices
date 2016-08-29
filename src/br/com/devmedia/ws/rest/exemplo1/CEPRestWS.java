package br.com.devmedia.ws.rest.exemplo1;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("ceprest")
public class CEPRestWS {
	
	@Context
	private UriInfo context;
	
	public CEPRestWS() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getCep/{cep}")
	public CEP getCep(@PathParam("cep") String cep){
		CEP cepReturn = new CEP();
		System.out.println("CEP: "+cep);
		if("24466142".equals(cep)){
			cepReturn.setBairro("Boa Vista");
			cepReturn.setEstado("Rio de Janeiro");
			cepReturn.setNumero(3930);
			cepReturn.setRua("Av. Joaquim de Oliveira");
			cepReturn.setCep(cep);
		}else{
			cepReturn.setBairro("Bairro");
			cepReturn.setEstado("Estado");
			cepReturn.setNumero(new Random().nextInt());
			cepReturn.setRua("Av. Rua");
			cepReturn.setCep(cep);
		}
		return cepReturn;
	}
	
	
}
