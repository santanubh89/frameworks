//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.01 at 05:17:37 PM IST 
//


package com.ericsson.mdc.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detailedResourceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedResourceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deployable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="joiningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineManager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rnamCoreFlexPool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cdCoreFlexPool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="loanResource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="skillset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentProject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rolloffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nextProject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedStartdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="resignedOrMobility" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fullyOccupied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailedResourceDetails", propOrder = {
    "signum",
    "status",
    "billable",
    "deployable",
    "joiningDate",
    "location",
    "position",
    "lineManager",
    "jobStage",
    "jobRole",
    "rnamCoreFlexPool",
    "cdCoreFlexPool",
    "loanResource",
    "skillset",
    "projectStatus",
    "region",
    "currentProject",
    "rolloffDate",
    "nextProject",
    "expectedStartdate",
    "resignedOrMobility",
    "fullyOccupied",
    "updateTimestamp"
})
public class DetailedResourceDetails {

    @XmlElement(required = true)
    protected String signum;
    @XmlElement(required = true)
    protected String status;
    protected boolean billable;
    protected boolean deployable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar joiningDate;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(required = true)
    protected String lineManager;
    @XmlElement(required = true)
    protected String jobStage;
    @XmlElement(required = true)
    protected String jobRole;
    protected boolean rnamCoreFlexPool;
    protected boolean cdCoreFlexPool;
    protected boolean loanResource;
    @XmlElement(required = true)
    protected String skillset;
    @XmlElement(required = true)
    protected String projectStatus;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(required = true)
    protected String currentProject;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rolloffDate;
    @XmlElement(required = true)
    protected String nextProject;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedStartdate;
    protected boolean resignedOrMobility;
    protected boolean fullyOccupied;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTimestamp;

    /**
     * Gets the value of the signum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignum() {
        return signum;
    }

    /**
     * Sets the value of the signum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignum(String value) {
        this.signum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the billable property.
     * 
     */
    public boolean isBillable() {
        return billable;
    }

    /**
     * Sets the value of the billable property.
     * 
     */
    public void setBillable(boolean value) {
        this.billable = value;
    }

    /**
     * Gets the value of the deployable property.
     * 
     */
    public boolean isDeployable() {
        return deployable;
    }

    /**
     * Sets the value of the deployable property.
     * 
     */
    public void setDeployable(boolean value) {
        this.deployable = value;
    }

    /**
     * Gets the value of the joiningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJoiningDate() {
        return joiningDate;
    }

    /**
     * Sets the value of the joiningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJoiningDate(XMLGregorianCalendar value) {
        this.joiningDate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the lineManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineManager() {
        return lineManager;
    }

    /**
     * Sets the value of the lineManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineManager(String value) {
        this.lineManager = value;
    }

    /**
     * Gets the value of the jobStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStage() {
        return jobStage;
    }

    /**
     * Sets the value of the jobStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStage(String value) {
        this.jobStage = value;
    }

    /**
     * Gets the value of the jobRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobRole() {
        return jobRole;
    }

    /**
     * Sets the value of the jobRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobRole(String value) {
        this.jobRole = value;
    }

    /**
     * Gets the value of the rnamCoreFlexPool property.
     * 
     */
    public boolean isRnamCoreFlexPool() {
        return rnamCoreFlexPool;
    }

    /**
     * Sets the value of the rnamCoreFlexPool property.
     * 
     */
    public void setRnamCoreFlexPool(boolean value) {
        this.rnamCoreFlexPool = value;
    }

    /**
     * Gets the value of the cdCoreFlexPool property.
     * 
     */
    public boolean isCdCoreFlexPool() {
        return cdCoreFlexPool;
    }

    /**
     * Sets the value of the cdCoreFlexPool property.
     * 
     */
    public void setCdCoreFlexPool(boolean value) {
        this.cdCoreFlexPool = value;
    }

    /**
     * Gets the value of the loanResource property.
     * 
     */
    public boolean isLoanResource() {
        return loanResource;
    }

    /**
     * Sets the value of the loanResource property.
     * 
     */
    public void setLoanResource(boolean value) {
        this.loanResource = value;
    }

    /**
     * Gets the value of the skillset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillset() {
        return skillset;
    }

    /**
     * Sets the value of the skillset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillset(String value) {
        this.skillset = value;
    }

    /**
     * Gets the value of the projectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * Sets the value of the projectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectStatus(String value) {
        this.projectStatus = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the currentProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentProject() {
        return currentProject;
    }

    /**
     * Sets the value of the currentProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentProject(String value) {
        this.currentProject = value;
    }

    /**
     * Gets the value of the rolloffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRolloffDate() {
        return rolloffDate;
    }

    /**
     * Sets the value of the rolloffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRolloffDate(XMLGregorianCalendar value) {
        this.rolloffDate = value;
    }

    /**
     * Gets the value of the nextProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextProject() {
        return nextProject;
    }

    /**
     * Sets the value of the nextProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextProject(String value) {
        this.nextProject = value;
    }

    /**
     * Gets the value of the expectedStartdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedStartdate() {
        return expectedStartdate;
    }

    /**
     * Sets the value of the expectedStartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedStartdate(XMLGregorianCalendar value) {
        this.expectedStartdate = value;
    }

    /**
     * Gets the value of the resignedOrMobility property.
     * 
     */
    public boolean isResignedOrMobility() {
        return resignedOrMobility;
    }

    /**
     * Sets the value of the resignedOrMobility property.
     * 
     */
    public void setResignedOrMobility(boolean value) {
        this.resignedOrMobility = value;
    }

    /**
     * Gets the value of the fullyOccupied property.
     * 
     */
    public boolean isFullyOccupied() {
        return fullyOccupied;
    }

    /**
     * Sets the value of the fullyOccupied property.
     * 
     */
    public void setFullyOccupied(boolean value) {
        this.fullyOccupied = value;
    }

    /**
     * Gets the value of the updateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * Sets the value of the updateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTimestamp(XMLGregorianCalendar value) {
        this.updateTimestamp = value;
    }

}