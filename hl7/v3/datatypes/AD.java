package com.janpix.hl7dto.hl7.v3.datatypes;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="addr")
public class AD {
	@XmlElement(name="streetAddressLine")
	public String streetAddressLine;
	@XmlElement(name="city")
	public String city;
	@XmlElement(name="state")
	public String province;
	@XmlElement(name="country")
	public String country;
	@XmlElement(name="additionalLocator")
	public String additionalLocator;
	@XmlElement(name="postalCode")
	public String postalCode;
    @XmlAttribute(name = "use")
    public List<String> use;
    @XmlAttribute(name = "isNotOrdered")
    public Boolean isNotOrdered;
}
