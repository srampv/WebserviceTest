/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seo.webservicetest;

import com.seo.testws.jaxws.Test;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import seo.com.TestWS;
import seo.com.TestWebService;

/**
 *
 * @author srampv
 */
public class WebserviceTest {
    
    public static void main(String[] args) throws MalformedURLException {
//        TestWS tc= (TestWS) Service.create(new URL("http://www.ramthoughts.com/TestWS/TestWebService?wsdl"), new QName("urn:com.seo", "TestWebService")).getPort(TestWS.class);
//        System.out.println("TEST:--->"+tc.test("hi"));
        QName name=new QName("urn:com.seo", "TestWebService");
        TestClient t=new TestClient(new URL("http://www.ramthoughts.com/TestWS/TestWebService?wsdl"), name);
//        ((BindingProvider)t.getTestWSPort()).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"https://localhost:8080/TestWS/TestWebService");
        System.out.println(t.getTestWSPort().test("hiii"));
    }
    
}
