package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.II;
import com.janpix.hl7dto.hl7.v3.datatypes.CS;

@XmlAccessorType(XmlAccessType.FIELD)
public class RegistrationEvent {
    public List<II> id;
    @XmlElement(required = true)
    public CS statusCode;
    @XmlElement(required = true)
    public Subject2 subject1;
    @XmlAttribute(name = "classCode", required = true)
    public List<String> classCode;
    @XmlAttribute(name = "moodCode", required = true)
    public List<String> moodCode;
    
    public RegistrationEvent() {
    	id = new ArrayList<II>();
    	classCode = new ArrayList<String>();
    	moodCode = new ArrayList<String>();
    }
}
