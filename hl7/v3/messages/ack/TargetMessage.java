package com.janpix.hl7dto.hl7.v3.messages.ack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
public class TargetMessage {
    @XmlElement(required = true)
    public II id;
}
