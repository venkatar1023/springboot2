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
 *         &lt;element name="bookingList" type="{http://company.com/myloyal}bookingList" minOccurs="0"/>
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
    "bookingList",
    "error"
})
@XmlRootElement(name = "retrieveCustomerBookingsResponse")
public class RetrieveCustomerBookingsResponse {

    protected BookingList bookingList;
    protected Error error;

    /**
     * Gets the value of the bookingList property.
     * 
     * @return
     *     possible object is
     *     {@link BookingList }
     *     
     */
    public BookingList getBookingList() {
        return bookingList;
    }

    /**
     * Sets the value of the bookingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingList }
     *     
     */
    public void setBookingList(BookingList value) {
        this.bookingList = value;
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
