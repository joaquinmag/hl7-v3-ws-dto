package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.janpix.hl7dto.hl7.v3.datatypes.enums.ActClassControlAct;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.XActMoodIntentEvent;

@XmlTransient
@XmlSeeAlso({ PatientControlActProcess.class, QueryControlActProcess.class })
public class ControlActProcess {
	@XmlAttribute(name = "classCode", required = true)
	public ActClassControlAct classCode;
	@XmlAttribute(name = "moodCode", required = true)
	public XActMoodIntentEvent moodCode;
}