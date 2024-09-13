
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Custom2 {

    public void customDialog(HashMap req, HashMap resp) {

        JTextField name = new JTextField();
        name.setEditable(false);
        name.setText(resp.get(FieldParamater.name).toString());
        JTextField bankName = new JTextField();
        bankName.setEditable(false);
        bankName.setText(resp.get(FieldParamater.toBank).toString());
        JTextField accountNumber = new JTextField();
        accountNumber.setEditable(false);
        accountNumber.setText(resp.get(FieldParamater.toAccount).toString());
        JTextField amount = new JTextField();
        amount.setEditable(false);
        amount.setText(resp.get(FieldParamater.amount).toString());
        final JComponent[] inputs = new JComponent[]{
            new JLabel("Nama"),
            name,
            new JLabel("Nama Bank"),
            bankName,
            new JLabel("Nomor Rekening"),
            accountNumber,
            new JLabel("Amount " + "(" + resp.get(FieldParamater.Ccy).toString() + ")"),
            amount,};
        int result = JOptionPane.showConfirmDialog(null, inputs, "Creadit Transfer To", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            HashMap remitter = new LinkedHashMap();
            HashMap beneficiary = new LinkedHashMap();
            HashMap messageToServer = new LinkedHashMap();
            HashMap body = new LinkedHashMap();
            HashMap document = new LinkedHashMap();
            HashMap fIToFICstmrCdtTrf = new LinkedHashMap();
            HashMap grpHdr = new LinkedHashMap();
            HashMap sttlmInf = new LinkedHashMap();
            HashMap cdtTrfTxInf = new LinkedHashMap();
            HashMap pmtId = new LinkedHashMap();
            HashMap pmtTpInf = new LinkedHashMap();
            HashMap intrBkSttlmAmt = new LinkedHashMap();
            HashMap ccy = new LinkedHashMap();
            HashMap lclInstrm = new LinkedHashMap();
            HashMap ctgyPurp = new LinkedHashMap();
            HashMap dbtrAgt = new LinkedHashMap();
            HashMap dbtr;
            HashMap cdtr;
            HashMap dbtrAcct = new LinkedHashMap();
            HashMap cdtAgt = new LinkedHashMap();
            HashMap cdtrAcct = new LinkedHashMap();
            HashMap prxy = new LinkedHashMap();
            HashMap rmtInf = new LinkedHashMap();
            HashMap splmtryData = new LinkedHashMap();
            HashMap envlp = new LinkedHashMap();

            HashMap finInstnId;
            HashMap othr;
            HashMap id;
            HashMap privtId;
            HashMap tp;

            String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().getTime());
            String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime());

            grpHdr.put("MsgId", rrn);
            grpHdr.put("CreDtTm", dateNow);
            grpHdr.put("NbOfTxs", "1");
            sttlmInf.put("SttlmMtd", "CLRG");
            grpHdr.put("SttlmInf", sttlmInf);

            pmtId.put("EndToEndId", rrn);
            pmtId.put("TxId", rrn);
            cdtTrfTxInf.put("PmtId", pmtId);

            lclInstrm.put("Prtry", "01");
            ctgyPurp.put("Prtry", "02");
            pmtTpInf.put("LclInstrm", lclInstrm);
            pmtTpInf.put("CtgyPurp", ctgyPurp);
            cdtTrfTxInf.put("PmtTpInf", pmtTpInf);

            cdtTrfTxInf.put("IntrBkSttlmAmt", resp.get(FieldParamater.amount));
            cdtTrfTxInf.put("Ccy", resp.get(FieldParamater.Ccy));

            cdtTrfTxInf.put("IntrBkSttlmDt", dateNow);
            cdtTrfTxInf.put("ChrgBr", "DEBT");

            dbtr = new LinkedHashMap();
            dbtr.put("Nm", req.get("remitterName").toString());
            id = new LinkedHashMap();
            privtId = new LinkedHashMap();
            othr = new LinkedHashMap();
            othr.put("Id", "0102030405060708");
            privtId.put("Othr", othr);
            id.put("PrivtId", privtId);
            dbtr.put("Id", id);
            cdtTrfTxInf.put("Dbtr", dbtr);

            id = new LinkedHashMap();
            othr = new LinkedHashMap();
            othr.put("Id", req.get("remitterAccount").toString());
            id.put("Othr", othr);
            dbtrAcct.put("Id", id);

            tp = new LinkedHashMap();
            tp.put("Prtry", "CACC");
            dbtrAcct.put("Tp", tp);
            cdtTrfTxInf.put("DbtrAcct", dbtrAcct);

            cdtr = new LinkedHashMap();
            cdtr.put("Nm", resp.get(FieldParamater.name).toString());
            id = new LinkedHashMap();
            privtId = new LinkedHashMap();
            othr = new LinkedHashMap();
            othr.put("Id", "0102030405060708");
            privtId.put("Othr", othr);
            id.put("PrivtId", id);
            cdtr.put("Id", id);
            cdtTrfTxInf.put("Cdtr", dbtr);

            tp = new LinkedHashMap();
            tp.put("Prtry", "SVGS");
            cdtrAcct.put("Tp", tp);
            tp = new LinkedHashMap();
            tp.put("Prtry", "02");
            prxy.put("Tp", tp);
            prxy.put("Id", req.get("beneficiaryEmail").toString());
            cdtrAcct.put("Prxy", prxy);
            cdtTrfTxInf.put("CdtrAcct", cdtrAcct);

            rmtInf.put("Ustrd", "asdasd");
            cdtTrfTxInf.put("RmtInf", rmtInf);

            dbtr = new LinkedHashMap();
            dbtr.put("Tp", "01");
            dbtr.put("RsdntSts", "01");
            dbtr.put("TwnNm", "0300");
            envlp.put("Dbtr", dbtr);

            cdtr = new LinkedHashMap();
            cdtr.put("Tp", "01");
            cdtr.put("RsdntSts", "01");
            cdtr.put("TwnNm", "0300");
            envlp.put("Dbtr", dbtr);
            splmtryData.put("Envlp", envlp);
            cdtTrfTxInf.put("SplmtryData", splmtryData);

            othr = new LinkedHashMap();
            othr.put("Id", "CENAIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);

            dbtrAgt.put("FinInstnId", finInstnId);
            cdtTrfTxInf.put("DbtrAgt", dbtrAgt);

            othr = new LinkedHashMap();
            othr.put("Id", "INDOIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);

            cdtAgt.put("FinInstnId", finInstnId);

            cdtTrfTxInf.put("CdtrAgt", cdtAgt);

            othr = new LinkedHashMap();
            othr.put("Id", resp.get(FieldParamater.toAccount));

            id = new LinkedHashMap();
            id.put("Othr", othr);

            cdtrAcct.put("Id", id);
            cdtTrfTxInf.put("CdtrAcct", cdtrAcct);

            fIToFICstmrCdtTrf.put("GrpHdr", grpHdr);
            fIToFICstmrCdtTrf.put("CdtTrfTxInf", cdtTrfTxInf);
            document.put("FIToFICstmrCdtTrf", fIToFICstmrCdtTrf);
            body.put("Document", document);
            body.put("procCode", FieldParamater.creditTransfer);
            body.put("rrn", rrn);
            body.put("currentDate", dateNow);
            String response = SendMessage.sendMessage2(body);
            HashMap respHasMap = JsonProcess.decodeJson(response);
            if (respHasMap.get("resp_code").equals("0000")) {
                DBConnection2 dBConnection = new DBConnection2();

                HashMap currBalance = dBConnection.getCurrBalance(req.get("remitterAccount").toString());
                String previousBalance = currBalance.get(FieldParamater.currBalance).toString();
                int bookBalance = Integer.valueOf(currBalance.get(FieldParamater.balanceBook).toString()) + Integer.valueOf(resp.get(FieldParamater.amount).toString());
                HashMap updateBalance = new HashMap();
                updateBalance.put(FieldParamater.currBalance, String.valueOf(currBalance.get(FieldParamater.currBalance).toString()));
                updateBalance.put(FieldParamater.previousBalance, currBalance.get(FieldParamater.previousBalance).toString());
                updateBalance.put(FieldParamater.balanceBook, String.valueOf(bookBalance));
                updateBalance.put(FieldParamater.accountNumber, req.get("remitterAccount").toString());

                String Ccy = resp.get(FieldParamater.Ccy).toString();
                String amountt = resp.get(FieldParamater.amount).toString();
                String amountInWord = req.get("amountInWord").toString();
                String purposePayment = req.get("purposePayment").toString();
                String remitterAccount = req.get("remitterAccount").toString();
                String toAccount = resp.get(FieldParamater.toAccount).toString();
                String message = req.get("message").toString();
                String procCode = respHasMap.get("procCode").toString();
                String respCode = resp.get("resp_code").toString();
                String respDesc = resp.get("resp_desc").toString();
                String bankCode = "INDOIDJA";

                dBConnection.createTransaction(rrn, rrn, "DEBT", remitterAccount, toAccount, bankCode, "INDONESIA", amountt, Ccy, "0", "-", procCode, respCode, respDesc, JsonProcess.generateJson(body), response);

//                dBConnection.createTrx(rrn, "3", dateNow, Ccy, amountt, amountInWord, "-", purposePayment, remitterAccount, "DEBT", "1234", toAccount, "INDONESIA", message, procCode, respCode, respDesc, JsonProcess.generateJson(body), response, "DEBT");
                dBConnection.UpdateBalance(updateBalance);
                AlertDialog alertDialog = new AlertDialog();
                alertDialog.showalertdialog("Berhasil", "Transaksi sedang diproses");
            } else {
                System.out.println("Error : " + respHasMap.get("resp_desc"));
            }

        } else {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }

    }

}
