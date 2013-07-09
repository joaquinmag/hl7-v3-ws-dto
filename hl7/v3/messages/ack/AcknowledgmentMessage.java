package com.janpix.hl7dto.hl7.v3.messages.ack;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.II;
import com.janpix.hl7dto.hl7.v3.datatypes.TS;
import com.janpix.hl7dto.hl7.v3.messages.Acknowledgement;
import com.janpix.hl7dto.hl7.v3.messages.HL7Message;
import com.janpix.hl7dto.hl7.v3.messages.HL7MessageReceiver;
import com.janpix.hl7dto.hl7.v3.messages.HL7MessageSender;

@XmlAccessorType(XmlAccessType.FIELD)
public class AcknowledgmentMessage extends HL7Message
{
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
    public CS acceptAckCode;
    @XmlElement(required = true)
    public List<HL7MessageReceiver> receiver;
    @XmlElement(required = true)
    public HL7MessageSender sender;
    @XmlElement(nillable = true)
    public List<Acknowledgement> acknowledgement;
	
    public AcknowledgmentMessage() {
    	this.receiver = new ArrayList<HL7MessageReceiver>();
    	this.acknowledgement = new ArrayList<Acknowledgement>();
    }
}

