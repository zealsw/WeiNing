
package com.hesicare.com.wsbs.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wbs package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPatientInfo_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "getPatientInfo");
    private final static QName _GetPatientInfoResponse_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "getPatientInfoResponse");
    private final static QName _Login_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "loginResponse");
    private final static QName _SetBGResult_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "setBGResult");
    private final static QName _SetBGResultResponse_QNAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "setBGResultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPatientInfo }
     * 
     */
    public GetPatientInfo createGetPatientInfo() {
        return new GetPatientInfo();
    }

    /**
     * Create an instance of {@link GetPatientInfoResponse }
     * 
     */
    public GetPatientInfoResponse createGetPatientInfoResponse() {
        return new GetPatientInfoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SetBGResult }
     * 
     */
    public SetBGResult createSetBGResult() {
        return new SetBGResult();
    }

    /**
     * Create an instance of {@link SetBGResultResponse }
     * 
     */
    public SetBGResultResponse createSetBGResultResponse() {
        return new SetBGResultResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPatientInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "getPatientInfo")
    public JAXBElement<GetPatientInfo> createGetPatientInfo(GetPatientInfo value) {
        return new JAXBElement<GetPatientInfo>(_GetPatientInfo_QNAME, GetPatientInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPatientInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPatientInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "getPatientInfoResponse")
    public JAXBElement<GetPatientInfoResponse> createGetPatientInfoResponse(GetPatientInfoResponse value) {
        return new JAXBElement<GetPatientInfoResponse>(_GetPatientInfoResponse_QNAME, GetPatientInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBGResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetBGResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "setBGResult")
    public JAXBElement<SetBGResult> createSetBGResult(SetBGResult value) {
        return new JAXBElement<SetBGResult>(_SetBGResult_QNAME, SetBGResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBGResultResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetBGResultResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.check.basic.health.yxhaibo.com/", name = "setBGResultResponse")
    public JAXBElement<SetBGResultResponse> createSetBGResultResponse(SetBGResultResponse value) {
        return new JAXBElement<SetBGResultResponse>(_SetBGResultResponse_QNAME, SetBGResultResponse.class, null, value);
    }

}
