package com.janpix.hl7dto.hl7.v3.messages.ack;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CD;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.ActClassControlAct;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.XActMoodIntentEvent;
import com.janpix.hl7dto.hl7.v3.messages.QueryControlActProcess;
import com.janpix.hl7dto.hl7.v3.messages.Subject1;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_IN201310UV02.MFMI_MT700711UV01.ControlActProcess")
public class QueryAckControlActProcess extends QueryControlActProcess {
    @XmlElement(required = true, nillable = true)
    public List<Subject1> subject;
    @XmlElement(required = true)
    protected QueryAckValue queryAck;
    
    public QueryAckControlActProcess() {
    	this.subject = new ArrayList<Subject1>();
    	this.code = new CD("PRPA_TE201310UV02");
    	this.moodCode = XActMoodIntentEvent.EVN;
    	this.classCode = ActClassControlAct.CACT;
    }
}
