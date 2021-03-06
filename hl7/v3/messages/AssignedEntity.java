package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
public class AssignedEntity {
	@XmlAttribute(required = true)
	String classCode;
	@XmlElement(required = false)
	II id;
	@XmlElement(required = false)
	AssignedOrganization assignedOrganization;
}
