package br.com.fiap.exemplos;

public class PrimeiroPortTypeProxy implements br.com.fiap.exemplos.PrimeiroPortType {
  private String _endpoint = null;
  private br.com.fiap.exemplos.PrimeiroPortType primeiroPortType = null;
  
  public PrimeiroPortTypeProxy() {
    _initPrimeiroPortTypeProxy();
  }
  
  public PrimeiroPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrimeiroPortTypeProxy();
  }
  
  private void _initPrimeiroPortTypeProxy() {
    try {
      primeiroPortType = (new br.com.fiap.exemplos.PrimeiroLocator()).getPrimeiroHttpSoap11Endpoint();
      if (primeiroPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)primeiroPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)primeiroPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (primeiroPortType != null)
      ((javax.xml.rpc.Stub)primeiroPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.exemplos.PrimeiroPortType getPrimeiroPortType() {
    if (primeiroPortType == null)
      _initPrimeiroPortTypeProxy();
    return primeiroPortType;
  }
  
  public java.lang.String ola(java.lang.String nome) throws java.rmi.RemoteException{
    if (primeiroPortType == null)
      _initPrimeiroPortTypeProxy();
    return primeiroPortType.ola(nome);
  }
  
  
}