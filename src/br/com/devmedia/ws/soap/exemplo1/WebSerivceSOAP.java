package br.com.devmedia.ws.soap.exemplo1;

import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

@WebService
public class WebSerivceSOAP {
	
	@WebMethod
	/**
	 * WebMethod indica que o m�todo vai ser publicado, n�o � obrigat�rio, se n�o colocar
	 * o m�todo vai ser publicado automaticamente, mas se quiser n�o publicar, � 
	 * s� setar o exclude para true
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
	
	private Integer getAgeteste(){
		return new Random().nextInt();
	}
}
