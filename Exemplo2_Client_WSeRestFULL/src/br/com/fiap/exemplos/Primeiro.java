/**
 * Primeiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.exemplos;

public interface Primeiro extends javax.xml.rpc.Service {
    public java.lang.String getPrimeiroHttpSoap11EndpointAddress();

    public br.com.fiap.exemplos.PrimeiroPortType getPrimeiroHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public br.com.fiap.exemplos.PrimeiroPortType getPrimeiroHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
