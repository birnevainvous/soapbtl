/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("timesheetsubwebserviceport")
public class TimesheetSubWebServicePort {

    private ws_client.TimesheetSubWebService port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TimesheetSubWebServicePort
     */
    public TimesheetSubWebServicePort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method login
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.EmployeeModel>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("login/")
    public JAXBElement<ws_client.EmployeeModel> getLogin(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                ws_client.EmployeeModel result = port.login(arg0, arg1);
                return new JAXBElement<ws_client.EmployeeModel>(new QName("http//ws_client/", "employeemodel"), ws_client.EmployeeModel.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method timeSheetSubmit
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @param arg6 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("timesheetsubmit/")
    public String getTimeSheetSubmit(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2, @QueryParam("arg3") String arg3, @QueryParam("arg4")
            @DefaultValue("0") int arg4, @QueryParam("arg5")
            @DefaultValue("0") int arg5, @QueryParam("arg6") String arg6) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.timeSheetSubmit(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllInvoice
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.FindAllInvoiceResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallinvoice/")
    public JAXBElement<ws_client.FindAllInvoiceResponse> getFindAllInvoice() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<ws_client.Invoice> result = port.findAllInvoice();

                class FindAllInvoiceResponse_1 extends ws_client.FindAllInvoiceResponse {

                    FindAllInvoiceResponse_1(java.util.List<ws_client.Invoice> _return) {
                        this._return = _return;
                    }
                }
                ws_client.FindAllInvoiceResponse response = new FindAllInvoiceResponse_1(result);
                return new ws_client.ObjectFactory().createFindAllInvoiceResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addInvoice
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @param arg6 resource URI parameter
     * @param arg7 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addinvoice/")
    public String getAddInvoice(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2, @QueryParam("arg3") String arg3, @QueryParam("arg4")
            @DefaultValue("0") int arg4, @QueryParam("arg5")
            @DefaultValue("0") int arg5, @QueryParam("arg6") String arg6, @QueryParam("arg7") String arg7) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addInvoice(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllEmployee
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.FindAllEmployeeResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallemployee/")
    public JAXBElement<ws_client.FindAllEmployeeResponse> getFindAllEmployee() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<ws_client.Employee> result = port.findAllEmployee();

                class FindAllEmployeeResponse_1 extends ws_client.FindAllEmployeeResponse {

                    FindAllEmployeeResponse_1(java.util.List<ws_client.Employee> _return) {
                        this._return = _return;
                    }
                }
                ws_client.FindAllEmployeeResponse response = new FindAllEmployeeResponse_1(result);
                return new ws_client.ObjectFactory().createFindAllEmployeeResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findHistoryByWorkerId
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.FindHistoryByWorkerIdResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findhistorybyworkerid/")
    public JAXBElement<ws_client.FindHistoryByWorkerIdResponse> getFindHistoryByWorkerId(@QueryParam("arg0")
            @DefaultValue("0") int arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<ws_client.History> result = port.findHistoryByWorkerId(arg0);

                class FindHistoryByWorkerIdResponse_1 extends ws_client.FindHistoryByWorkerIdResponse {

                    FindHistoryByWorkerIdResponse_1(java.util.List<ws_client.History> _return) {
                        this._return = _return;
                    }
                }
                ws_client.FindHistoryByWorkerIdResponse response = new FindHistoryByWorkerIdResponse_1(result);
                return new ws_client.ObjectFactory().createFindHistoryByWorkerIdResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private ws_client.TimesheetSubWebService getPort() {
        try {
            // Call Web Service Operation
            ws_client.TimesheetSubWebService_Service service = new ws_client.TimesheetSubWebService_Service();
            ws_client.TimesheetSubWebService p = service.getTimesheetSubWebServicePort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
