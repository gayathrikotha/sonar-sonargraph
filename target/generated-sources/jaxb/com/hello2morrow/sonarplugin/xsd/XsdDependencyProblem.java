//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.10 at 01:27:14 PM MESZ 
//


package com.hello2morrow.sonarplugin.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xsdDependencyProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xsdDependencyProblem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fromScope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fromElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toScope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xsdDependencyProblem")
public class XsdDependencyProblem {

    @XmlAttribute(required = true)
    protected String fromScope;
    @XmlAttribute(required = true)
    protected String fromElement;
    @XmlAttribute(required = true)
    protected String toScope;
    @XmlAttribute(required = true)
    protected String toElement;
    @XmlAttribute(required = true)
    protected String description;

    /**
     * Gets the value of the fromScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromScope() {
        return fromScope;
    }

    /**
     * Sets the value of the fromScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromScope(String value) {
        this.fromScope = value;
    }

    /**
     * Gets the value of the fromElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromElement() {
        return fromElement;
    }

    /**
     * Sets the value of the fromElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromElement(String value) {
        this.fromElement = value;
    }

    /**
     * Gets the value of the toScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToScope() {
        return toScope;
    }

    /**
     * Sets the value of the toScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToScope(String value) {
        this.toScope = value;
    }

    /**
     * Gets the value of the toElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToElement() {
        return toElement;
    }

    /**
     * Sets the value of the toElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToElement(String value) {
        this.toElement = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}