//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.10 at 03:10:58 PM IST 
//


package com.company.myloyal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loyaltyPointsList" type="{http://company.com/myloyal}loyaltyPointsList" minOccurs="0"/>
 *         &lt;element name="error" type="{http://company.com/myloyal}error" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyPointsList",
    "error"
})
@XmlRootElement(name = "retrieveCustomerLoyaltyPointsResponse")
public class RetrieveCustomerLoyaltyPointsResponse {

    protected LoyaltyPointsList loyaltyPointsList;
    protected Error error;

    /**
     * Gets the value of the loyaltyPointsList property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPointsList }
     *     
     */
    public LoyaltyPointsList getLoyaltyPointsList() {
        return loyaltyPointsList;
    }

    /**
     * Sets the value of the loyaltyPointsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPointsList }
     *     
     */
    public void setLoyaltyPointsList(LoyaltyPointsList value) {
        this.loyaltyPointsList = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
