package com.janpix.hl7dto.hl7.v3.messages;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.AD;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirthPlace")
public class BirthPlace {
    public AD addr;
    @XmlAttribute(name = "classCode")
    public List<String> classCode;
}
