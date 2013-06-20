package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ControlActProcess {
    @XmlElement(required = true, nillable = true)
    public List<Subject1> subject;
    @XmlAttribute(name = "classCode", required = true)
    public ActClassControlAct classCode;
    @XmlAttribute(name = "moodCode", required = true)
    public XActMoodIntentEvent moodCode;
}
