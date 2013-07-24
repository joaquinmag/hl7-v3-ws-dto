package com.janpix.hl7dto.hl7.v3.messages.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201307UV02.QueryByParameter")
public class QueryByParameter {
    @XmlElement(required = true, name = "queryId")
    public II queryId;
    @XmlElement(required = true)
    public CS statusCode;
    @XmlElement(required = true)
    public QueryParameterList parameterList;
}
