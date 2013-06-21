package com.janpix.hl7dto.hl7.v3.datatypes.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ActClassControlAct")
@XmlEnum
public enum ActClassControlAct {

    CACT,
    ACTN,
    INFO,
    STC;

    public String value() {
        return name();
    }

    public static ActClassControlAct fromValue(String v) {
        return valueOf(v);
    }

}
