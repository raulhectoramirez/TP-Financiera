
package org.tempuri;

import javax.xml.ws.WebFault;
import org.datacontract.schemas._2004._07.sge_service_contracts.ErrorServicio;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ErrorServicio", targetNamespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults")
public class IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ErrorServicio faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage(String message, ErrorServicio faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IServicioPublicoCreditoInformarCreditoOtorgadoErrorServicioFaultFaultMessage(String message, ErrorServicio faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.datacontract.schemas._2004._07.sge_service_contracts.ErrorServicio
     */
    public ErrorServicio getFaultInfo() {
        return faultInfo;
    }

}