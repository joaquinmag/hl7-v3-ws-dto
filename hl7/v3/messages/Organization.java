package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.ON;
import com.janpix.hl7dto.hl7.v3.datatypes.AD;
import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization")
public class Organization {
    @XmlElement(required = true)
    protected List<II> id;
    @XmlElement(name = "name")
    protected List<ON> name;
    protected List<AD> addr;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected String determinerCode;
}
