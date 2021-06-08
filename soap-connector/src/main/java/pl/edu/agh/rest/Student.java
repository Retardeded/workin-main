
package pl.edu.agh.rest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="album" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="picturePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="courses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="club" type="{http://lab.rest.agh.edu.pl/}club" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "name",
    "album",
    "picturePath",
    "courses",
    "club"
})
public class Student {

    protected String name;
    protected int album;
    protected String picturePath;
    protected Student.Courses courses;
    protected Club club;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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

    /**
     * Gets the value of the courses property.
     * 
     * @return
     *     possible object is
     *     {@link Student.Courses }
     *     
     */
    public Student.Courses getCourses() {
        return courses;
    }

    /**
     * Sets the value of the courses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student.Courses }
     *     
     */
    public void setCourses(Student.Courses value) {
        this.courses = value;
    }

    /**
     * Gets the value of the club property.
     * 
     * @return
     *     possible object is
     *     {@link Club }
     *     
     */
    public Club getClub() {
        return club;
    }

    /**
     * Sets the value of the club property.
     * 
     * @param value
     *     allowed object is
     *     {@link Club }
     *     
     */
    public void setClub(Club value) {
        this.club = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="courses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "courses"
    })
    public static class Courses {

        protected List<String> courses;

        /**
         * Gets the value of the courses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the courses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCourses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCourses() {
            if (courses == null) {
                courses = new ArrayList<String>();
            }
            return this.courses;
        }

    }

}
