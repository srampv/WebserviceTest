
package seo.com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWS", targetNamespace = "urn:com.seo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWS {


    /**
     * 
     * @param test
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "urn:com.seo", className = "seo.com.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "urn:com.seo", className = "seo.com.TestResponse")
    @Action(input = "urn:com.seo:TestWS:testRequest", output = "urn:com.seo:TestWS:testResponse")
    public String test(
        @WebParam(name = "test", targetNamespace = "")
        String test);

}