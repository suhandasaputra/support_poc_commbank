/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bifast.process;

import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 *
 * @author suhanda
 */
public class AliasRegistrationInquiryRequest {

    private static Logger log = Logger.getLogger(AliasRegistrationInquiryRequest.class);

    public HashMap process(HashMap input) {
        HashMap resp = new HashMap();
        String xml_nya = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<ns:BusMsg xmlns:ns2=\"urn:iso:std:iso:20022:tech:xsd:prxy.006.001.01\" xmlns:ns=\"urn:iso\" \n"
                + "xmlns:ns1=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n"
                + "xsi:schemaLocation=\"urn:iso ../../../xsd/phase1/MainCIHub.xsd \">\n"
                + "<ns:AppHdr>\n"
                + "<ns1:Fr>\n"
                + "<ns1:FIId>\n"
                + "<ns1:FinInstnId>\n"
                + "<ns1:Othr>\n"
                + "<ns1:Id>FASTIDJA</ns1:Id>\n"
                + "<!-- Sending system -->\n"
                + "</ns1:Othr>\n"
                + "</ns1:FinInstnId>\n"
                + "</ns1:FIId>\n"
                + "</ns1:Fr>\n"
                + "<ns1:To>\n"
                + "<ns1:FIId>\n"
                + "<ns1:FinInstnId>\n"
                + "<ns1:Othr>\n"
                + "<ns1:Id>INDOIDJA</ns1:Id>\n"
                + "<!-- Receiving system -->\n"
                + "</ns1:Othr>\n"
                + "</ns1:FinInstnId>\n"
                + "</ns1:FIId>\n"
                + "</ns1:To>\n"
                + "<ns1:BizMsgIdr>20210301INDOIDJATTTHRB12345678</ns1:BizMsgIdr>\n"
                + "<ns1:MsgDefIdr>prxy.006.001.01</ns1:MsgDefIdr>\n"
                + "<ns1:CreDt>2021-03-01T12:00:00Z</ns1:CreDt>\n"
                + "</ns:AppHdr>\n"
                + "<ns:Document>\n"
                + "<ns:PrxyNqryRspn>\n"
                + "<ns2:GrpHdr>\n"
                + "<ns2:MsgId>20210301FASTIDJA710HRB12345679</ns2:MsgId>\n"
                + "<ns2:CreDtTm>2021-09-27T19:00:00.000</ns2:CreDtTm>\n"
                + "<ns2:MsgRcpt>\n"
                + "<ns2:Agt>\n"
                + "<ns2:FinInstnId>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>INDOIDJA</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:FinInstnId>\n"
                + "</ns2:Agt>\n"
                + "</ns2:MsgRcpt>\n"
                + "</ns2:GrpHdr>\n"
                + "<ns2:OrgnlGrpInf>\n"
                + "<ns2:OrgnlMsgId>20210301INDOIDJA710HRB12345678</ns2:OrgnlMsgId>\n"
                + "<ns2:OrgnlMsgNmId>prxy.005.001.01</ns2:OrgnlMsgNmId>\n"
                + "<ns2:OrgnlCreDtTm>2021-09-27T18:59:58.000</ns2:OrgnlCreDtTm>\n"
                + "</ns2:OrgnlGrpInf>\n"
                + "<ns2:NqryRspn>\n"
                + "<ns2:PrxRspnSts>ACTC</ns2:PrxRspnSts>\n"
                + "<ns2:StsRsnInf>\n"
                + "<ns2:Prtry>U000</ns2:Prtry>\n"
                + "</ns2:StsRsnInf>\n"
                + "<ns2:Rspn>\n"
                + "<!-- first entry -->\n"
                + "<ns2:RegnId>6789012345</ns2:RegnId>\n"
                + "<ns2:DsplNm>Mr. James Brown</ns2:DsplNm>\n"
                + "<ns2:Ptcpt>\n"
                + "<ns2:FinInstnId>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>INDOIDJA</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:FinInstnId>\n"
                + "</ns2:Ptcpt>\n"
                + "<ns2:PrxyInf>\n"
                + "<ns2:Tp>02</ns2:Tp>\n"
                + "<ns2:Val>james.brown@example.com</ns2:Val>\n"
                + "<ns2:Sts>ACTV</ns2:Sts>\n"
                + "</ns2:PrxyInf>\n"
                + "<ns2:AcctInf>\n"
                + "<ns2:Agt>\n"
                + "<ns2:FinInstnId>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>INDOIDJA</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:FinInstnId>\n"
                + "</ns2:Agt>\n"
                + "<ns2:Acct>\n"
                + "<ns2:Id>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>2040606090112</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:Id>\n"
                + "<ns2:Tp>\n"
                + "<ns2:Prtry>CACC</ns2:Prtry>\n"
                + "</ns2:Tp>\n"
                + "<ns2:Nm>James Brown</ns2:Nm>\n"
                + "</ns2:Acct>\n"
                + "</ns2:AcctInf>\n"
                + "<ns2:SplmtryData>\n"
                + "<ns2:Envlp>\n"
                + "<ns2:Cstmr>\n"
                + "<ns2:Tp>01</ns2:Tp>\n"
                + "<ns2:Id>1020304050607080</ns2:Id>\n"
                + "<ns2:RsdntSts>01</ns2:RsdntSts>\n"
                + "<ns2:TwnNm>0300</ns2:TwnNm>\n"
                + "</ns2:Cstmr>\n"
                + "</ns2:Envlp>\n"
                + "</ns2:SplmtryData>\n"
                + "</ns2:Rspn>\n"
                + "<ns2:Rspn>\n"
                + "<!-- second entry -->\n"
                + "<ns2:RegnId>6789012346</ns2:RegnId>\n"
                + "<ns2:DsplNm>Mr. James Brown</ns2:DsplNm>\n"
                + "<ns2:Ptcpt>\n"
                + "<ns2:FinInstnId>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>CENAIDJA</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:FinInstnId>\n"
                + "</ns2:Ptcpt>\n"
                + "<ns2:PrxyInf>\n"
                + "<ns2:Tp>01</ns2:Tp>\n"
                + "<ns2:Val>02192189944</ns2:Val>\n"
                + "<ns2:Sts>ACTV</ns2:Sts>\n"
                + "</ns2:PrxyInf>\n"
                + "<ns2:AcctInf>\n"
                + "<ns2:Agt>\n"
                + "<ns2:FinInstnId>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>CENAIDJA</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:FinInstnId>\n"
                + "</ns2:Agt>\n"
                + "<ns2:Acct>\n"
                + "<ns2:Id>\n"
                + "<ns2:Othr>\n"
                + "<ns2:Id>6120920400160</ns2:Id>\n"
                + "</ns2:Othr>\n"
                + "</ns2:Id>\n"
                + "<ns2:Tp>\n"
                + "<ns2:Prtry>SVGS</ns2:Prtry>\n"
                + "</ns2:Tp>\n"
                + "<ns2:Nm>James Brown</ns2:Nm>\n"
                + "</ns2:Acct>\n"
                + "</ns2:AcctInf>\n"
                + "<ns2:SplmtryData>\n"
                + "<ns2:Envlp>\n"
                + "<ns2:Cstmr>\n"
                + "<ns2:Tp>01</ns2:Tp>\n"
                + "<ns2:Id>1020304050607080</ns2:Id>\n"
                + "<ns2:RsdntSts>01</ns2:RsdntSts>\n"
                + "<ns2:TwnNm>0300</ns2:TwnNm>\n"
                + "</ns2:Cstmr>\n"
                + "</ns2:Envlp>\n"
                + "</ns2:SplmtryData>\n"
                + "</ns2:Rspn>\n"
                + "</ns2:NqryRspn>\n"
                + "</ns:PrxyNqryRspn>\n"
                + "</ns:Document>\n"
                + "</ns:BusMsg>";
        resp.put("xml_nya", xml_nya);
        return resp;
    }
}
