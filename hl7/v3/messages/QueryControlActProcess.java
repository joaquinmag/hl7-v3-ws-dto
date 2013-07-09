package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CD;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_IN201309UV02.QUQI_MT021001UV01.ControlActProcess")
public class QueryControlActProcess extends ControlActProcess {
	
	@XmlElement(name = "code")
	public CD code = new CD("PRPA_TE201309UV02", "2.16.840.1.113883.1.6");
	
	

}
