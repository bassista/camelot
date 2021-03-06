//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 02:25:39 PM MSK 
//


package ru.yandex.qatools.camelot.core.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SmsConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmsConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:beans.qa.yandex.ru}BaseConfig">
 *       &lt;sequence>
 *         &lt;element name="subscriber" type="{urn:beans.qa.yandex.ru}SmsSubscriber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmsConfig", propOrder = {
    "subscribers"
})
public class SmsConfig
    extends BaseConfig
    implements Serializable
{

    @XmlElement(name = "subscriber")
    protected List<SmsSubscriber> subscribers;

    /**
     * Gets the value of the subscribers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsSubscriber }
     * 
     * 
     */
    public List<SmsSubscriber> getSubscribers() {
        if (subscribers == null) {
            subscribers = new ArrayList<SmsSubscriber>();
        }
        return this.subscribers;
    }

}
