package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.II;


@XmlAccessorType(XmlAccessType.FIELD)
public class ProviderOrganization {
	@XmlAttribute(required = true)
	String classCode;
	@XmlAttribute(required = false)
	String determinerCode;
	@XmlElement(required = false)
	II id;
	@XmlElement(required = false)
	String name;
	@XmlElement(required = false)
	ContactParty contactParty;
}
