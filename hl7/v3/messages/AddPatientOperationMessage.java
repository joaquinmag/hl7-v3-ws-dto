package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_IN201301UV02")
public class AddPatientOperationMessage extends HL7OperationMessage {
	@XmlElement(required = true, name = "controlActProcess")
	public PatientControlActProcess controlActProcess;
}
