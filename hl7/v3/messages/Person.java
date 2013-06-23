package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.AD;
import com.janpix.hl7dto.hl7.v3.datatypes.CE;
import com.janpix.hl7dto.hl7.v3.datatypes.PN;
import com.janpix.hl7dto.hl7.v3.datatypes.TEL;
import com.janpix.hl7dto.hl7.v3.datatypes.TS;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlElement(required = true)
    public List<PN> name;
    public List<TEL> telecom;
    public CE administrativeGenderCode;
    public TS birthTime;
    public Boolean deceasedInd;
    public TS deceasedTime;
    public Boolean multipleBirthInd;
    public Boolean organDonorInd;
    public List<AD> addr;
    public CE maritalStatusCode;
    public CE educationLevelCode;
    @XmlElement(nillable = true)
    public List<OtherIDs> asOtherIDs;
    @XmlElement(name = "birthPlace", namespace = "urn:hl7-org:v3", required = false)
    public BirthPlace birthPlace;
    @XmlAttribute(name = "classCode")
    public List<String> classCode;
    
    public Person() {
    	name = new ArrayList<PN>();
    	telecom = new ArrayList<TEL>();
    	addr = new ArrayList<AD>();
    	asOtherIDs = new ArrayList<OtherIDs>();
    	classCode = new ArrayList<String>();
    }
}
