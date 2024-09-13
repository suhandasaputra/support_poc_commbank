
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] a) throws ClassNotFoundException, InstantiationException {
        String username, password, url;
        Connection conect = null;
        ResultSet rs = null;

        List batchHasil = new ArrayList();
        try {

            Class.forName("org.postgresql.Driver").newInstance();
            url = "jdbc:postgresql://localhost/mios";
            username = "postgres";
            password = "sugi50361";
            try {
                conect = DriverManager.getConnection(url, username, password);
                PreparedStatement statemen = conect.prepareStatement("SELECT* FROM am_trancode WHERE agent_id = ?");
                statemen.setString(1, "test");
                rs = statemen.executeQuery();
                while (rs.next()) {
                    HashMap result = new HashMap();
                    result.put("agent_id", "test");
                    result.put("trancodeid", rs.getString("trancodeid"));
                    result.put("feejual", rs.getString("feejual"));
                    result.put("hargajual", rs.getString("hargajual"));
                    result.put("profit", rs.getString("profit"));
                    batchHasil.add(result);
                }
                System.out.println("ini hasil : " + batchHasil);
                System.out.println("ini hasil length: " + batchHasil.size());
                for (int i = 0; i < batchHasil.size(); i++) {
                    HashMap record = new HashMap();
                    record = (HashMap) batchHasil.get(i);
                    System.out.println("ini record : " + record);
                    System.out.println("ini item : " + record.get("trancodeid"));
//                    PreparedStatement statemenInsert = conect.prepareStatement("INSERT INTO am_trancode(agent_id, trancodeid, feejual, hargajual, profit) VALUES(?, ?, ?, ?, ?)");
//                    statemenInsert.setString(1, record.get("agent_id").toString());
//                    statemenInsert.setInt(2, Integer.valueOf(record.get("trancodeid").toString()));
//                    statemenInsert.setInt(3, Integer.valueOf(record.get("feejual").toString()));
//                    statemenInsert.setInt(4, Integer.valueOf(record.get("hargajual").toString()));
//                    statemenInsert.setInt(5, Integer.valueOf(record.get("profit").toString()));
//                    statemenInsert.executeUpdate();
//                    statemenInsert.close();

                }
//                System.out.println("Berhasil insert............");
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);
                System.exit(1);
            }
        } catch (Exception ex) {
            System.out.println("salah " + ex);
        }
    }

}
