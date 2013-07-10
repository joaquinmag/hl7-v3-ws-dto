package com.janpix.hl7dto.hl7.v3.messages.ack;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PRPA_IN201310UV02")
public class QueryAcknowledgmentMessage extends AcknowledgmentMessage {
	public QueryAckControlActProcess controlActProcess;
}
