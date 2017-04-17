/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seo.webservicetest;

import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import seo.com.TestWS;

/**
 *
 * @author srampv
 */
@WebServiceClient(name = "test", targetNamespace = "urn:com.seo",wsdlLocation = "http://www.ramthoughts.com/TestWS/TestWebService?wsdl")
@HandlerChain(file = "handler-chain.xml")
public class TestClient extends Service {
    
    public TestClient(URL url,QName name){
       super(url,name);   
    }
    
     @WebEndpoint(name="TestWSPort")
     public TestWS getTestWSPort(){
         return super.getPort(new QName("urn:com.seo", "TestWSPort"), TestWS.class);
          
      }    
}
