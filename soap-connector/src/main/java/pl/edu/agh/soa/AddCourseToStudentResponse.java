
package pl.edu.agh.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCourseToStudentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCourseToStudentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addCourseToStudentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCourseToStudentResponse", propOrder = {
    "addCourseToStudentResult"
})
public class AddCourseToStudentResponse {

    protected String addCourseToStudentResult;

    /**
     * Gets the value of the addCourseToStudentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCourseToStudentResult() {
        return addCourseToStudentResult;
    }

    /**
     * Sets the value of the addCourseToStudentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCourseToStudentResult(String value) {
        this.addCourseToStudentResult = value;
    }

}
