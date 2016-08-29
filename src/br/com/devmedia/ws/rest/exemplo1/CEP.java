package br.com.devmedia.ws.rest.exemplo1;

import java.io.Serializable;

public class CEP implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	private String estado;
	
	public CEP() {
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
