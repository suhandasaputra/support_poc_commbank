/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boserverpos.servlet;

import com.bifast.process.AliasManagementRequest;
import com.bifast.process.CreditTransferRequest;
import com.bifast.process.MessageRejectResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

/**
 *
 * author MATAJARI MITRA SOLUSI
 */
public class BackendProcess extends HttpServlet {

//    Messagein msgin = new Messagein();
//    private Tempmsg tempmsg = new Tempmsg();
    private static Logger log = Logger.getLogger(BackendProcess.class);

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JDOMException {

        BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String input = "";
        String inputString = "";
        String line = "";
        String resp = "";
//        String resp = "";
        while ((line = in.readLine()) != null) {
            inputString += line;
        }
        inputString = inputString.replace("%20", " ");
        System.out.println("\n" + "Message Incoming :" + inputString + "\n");

        SAXBuilder builder = new SAXBuilder();
        InputStream stream = new ByteArrayInputStream(inputString.getBytes("UTF-8"));
        Document doc = builder.build(stream);
        Element root1 = doc.getRootElement();

        Namespace ns = Namespace.getNamespace("ns", "urn:iso");
        Namespace ns1 = Namespace.getNamespace("ns1", "urn:iso:std:iso:20022:tech:xsd:head.001.001.01");
        Element AppHeader = root1.getChild("AppHdr", ns);
        Element MsgDefIdr = AppHeader.getChild("MsgDefIdr", ns1);
        Element BizMsgIdr = AppHeader.getChild("BizMsgIdr", ns1);
        Element Document = root1.getChild("Document", ns);

        try {
            switch (MsgDefIdr.getValue()) {
                case "prxy.001.001.01":
                    System.out.println("Alias Management Request (prxy.001)");
                    input = new AliasManagementRequest().process(Document, ns, ns1);
                    response.getOutputStream().write(input.getBytes());
                    response.getOutputStream().flush();
                    break;
                case "pacs.008.001.08":
                    System.out.println("Credit Transfer Request (pacs.008)");
//                    input = new CreditTransferRequest().process(inputString, Document, ns, ns1);
                    resp = "<ns:BusMsg xmlns:ns=\"urn:iso\" xmlns:ns1=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" \n"
                            + "xmlns:ns2=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n"
                            + "xsi:schemaLocation=\"urn:iso ../../../xsd/phase1/MainCIHub.xsd \">\n"
                            + "<ns:AppHdr>\n"
                            + "<ns1:Fr>\n"
                            + "<ns1:FIId>\n"
                            + "<ns1:FinInstnId>\n"
                            + "<ns1:Othr>\n"
                            + "<ns1:Id>SWIFT</ns1:Id>\n"
                            + "</ns1:Othr>\n"
                            + "</ns1:FinInstnId>\n"
                            + "</ns1:FIId>\n"
                            + "</ns1:Fr>\n"
                            + "<ns1:To>\n"
                            + "<ns1:FIId>\n"
                            + "<ns1:FinInstnId>\n"
                            + "<ns1:Othr>\n"
                            + "<ns1:Id>MIOS</ns1:Id>\n"
                            + "</ns1:Othr>\n"
                            + "</ns1:FinInstnId>\n"
                            + "</ns1:FIId>\n"
                            + "</ns1:To>\n"
                            + "<ns1:BizMsgIdr>"+BizMsgIdr.getValue()+"</ns1:BizMsgIdr>\n"
                            + "<ns1:MsgDefIdr>pacs.002.001.10</ns1:MsgDefIdr>\n"
                            + "<ns1:BizSvc>CTRESPONSE</ns1:BizSvc>\n"
                            + "<ns1:CreDt>2021-03-01T12:00:00Z</ns1:CreDt>\n"
                            + "</ns:AppHdr>\n"
                            + "<ns:Document>\n"
                            + "<ns:FIToFIPmtStsRpt>\n"
                            + "<ns2:GrpHdr>\n"
                            + "<ns2:MsgId>20210301FASTIDJA11012345678</ns2:MsgId>\n"
                            + "<ns2:CreDtTm>2021-03-01T19:00:00.000</ns2:CreDtTm>\n"
                            + "</ns2:GrpHdr>\n"
                            + "<ns2:OrgnlGrpInfAndSts>\n"
                            + "<ns2:OrgnlMsgId>20210301INDOIDJA11012345678</ns2:OrgnlMsgId>\n"
                            + "<ns2:OrgnlMsgNmId>pacs.008.001.08</ns2:OrgnlMsgNmId>\n"
                            + "</ns2:OrgnlGrpInfAndSts>\n"
                            + "<ns2:TxInfAndSts>\n"
                            + "<ns2:OrgnlEndToEndId>20210301INDOIDJA110ORB12345678</ns2:OrgnlEndToEndId>\n"
                            + "<ns2:OrgnlTxId>20210301INDOIDJA11012345678</ns2:OrgnlTxId>\n"
                            + "<ns2:TxSts>ACTC</ns2:TxSts>\n"
                            + "<ns2:StsRsnInf>\n"
                            + "<ns2:Rsn>\n"
                            + "<ns2:Prtry>U000</ns2:Prtry>\n"
                            + "</ns2:Rsn>\n"
                            + "<ns2:AddtlInf>O 1234</ns2:AddtlInf>\n"
                            + "</ns2:StsRsnInf>\n"
                            + "<ns2:OrgnlTxRef>\n"
                            + "<ns2:IntrBkSttlmDt>2021-03-01</ns2:IntrBkSttlmDt>\n"
                            + "<ns2:Cdtr>\n"
                            + "<ns2:Pty>\n"
                            + "<ns2:Nm>JOHN SMITH</ns2:Nm>\n"
                            + "</ns2:Pty>\n"
                            + "</ns2:Cdtr>\n"
                            + "</ns2:OrgnlTxRef>\n"
                            + "<ns2:SplmtryData>\n"
                            + "<ns2:Envlp>\n"
                            + "<ns2:Cdtr>\n"
                            + "<ns2:Tp>01</ns2:Tp>\n"
                            + "<ns2:Id>0102030405060708</ns2:Id>\n"
                            + "<ns2:RsdntSts>01</ns2:RsdntSts>\n"
                            + "<ns2:TwnNm>0300</ns2:TwnNm>\n"
                            + "</ns2:Cdtr>\n"
                            + "</ns2:Envlp>\n"
                            + "</ns2:SplmtryData>\n"
                            + "</ns2:TxInfAndSts>\n"
                            + "</ns:FIToFIPmtStsRpt>\n"
                            + "</ns:Document>\n"
                            + "</ns:BusMsg>";
                    response.getOutputStream().write(resp.getBytes());
                    response.getOutputStream().flush();
                    break;
                default:
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Message Reject Response (admi.002)");
            input = new MessageRejectResponse().process();
            response.getOutputStream().write(input.getBytes());
            response.getOutputStream().flush();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            java.util.logging.Logger.getLogger(BackendProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            java.util.logging.Logger.getLogger(BackendProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
