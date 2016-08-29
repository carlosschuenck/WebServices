/**
 * WebSerivceSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devmedia.ws.soap.exemplo1;

public interface WebSerivceSOAP extends java.rmi.Remote {
    public java.lang.String ping(java.lang.String nome) throws java.rmi.RemoteException;
    public java.lang.Integer mostrarIdade() throws java.rmi.RemoteException;
    public java.lang.String[] getListarString() throws java.rmi.RemoteException;
    public br.com.devmedia.ws.soap.exemplo1.Carro[] getListarCarros() throws java.rmi.RemoteException;
}
