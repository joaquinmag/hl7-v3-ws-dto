package com.janpix.hl7dto.hl7.v3.contracts;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.II;
import com.janpix.hl7dto.hl7.v3.datatypes.TS;
import com.janpix.hl7dto.hl7.v3.messages.Acknowledgement;
import com.janpix.hl7dto.hl7.v3.messages.HL7Message;
import com.janpix.hl7dto.hl7.v3.messages.HL7MessageReceiver;
import com.janpix.hl7dto.hl7.v3.messages.HL7MessageSender;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MCCI_IN000002UV01")
public class MCCIIN000002UV01 extends HL7Message
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
	
    public MCCIIN000002UV01() {
    	this.receiver = new ArrayList<HL7MessageReceiver>();
    	this.acknowledgement = new ArrayList<Acknowledgement>();
    }
}

