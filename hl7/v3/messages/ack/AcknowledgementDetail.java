package com.janpix.hl7dto.hl7.v3.messages.ack;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.CE;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.AcknowledgementDetailType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AcknowledgementDetail {
    public CE code;
    public String text;
    @XmlElement(name = "location")
    public List<String> location;
    @XmlAttribute(name = "typeCode")
    public AcknowledgementDetailType typeCode;
    
    public AcknowledgementDetail() {
    	this.location = new ArrayList<String>();
    }
}
