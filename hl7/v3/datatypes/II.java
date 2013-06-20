package com.janpix.hl7dto.hl7.v3.datatypes;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



/** Minimal implementation of II as a model we can use for all other
    type. This one is only used to convey NULL values. Again, we have
    static values of it, so we don't create so many objects in a 
    running program.
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "II")
public final class II {

	@XmlAttribute(name = "extension")
	public String extension;
	@XmlAttribute(name = "root")
	public String root;
	@XmlAttribute(name = "assigningAuthority")
	public String assigningAuthorityName;
	@XmlAttribute(name = "displayable")
	public Boolean displayable;


};
