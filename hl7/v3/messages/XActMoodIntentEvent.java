package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "x_ActMoodIntentEvent")
@XmlEnum
public enum XActMoodIntentEvent {

    EVN;

    public String value() {
        return name();
    }

    public static XActMoodIntentEvent fromValue(String v) {
        return valueOf(v);
    }

}
