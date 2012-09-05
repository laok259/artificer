/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 05:25:27 PM EDT 
//


package org.s_ramp.xmlns._2010.s_ramp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInterface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://s-ramp.org/xmlns/2010/s-ramp}SoaModelType">
 *       &lt;sequence>
 *         &lt;element name="interfaceDefinedBy" type="{http://s-ramp.org/xmlns/2010/s-ramp}DerivedArtifactType" minOccurs="0"/>
 *         &lt;element name="hasOperation" type="{http://s-ramp.org/xmlns/2010/s-ramp}serviceOperationTarget" minOccurs="0"/>
 *         &lt;element name="hasOutput" type="{http://s-ramp.org/xmlns/2010/s-ramp}informationTypeTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasInput" type="{http://s-ramp.org/xmlns/2010/s-ramp}informationTypeTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInterfaceOf" type="{http://s-ramp.org/xmlns/2010/s-ramp}serviceTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInterface", propOrder = {
    "interfaceDefinedBy",
    "hasOperation",
    "hasOutput",
    "hasInput",
    "isInterfaceOf"
})
public class ServiceInterface
    extends SoaModelType
    implements Serializable
{

    private static final long serialVersionUID = 4946377181380263332L;
    protected DerivedArtifactType interfaceDefinedBy;
    protected ServiceOperationTarget hasOperation;
    protected List<InformationTypeTarget> hasOutput;
    protected List<InformationTypeTarget> hasInput;
    protected List<ServiceTarget> isInterfaceOf;

    /**
     * Gets the value of the interfaceDefinedBy property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedArtifactType }
     *     
     */
    public DerivedArtifactType getInterfaceDefinedBy() {
        return interfaceDefinedBy;
    }

    /**
     * Sets the value of the interfaceDefinedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedArtifactType }
     *     
     */
    public void setInterfaceDefinedBy(DerivedArtifactType value) {
        this.interfaceDefinedBy = value;
    }

    /**
     * Gets the value of the hasOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOperationTarget }
     *     
     */
    public ServiceOperationTarget getHasOperation() {
        return hasOperation;
    }

    /**
     * Sets the value of the hasOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOperationTarget }
     *     
     */
    public void setHasOperation(ServiceOperationTarget value) {
        this.hasOperation = value;
    }

    /**
     * Gets the value of the hasOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationTypeTarget }
     * 
     * 
     */
    public List<InformationTypeTarget> getHasOutput() {
        if (hasOutput == null) {
            hasOutput = new ArrayList<InformationTypeTarget>();
        }
        return this.hasOutput;
    }

    /**
     * Gets the value of the hasInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationTypeTarget }
     * 
     * 
     */
    public List<InformationTypeTarget> getHasInput() {
        if (hasInput == null) {
            hasInput = new ArrayList<InformationTypeTarget>();
        }
        return this.hasInput;
    }

    /**
     * Gets the value of the isInterfaceOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInterfaceOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInterfaceOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTarget }
     * 
     * 
     */
    public List<ServiceTarget> getIsInterfaceOf() {
        if (isInterfaceOf == null) {
            isInterfaceOf = new ArrayList<ServiceTarget>();
        }
        return this.isInterfaceOf;
    }

}
