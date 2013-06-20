package com.janpix.hl7.v3.datatypes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.hl7.types.*;

/** Minimal implementation of II as a model we can use for all other
    type. This one is only used to convey NULL values. Again, we have
    static values of it, so we don't create so many objects in a 
    running program.
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TS")
public final class TS {

	@XmlAttribute(name = "value")
	public String value;



};
