package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.messages.ack.AcknowledgementDetail;
import com.janpix.hl7dto.hl7.v3.messages.ack.TargetMessage;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acknowledgement")
public class Acknowledgement {
    @XmlElement(required = true)
    public CS typeCode;
    @XmlElement(required = true, nillable = true)
    public TargetMessage targetMessage;
    @XmlElement(nillable = true)
    public List<AcknowledgementDetail> acknowledgementDetail;
    
    public Acknowledgement() {
    	this.acknowledgementDetail = new ArrayList<AcknowledgementDetail>();
    }
}
