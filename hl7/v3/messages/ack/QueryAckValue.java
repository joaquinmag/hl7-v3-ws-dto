package com.janpix.hl7dto.hl7.v3.messages.ack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlType(name = "MFMI_MT700711UV01.QueryAck")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryAckValue {
	public II queryId;
    @XmlElement(required = true)
    public CS queryResponseCode;
}
