package br.com.devmedia.ws.soap.exemplo1;

public class WebSerivceSOAPProxy implements br.com.devmedia.ws.soap.exemplo1.WebSerivceSOAP {
  private String _endpoint = null;
  private br.com.devmedia.ws.soap.exemplo1.WebSerivceSOAP webSerivceSOAP = null;
  
  public WebSerivceSOAPProxy() {
    _initWebSerivceSOAPProxy();
  }
  
  public WebSerivceSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebSerivceSOAPProxy();
  }
  
  private void _initWebSerivceSOAPProxy() {
    try {
      webSerivceSOAP = (new br.com.devmedia.ws.soap.exemplo1.WebSerivceSOAPServiceLocator()).getWebSerivceSOAPPort();
      if (webSerivceSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webSerivceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webSerivceSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webSerivceSOAP != null)
      ((javax.xml.rpc.Stub)webSerivceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.devmedia.ws.soap.exemplo1.WebSerivceSOAP getWebSerivceSOAP() {
    if (webSerivceSOAP == null)
      _initWebSerivceSOAPProxy();
    return webSerivceSOAP;
  }
  
  public java.lang.String ping(java.lang.String nome) throws java.rmi.RemoteException{
    if (webSerivceSOAP == null)
      _initWebSerivceSOAPProxy();
    return webSerivceSOAP.ping(nome);
  }
  
  public java.lang.Integer mostrarIdade() throws java.rmi.RemoteException{
    if (webSerivceSOAP == null)
      _initWebSerivceSOAPProxy();
    return webSerivceSOAP.mostrarIdade();
  }
  
  public java.lang.String[] getListarString() throws java.rmi.RemoteException{
    if (webSerivceSOAP == null)
      _initWebSerivceSOAPProxy();
    return webSerivceSOAP.getListarString();
  }
  
  public br.com.devmedia.ws.soap.exemplo1.Carro[] getListarCarros() throws java.rmi.RemoteException{
    if (webSerivceSOAP == null)
      _initWebSerivceSOAPProxy();
    return webSerivceSOAP.getListarCarros();
  }
  
  
}