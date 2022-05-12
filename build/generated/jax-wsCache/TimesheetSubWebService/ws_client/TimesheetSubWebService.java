
package ws_client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimesheetSubWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimesheetSubWebService {


    /**
     * 
     * @return
     *     returns java.util.List<ws_client.History>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findHistoryByWorkerId", targetNamespace = "http://ws/", className = "ws_client.FindHistoryByWorkerId")
    @ResponseWrapper(localName = "findHistoryByWorkerIdResponse", targetNamespace = "http://ws/", className = "ws_client.FindHistoryByWorkerIdResponse")
    @Action(input = "http://ws/TimesheetSubWebService/findHistoryByWorkerIdRequest", output = "http://ws/TimesheetSubWebService/findHistoryByWorkerIdResponse")
    public List<History> findHistoryByWorkerId();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns ws_client.EmployeeModel
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws/", className = "ws_client.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws/", className = "ws_client.LoginResponse")
    @Action(input = "http://ws/TimesheetSubWebService/loginRequest", output = "http://ws/TimesheetSubWebService/loginResponse")
    public EmployeeModel login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "timeSheetSubmit", targetNamespace = "http://ws/", className = "ws_client.TimeSheetSubmit")
    @ResponseWrapper(localName = "timeSheetSubmitResponse", targetNamespace = "http://ws/", className = "ws_client.TimeSheetSubmitResponse")
    @Action(input = "http://ws/TimesheetSubWebService/timeSheetSubmitRequest", output = "http://ws/TimesheetSubWebService/timeSheetSubmitResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws/TimesheetSubWebService/timeSheetSubmit/Fault/Exception")
    })
    public String timeSheetSubmit(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addInvoice", targetNamespace = "http://ws/", className = "ws_client.AddInvoice")
    @ResponseWrapper(localName = "addInvoiceResponse", targetNamespace = "http://ws/", className = "ws_client.AddInvoiceResponse")
    @Action(input = "http://ws/TimesheetSubWebService/addInvoiceRequest", output = "http://ws/TimesheetSubWebService/addInvoiceResponse")
    public String addInvoice(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

    /**
     * 
     * @return
     *     returns java.util.List<ws_client.Invoice>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllInvoice", targetNamespace = "http://ws/", className = "ws_client.FindAllInvoice")
    @ResponseWrapper(localName = "findAllInvoiceResponse", targetNamespace = "http://ws/", className = "ws_client.FindAllInvoiceResponse")
    @Action(input = "http://ws/TimesheetSubWebService/findAllInvoiceRequest", output = "http://ws/TimesheetSubWebService/findAllInvoiceResponse")
    public List<Invoice> findAllInvoice();

}
