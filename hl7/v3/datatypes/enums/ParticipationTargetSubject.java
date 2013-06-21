package com.janpix.hl7dto.hl7.v3.datatypes.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ParticipationTargetSubject")
@XmlEnum
public enum ParticipationTargetSubject {

    SBJ,
    SPC;

    public String value() {
        return name();
    }

    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
