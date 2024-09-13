/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.*;

public class DBConnection {

    private String username, password, url;
    public Connection conect;

    public Connection DBConnection() {
        try {

            Class.forName("org.postgresql.Driver").newInstance();
            url = "jdbc:postgresql://103.41.204.105:5432/skn_bi_db";
            username = "postgres";
            password = "MMS@P@ssw0rd123";
            try {
                conect = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);
                System.exit(1);
            }
        } catch (Exception ex) {
            System.out.println("salah " + ex);
        }
        return conect;
    }

    public void createAlias(String fullName, String gender, String citizenship, String country, String bornPlace, String bornDate, String mother, String idCardType, String numberId, String lastEducation, String religion, String marriageStatus, String address, String rt, String rw, String village, String kecamatan, String kabupaten, String province, String postCode, String alias, String accountNumber, String as_alias) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
            PreparedStatement statemen = connection.prepareStatement("INSERT INTO am_user(number_id, type_id,name, born_place, born_date, gender, last_education,citizenship, country,  marriage_status, biological_mother, religion, address, rt, rw, kecamatan, kabupaten, province, post_code, alias, account_number, as_alias) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statemen.setString(1, numberId);
            statemen.setString(2, idCardType);
            statemen.setString(3, fullName);
            statemen.setString(4, bornPlace);
            statemen.setString(5, bornDate);
            statemen.setString(6, gender);
            statemen.setString(7, lastEducation);
            statemen.setString(8, citizenship);
            statemen.setString(9, country);
            statemen.setString(10, marriageStatus);
            statemen.setString(11, mother);
            statemen.setString(12, religion);
            statemen.setString(13, address);
            statemen.setString(14, rt);
            statemen.setString(15, rw);
            statemen.setString(16, kecamatan);
            statemen.setString(17, kabupaten);
            statemen.setString(18, province);
            statemen.setString(19, postCode);
            statemen.setString(20, alias);
            statemen.setString(21, accountNumber);
            statemen.setString(22, as_alias);

            statemen.executeUpdate();
            statemen.close();
            System.out.println("Data user Telah Tersimpan");
        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }
    }

    public void updateAccount(String fullName, String gender, String citizenship, String country, String bornPlace, String bornDate, String mother, String idCardType, String numberId, String lastEducation, String religion, String marriageStatus, String address, String rt, String rw, String village, String kecamatan, String kabupaten, String province, String postCode, String alias, String accountNumber, String as_alias, String customerType) {
        String dateNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        try {
//            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
            PreparedStatement statemen = DBConnection().prepareStatement("UPDATE am_user SET number_id=?, type_id=?,name=?, born_place=?, born_date=?, gender=?, last_education=?,citizenship=?, country=?,  marriage_status=?, biological_mother=?, religion=?, address=?, rt=?, rw=?, kecamatan=?, kabupaten=?, province=?, post_code=?, alias=?, as_alias=?, customer_type=?, has_create_alias=?, activate_date_alias=? WHERE account_number=?");
            statemen.setString(1, numberId);
            statemen.setString(2, idCardType);
            statemen.setString(3, fullName);
            statemen.setString(4, bornPlace);
            statemen.setString(5, bornDate);
            statemen.setString(6, gender);
            statemen.setString(7, lastEducation);
            statemen.setString(8, citizenship);
            statemen.setString(9, country);
            statemen.setString(10, marriageStatus);
            statemen.setString(11, mother);
            statemen.setString(12, religion);
            statemen.setString(13, address);
            statemen.setString(14, rt);
            statemen.setString(15, rw);
            statemen.setString(16, kecamatan);
            statemen.setString(17, kabupaten);
            statemen.setString(18, province);
            statemen.setString(19, postCode);
            statemen.setString(20, alias);
            statemen.setString(21, as_alias);
            statemen.setString(22, customerType);
            statemen.setString(23, "true");
            statemen.setString(24, dateNow);
            statemen.setString(25, accountNumber);

            statemen.executeUpdate();
            statemen.close();
            System.out.println("Data user Telah Diubah");
            AlertDialog alertDialog = new AlertDialog();
            alertDialog.showalertdialog("Berhasil", "Data berhasil diubah");

        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }
    }

    public void activateAlias(String fullName, String gender, String citizenship, String country, String bornPlace, String bornDate, String mother, String idCardType, String numberId, String lastEducation, String religion, String marriageStatus, String address, String rt, String rw, String village, String kecamatan, String kabupaten, String province, String postCode, String alias, String accountNumber, String as_alias, String customerType) {

        try {
            String dateNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'").format(Calendar.getInstance().getTime());

            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
            PreparedStatement statemen = connection.prepareStatement("UPDATE am_user SET number_id=?, type_id=?,name=?, born_place=?, born_date=?, gender=?, last_education=?,citizenship=?, country=?,  marriage_status=?, biological_mother=?, religion=?, address=?, rt=?, rw=?, kecamatan=?, kabupaten=?, province=?, post_code=?, alias=?, as_alias=?, customer_type=?, activate_alias WHERE account_number=?");
            statemen.setString(1, numberId);
            statemen.setString(2, idCardType);
            statemen.setString(3, fullName);
            statemen.setString(4, bornPlace);
            statemen.setString(5, bornDate);
            statemen.setString(6, gender);
            statemen.setString(7, lastEducation);
            statemen.setString(8, citizenship);
            statemen.setString(9, country);
            statemen.setString(10, marriageStatus);
            statemen.setString(11, mother);
            statemen.setString(12, religion);
            statemen.setString(13, address);
            statemen.setString(14, rt);
            statemen.setString(15, rw);
            statemen.setString(16, kecamatan);
            statemen.setString(17, kabupaten);
            statemen.setString(18, province);
            statemen.setString(19, postCode);
            statemen.setString(20, alias);
            statemen.setString(21, as_alias);
            statemen.setString(22, customerType);
            statemen.setString(23, dateNow);
            statemen.setString(24, accountNumber);

            statemen.executeUpdate();
            statemen.close();
            System.out.println("Data user Telah Diubah");

        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }
    }

    public HashMap getCurrBalance(String accountNumbber) {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        HashMap result = new HashMap();
        try {
            stat = DBConnection().prepareStatement("select * from am_balance where account_number=? ");
            stat.setString(1, accountNumbber);
            rs = stat.executeQuery();
            while (rs.next()) {
                result.put(FieldParamater.currBalance, rs.getString("curr_balance"));
                result.put(FieldParamater.balanceBook, rs.getString("book_balance"));
                result.put(FieldParamater.previousBalance, rs.getString("prev_balance"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            clearAllConnStatRS(conn, stat, rs);
        }
        return result;
    }

    public Boolean UpdateBalance(HashMap inputMap) {
        Connection conn = null;
        PreparedStatement stat = null;
        HashMap resData = new HashMap();

        try {

            stat = DBConnection().prepareStatement("UPDATE am_balance SET  curr_balance=?, book_balance=?, prev_balance=? where account_number=?");
            stat.setString(1, inputMap.get(FieldParamater.currBalance).toString());
            stat.setString(2, inputMap.get(FieldParamater.balanceBook).toString());
            stat.setString(3, inputMap.get(FieldParamater.previousBalance).toString());
            stat.setString(4, inputMap.get(FieldParamater.accountNumber).toString());

            stat.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            clearStatment(stat);
            clearDBConnection(conn);
        }
        return false;

    }

    public void createTrx(String rrn, String typeTrx, String date, String currency, String amount, String amountInWord, String sourceOfFund, String purposePayment, String remitterAccount, String chrageTo, String bankCode, String beneficiaryAccount, String country, String message, String procCode, String respCode, String respDesc, String reqMsg, String respMsg, String trx_type) {

        try {
//            Class.forName("org.postgresql.Driver");
////            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://103.41.204.105:5432/skn_bi_db", "postgres", "MMS@P@ssw0rd123");

            PreparedStatement statemen = DBConnection().prepareStatement("INSERT INTO log_trx(proc_code, req_msg,resp_msg, resp_code, resp_dsc, rrn, trx_type, currency,amount, amount_id_word,  source_of_fund, purpose_payment, remitter_account, beneficiary_account, charge_to, bank_code, country, trx_id, status, type_trx) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statemen.setString(1, procCode);
            statemen.setString(2, reqMsg);
            statemen.setString(3, respMsg);
            statemen.setString(4, respCode);
            statemen.setString(5, respDesc);
            statemen.setString(6, rrn);
            statemen.setString(7, typeTrx);
            statemen.setString(8, currency);
            statemen.setString(9, amount);
            statemen.setString(10, amountInWord);
            statemen.setString(11, sourceOfFund);
            statemen.setString(12, purposePayment);
            statemen.setString(13, remitterAccount);
            statemen.setString(14, beneficiaryAccount);
            statemen.setString(15, chrageTo);
            statemen.setString(16, bankCode);
            statemen.setString(17, country);
            statemen.setString(18, rrn);
            statemen.setString(19, "0");
            statemen.setString(20, trx_type);

            statemen.executeUpdate();
            statemen.close();
            System.out.println("Data trx Telah Tersimpan");
        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }
    }
//    public void createTransaction(String rrn, String typeTrx, String date, String currency, String amount, String amountInWord, String sourceOfFund, String purposePayment, String remitterAccount, String chrageTo, String bankCode, String beneficiaryAccount, String country, String message, String procCode, String respCode, String respDesc, String reqMsg, String respMsg, String trx_type) {

    public void createTransaction(String rrn, String trxId, String trxType, String fromAccount, String toAccount, String bankCode, String country, String amount, String currency, String status, String dateApproved, String procCode, String respCode, String respDesc, String reqMsg, String respMsg) {

        try {
//            Class.forName("org.postgresql.Driver");
////            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://103.41.204.105:5432/skn_bi_db", "postgres", "MMS@P@ssw0rd123");
            String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().getTime());

            PreparedStatement statemen = DBConnection().prepareStatement("INSERT INTO log_transaction(rrn, trx_id, trx_type, from_account, to_account, amount, currency, country, status,date_approved, bank_code, proc_code, resp_code, resp_desc, req_msg, resp_msg, trx_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statemen.setString(1, rrn);
            statemen.setString(2, trxId);
            statemen.setString(3, trxType);
            statemen.setString(4, fromAccount);
            statemen.setString(5, toAccount);
            statemen.setString(6, amount);
            statemen.setString(7, currency);
            statemen.setString(8, country);
            statemen.setString(9, status);
            statemen.setString(10, dateApproved);
            statemen.setString(11, bankCode);
            statemen.setString(12, procCode);
            statemen.setString(13, respCode);
            statemen.setString(14, respDesc);
            statemen.setString(15, reqMsg);
            statemen.setString(16, respMsg);
            statemen.setString(17, dateNow);

            statemen.executeUpdate();
            statemen.close();
            System.out.println("Data trx Telah Tersimpan");
        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }
    }

    public HashMap getAccount(String accountNumber) {
        HashMap accountHasMap = new HashMap();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
            preparedStatement = DBConnection().prepareStatement("select* from am_user where account_number = ?");
            preparedStatement.setString(1, accountNumber);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                accountHasMap.put("user_id", resultSet.getString("user_id"));
                accountHasMap.put("number_id", resultSet.getString("number_id"));
                accountHasMap.put("account_number", resultSet.getString("account_number"));
                accountHasMap.put("name", resultSet.getString("name"));
                accountHasMap.put("born_place", resultSet.getString("born_place"));
                accountHasMap.put("born_date", resultSet.getString("born_date"));
                accountHasMap.put("gender", resultSet.getString("gender"));
                accountHasMap.put("last_education", resultSet.getString("last_education"));
                accountHasMap.put("citizenship", resultSet.getString("citizenship"));
                accountHasMap.put("marriage_status", resultSet.getString("marriage_status"));
                accountHasMap.put("biological_mother", resultSet.getString("biological_mother"));
                accountHasMap.put("religion", resultSet.getString("religion"));
                accountHasMap.put("email", resultSet.getString("email"));
                accountHasMap.put("address", resultSet.getString("address"));
                accountHasMap.put("rt", resultSet.getString("rt"));
                accountHasMap.put("rw", resultSet.getString("rw"));
                accountHasMap.put("village", resultSet.getString("village"));
                accountHasMap.put("kecamatan", resultSet.getString("kecamatan"));
                accountHasMap.put("kabupaten", resultSet.getString("kabupaten"));
                accountHasMap.put("province", resultSet.getString("province"));
                accountHasMap.put("post_code", resultSet.getString("post_code"));
                accountHasMap.put("phone_number", resultSet.getString("phon_number"));
                accountHasMap.put("type_id", resultSet.getString("type_id"));
                accountHasMap.put("country", resultSet.getString("country"));
                accountHasMap.put("alias", resultSet.getString("alias"));
                accountHasMap.put("as_alias", resultSet.getString("as_alias"));
                accountHasMap.put("has_create_alias", resultSet.getString("has_create_alias"));
            }

        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        } finally {
            clearAllConnStatRS(DBConnection(), preparedStatement, resultSet);
        }
        return accountHasMap;
    }

    public ArrayList getAllAccount() {

        ArrayList accArrayList = new ArrayList();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
//            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/skn_bi_db", "postgres", "sugi50361");
            preparedStatement = DBConnection().prepareStatement("select* from am_user");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HashMap accountHasMap = new HashMap();
                accountHasMap.put("user_id", resultSet.getString("user_id"));
                accountHasMap.put("number_id", resultSet.getString("number_id"));
                accountHasMap.put("account_number", resultSet.getString("account_number"));
                accountHasMap.put("name", resultSet.getString("name"));
                accountHasMap.put("born_place", resultSet.getString("born_place"));
                accountHasMap.put("born_date", resultSet.getString("born_date"));
                accountHasMap.put("gender", resultSet.getString("gender"));
                accountHasMap.put("last_education", resultSet.getString("last_education"));
                accountHasMap.put("citizenship", resultSet.getString("citizenship"));
                accountHasMap.put("marriage_status", resultSet.getString("marriage_status"));
                accountHasMap.put("biological_mother", resultSet.getString("biological_mother"));
                accountHasMap.put("religion", resultSet.getString("religion"));
                accountHasMap.put("email", resultSet.getString("email"));
                accountHasMap.put("address", resultSet.getString("address"));
                accountHasMap.put("rt", resultSet.getString("rt"));
                accountHasMap.put("rw", resultSet.getString("rw"));
                accountHasMap.put("village", resultSet.getString("village"));
                accountHasMap.put("kecamatan", resultSet.getString("kecamatan"));
                accountHasMap.put("kabupaten", resultSet.getString("kabupaten"));
                accountHasMap.put("province", resultSet.getString("province"));
                accountHasMap.put("post_code", resultSet.getString("post_code"));
                accountHasMap.put("phone_number", resultSet.getString("phon_number"));
                accountHasMap.put("type_id", resultSet.getString("type_id"));
                accountHasMap.put("country", resultSet.getString("country"));
                accountHasMap.put("alias", resultSet.getString("alias"));
                accountHasMap.put("as_alias", resultSet.getString("as_alias"));
                accountHasMap.put("has_create_alias", resultSet.getString("has_create_alias"));
                accArrayList.add(accountHasMap);
            }

        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        } finally {
            clearAllConnStatRS(DBConnection(), preparedStatement, resultSet);
        }
        return accArrayList;
    }

    
    public ArrayList getListTrx() {
        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;
        ArrayList result = new ArrayList();

        try {
          
            stat = DBConnection().prepareStatement("select proc_code, rrn, trx_id, trx_type, from_account, to_account, amount, currency, status, trx_date, bank_code, country, date_approved  from log_transaction");
            rs = stat.executeQuery();
            while (rs.next()) {
                HashMap receord = new HashMap();
                receord.put("procCode", rs.getString("proc_code"));
                receord.put("rrn", rs.getString("rrn"));
                receord.put("trx_id", rs.getString("trx_id"));
                receord.put("fromAccount", rs.getString("from_account"));
                receord.put("toAccount", rs.getString("to_account"));
                receord.put("amount", rs.getString("amount"));
                receord.put("currency", rs.getString("currency"));
                receord.put("status", rs.getString("status"));
                receord.put("trx_date", rs.getString("trx_date"));
                receord.put("trx_type", rs.getString("trx_type"));
                receord.put("bank_name", rs.getString("bank_code"));
                receord.put("dateApproved", rs.getString("date_approved"));
//               
                result.add(receord);

            }

        } catch (Exception e) {
            System.out.println("Kesalahan, silahkan periksa" + e);
        }  finally {
            clearAllConnStatRS(DBConnection(), stat, rs);
        }
        return result;
    }
    public static void clearAllConnStatRS(Connection conn, PreparedStatement stat, ResultSet rs) {
        clearResultset(rs);
        clearStatment(stat);
        clearDBConnection(conn);
    }

    public static void clearStatment(PreparedStatement stat) {
//        log.info("stat 2 : " + stat);
        if (stat != null) {
            try {
//                log.info("stat A");
                stat.clearBatch();
//                log.info("stat B");
                stat.clearParameters();
//                log.info("stat C");
                stat.close();
//                log.info("stat D");
                stat = null;
//                log.info("stat E");
            } catch (SQLException ex) {
//                log.error("clearStatment : " +ex.getMessage());
//                ex.printStackTrace();
            }
        }
    }

    public static void clearDBConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
            }
        }
    }

    public static void clearResultset(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException ex) {
            }
        }
    }

}
