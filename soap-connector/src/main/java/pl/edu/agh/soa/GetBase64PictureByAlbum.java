
package pl.edu.agh.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBase64PictureByAlbum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBase64PictureByAlbum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="album" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBase64PictureByAlbum", propOrder = {
    "album"
})
public class GetBase64PictureByAlbum {

    protected int album;

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

}
