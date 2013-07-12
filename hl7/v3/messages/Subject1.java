package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Subject1 {
    @XmlElement(required = true, nillable = true)
    public RegistrationEvent registrationEvent;
    @XmlAttribute(name = "typeCode", required = true)
    public List<String> typeCode;
    
    public Subject1() {
    	typeCode = new ArrayList<String>();
    	typeCode.add("SUBJ");
    }
}
