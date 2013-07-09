package com.janpix.hl7dto.hl7.v3.messages.query;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
public class QueryParameter {
    @XmlElement(required = true)
    public List<II> value;
    @XmlElement(name = "semanticsText", required = true)
    public String semanticsText;
}
