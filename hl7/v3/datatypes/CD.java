package com.janpix.hl7dto.hl7.v3.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD")
public class CD {
	@XmlAttribute(name = "code")
	public String code;
	@XmlAttribute(name = "codeSystem", required = false)
	public String codeSystem;
	
	public CD() { }
	public CD(String code) {
		this.code = code;
	}
	public CD(String code, String codeSystem) {
		this.codeSystem = codeSystem;
	}
}
