//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.16 at 02:40:05 PM CET 
//
package org.glotaran.core.models.tgm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for WeightPar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightPar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="min2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="max1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="max2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightPar", propOrder = {
    "min1",
    "min2",
    "max1",
    "max2",
    "weight"
})
public class WeightPar {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double min1;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double min2;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double max1;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double max2;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double weight;

    /**
     * Gets the value of the min1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMin1() {
        return min1;
    }

    /**
     * Sets the value of the min1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMin1(Double value) {
        this.min1 = value;
    }

    /**
     * Gets the value of the min2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMin2() {
        return min2;
    }

    /**
     * Sets the value of the min2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMin2(Double value) {
        this.min2 = value;
    }

    /**
     * Gets the value of the max1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMax1() {
        return max1;
    }

    /**
     * Sets the value of the max1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMax1(Double value) {
        this.max1 = value;
    }

    /**
     * Gets the value of the max2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMax2() {
        return max2;
    }

    /**
     * Sets the value of the max2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMax2(Double value) {
        this.max2 = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }
}