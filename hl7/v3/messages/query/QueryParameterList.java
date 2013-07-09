package com.janpix.hl7dto.hl7.v3.messages.query;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "parameterList")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryParameterList {
	@XmlElement(nillable = true, name = "dataSource")
    protected List<QueryParameter> dataSource;
    @XmlElement(required = true, name = "patientIdentifier")
    protected List<QueryParameter> patientIdentifier;
}
