/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boserverpos.servlet;

import com.bifast.process.AliasManagementRequest;
import com.bifast.process.CreditTransferRequest;
import com.bifast.process.MessageRejectResponse;
import com.bo.function.JsonProcess;
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
import java.util.HashMap;
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
        HashMap resp = new HashMap();
        HashMap input1 = new HashMap();
        HashMap input2 = new HashMap();
        
        while ((line = in.readLine()) != null) {
            inputString += line;
        }
        inputString = inputString.replace("%20", " ");
        System.out.println("\n" + "Message Incoming :" + inputString + "\n");
        input1 = JsonProcess.decodeJson(inputString);
        input2 = (HashMap) input1.get("transAmount");
        try {
            
            resp.put("responseCode", "00");
            resp.put("responseMessage", "Successfully");
            resp.put("customerId", input1.get("customerId"));
            resp.put("bankCardToken", input1.get("bankCardToken"));
            resp.put("isDeepLink", input1.get("isDeepLink"));
            resp.put("type", input1.get("type"));
            resp.put("otpStatus", input1.get("otpStatus"));
            resp.put("settlementAccount", input1.get("settlementAccount"));
            resp.put("referenceNo", "08493296759260462774");
            resp.put("partnerReferenceNo", input1.get("partnerReferenceNo"));
            resp.put("description", "Pajak Bumi Bangunan");
            resp.put("amount",  input1.get("value"));
            resp.put("currency",  input1.get("currency"));                
            resp.put("merchantTrxId", input1.get("merchantTrxId"));
                
            System.out.println("\n" + "Message Outgoing :" + resp + "\n");
            response.getOutputStream().write(JsonProcess.generateJson(resp).getBytes());
            response.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("message tidak dikenali");
            resp.put("responseCode", "04");
            resp.put("responseMessage", "message tidak dikenali");

            response.getOutputStream().write(JsonProcess.generateJson(resp).getBytes());
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
