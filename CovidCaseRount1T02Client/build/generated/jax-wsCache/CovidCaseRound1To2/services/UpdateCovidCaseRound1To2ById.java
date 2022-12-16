
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCovidCaseRound1To2ById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCovidCaseRound1To2ById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="new_case" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="new_death" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCovidCaseRound1To2ById", propOrder = {
    "id",
    "newCase",
    "newDeath"
})
public class UpdateCovidCaseRound1To2ById {

    protected int id;
    @XmlElement(name = "new_case")
    protected int newCase;
    @XmlElement(name = "new_death")
    protected int newDeath;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the newCase property.
     * 
     */
    public int getNewCase() {
        return newCase;
    }

    /**
     * Sets the value of the newCase property.
     * 
     */
    public void setNewCase(int value) {
        this.newCase = value;
    }

    /**
     * Gets the value of the newDeath property.
     * 
     */
    public int getNewDeath() {
        return newDeath;
    }

    /**
     * Sets the value of the newDeath property.
     * 
     */
    public void setNewDeath(int value) {
        this.newDeath = value;
    }

}
