package br.com.devmedia.ws.soap.exemplo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

@WebService
public class WebServiceSOAP {
	
	@WebMethod
	/**
	 * WebMethod indica que o método vai ser publicado, não é obrigatório, se não colocar
	 * o método vai ser publicado automaticamente, mas se quiser não publicar, é 
	 * só setar o exclude para true
	 * @param nome
	 * @return
	 */
	public String ping(@WebParam(name="nome") @NotNull String nome){
		return "Pong! : "+nome;
	}
	@WebMethod(operationName="MostrarIdade",exclude=false)
	public Integer getAge(){
		return new Random().nextInt();
	}
	
	public List<String> getListString(){
		List<String> lista = new LinkedList<String>();
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 4");
		
		return lista;
	}
	
	public List<Carro> getListCarro(){
		List<Carro> lista = new LinkedList<Carro>();
		Carro carro1 = new Carro();
		carro1.setCor(CorTipo.BRANCO);
		carro1.setMarca("MARCA CARRO 1");
		carro1.setNome("CARRO 1");
		
		Carro carro2 = new Carro();
		carro2.setCor(CorTipo.VERDE);
		carro2.setMarca("MARCA CARRO 2");
		carro2.setNome("CARRO 2");
		
		lista.add(carro1);
		lista.add(carro2);
		return lista;
	}
	
	
}
