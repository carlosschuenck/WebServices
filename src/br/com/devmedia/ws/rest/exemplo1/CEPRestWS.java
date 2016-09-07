package br.com.devmedia.ws.rest.exemplo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.hibernate.validator.constraints.Length;

@Path("ceprest")
public class CEPRestWS {
	
	@Context
	private UriInfo context;
	
	public CEPRestWS() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getCep/{cep}")
	public CEP getCep(@CEPValido @PathParam("cep") String cep){
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("getCepByRua/{rua}")
	public List<CEP> getCepByRua(@PathParam("rua") String rua){
		List<CEP> listaCEP = new LinkedList<CEP>();
		
		for (int i = 0; i < 10; i++) {
			CEP cepReturn = new CEP();
			cepReturn.setBairro("Bairro "+new Random().nextInt());
			cepReturn.setEstado("RJ");
			cepReturn.setNumero(new Random().nextInt());
			cepReturn.setRua("Av. "+rua);
			cepReturn.setCep(String.valueOf(new Random().nextInt()));
			for (int j = 0; j < 5; j++) {
				CEP cepReturn2 = new CEP();
				cepReturn2.setBairro("Bairro "+new Random().nextInt());
				cepReturn2.setEstado("RJ");
				cepReturn2.setNumero(new Random().nextInt());
				cepReturn2.setRua("Av. "+rua);
				cepReturn2.setCep(String.valueOf(new Random().nextInt()));
				cepReturn.getCepsPorPerto().add(cepReturn2);
			}
			listaCEP.add(cepReturn);
		}
		return listaCEP;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("setCep")
	public void setCep(CEP cep){
		System.out.println(
				"CEP: "+cep.getCep()+
				"\nNUMERO: "+cep.getNumero()+
				"\nRUA: "+cep.getRua()+
				"\nBAIRRO: "+cep.getBairro()+
				"\nESTADO: "+cep.getEstado()
				);
	}
}
