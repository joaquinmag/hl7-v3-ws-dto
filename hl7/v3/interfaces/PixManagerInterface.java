package com.janpix.hl7dto.hl7.v3.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import org.apache.cxf.annotations.WSDLDocumentation;

import com.janpix.hl7dto.hl7.v3.messages.HL7OperationMessage;
import com.janpix.hl7dto.hl7.v3.messages.PatientOperationMessage;
import com.janpix.hl7dto.hl7.v3.messages.QueryPatientOperationMessage;
import com.janpix.hl7dto.hl7.v3.messages.ack.AddPatientAcknowledgmentMessage;
import com.janpix.hl7dto.hl7.v3.messages.ack.QueryAcknowledgmentMessage;


@WebService(
		name = "PixManager",
		targetNamespace = "urn:ihe:iti:pixv3:2007",
		serviceName = "PIXManager_Service",
		portName = "PIXManager_PortType"
		)
@SOAPBinding(parameterStyle=ParameterStyle.BARE) 
public interface PixManagerInterface {
	
	/**
	 * Add new patients to the PIX. 
	 * Patient Registry Record Added(IHE_ITI Vol 2b - Seccion: 3.44.4.1. PIXManager_PRPA_IN201301UV02
	 * @param body PRPA_IN201301UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/01_PatientRegistryRecordAdded1.xml">link</a> )
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml>link</a>
	 */
	@WebMethod(operationName = "PatientRegistryRecordAdded")
	@WebResult(name = "MCCI_IN000002UV01",targetNamespace="urn:hl7-org:v3",partName = "Body")
	@WSDLDocumentation("Add new patients to the PIX. Patient Registry Record Added(IHE_ITI Vol 2b - Seccion: 3.44.4.1)")
	public AddPatientAcknowledgmentMessage AddNewPatient(
			@WebParam(name = "PRPA_IN201301UV02",targetNamespace="urn:hl7-org:v3",partName="Body") 
			PatientOperationMessage body
		);
	

	
	/**
	 * Merges two patients that where added as different patients
	 * Patient Registry Duplicates Resolved (IHE_ITI Vol 2b - Seccion: 3.44.4).PIXManager_PRPA_IN201304UV02
	 * @param body PRPA_IN201304UV02 (ej: ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/05_PatientRegistryDuplicatesResolved.xml )
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml>link</a>
	 */
	@WebMethod(operationName = "PatientRegistryDuplicatesResolved")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	@WSDLDocumentation("Merges two patients that where added as different patients. Patient Registry Duplicates Resolved (IHE_ITI Vol 2b - Seccion: 3.44.4)")
	public AddPatientAcknowledgmentMessage MergePatients(
			@WebParam(name = "PRPA_IN201304UV02", targetNamespace = "urn:hl7-org:v3",partName = "Body")
			HL7OperationMessage body
		);
	
	/**
	 * This method is for updating patient information
	 * Patient Registry Record Revised(IHE_ITI Vol 2b - Seccion: 3.44.4.1).PIXManager_PRPA_IN201302UV02
	 * @param body PRPA_IN201302UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/04_PatientRegistryRecordRevised2.xml">link</a>
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml">link</a>
	 */
	@WebMethod(operationName = "PatientRegistryRecordRevised")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	@WSDLDocumentation("This method is for updating patient information. Patient Registry Record Revised(IHE_ITI Vol 2b - Seccion: 3.44.4.1)")
	public AddPatientAcknowledgmentMessage UpdatePatient (
			@WebParam(name = "PRPA_IN201302UV02", targetNamespace = "urn:hl7-org:v3",partName = "Body")
			PatientOperationMessage body
		);
	
	/**
	 * Returns all the identifiers of a patient.
	 * Patient Registry Get Identifiers Query (IHE_ITI Vol 2b - Seccion: 3.45.4). PIXManager_PRPA_IN201310UV02
	 * @param body PRPA_IN201309UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/06_PIXQuery1.xml">link</a>
	 * @return PRPA_IN201310UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/07_PIXQuery1Response.xml">link</a>
	 */
	@WebMethod(operationName = "PatientRegistryGetIdentifiersQuery",action = "urn:hl7-org:v3:PRPA_IN201301UV02")
	@WebResult(name = "PRPA_IN201310UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	@WSDLDocumentation("Returns all the identifiers of a patient. Patient Registry Get Identifiers Query (IHE_ITI Vol 2b - Seccion: 3.45.4)")
	public QueryAcknowledgmentMessage GetAllIdentifiersPatient(
			@WebParam( name = "PRPA_IN201309UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body")
			QueryPatientOperationMessage body);
	
	
	/** Metodos Extendidos **/
	
	/**
	 * Add new patients to the PIX without validate matching with other patients. 
	 * This method is an extension of IHE Protocol
	 * @param body PRPA_IN201301UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/01_PatientRegistryRecordAdded1.xml">link</a> )
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml>link</a>
	 */
	@WebMethod(operationName = "PatientRegistryRecordAddedWithoutValidation")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	@WSDLDocumentation("Add new patients to the PIX without validate matching with other patients.")
	public AddPatientAcknowledgmentMessage AddNewPatientWithoutValidation(
			@WebParam(name = "PRPA_IN201302UV02",targetNamespace="urn:hl7-org:v3",partName="Body") 
			PatientOperationMessage body);
	
	
	/**
	 * Returns all patient maching with Patient 
	 * This method is an extension of IHE Protocol
	 * FIXME! Ver que Objetos debe enviar y recibir
	 * @param body PRPA_IN201301UV02 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/01_PatientRegistryRecordAdded1.xml">link</a> )
	 * @return ACK : MCCI_IN000002UV01 @see <a href="ftp://ftp.ihe.net/TF_Implementation_Material/ITI/examples/PIXV3/02_PatientRegistryRecordAdded1Ack.xml>link</a>
	 */
	@WebMethod(operationName = "GetAllPossibleMatchedPatients")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	@WSDLDocumentation("Returns all patient maching with Patient")
	public QueryAcknowledgmentMessage GetAllPossibleMatchedPatients(
			@WebParam(name = "PRPA_IN201302UV02",targetNamespace="urn:hl7-org:v3",partName="Body") 
			PatientOperationMessage body);
	
	
	
	//@Action(input = "urn:hl7-org:v3:PRPA_IN201301UV02_Message", output = "urn:hl7-org:v3:MCCI_IN000002UV01_Message")
	//@RequestWrapper(className="com.janpix.hl7.v3.datatypes.II")
	//@ResponseWrapper(className="com.janpix.hl7.v3.datatypes.II",localName="DevolviendoII",targetNamespace="urn:hl7-org:v3")

}
