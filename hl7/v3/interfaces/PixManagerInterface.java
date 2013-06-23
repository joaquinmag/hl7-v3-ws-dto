package com.janpix.hl7dto.hl7.v3.interfaces;

import com.janpix.hl7dto.hl7.v3.datatypes.*;
import com.janpix.hl7dto.hl7.v3.messages.HL7Message;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

import org.apache.cxf.annotations.WSDLDocumentation


@WebService(name = "PixManager",targetNamespace = "urn:ihe:iti:pixv3:2007")
@SOAPBinding(parameterStyle=ParameterStyle.BARE) 
public interface PixManagerInterface {
	/**
	 * Add new patients to the PIX. 
	 * Patient Registry Record Added(IHE_ITI Vol 2b - Seccion: 3.44.4.1
	 * @param body PRPA_IN201301UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/01_PatientRegistryRecordAdded1.xml">link</a> )
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml>link</a>
	 */
	@WebMethod(operationName = "PRPA_IN201301UV02_Message")
	@WebResult(name = "MCCI_IN000002UV01")
	@WSDLDocumentation("Add new patients to the PIX. Patient Registry Record Added(IHE_ITI Vol 2b - Seccion: 3.44.4.1")
	//@Action(input = "urn:hl7-org:v3:PRPA_IN201301UV02_Message", output = "urn:hl7-org:v3:MCCI_IN000002UV01_Message")
	//@RequestWrapper(className="com.janpix.hl7.v3.datatypes.II")
	//@ResponseWrapper(className="com.janpix.hl7.v3.datatypes.II",localName="DevolviendoII",targetNamespace="urn:hl7-org:v3")
	public HL7Message AddNewPatient(@WebParam(name = "PRPA_IN201301UV02",partName="Body") HL7Message body);
	

}
