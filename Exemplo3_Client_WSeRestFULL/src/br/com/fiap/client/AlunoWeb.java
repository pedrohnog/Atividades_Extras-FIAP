
package br.com.fiap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlunoWeb", targetNamespace = "http://ws.exemplo.fiap.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlunoWeb {


    /**
     * 
     * @param senha
     * @param usuario
     * @param parameters
     * @return
     *     returns br.com.fiap.client.ListarResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "listarResponse", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "result")
    @Action(input = "http://ws.exemplo.fiap.com/AlunoWeb/listarRequest", output = "http://ws.exemplo.fiap.com/AlunoWeb/listarResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws.exemplo.fiap.com/AlunoWeb/listar/Fault/Exception")
    })
    public ListarResponse listar(
        @WebParam(name = "listar", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "parameters")
        Listar parameters,
        @WebParam(name = "Usuario", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "Usuario")
        String usuario,
        @WebParam(name = "Senha", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "Senha")
        String senha)
        throws Exception_Exception
    ;

    /**
     * 
     * @param senha
     * @param usuario
     * @param parameters
     * @return
     *     returns br.com.fiap.client.NovoResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "novoResponse", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "result")
    @Action(input = "http://ws.exemplo.fiap.com/AlunoWeb/novoRequest", output = "http://ws.exemplo.fiap.com/AlunoWeb/novoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws.exemplo.fiap.com/AlunoWeb/novo/Fault/Exception")
    })
    public NovoResponse novo(
        @WebParam(name = "novo", targetNamespace = "http://ws.exemplo.fiap.com/", partName = "parameters")
        Novo parameters,
        @WebParam(name = "Usuario", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "Usuario")
        String usuario,
        @WebParam(name = "Senha", targetNamespace = "http://ws.exemplo.fiap.com/", header = true, partName = "Senha")
        String senha)
        throws Exception_Exception
    ;

}
