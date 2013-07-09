package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PatientControlActProcess extends ControlActProcess {
    @XmlElement(required = true, nillable = true)
    public List<Subject1> subject;
    public PatientControlActProcess() {
    	this.subject = new ArrayList<Subject1>();
    }
}
