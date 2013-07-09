package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PRPA_IN201309UV02")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryPatientOperationMessage extends HL7OperationMessage {
	@XmlElement(required = true, name = "controlActProcess")
	public QueryControlActProcess controlActProcess;
}
