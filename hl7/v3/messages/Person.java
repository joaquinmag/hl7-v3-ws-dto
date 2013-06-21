package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.CE;
import com.janpix.hl7dto.hl7.v3.datatypes.II;
import com.janpix.hl7dto.hl7.v3.datatypes.TEL;
import com.janpix.hl7dto.hl7.v3.datatypes.PN;
import com.janpix.hl7dto.hl7.v3.datatypes.AD;
import com.janpix.hl7dto.hl7.v3.datatypes.EN;
import com.janpix.hl7dto.hl7.v3.datatypes.TS;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    public List<PersonId> id;
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
    public CE livingArrangementCode;
    //@XmlElementRef(name = "birthPlace", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    //protected JAXBElement<PRPAMT201302UV02BirthPlace> birthPlace;
    @XmlAttribute(name = "classCode")
    public List<String> classCode;
}
