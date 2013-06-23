package com.janpix.hl7dto.hl7.v3.datatypes.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AcknowledgementDetailType")
@XmlEnum
public enum AcknowledgementDetailType {
    E,
    I,
    W;

    public String value() {
        return name();
    }

    public static AcknowledgementDetailType fromValue(String v) {
        return valueOf(v);
    }

}
