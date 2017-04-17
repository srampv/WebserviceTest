
package com.seo.testws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "test", namespace = "urn:com.seo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", namespace = "urn:com.seo")
public class Test {

    @XmlElement(name = "test", namespace = "")
    private String test;

    /**
     * 
     * @return
     *     returns String
     */
    public String getTest() {
        return this.test;
    }

    /**
     * 
     * @param test
     *     the value for the test property
     */
    public void setTest(String test) {
        this.test = test;
    }

}
