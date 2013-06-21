package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.enums.ParticipationTargetSubject;

@XmlAccessorType(XmlAccessType.FIELD)
public class Subject2 {
    @XmlElement(required = true, nillable = true)
    public Patient patient;
    @XmlAttribute(name = "typeCode", required = true)
    public ParticipationTargetSubject typeCode;
}
