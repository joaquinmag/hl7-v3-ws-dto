package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAttribute;

import com.janpix.hl7dto.hl7.v3.datatypes.enums.ActClassControlAct;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.XActMoodIntentEvent;

public class ControlActProcess {

	@XmlAttribute(name = "classCode", required = true)
	public ActClassControlAct classCode;
	@XmlAttribute(name = "moodCode", required = true)
	public XActMoodIntentEvent moodCode;

}