package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;



import com.janpix.hl7dto.hl7.v3.datatypes.*;


public class HL7Message {
	@XmlAttribute(name = "ITSVersion", required = true)
    public String itsVersion;
	    
    @XmlElement(required = true)
    public II id;
    @XmlElement(required = true)
    public TS creationTime;
    @XmlElement(required = true)
    public II interactionId;
    @XmlElement(required = true)
    public CS processingCode;
    @XmlElement(required = true)
    public CS processingModeCode;
    @XmlElement(required = true)
    public List<HL7MessageReceiver> receiver;
    @XmlElement(required = true)
    public HL7MessageSender sender;
    @XmlElement(required = true)
    public ControlActProcess controlActProcess;
    @XmlElement(required = true)
    public CS acceptAckCode;

    public HL7Message() {
    	receiver = new ArrayList<HL7MessageReceiver>();
    }
}
