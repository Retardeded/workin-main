
package pl.edu.agh.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePictureOfStudentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePictureOfStudentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updatePicutreOfStudentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePictureOfStudentResponse", propOrder = {
    "updatePicutreOfStudentResult"
})
public class UpdatePictureOfStudentResponse {

    protected String updatePicutreOfStudentResult;

    /**
     * Gets the value of the updatePicutreOfStudentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePicutreOfStudentResult() {
        return updatePicutreOfStudentResult;
    }

    /**
     * Sets the value of the updatePicutreOfStudentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePicutreOfStudentResult(String value) {
        this.updatePicutreOfStudentResult = value;
    }

}
