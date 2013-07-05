package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AssignedOrganization {
	@XmlAttribute(required = true)
	String classCode;
	@XmlAttribute(required = false)
	String determinerCode;
	@XmlElement(required = false)
	String name;
}
