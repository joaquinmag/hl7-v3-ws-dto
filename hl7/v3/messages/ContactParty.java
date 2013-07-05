package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.TEL;

@XmlAccessorType(XmlAccessType.FIELD)
public class ContactParty {
	@XmlAttribute(required = true)
	String classCode;
	@XmlElement(required = false)
	TEL telecom;
	
}
