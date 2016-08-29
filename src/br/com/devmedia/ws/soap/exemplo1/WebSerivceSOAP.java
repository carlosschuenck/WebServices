package br.com.devmedia.ws.soap.exemplo1;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

@WebService
public class WebSerivceSOAP {
	
	public String ping(@WebParam(name="nome") @NotNull String nome){
		return "Pong! : "+nome;
	}
}
