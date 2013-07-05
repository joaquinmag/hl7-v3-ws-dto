package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.II;
import com.janpix.hl7dto.hl7.v3.datatypes.AD;
import com.janpix.hl7dto.hl7.v3.datatypes.TEL;
import com.janpix.hl7dto.hl7.v3.datatypes.CS;


@XmlAccessorType(XmlAccessType.FIELD)
public class Patient {
    @XmlElement(required = true)
    public List<II> id;
    public List<AD> addr;
    public List<TEL> telecom;
    @XmlElement(required = true)
    public CS statusCode;
    @XmlElement(name = "patientPerson",required = false)
    public Person patientPerson;
    @XmlAttribute(name = "classCode", required = true)
    public List<String> classCode;
    @XmlElement(required = false)
    public ProviderOrganization providerOrganization;
    
    public Patient() {
    	id = new ArrayList<II>();
    	addr = new ArrayList<AD>();
    	telecom = new ArrayList<TEL>();
    	classCode = new ArrayList<String>();
    }
}
