
package pl.edu.agh.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePictureOfStudent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePictureOfStudent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="album" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="picturePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePictureOfStudent", propOrder = {
    "album",
    "picturePath"
})
public class UpdatePictureOfStudent {

    protected int album;
    protected String picturePath;

    /**
     * Gets the value of the album property.
     * 
     */
    public int getAlbum() {
        return album;
    }

    /**
     * Sets the value of the album property.
     * 
     */
    public void setAlbum(int value) {
        this.album = value;
    }

    /**
     * Gets the value of the picturePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicturePath() {
        return picturePath;
    }

    /**
     * Sets the value of the picturePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicturePath(String value) {
        this.picturePath = value;
    }

}
