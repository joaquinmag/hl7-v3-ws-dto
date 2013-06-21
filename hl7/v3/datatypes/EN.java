package com.janpix.hl7dto.hl7.v3.datatypes;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN")
public class EN {    
    @XmlElement(name = "delimiter", namespace = "urn:hl7-org:v3", required = false)
    public String delimiter;
    @XmlElement(name = "validTime", namespace = "urn:hl7-org:v3", required = false)
    public String validTime;
    @XmlElement(name = "prefix", namespace = "urn:hl7-org:v3", required = false)
    public String prefix;
    @XmlElement(name = "given", namespace = "urn:hl7-org:v3", required = false)
    public String given;
    @XmlElement(name = "suffix", namespace = "urn:hl7-org:v3", required = false)
    public String suffix;
    @XmlElement(name = "family", namespace = "urn:hl7-org:v3", required = false)
    public String family;
    
    @XmlAttribute(name = "use")
    protected List<String> use;
}
