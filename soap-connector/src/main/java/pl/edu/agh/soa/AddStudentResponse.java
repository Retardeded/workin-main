
package pl.edu.agh.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addStudentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addStudentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addStudentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addStudentResponse", propOrder = {
    "addStudentResult"
})
public class AddStudentResponse {

    protected String addStudentResult;

    /**
     * Gets the value of the addStudentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddStudentResult() {
        return addStudentResult;
    }

    /**
     * Sets the value of the addStudentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddStudentResult(String value) {
        this.addStudentResult = value;
    }

}
