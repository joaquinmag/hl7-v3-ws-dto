package com.janpix.hl7dto.hl7.v3.messages;

import javax.xml.bind.annotation.XmlAttribute;

public class HL7Message {
<<<<<<< HEAD
=======
	@XmlAttribute(name = "ITSVersion", required = true)
    public String itsVersion = "XML_1.0";
	    
    @XmlElement(required = true)
    public II id;
    @XmlElement(required = true)
    public TS creationTime;
    @XmlElement(required = true)
    public II interactionId;
    @XmlElement(required = true)
    public CS processingCode;
    @XmlElement(required = true)
    public CS processingModeCode;
    @XmlElement(required = true)
    public List<HL7MessageReceiver> receiver;
    @XmlElement(required = true)
    public HL7MessageSender sender;
    @XmlElement(required = true)
    public CS acceptAckCode;
>>>>>>> 0fcf1f7... Agrego interfaz para el WS y los package-info para definir namespaces

	@XmlAttribute(name = "ITSVersion", required = true)
	public String itsVersion;

	public HL7Message() {
		super();
	}

}
