
package pl.edu.agh.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteStudentByAlbumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteStudentByAlbumResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="removeStudentByAlbumResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteStudentByAlbumResponse", propOrder = {
    "removeStudentByAlbumResult"
})
public class DeleteStudentByAlbumResponse {

    protected String removeStudentByAlbumResult;

    /**
     * Gets the value of the removeStudentByAlbumResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveStudentByAlbumResult() {
        return removeStudentByAlbumResult;
    }

    /**
     * Sets the value of the removeStudentByAlbumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveStudentByAlbumResult(String value) {
        this.removeStudentByAlbumResult = value;
    }

}
