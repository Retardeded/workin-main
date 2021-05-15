
package pl.edu.agh.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBase64PictureByAlbumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBase64PictureByAlbumResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getBase64PictureByAlbumResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBase64PictureByAlbumResponse", propOrder = {
    "getBase64PictureByAlbumResult"
})
public class GetBase64PictureByAlbumResponse {

    protected String getBase64PictureByAlbumResult;

    /**
     * Gets the value of the getBase64PictureByAlbumResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetBase64PictureByAlbumResult() {
        return getBase64PictureByAlbumResult;
    }

    /**
     * Sets the value of the getBase64PictureByAlbumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetBase64PictureByAlbumResult(String value) {
        this.getBase64PictureByAlbumResult = value;
    }

}
