package br.com.devmedia.ws.soap.exemplo1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Carro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement
	private String nome;
	@XmlElement
	private String marca;
	@XmlElement
	private CorTipo cor;
	
	public Carro() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public CorTipo getCor() {
		return cor;
	}
	public void setCor(CorTipo cor) {
		this.cor = cor;
	}
	
	
}
