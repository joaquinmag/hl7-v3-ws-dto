package com.janpix.hl7dto.hl7.v3.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.janpix.hl7dto.hl7.v3.datatypes.CS;
import com.janpix.hl7dto.hl7.v3.datatypes.II;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherIDs")
public class OtherIDs {
    @XmlElement(required = true)
    public List<II> id;
    public CS statusCode;
    @XmlElement(required = true, nillable = true)
    public Organization scopingOrganization;
    @XmlAttribute(name = "classCode", required = true)
    public List<String> classCode;
    
    public OtherIDs() {
    	id = new ArrayList<II>();
    	classCode = new ArrayList<String>();
    }
}
