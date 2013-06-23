// Anotaciones para todos los elementos del paquete
@javax.xml.bind.annotation.XmlSchema (
  namespace = "urn:hl7-org:v3", 
  elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
  xmlns = { 
		  @javax.xml.bind.annotation.XmlNs(prefix = "hl7", namespaceURI="urn:hl7-org:v3")
  }
)
package com.janpix.hl7dto.hl7.v3.interfaces;
