
package com.hesicare.com.wsbs.client.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-09-15T14:21:17.144+08:00
 * Generated source version: 3.4.0
 *
 */
public final class SyncInfoService_SyncInfoServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ws.check.basic.health.yxhaibo.com/", "SyncInfoServiceImplService");

    private SyncInfoService_SyncInfoServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SyncInfoServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        SyncInfoServiceImplService ss = new SyncInfoServiceImplService(wsdlURL, SERVICE_NAME);
        SyncInfoService port = ss.getSyncInfoServiceImplPort();

        {
        System.out.println("Invoking setBGResult...");
        String _setBGResult_account = "";
        String _setBGResult_token = "";
        String _setBGResult_serialNumber = "";
        String _setBGResult_bloodSugar = "";
        Object _setBGResult__return = port.setBGResult(_setBGResult_account, _setBGResult_token, _setBGResult_serialNumber, _setBGResult_bloodSugar);
        System.out.println("setBGResult.result=" + _setBGResult__return);


        }
        {
        System.out.println("Invoking login...");
        String _login_account = "";
        String _login_password = "";
        String _login_secretKey = "";
        Object _login__return = port.login(_login_account, _login_password, _login_secretKey);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking getPatientInfo...");
        String _getPatientInfo_account = "";
        String _getPatientInfo_token = "";
        String _getPatientInfo_serialNumber = "";
        Object _getPatientInfo__return = port.getPatientInfo(_getPatientInfo_account, _getPatientInfo_token, _getPatientInfo_serialNumber);
        System.out.println("getPatientInfo.result=" + _getPatientInfo__return);


        }

        System.exit(0);
    }

}
