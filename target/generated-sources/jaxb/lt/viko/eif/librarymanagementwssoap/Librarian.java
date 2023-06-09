//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.10 at 11:30:01 AM EEST 
//


package lt.viko.eif.librarymanagementwssoap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for librarian complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="librarian"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="librarian-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="librarian-email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="librarian-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="last-name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarian", propOrder = {
    "librarianId",
    "librarianEmail",
    "librarianName",
    "lastName",
    "phoneNumber"
})
public class Librarian {

    @XmlElement(name = "librarian-id", required = true)
    protected String librarianId;
    @XmlElement(name = "librarian-email", required = true)
    protected String librarianEmail;
    @XmlElement(name = "librarian-name", required = true)
    protected String librarianName;
    @XmlElement(name = "last-name", required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String phoneNumber;

    /**
     * Gets the value of the librarianId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianId() {
        return librarianId;
    }

    /**
     * Sets the value of the librarianId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianId(String value) {
        this.librarianId = value;
    }

    /**
     * Gets the value of the librarianEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianEmail() {
        return librarianEmail;
    }

    /**
     * Sets the value of the librarianEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianEmail(String value) {
        this.librarianEmail = value;
    }

    /**
     * Gets the value of the librarianName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianName() {
        return librarianName;
    }

    /**
     * Sets the value of the librarianName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianName(String value) {
        this.librarianName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
