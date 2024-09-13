
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class MainPageJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form MainPageJFrame
     */
    public MainPageJFrame2() {
        initComponents();
        
        DBConnection2 dBConnection = new DBConnection2();
        ArrayList accountArrayList = dBConnection.getAllAccount();
        ArrayList trxArrayList = dBConnection.getListTrx();
        String colAccount[] = {"No.Rek.", "Nama", "Email", "Ponsel", "Alias"};
        DefaultTableModel tableModelAccount = new DefaultTableModel(colAccount, 0);
        String coltrx[] = {"No.Ref.", "Tanggal", "Jenis Trx", "Amount", "Akun Pengirim", "Akun Penerima", "Bank", "Status", "Tanggal Disetujui"};
        DefaultTableModel tableModeltrx = new DefaultTableModel(coltrx, 0);

//        String data[][] = {{"Vinod", "MCA", "Computer"},
//        {"Deepak", "PGDCA", "History"},
//        {"Ranjan", "M.SC.", "Biology"},
//        {"Radha", "BCA", "Computer"}};
        if (dBConnection.getAllAccount().size() > 0) {
            for (int i = 0; i < accountArrayList.size(); i++) {
                HashMap accountHasMap = (HashMap) accountArrayList.get(i);
                Object[] objs = {accountHasMap.get("account_number").toString(), accountHasMap.get("name").toString(), accountHasMap.get("email").toString(), accountHasMap.get("phone_number").toString(), accountHasMap.get("alias").toString()};
//            String[] itemAccountArr = {accountHasMap.get("account_number").toString(), accountHasMap.get("name").toString(), accountHasMap.get("address").toString(), accountHasMap.get("email").toString(), accountHasMap.get("phone_number").toString(), accountHasMap.get("alias").toString()};

                tableModelAccount.addRow(objs);
                jTable1.setModel(tableModelAccount);

            }
        }

        if (dBConnection.getListTrx().size() > 0) {
            for (int i = 0; i < trxArrayList.size(); i++) {
                HashMap trxHasMap = (HashMap) trxArrayList.get(i);

                String status= "";
                if (trxHasMap.get("status").toString().equals("0")) {
                    status = "Sedang di Proses";
                } else if (trxHasMap.get("status").toString().equals("1")) {
                    status = "Berhasil";
                } else if (trxHasMap.get("status").toString().equals("2")) {
                    status = "Ditolak";
                }

                Object[] objs = {trxHasMap.get("rrn").toString(), trxHasMap.get("trx_date").toString(), trxHasMap.get("trx_type").toString(), trxHasMap.get("amount").toString(), trxHasMap.get("fromAccount").toString(), trxHasMap.get("toAccount").toString(), trxHasMap.get("bank_name").toString(), status, trxHasMap.get("dateApproved").toString()};
//            String[] itemAccountArr = {accountHasMap.get("account_number").toString(), accountHasMap.get("name").toString(), accountHasMap.get("address").toString(), accountHasMap.get("email").toString(), accountHasMap.get("phone_number").toString(), accountHasMap.get("alias").toString()};

                tableModeltrx.addRow(objs);
                jTable2.setModel(tableModeltrx);

            }
        }

        trxDatejTextField.setText(new SimpleDateFormat("dd/MM/yy").format(Calendar.getInstance().getTime()));
        accountNumberjTextField1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField1.getText().length() == 1) {
                    accountNumberjTextField2.requestFocus();
                    accountNumberjTextField2.setEditable(true);
                    accountNumberjTextField1.setEditable(false);
                }
            }
        });

        accountNumberjTextField2.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField2.getText().length() == 1) {
                    accountNumberjTextField3.requestFocus();
                    accountNumberjTextField3.setEditable(true);
                    accountNumberjTextField2.setEditable(false);
                } else if (accountNumberjTextField2.getText().length() < 1) {
                    accountNumberjTextField1.requestFocus();
                    accountNumberjTextField1.setEditable(true);

                }
            }
        });
        if (accountNumberjTextField2.getText().isEmpty()) {
            accountNumberjTextField2.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField1.requestFocus();
                        accountNumberjTextField1.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        accountNumberjTextField3.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField3.getText().length() == 1) {
                    accountNumberjTextField4.requestFocus();
                    accountNumberjTextField4.setEditable(true);
                    accountNumberjTextField3.setEditable(false);
                } else if (accountNumberjTextField3.getText().length() < 1) {
                    accountNumberjTextField2.requestFocus();
                    accountNumberjTextField2.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField3.getText().isEmpty()) {
            accountNumberjTextField3.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField2.requestFocus();
                        accountNumberjTextField2.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        accountNumberjTextField4.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField4.getText().length() == 1) {
                    accountNumberjTextField5.requestFocus();
                    accountNumberjTextField5.setEditable(true);
                    accountNumberjTextField4.setEditable(false);
                } else if (accountNumberjTextField4.getText().length() < 1) {
                    accountNumberjTextField3.requestFocus();
                    accountNumberjTextField3.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField4.getText().isEmpty()) {
            accountNumberjTextField4.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField3.requestFocus();
                        accountNumberjTextField3.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        accountNumberjTextField5.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField5.getText().length() == 1) {
                    accountNumberjTextField6.requestFocus();
                    accountNumberjTextField6.setEditable(true);
                    accountNumberjTextField5.setEditable(false);
                } else if (accountNumberjTextField5.getText().length() < 1) {
                    accountNumberjTextField4.requestFocus();
                    accountNumberjTextField4.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField5.getText().isEmpty()) {
            accountNumberjTextField5.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField4.requestFocus();
                        accountNumberjTextField4.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        accountNumberjTextField6.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField6.getText().length() == 1) {
                    accountNumberjTextField7.requestFocus();
                    accountNumberjTextField7.setEditable(true);
                    accountNumberjTextField6.setEditable(false);
                } else if (accountNumberjTextField6.getText().length() < 1) {
                    accountNumberjTextField5.requestFocus();
                    accountNumberjTextField5.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField6.getText().isEmpty()) {
            accountNumberjTextField6.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField5.requestFocus();
                        accountNumberjTextField5.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        accountNumberjTextField7.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField7.getText().length() == 1) {
                    accountNumberjTextField8.requestFocus();
                    accountNumberjTextField8.setEditable(true);
                    accountNumberjTextField7.setEditable(false);
                } else if (accountNumberjTextField7.getText().length() < 1) {
                    accountNumberjTextField6.requestFocus();
                    accountNumberjTextField6.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField7.getText().isEmpty()) {
            accountNumberjTextField7.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField6.requestFocus();
                        accountNumberjTextField6.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        accountNumberjTextField8.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField8.getText().length() == 1) {
                    accountNumberjTextField9.requestFocus();
                    accountNumberjTextField9.setEditable(true);
                    accountNumberjTextField8.setEditable(false);
                } else if (accountNumberjTextField8.getText().length() < 1) {
                    accountNumberjTextField7.requestFocus();
                    accountNumberjTextField7.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField8.getText().isEmpty()) {
            accountNumberjTextField8.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField7.requestFocus();
                        accountNumberjTextField7.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        accountNumberjTextField9.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField9.getText().length() == 1) {
                    accountNumberjTextField10.requestFocus();
                    accountNumberjTextField10.setEditable(true);
                    accountNumberjTextField9.setEditable(false);
                } else if (accountNumberjTextField9.getText().length() < 1) {
                    accountNumberjTextField8.requestFocus();
                    accountNumberjTextField8.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField9.getText().isEmpty()) {
            accountNumberjTextField9.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField8.requestFocus();
                        accountNumberjTextField8.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        accountNumberjTextField10.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField10.getText().length() == 1) {
                    accountNumberjTextField11.requestFocus();
                    accountNumberjTextField11.setEditable(true);
                    accountNumberjTextField10.setEditable(false);
                    String accountNumber = accountNumberjTextField1.getText() + accountNumberjTextField2.getText() + accountNumberjTextField3.getText() + accountNumberjTextField4.getText() + accountNumberjTextField5.getText() + accountNumberjTextField6.getText() + accountNumberjTextField7.getText() + accountNumberjTextField8.getText() + accountNumberjTextField9.getText() + accountNumberjTextField10.getText();
                    HashMap userDataMap = getAccount(accountNumber);
                    if (userDataMap.size() > 0) {
                        fullNameRemitterjTextField.setText(userDataMap.get("name").toString());
                        addressRemitterjTextField1.setText(userDataMap.get("address").toString());
                        cityRemitterjTextField.setText(userDataMap.get("kabupaten").toString());
                        provinceRemitterjTextField.setText(userDataMap.get("province").toString());
                        postCoderemitterjTextField.setText(userDataMap.get("post_code").toString());

                    }
                } else if (accountNumberjTextField10.getText().length() < 1) {
                    accountNumberjTextField9.requestFocus();
                    accountNumberjTextField9.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField10.getText().isEmpty()) {
            accountNumberjTextField10.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField9.requestFocus();
                        accountNumberjTextField9.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        accountNumberjTextField11.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField11.getText().length() == 1) {
                    accountNumberjTextField12.requestFocus();
                    accountNumberjTextField12.setEditable(true);
                    accountNumberjTextField11.setEditable(false);
                } else if (accountNumberjTextField11.getText().length() < 1) {
                    accountNumberjTextField10.requestFocus();
                    accountNumberjTextField10.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField11.getText().isEmpty()) {
            accountNumberjTextField11.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField10.requestFocus();
                        accountNumberjTextField10.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        accountNumberjTextField12.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            protected void updateFieldState() {

                if (accountNumberjTextField12.getText().length() < 1) {
                    accountNumberjTextField11.requestFocus();
                    accountNumberjTextField11.setEditable(true);
                }
            }
        });
        if (accountNumberjTextField12.getText().isEmpty()) {
            accountNumberjTextField12.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        accountNumberjTextField11.requestFocus();
                        accountNumberjTextField11.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        fullNamejTextField = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        villagejTextField = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        cityjTextField = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        provincejTextField = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        postCodejTextField = new javax.swing.JTextField();
        womenjCheckBox = new javax.swing.JCheckBox();
        menjCheckBox = new javax.swing.JCheckBox();
        jLabel188 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        wnajCheckBox = new javax.swing.JCheckBox();
        wnijCheckBox = new javax.swing.JCheckBox();
        jLabel189 = new javax.swing.JLabel();
        bornPlacejTextField = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        bornDatejTextField = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        motherjTextField = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        ktpjCheckBox = new javax.swing.JCheckBox();
        simjCheckBox = new javax.swing.JCheckBox();
        pasportjCheckBox = new javax.swing.JCheckBox();
        idNumberjTextField = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        sdjCheckBox = new javax.swing.JCheckBox();
        smpjCheckBox = new javax.swing.JCheckBox();
        sltajCheckBox = new javax.swing.JCheckBox();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        s3jCheckBox = new javax.swing.JCheckBox();
        s1jCheckBox = new javax.swing.JCheckBox();
        s2jCheckBox = new javax.swing.JCheckBox();
        lajangjCheckBox = new javax.swing.JCheckBox();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        marriagejCheckBox = new javax.swing.JCheckBox();
        jandaordudajCheckBox = new javax.swing.JCheckBox();
        islamjCheckBox = new javax.swing.JCheckBox();
        katolikjCheckBox = new javax.swing.JCheckBox();
        protestantjCheckBox = new javax.swing.JCheckBox();
        budhajCheckBox = new javax.swing.JCheckBox();
        hindujCheckBox = new javax.swing.JCheckBox();
        otherjCheckBox = new javax.swing.JCheckBox();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        rt3jTextField = new javax.swing.JTextField();
        rt2rjTextField = new javax.swing.JTextField();
        rt1jTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rw1jTextField = new javax.swing.JTextField();
        rw2jTextField = new javax.swing.JTextField();
        rw3jTextField = new javax.swing.JTextField();
        addressjTextField = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        kecamatanjTextField = new javax.swing.JTextField();
        phoneNumberjTextField = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        emailNumberjTextField = new javax.swing.JTextField();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        phonenumberasaliasjCheckBox = new javax.swing.JCheckBox();
        emailjCheckBox = new javax.swing.JCheckBox();
        jLabel248 = new javax.swing.JLabel();
        typeCustomerjComboBox = new javax.swing.JComboBox<>();
        jLabel249 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        accountNumberjTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        trxTypejComboBox = new javax.swing.JComboBox<>();
        referencesNumberjTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        amountjTextField = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        transferCurrencyjComboBox = new javax.swing.JComboBox<>();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        amountInWordjTextArea = new javax.swing.JTextArea();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        purposePaymentjTextField = new javax.swing.JTextField();
        sourceOfFundjTextField = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        fullNameRemitterjTextField = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        addressRemitterjTextField1 = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        addressRemitterjTextField = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        cityRemitterjTextField = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        provinceRemitterjTextField = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        postCoderemitterjTextField = new javax.swing.JTextField();
        accountNumberjTextField10 = new javax.swing.JTextField();
        accountNumberjTextField1 = new javax.swing.JTextField();
        accountNumberjTextField11 = new javax.swing.JTextField();
        accountNumberjTextField12 = new javax.swing.JTextField();
        accountNumberjTextField6 = new javax.swing.JTextField();
        accountNumberjTextField9 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        accountNumberjTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        accountNumberjTextField4 = new javax.swing.JTextField();
        accountNumberjTextField8 = new javax.swing.JTextField();
        accountNumberjTextField5 = new javax.swing.JTextField();
        accountNumberjTextField2 = new javax.swing.JTextField();
        accountNumberjTextField7 = new javax.swing.JTextField();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        adminFeejComboBox = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        fullNameBeneficiaryjTextField = new javax.swing.JTextField();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        addressBeneficiaryjTextField1 = new javax.swing.JTextField();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        addressBeneficiaryjTextField2 = new javax.swing.JTextField();
        countryBeneficiaryjComboBox = new javax.swing.JComboBox<>();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        cityBeneficiaryjTextField = new javax.swing.JTextField();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        provinceBeneficiaryjTextField = new javax.swing.JTextField();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        postCodeBeneficiaryjTextField = new javax.swing.JTextField();
        messagetoBeneficiaryjTextField1 = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        messagetoBeneficiaryjTextField2 = new javax.swing.JTextField();
        jLabel243 = new javax.swing.JLabel();
        messagetoBeneficiaryjTextField3 = new javax.swing.JTextField();
        accountNumberBneficiaryjTextField = new javax.swing.JTextField();
        jLabel244 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        countryBeneficiaryjComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        accountVerifijCheckBox = new javax.swing.JCheckBox();
        emailBeneficiaryjTextField = new javax.swing.JTextField();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        trxDatejTextField = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data / Data Pribadi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel157.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel157.setText("Nama Penerima");

        jLabel158.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel158.setText("Full Name /");

        fullNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNamejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel165.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel165.setText("Desa / ");

        jLabel166.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel166.setText("Desa");

        villagejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villagejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel167.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel167.setText("Kota");

        jLabel168.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel168.setText("City /");

        cityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel169.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel169.setText("Propinsi");

        jLabel170.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel170.setText("Province /");

        provincejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provincejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel171.setText("Post Code /");

        jLabel172.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel172.setText("Kode Pos");

        postCodejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        womenjCheckBox.setText("Perempuan");

        menjCheckBox.setText("Laki - Laki");
        menjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menjCheckBoxActionPerformed(evt);
            }
        });

        jLabel188.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel188.setText("Full Gender / ");

        jLabel187.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel187.setText("Jenis Kelamin");

        jLabel190.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel190.setText("Kewarganegaraan");

        wnajCheckBox.setText("WNA");
        wnajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wnajCheckBoxActionPerformed(evt);
            }
        });

        wnijCheckBox.setText("WNI");
        wnijCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wnijCheckBoxActionPerformed(evt);
            }
        });

        jLabel189.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel189.setText("Citizenship /");

        bornPlacejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bornPlacejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel173.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel173.setText("Born Place /");

        jLabel174.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel174.setText("Tempat Lahir");

        bornDatejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bornDatejTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel193.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel193.setText("Born Date /");

        jLabel194.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel194.setText("Tanggal Lahir");

        jLabel195.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel195.setText("Biological Mother /");

        jLabel196.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel196.setText("Ibu Kandung");

        motherjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel197.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel197.setText("ID card type /");

        jLabel198.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel198.setText("Jenis Kartu identitas");

        ktpjCheckBox.setText("KTP");
        ktpjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktpjCheckBoxActionPerformed(evt);
            }
        });

        simjCheckBox.setText("SIM");
        simjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simjCheckBoxActionPerformed(evt);
            }
        });

        pasportjCheckBox.setText("PASPORT");
        pasportjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasportjCheckBoxActionPerformed(evt);
            }
        });

        idNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel199.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel199.setText("ID Number /");

        jLabel200.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel200.setText("Nomor ID");

        sdjCheckBox.setText("SD");
        sdjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdjCheckBoxActionPerformed(evt);
            }
        });

        smpjCheckBox.setText("SMP");
        smpjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smpjCheckBoxActionPerformed(evt);
            }
        });

        sltajCheckBox.setText("SLTA");
        sltajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sltajCheckBoxActionPerformed(evt);
            }
        });

        jLabel201.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel201.setText("Last Education /");

        jLabel202.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel202.setText("Pendidikan Terkahir");

        s3jCheckBox.setText("S3");
        s3jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3jCheckBoxActionPerformed(evt);
            }
        });

        s1jCheckBox.setText("S1");
        s1jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1jCheckBoxActionPerformed(evt);
            }
        });

        s2jCheckBox.setText("S2");
        s2jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2jCheckBoxActionPerformed(evt);
            }
        });

        lajangjCheckBox.setText("Lajang");
        lajangjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lajangjCheckBoxActionPerformed(evt);
            }
        });

        jLabel203.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel203.setText("Marriage Status /");

        jLabel204.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel204.setText("Status Perkawinan");

        marriagejCheckBox.setText("Kawin");
        marriagejCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriagejCheckBoxActionPerformed(evt);
            }
        });

        jandaordudajCheckBox.setText("Janda/Duda");
        jandaordudajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jandaordudajCheckBoxActionPerformed(evt);
            }
        });

        islamjCheckBox.setText("Islam");
        islamjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islamjCheckBoxActionPerformed(evt);
            }
        });

        katolikjCheckBox.setText("Katolik");
        katolikjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katolikjCheckBoxActionPerformed(evt);
            }
        });

        protestantjCheckBox.setText("protestan");
        protestantjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protestantjCheckBoxActionPerformed(evt);
            }
        });

        budhajCheckBox.setText("Budha");
        budhajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budhajCheckBoxActionPerformed(evt);
            }
        });

        hindujCheckBox.setText("Hindu");
        hindujCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hindujCheckBoxActionPerformed(evt);
            }
        });

        otherjCheckBox.setText("Lainnya");
        otherjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherjCheckBoxActionPerformed(evt);
            }
        });

        jLabel207.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel207.setText("Agama");

        jLabel208.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel208.setText("Religion / ");

        rt3jTextField.setEditable(false);
        rt3jTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rt3jTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rt3jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt3jTextFieldActionPerformed(evt);
            }
        });

        rt2rjTextField.setEditable(false);
        rt2rjTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rt2rjTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rt2rjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt2rjTextFieldActionPerformed(evt);
            }
        });

        rt1jTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rt1jTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rt1jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt1jTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel18.setText("RT");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel22.setText("RT / ");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel23.setText("Rw / ");

        jLabel19.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel19.setText("RW");

        rw1jTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rw1jTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rw1jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rw1jTextFieldActionPerformed(evt);
            }
        });

        rw2jTextField.setEditable(false);
        rw2jTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rw2jTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rw2jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rw2jTextFieldActionPerformed(evt);
            }
        });

        rw3jTextField.setEditable(false);
        rw3jTextField.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rw3jTextField.setMinimumSize(new java.awt.Dimension(5, 20));
        rw3jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rw3jTextFieldActionPerformed(evt);
            }
        });

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel205.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel205.setText("Address /");

        jLabel206.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel206.setText("Alamat");

        jLabel175.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel175.setText("Kecamatan / ");

        jLabel176.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel176.setText("Kecamatan");

        kecamatanjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kecamatanjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        phoneNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel209.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel209.setText("Phone Number / ");

        jLabel210.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel210.setText("Nomor Ponsel");

        emailNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailNumberjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel211.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel211.setText("Email / ");

        jLabel212.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel212.setText("Email");

        phonenumberasaliasjCheckBox.setText("As Alias");
        phonenumberasaliasjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberasaliasjCheckBoxActionPerformed(evt);
            }
        });

        emailjCheckBox.setText("As Alias");
        emailjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjCheckBoxActionPerformed(evt);
            }
        });

        jLabel248.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel248.setText("Tipe User");

        typeCustomerjComboBox.setBackground(new java.awt.Color(204, 204, 255));
        typeCustomerjComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        typeCustomerjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perorangan", "Korporasi", "Pemerintahan", "Remitansi", "Lainya", " " }));
        typeCustomerjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCustomerjComboBoxjComboBox6ActionPerformed(evt);
            }
        });

        jLabel249.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel249.setText("User type / ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18))
                        .addGap(112, 112, 112)
                        .addComponent(rt1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rt2rjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rt3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel19))
                        .addGap(79, 79, 79)
                        .addComponent(rw1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rw2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rw3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel168)
                            .addComponent(jLabel167)
                            .addComponent(jLabel170)
                            .addComponent(jLabel169))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(provincejTextField)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel171)
                                    .addComponent(jLabel172))
                                .addGap(18, 18, 18)
                                .addComponent(postCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cityjTextField)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel205)
                        .addGap(93, 93, 93)
                        .addComponent(addressjTextField))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel165)
                            .addComponent(jLabel166)
                            .addComponent(jLabel175)
                            .addComponent(jLabel176))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kecamatanjTextField)
                            .addComponent(villagejTextField)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel208)
                            .addComponent(jLabel207)
                            .addComponent(jLabel203)
                            .addComponent(jLabel204)
                            .addComponent(jLabel206))
                        .addContainerGap(519, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel209)
                            .addComponent(jLabel210)
                            .addComponent(jLabel211)
                            .addComponent(jLabel212))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(emailNumberjTextField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phonenumberasaliasjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel158)
                            .addComponent(jLabel157)
                            .addComponent(jLabel188)
                            .addComponent(jLabel187)
                            .addComponent(jLabel189)
                            .addComponent(jLabel190)
                            .addComponent(jLabel173)
                            .addComponent(jLabel174)
                            .addComponent(jLabel193)
                            .addComponent(jLabel194)
                            .addComponent(jLabel195)
                            .addComponent(jLabel196)
                            .addComponent(jLabel197)
                            .addComponent(jLabel198)
                            .addComponent(jLabel199)
                            .addComponent(jLabel200)
                            .addComponent(jLabel201)
                            .addComponent(jLabel202)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeCustomerjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bornPlacejTextField)
                            .addComponent(bornDatejTextField)
                            .addComponent(motherjTextField)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(menjCheckBox)
                                            .addComponent(wnijCheckBox)
                                            .addComponent(ktpjCheckBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(wnajCheckBox)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(womenjCheckBox)
                                                    .addComponent(simjCheckBox))
                                                .addGap(18, 18, 18)
                                                .addComponent(pasportjCheckBox))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lajangjCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(marriagejCheckBox)
                                        .addGap(27, 27, 27)
                                        .addComponent(jandaordudajCheckBox))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(islamjCheckBox)
                                            .addComponent(sdjCheckBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(smpjCheckBox)
                                                .addGap(30, 30, 30)
                                                .addComponent(sltajCheckBox)
                                                .addGap(42, 42, 42)
                                                .addComponent(s1jCheckBox)
                                                .addGap(36, 36, 36)
                                                .addComponent(s2jCheckBox)
                                                .addGap(34, 34, 34)
                                                .addComponent(s3jCheckBox))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(katolikjCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(protestantjCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(budhajCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(hindujCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(otherjCheckBox))))
                                    .addComponent(fullNamejTextField))
                                .addContainerGap())
                            .addComponent(idNumberjTextField)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel248))
                    .addComponent(typeCustomerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel157)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel188)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel187))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menjCheckBox)
                        .addComponent(womenjCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel189)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel190))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wnijCheckBox)
                        .addComponent(wnajCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel173)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel174))
                    .addComponent(bornPlacejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel194))
                    .addComponent(bornDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel195)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel196))
                    .addComponent(motherjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel197)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel198))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ktpjCheckBox)
                        .addComponent(simjCheckBox)
                        .addComponent(pasportjCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel199)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel200)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phonenumberasaliasjCheckBox))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel209)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel210)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailjCheckBox))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel211)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel212)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel201)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel202))
                    .addComponent(sltajCheckBox)
                    .addComponent(s2jCheckBox)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sdjCheckBox)
                        .addComponent(smpjCheckBox)
                        .addComponent(s1jCheckBox)
                        .addComponent(s3jCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(islamjCheckBox)
                        .addComponent(katolikjCheckBox)
                        .addComponent(protestantjCheckBox)
                        .addComponent(budhajCheckBox)
                        .addComponent(hindujCheckBox)
                        .addComponent(otherjCheckBox))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel208)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel207)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel203)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel204))
                    .addComponent(jandaordudajCheckBox)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lajangjCheckBox)
                        .addComponent(marriagejCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel205)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel206)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel18))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rt1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rt2rjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rt3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(villagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel165)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel166))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rw1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rw2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rw3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kecamatanjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel175)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel176)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel168)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel167)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provincejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel170)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel169))
                    .addComponent(postCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel171)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel172)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Aktivasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Batal");

        accountNumberjTextField.setToolTipText("Account Number / Nomor Rekening");
        accountNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel159.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel159.setText("Account Number /");

        jLabel160.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel160.setText("Nomor Rekening");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.Rek", "Nama", "Alamat", "Email", "Ponsel", "Alias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel159)
                                .addComponent(jLabel160)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(accountNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel159)
                .addGap(0, 0, 0)
                .addComponent(jLabel160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Alias Registrastion", jPanel3);

        trxTypejComboBox.setBackground(new java.awt.Color(204, 204, 255));
        trxTypejComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        trxTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telegraphic Transfer/Pengiriman Uang Dengan Teleks", "RTGS", "Interbank Giro/LLG/SKN", "Inhouse Transfer" }));
        trxTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trxTypejComboBoxActionPerformed(evt);
            }
        });

        referencesNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referencesNumberjTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel13.setText("Formulir Aplikasi Pengirima Uang Untuk");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setText("Bank Use Only Running Number / ");

        jLabel5.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel5.setText("Nomor Referensi");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("Application Form For /");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer Currency and Amount / Mata Uang dan Jumlah Pengiriman", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        amountjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountjTextFieldjTextField9ActionPerformed(evt);
            }
        });

        jLabel184.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel184.setText("Transfer Currency");

        transferCurrencyjComboBox.setBackground(new java.awt.Color(204, 204, 255));
        transferCurrencyjComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        transferCurrencyjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rupiah", "Dollar Amerika", "Dolar Singapura", "Yen" }));
        transferCurrencyjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferCurrencyjComboBoxjComboBox4ActionPerformed(evt);
            }
        });

        jLabel191.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel191.setText("Nomor Referensi");

        jLabel192.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel192.setText("Amount In Words / ");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        amountInWordjTextArea.setColumns(20);
        amountInWordjTextArea.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        amountInWordjTextArea.setRows(5);
        jScrollPane9.setViewportView(amountInWordjTextArea);

        jLabel213.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel213.setText("Sumber Dana");

        jLabel214.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel214.setText("Source of Fund / ");

        jLabel215.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel215.setText("Tujuan Transaksi");

        jLabel216.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel216.setText("Purpose of Payment /");

        purposePaymentjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purposePaymentjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        sourceOfFundjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceOfFundjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel217.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel217.setText("Mata uang Pengiriman");

        jLabel245.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel245.setText("Jumlah");

        jLabel246.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel246.setText("Amount /");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel192)
                    .addComponent(jLabel191)
                    .addComponent(jLabel214)
                    .addComponent(jLabel213)
                    .addComponent(jLabel217)
                    .addComponent(jLabel184))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sourceOfFundjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferCurrencyjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 190, 190)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel215)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel216)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel246)
                                    .addComponent(jLabel245))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(purposePaymentjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(amountjTextField)))
                    .addComponent(jScrollPane9))
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transferCurrencyjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel184)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel217)))
                        .addComponent(amountjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel246)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel245)))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel192)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel191))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel214)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel213))
                    .addComponent(sourceOfFundjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel216)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel215))
                    .addComponent(purposePaymentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remitter Detail / Deskripsi Pengirim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel161.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel161.setText("Nama Penerima");

        jLabel162.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel162.setText("Full Name /");

        fullNameRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel163.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel163.setText("Address /");

        jLabel164.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel164.setText("Alamat");

        addressRemitterjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressRemitterjTextField1jTextField13ActionPerformed(evt);
            }
        });

        jLabel177.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel177.setText("Address /");

        jLabel178.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel178.setText("Alamat");

        addressRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel179.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel179.setText("Kota");

        jLabel180.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel180.setText("City /");

        cityRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel181.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel181.setText("Propinsi");

        jLabel182.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel182.setText("Province /");

        provinceRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel183.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel183.setText("Post Code /");

        jLabel185.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel185.setText("Kode Pos");

        postCoderemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCoderemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        accountNumberjTextField10.setEditable(false);
        accountNumberjTextField10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField10.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField10ActionPerformed(evt);
            }
        });

        accountNumberjTextField1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField1.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField1ActionPerformed(evt);
            }
        });

        accountNumberjTextField11.setEditable(false);
        accountNumberjTextField11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField11.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField11ActionPerformed(evt);
            }
        });

        accountNumberjTextField12.setEditable(false);
        accountNumberjTextField12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField12.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField12ActionPerformed(evt);
            }
        });

        accountNumberjTextField6.setEditable(false);
        accountNumberjTextField6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField6.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField6ActionPerformed(evt);
            }
        });

        accountNumberjTextField9.setEditable(false);
        accountNumberjTextField9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField9.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField9ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel21.setText("Debit Account Number / ");

        accountNumberjTextField3.setEditable(false);
        accountNumberjTextField3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField3.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel17.setText("Debit Nomor Rekening");

        accountNumberjTextField4.setEditable(false);
        accountNumberjTextField4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField4.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField4ActionPerformed(evt);
            }
        });

        accountNumberjTextField8.setEditable(false);
        accountNumberjTextField8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField8.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField8ActionPerformed(evt);
            }
        });

        accountNumberjTextField5.setEditable(false);
        accountNumberjTextField5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField5.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField5ActionPerformed(evt);
            }
        });

        accountNumberjTextField2.setEditable(false);
        accountNumberjTextField2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField2.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField2ActionPerformed(evt);
            }
        });

        accountNumberjTextField7.setEditable(false);
        accountNumberjTextField7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        accountNumberjTextField7.setMinimumSize(new java.awt.Dimension(5, 20));
        accountNumberjTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberjTextField7ActionPerformed(evt);
            }
        });

        jLabel218.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel218.setText("Charge to /");

        jLabel219.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel219.setText("Biaya dibebankan ke");

        adminFeejComboBox.setBackground(new java.awt.Color(204, 204, 255));
        adminFeejComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        adminFeejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remitter / Pengirim", "Beneficiary / Penerima" }));
        adminFeejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminFeejComboBoxjComboBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel162)
                    .addComponent(jLabel161)
                    .addComponent(jLabel163)
                    .addComponent(jLabel164)
                    .addComponent(jLabel177)
                    .addComponent(jLabel178)
                    .addComponent(jLabel180)
                    .addComponent(jLabel179)
                    .addComponent(jLabel182)
                    .addComponent(jLabel181)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel218)
                    .addComponent(jLabel219))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminFeejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(accountNumberjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(accountNumberjTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addComponent(cityRemitterjTextField)
                    .addComponent(addressRemitterjTextField)
                    .addComponent(addressRemitterjTextField1)
                    .addComponent(fullNameRemitterjTextField)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(provinceRemitterjTextField)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel183)
                            .addComponent(jLabel185))
                        .addGap(18, 18, 18)
                        .addComponent(postCoderemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accountNumberjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel162)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel161))
                    .addComponent(fullNameRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressRemitterjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel163)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel164)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel178)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel180)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel179)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provinceRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel182)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel181))
                    .addComponent(postCoderemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel183)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel185)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adminFeejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Beneficiary Detail / Informasi Penerima", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel223.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel223.setText("Account Number/IBAN /");

        jLabel224.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel224.setText("Nomor Rekening/IBAN");

        jLabel225.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel225.setText("Nama Penerima");

        jLabel226.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel226.setText("Full Name /");

        fullNameBeneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameBeneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel227.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel227.setText("Country");

        jLabel228.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel228.setText("Negara");

        jLabel229.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel229.setText("Address /");

        jLabel230.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel230.setText("Alamat");

        addressBeneficiaryjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressBeneficiaryjTextField1jTextField13ActionPerformed(evt);
            }
        });

        jLabel231.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel231.setText("Address /");

        jLabel232.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel232.setText("Alamat");

        addressBeneficiaryjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressBeneficiaryjTextField2jTextField13ActionPerformed(evt);
            }
        });

        countryBeneficiaryjComboBox.setBackground(new java.awt.Color(204, 204, 255));
        countryBeneficiaryjComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        countryBeneficiaryjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indonesia", "Afganistan", "Afrika Selatan", "Afrika Tengah", "Albaniar", "Albania", "Amerika Serikat", "Andorra", "Angola", "Antigua dan Barbuda", "Arab Saudi", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahama", "Bahrain", "Bangladesh", "Barbados", "Belanda", "Belarus", "Belgia", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia dan Herzegovina", "Botswana", "Brasil", "Britania Raya", "Brunei", "Brunei ", " " }));
        countryBeneficiaryjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryBeneficiaryjComboBoxjComboBox6ActionPerformed(evt);
            }
        });

        jLabel233.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel233.setText("Kota");

        jLabel234.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel234.setText("City /");

        cityBeneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityBeneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel235.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel235.setText("Propinsi");

        jLabel236.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel236.setText("Province /");

        provinceBeneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceBeneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel237.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel237.setText("Post Code /");

        jLabel238.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel238.setText("Kode Pos");

        postCodeBeneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeBeneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        messagetoBeneficiaryjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagetoBeneficiaryjTextField1jTextField13ActionPerformed(evt);
            }
        });

        jLabel239.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel239.setText("Message to Beneficiary");

        jLabel240.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel240.setText("(Maximum 35 Character in");

        jLabel241.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel241.setText("each line) / ");

        jLabel242.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel242.setText("(Maksimal 35 karakter");

        messagetoBeneficiaryjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagetoBeneficiaryjTextField2jTextField13ActionPerformed(evt);
            }
        });

        jLabel243.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel243.setText("pada setiap baris)");

        messagetoBeneficiaryjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagetoBeneficiaryjTextField3jTextField13ActionPerformed(evt);
            }
        });

        accountNumberBneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberBneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel244.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel244.setText("Kode Bank");

        jLabel247.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel247.setText("Bank Code / ");

        countryBeneficiaryjComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        countryBeneficiaryjComboBox1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        countryBeneficiaryjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indonesia", "Afganistan", "Afrika Selatan", "Afrika Tengah", "Albaniar", "Albania", "Amerika Serikat", "Andorra", "Angola", "Antigua dan Barbuda", "Arab Saudi", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahama", "Bahrain", "Bangladesh", "Barbados", "Belanda", "Belarus", "Belgia", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia dan Herzegovina", "Botswana", "Brasil", "Britania Raya", "Brunei", "Brunei ", " " }));
        countryBeneficiaryjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryBeneficiaryjComboBox1jComboBox6ActionPerformed(evt);
            }
        });

        jButton7.setText("Check Account");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        accountVerifijCheckBox.setText("Account Verified");
        accountVerifijCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountVerifijCheckBoxActionPerformed(evt);
            }
        });

        emailBeneficiaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBeneficiaryjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel250.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel250.setText("Email /");

        jLabel251.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel251.setText("Email");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel241)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel223, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel226)
                        .addComponent(jLabel225)
                        .addComponent(jLabel224, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel227, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel229)
                    .addComponent(jLabel230)
                    .addComponent(jLabel231)
                    .addComponent(jLabel232)
                    .addComponent(jLabel234)
                    .addComponent(jLabel233)
                    .addComponent(jLabel236)
                    .addComponent(jLabel235)
                    .addComponent(jLabel239)
                    .addComponent(jLabel240)
                    .addComponent(jLabel242)
                    .addComponent(jLabel243)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel247, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel250)
                    .addComponent(jLabel251))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(accountVerifijCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addComponent(countryBeneficiaryjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(messagetoBeneficiaryjTextField3)
                    .addComponent(messagetoBeneficiaryjTextField2)
                    .addComponent(messagetoBeneficiaryjTextField1)
                    .addComponent(cityBeneficiaryjTextField)
                    .addComponent(addressBeneficiaryjTextField2)
                    .addComponent(addressBeneficiaryjTextField1)
                    .addComponent(fullNameBeneficiaryjTextField)
                    .addComponent(countryBeneficiaryjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(provinceBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel237)
                            .addComponent(jLabel238))
                        .addGap(18, 18, 18)
                        .addComponent(postCodeBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountNumberBneficiaryjTextField)
                    .addComponent(emailBeneficiaryjTextField)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel244))
                    .addComponent(countryBeneficiaryjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel224))
                    .addComponent(accountNumberBneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel226)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel225))
                    .addComponent(fullNameBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel250)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel251)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel228))
                    .addComponent(countryBeneficiaryjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressBeneficiaryjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel229)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel230)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressBeneficiaryjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel231)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel232)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel234)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel233)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provinceBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel236)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel235))
                    .addComponent(postCodeBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel237)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel238)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messagetoBeneficiaryjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel239)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel240)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(messagetoBeneficiaryjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(messagetoBeneficiaryjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel241)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel242)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel243)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(accountVerifijCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel43.setText("Tanggal Transaksi");

        trxDatejTextField.setEditable(false);
        trxDatejTextField.setBackground(new java.awt.Color(204, 204, 255));
        trxDatejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        trxDatejTextField.setText("29/06/2021");
        trxDatejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trxDatejTextFieldActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel46.setText("Transaction Date / ");

        jButton5.setText("Next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(referencesNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(trxTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel43))
                                    .addGap(18, 18, 18)
                                    .addComponent(trxDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel43))
                            .addComponent(trxDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5))
                            .addComponent(referencesNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(trxTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Transfer", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.Ref.", "Tanggal", "Jenis Trx", "Currency", "Amount", "Akun Pengirim", "Akun Penerima", "Bank", "Status", "Tanggal Disetujui"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jTabbedPane2.addTab("History", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String accountNumbr = accountNumberjTextField1.getText() + accountNumberjTextField2.getText() + accountNumberjTextField3.getText()
        + accountNumberjTextField4.getText() + accountNumberjTextField5.getText() + accountNumberjTextField6.getText()
        + accountNumberjTextField7.getText() + accountNumberjTextField8.getText() + accountNumberjTextField9.getText()
        + accountNumberjTextField10.getText() + accountNumberjTextField11.getText() + accountNumberjTextField12.getText()
        + accountNumberjTextField5.getText();
        String amount = amountjTextField.getText();
        String amountInWord = amountInWordjTextArea.getText();
        String sourceOfFund = sourceOfFundjTextField.getText();
        String cityRemitter = cityRemitterjTextField.getText();
        String purposePayment = purposePaymentjTextField.getText();
        String cityBeneficiary = cityBeneficiaryjTextField.getText();
        String provinceRemitter = provinceRemitterjTextField.getText();
        String refrencesNumber = referencesNumberjTextField.getText();
        String fullNameRemitter = fullNameRemitterjTextField.getText();
        String fullNameBeneficiary = fullNameBeneficiaryjTextField.getText();
        String provinceBeneficiary = provinceBeneficiaryjTextField.getText();
        String accountNumberBneficiary = accountNumberBneficiaryjTextField.getText();
        String addressRemitter = addressRemitterjTextField1.getText() + addressRemitterjTextField.getText();
        String addressBeneficiary = addressBeneficiaryjTextField1.getText() + addressBeneficiaryjTextField2.getText();
        String message = messagetoBeneficiaryjTextField1.getText().toString() + " " + messagetoBeneficiaryjTextField2.getText().toString() + " " + messagetoBeneficiaryjTextField3.getText().toString();

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

        grpHdr.put("MsgId", "20210301INDOIDJA51012345678");
        grpHdr.put("CreDtTm", dateNow);
        grpHdr.put("NbOfTxs", "1");
        sttlmInf.put("SttlmMtd", "CLRG");
        grpHdr.put("SttlmInf", sttlmInf);

        pmtId.put("EndToEndId", "20210301INDOIDJA51012345678");
        pmtId.put("TxId", "20210301INDOIDJA51012345678");
        cdtTrfTxInf.put("PmtId", pmtId);

        lclInstrm.put("Prtry", "01");
        ctgyPurp.put("Prtry", "02");
        pmtTpInf.put("LclInstrm", lclInstrm);
        pmtTpInf.put("CtgyPurp", ctgyPurp);
        cdtTrfTxInf.put("PmtTpInf", pmtTpInf);

        cdtTrfTxInf.put("IntrBkSttlmAmt", "1500000");
        cdtTrfTxInf.put("Ccy", "IDR");

        cdtTrfTxInf.put("IntrBkSttlmDt", "2021-03-19T00:00:00");
        cdtTrfTxInf.put("ChrgBr", "DEBT");

        dbtr = new LinkedHashMap();
        dbtr.put("Nm", "qeqeqwe");
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
        othr.put("Id", "123123");
        id.put("Othr", othr);
        dbtrAcct.put("Id", id);

        tp = new LinkedHashMap();
        tp.put("Prtry", "CACC");
        dbtrAcct.put("Tp", tp);
        cdtTrfTxInf.put("DbtrAcct", dbtrAcct);

        cdtr = new LinkedHashMap();
        cdtr.put("Nm", fullNameBeneficiary);
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
        prxy.put("Id", "john.smith@example.com");
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
        othr.put("Id", "INDOIDJA");

        finInstnId = new LinkedHashMap();
        finInstnId.put("Othr", othr);

        dbtrAgt.put("FinInstnId", finInstnId);
        cdtTrfTxInf.put("DbtrAgt", dbtrAgt);

        othr = new LinkedHashMap();
        othr.put("Id", "CENAIDJA");

        finInstnId = new LinkedHashMap();
        finInstnId.put("Othr", othr);

        cdtAgt.put("FinInstnId", finInstnId);

        cdtTrfTxInf.put("CdtrAgt", cdtAgt);

        othr = new LinkedHashMap();
        othr.put("Id", "2040606090112");

        id = new LinkedHashMap();
        id.put("Othr", othr);

        cdtrAcct.put("Id", id);
        cdtTrfTxInf.put("CdtrAcct", cdtrAcct);

        fIToFICstmrCdtTrf.put("GrpHdr", grpHdr);
        System.out.println("masuk sini");
        fIToFICstmrCdtTrf.put("CdtTrfTxInf", cdtTrfTxInf);
        System.out.println("masuk sini");
        document.put("FIToFICstmrCdtTrf", fIToFICstmrCdtTrf);
        System.out.println("masuk sini");
        body.put("Document", document);
        body.put("procCode", FieldParamater.creditTransfer);
        body.put("rrn", rrn);
        body.put("currentDate", dateNow);
        String response = SendMessage.sendMessage(body);
        HashMap respHasMap = JsonProcess.decodeJson(response);
        if (respHasMap.get("resp_code").equals("0000")) {
            DBConnection dBConnection = new DBConnection();

            dBConnection.createTrx(rrn, "3", dateNow, "IDR", amount, amountInWord, "-", purposePayment, accountNumbr, "DEBT", "1234", accountNumberBneficiary, "INDONESIA", message, respHasMap.get("procCode").toString(), respHasMap.get("resp_code").toString(), respHasMap.get("resp_desc").toString(), JsonProcess.generateJson(body), response, "DEBT");

        } else {
            System.out.println("Error : " + respHasMap.get("resp_desc"));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        String accountNumbr = accountNumberjTextField1.getText() + accountNumberjTextField2.getText() + accountNumberjTextField3.getText()
        + accountNumberjTextField4.getText() + accountNumberjTextField5.getText() + accountNumberjTextField6.getText()
        + accountNumberjTextField7.getText() + accountNumberjTextField8.getText() + accountNumberjTextField9.getText()
        + accountNumberjTextField10.getText() + accountNumberjTextField11.getText() + accountNumberjTextField12.getText();
        String amount = amountjTextField.getText();
        String amountInWord = amountInWordjTextArea.getText();
        String sourceOfFund = sourceOfFundjTextField.getText();
        String cityRemitter = cityRemitterjTextField.getText();
        String purposePayment = purposePaymentjTextField.getText();
        String cityBeneficiary = cityBeneficiaryjTextField.getText();
        String provinceRemitter = provinceRemitterjTextField.getText();
        String refrencesNumber = referencesNumberjTextField.getText();
        String fullNameRemitter = fullNameRemitterjTextField.getText();
        String fullNameBeneficiary = fullNameBeneficiaryjTextField.getText();
        String provinceBeneficiary = provinceBeneficiaryjTextField.getText();
        String accountNumberBneficiary = accountNumberBneficiaryjTextField.getText();
        String addressRemitter = addressRemitterjTextField1.getText() + addressRemitterjTextField.getText();
        String addressBeneficiary = addressBeneficiaryjTextField1.getText() + addressBeneficiaryjTextField2.getText();
        String message = messagetoBeneficiaryjTextField1.getText().toString() + " " + messagetoBeneficiaryjTextField2.getText().toString() + " " + messagetoBeneficiaryjTextField3.getText().toString();
        String email = emailBeneficiaryjTextField.getText();

        if (amount.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Amount Harus diisi");
        } else if (amountInWord.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Amount Terbilang Harus diisi");
        } else if (sourceOfFund.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Sumber Dana Harus diisi");
        } else if (purposePayment.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Tujuan Transaksi Harus diisi");
        } else if (accountNumbr.isEmpty() || accountNumbr.length() < 8) {
            showalertdialog("Data Belum Lengkap", "Nomor Rekening Pengirim Harus diisi");
        } else if (fullNameRemitter.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Pengirim Harus diisi");
        } else if (addressRemitter.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Alamat Pengirim Harus diisi");
        } else if (cityRemitter.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kota Pengirim Harus diisi");
        } else if (provinceRemitter.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "provinsi Pengirim Harus diisi");
        } else if (accountNumberBneficiary.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nomor Rekening Penerima Harus diisi");
        } else if (fullNameBeneficiary.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Penerima Harus diisi");
        } else if (addressBeneficiary.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Alamat Penerima Harus diisi");
        } else if (cityBeneficiary.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kota Penerima Harus diisi");
        } else if (provinceBeneficiary.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Provinsi Penerima Harus diisi");
        } else if (email.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Email Penerima Harus diisi");
        } else {
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
            HashMap dbtrAgt = new LinkedHashMap();
            HashMap cdtAgt = new LinkedHashMap();
            HashMap cdtrAcct = new LinkedHashMap();
            HashMap finInstnId;
            HashMap othr;
            HashMap id;

            String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().getTime());
            String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime()) + String.valueOf(StringFunction.generateOTP(4));

            grpHdr.put("MsgId", rrn);
            grpHdr.put("CreDtTm", dateNow);
            grpHdr.put("NbOfTxs", "1");
            sttlmInf.put("SttlmMtd", "CLRG");
            grpHdr.put("SttlmInf", sttlmInf);

            pmtId.put("EndToEndId", rrn);
            pmtId.put("TxId", rrn);
            pmtId.put("ChrgBr", "DEBT");

            cdtTrfTxInf.put("PmtId", pmtId);
            cdtTrfTxInf.put("IntrBkSttlmAmt", amount);
            cdtTrfTxInf.put("Ccy", "IDR");

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
            othr.put("Id", accountNumberBneficiary);

            id = new LinkedHashMap();
            id.put("Othr", othr);

            cdtrAcct.put("Id", id);
            cdtTrfTxInf.put("CdtrAcct", cdtrAcct);

            fIToFICstmrCdtTrf.put("GrpHdr", grpHdr);
            fIToFICstmrCdtTrf.put("CdtTrfTxInf", cdtTrfTxInf);
            document.put("FIToFICstmrCdtTrf", fIToFICstmrCdtTrf);
            body.put("Document", document);
            body.put("procCode", FieldParamater.accountEnquiry);
            body.put("rrn", rrn);
            body.put("currentDate", dateNow);
            String response = SendMessage.sendMessage2(body);
            HashMap respHasMap = JsonProcess.decodeJson(response);
            HashMap req = new HashMap();
            req.put("amountInWord", amountInWord);
            req.put("purposePayment", purposePayment);
            req.put("chargeTo", "DEBT");
            req.put("remitterAccount", accountNumbr);
            req.put("remitterName", fullNameRemitter);
            req.put("beneficiaryEmail", email);
            req.put("message", message);
            req.put("reqMsg", JsonProcess.generateJson(body));
            if (respHasMap.get("resp_code").equals("0000")) {
                //                DBConnection dBConnection = new DBConnection();
                //
                //                dBConnection.createTrx(rrn, "3", dateNow, "IDR", amount, amountInWord, "-", purposePayment, accountNumbr, "DEBT", "1234", accountNumberBneficiary, "INDONESIA", message, respHasMap.get("procCode").toString(), respHasMap.get("resp_code").toString(), respHasMap.get("resp_desc").toString(), JsonProcess.generateJson(body), response);
                Custom2 custom = new Custom2();
                custom.customDialog(req,respHasMap);
            } else {
                System.out.println("Error : " + respHasMap.get("resp_desc"));
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void trxDatejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trxDatejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trxDatejTextFieldActionPerformed

    private void emailBeneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBeneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailBeneficiaryjTextFieldjTextField13ActionPerformed

    private void accountVerifijCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountVerifijCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountVerifijCheckBoxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        HashMap userDataMap = getAccount(accountNumberBneficiaryjTextField.getText());
        if (userDataMap.isEmpty()) {
            showalertdialog("Data Tidak Ditemukan", "Data yang anda masukan tidak ditemukan di dalam sistem");

        } else if (userDataMap.get("name").toString() == null ? fullNameBeneficiaryjTextField.getText() != null : !userDataMap.get("name").toString().equals(fullNameBeneficiaryjTextField.getText())) {
            showalertdialog("Data Tidak Sesuai", "Nama tidak sesuai dengan data di dalam sistem");
        } else if (userDataMap.get("address").toString() == null ? addressBeneficiaryjTextField1.getText() != null : !userDataMap.get("address").toString().equals(addressBeneficiaryjTextField1.getText())) {
            showalertdialog("Data Tidak Sesuai", "Alamat tidak sesuai dengan data di dalam sistem");
        } else if (userDataMap.get("address").toString() == null ? cityBeneficiaryjTextField.getText() != null : !userDataMap.get("address").toString().equals(cityBeneficiaryjTextField.getText())) {
            showalertdialog("Data Tidak Sesuai", "Kota tidak sesuai dengan data di dalam sistem");
        } else if (userDataMap.get("province").toString() == null ? provinceBeneficiaryjTextField.getText() != null : !userDataMap.get("province").toString().equals(provinceBeneficiaryjTextField.getText())) {
            showalertdialog("Data Tidak Sesuai", "Profinsi tidak sesuai dengan data di dalam sistem");
        } else if (userDataMap.get("post_code").toString() == null ? postCodeBeneficiaryjTextField.getText() != null : !userDataMap.get("post_code").toString().equals(postCodeBeneficiaryjTextField.getText())) {
            showalertdialog("Data Tidak Sesuai", "Profinsi tidak sesuai dengan data di dalam sistem");
        } else {
            accountVerifijCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void countryBeneficiaryjComboBox1jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryBeneficiaryjComboBox1jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryBeneficiaryjComboBox1jComboBox6ActionPerformed

    private void accountNumberBneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberBneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberBneficiaryjTextFieldjTextField13ActionPerformed

    private void messagetoBeneficiaryjTextField3jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagetoBeneficiaryjTextField3jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagetoBeneficiaryjTextField3jTextField13ActionPerformed

    private void messagetoBeneficiaryjTextField2jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagetoBeneficiaryjTextField2jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagetoBeneficiaryjTextField2jTextField13ActionPerformed

    private void messagetoBeneficiaryjTextField1jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagetoBeneficiaryjTextField1jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagetoBeneficiaryjTextField1jTextField13ActionPerformed

    private void postCodeBeneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeBeneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeBeneficiaryjTextFieldjTextField13ActionPerformed

    private void provinceBeneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceBeneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceBeneficiaryjTextFieldjTextField13ActionPerformed

    private void cityBeneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityBeneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityBeneficiaryjTextFieldjTextField13ActionPerformed

    private void countryBeneficiaryjComboBoxjComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryBeneficiaryjComboBoxjComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryBeneficiaryjComboBoxjComboBox6ActionPerformed

    private void addressBeneficiaryjTextField2jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressBeneficiaryjTextField2jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressBeneficiaryjTextField2jTextField13ActionPerformed

    private void addressBeneficiaryjTextField1jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressBeneficiaryjTextField1jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressBeneficiaryjTextField1jTextField13ActionPerformed

    private void fullNameBeneficiaryjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameBeneficiaryjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameBeneficiaryjTextFieldjTextField13ActionPerformed

    private void adminFeejComboBoxjComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminFeejComboBoxjComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminFeejComboBoxjComboBox6ActionPerformed

    private void accountNumberjTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField7ActionPerformed

    private void accountNumberjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField2ActionPerformed

    private void accountNumberjTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField5ActionPerformed

    private void accountNumberjTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField8ActionPerformed

    private void accountNumberjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField4ActionPerformed

    private void accountNumberjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField3ActionPerformed

    private void accountNumberjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField9ActionPerformed

    private void accountNumberjTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField6ActionPerformed

    private void accountNumberjTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField12ActionPerformed

    private void accountNumberjTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField11ActionPerformed

    private void accountNumberjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField1ActionPerformed

    private void accountNumberjTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextField10ActionPerformed

    private void postCoderemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCoderemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCoderemitterjTextFieldjTextField13ActionPerformed

    private void provinceRemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceRemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceRemitterjTextFieldjTextField13ActionPerformed

    private void cityRemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityRemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityRemitterjTextFieldjTextField13ActionPerformed

    private void addressRemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressRemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressRemitterjTextFieldjTextField13ActionPerformed

    private void addressRemitterjTextField1jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressRemitterjTextField1jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressRemitterjTextField1jTextField13ActionPerformed

    private void fullNameRemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameRemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameRemitterjTextFieldjTextField13ActionPerformed

    private void sourceOfFundjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceOfFundjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceOfFundjTextFieldjTextField13ActionPerformed

    private void purposePaymentjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purposePaymentjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purposePaymentjTextFieldjTextField13ActionPerformed

    private void transferCurrencyjComboBoxjComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferCurrencyjComboBoxjComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferCurrencyjComboBoxjComboBox4ActionPerformed

    private void amountjTextFieldjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountjTextFieldjTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountjTextFieldjTextField9ActionPerformed

    private void referencesNumberjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referencesNumberjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referencesNumberjTextFieldActionPerformed

    private void trxTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trxTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trxTypejComboBoxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        DBConnection2 dBConnection = new DBConnection2();
        HashMap userDataMap = dBConnection.getAccount(accountNumberjTextField.getText());
        if (userDataMap.size() > 0) {
            if (userDataMap.get("has_create_alias").toString().equals("true")) {
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                if (userDataMap.get("as_alias").equals("02")) {
                    emailjCheckBox.setSelected(true);
                } else if (userDataMap.get("as_alias").equals("01")) {
                    phonenumberasaliasjCheckBox.setSelected(true);
                }
            } else if (userDataMap.get("has_create_alias").toString().equals("false")) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
            }
            fullNamejTextField.setText(userDataMap.get("name").toString());
            bornPlacejTextField.setText(userDataMap.get("born_place").toString());
            bornDatejTextField.setText(userDataMap.get("born_date").toString());
            bornDatejTextField.setText(userDataMap.get("born_date").toString());
            motherjTextField.setText(userDataMap.get("biological_mother").toString());
            idNumberjTextField.setText(userDataMap.get("number_id").toString());
            phoneNumberjTextField.setText(userDataMap.get("phone_number").toString());
            emailNumberjTextField.setText(userDataMap.get("email").toString());
            addressjTextField.setText(userDataMap.get("address").toString());
            villagejTextField.setText(userDataMap.get("village").toString());
            kecamatanjTextField.setText(userDataMap.get("kecamatan").toString());
            cityjTextField.setText(userDataMap.get("kabupaten").toString());
            postCodejTextField.setText(userDataMap.get("post_code").toString());
            provincejTextField.setText(userDataMap.get("province").toString());

            if (userDataMap.get("gender").equals("0")) {
                menjCheckBox.setSelected(true);
            } else if (userDataMap.get("gender").equals("1")) {
                womenjCheckBox.setSelected(true);
            }

            if (userDataMap.get("citizenship").equals("01")) {
                wnijCheckBox.setSelected(true);
            } else if (userDataMap.get("citizenship").equals("02")) {
                wnajCheckBox.setSelected(true);
            }

            if (userDataMap.get("type_id").equals("01")) {
                ktpjCheckBox.setSelected(true);
            } else if (userDataMap.get("type_id").equals("1")) {
                simjCheckBox.setSelected(true);
            } else if (userDataMap.get("type_id").equals("02")) {
                pasportjCheckBox.setSelected(true);
            }

            if (userDataMap.get("last_education").equals("0")) {
                sdjCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("1")) {
                smpjCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("2")) {
                sltajCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("3")) {
                s1jCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("4")) {
                s2jCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("5")) {
                s3jCheckBox.setSelected(true);
            }

            if (userDataMap.get("religion").equals("0")) {
                islamjCheckBox.setSelected(true);
            } else if (userDataMap.get("religion").equals("1")) {
                katolikjCheckBox.setSelected(true);
            } else if (userDataMap.get("religion").equals("2")) {
                protestantjCheckBox.setSelected(true);
            } else if (userDataMap.get("religion").equals("3")) {
                budhajCheckBox.setSelected(true);
            } else if (userDataMap.get("religion").equals("4")) {
                hindujCheckBox.setSelected(true);
            } else if (userDataMap.get("religion").equals("5")) {
                otherjCheckBox.setSelected(true);
            }

            if (userDataMap.get("marriage_status").equals("0")) {
                lajangjCheckBox.setSelected(true);
            } else if (userDataMap.get("marriage_status").equals("1")) {
                marriagejCheckBox.setSelected(true);
            } else if (userDataMap.get("marriage_status").equals("2")) {
                jandaordudajCheckBox.setSelected(true);
            }

            rt1jTextField.setText(userDataMap.get("rt").toString().substring(0, 1));
            rt2rjTextField.setText(userDataMap.get("rt").toString().substring(1, 2));
            rt3jTextField.setText(userDataMap.get("rt").toString().substring(2));

            rw1jTextField.setText(userDataMap.get("rw").toString().substring(0, 1));
            rw2jTextField.setText(userDataMap.get("rw").toString().substring(1, 2));
            rw3jTextField.setText(userDataMap.get("rw").toString().substring(2));

        }
        //        if(userDataMap.get("gender").equals("0")){
            //        menjCheckBox.setSelected(true);
            //
            //        }else if(userDataMap.get("gender").equals("1")){
            //        womenjCheckBox.setSelected(true);
            //
            //        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void accountNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextFieldjTextField13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String typeCustomer = "0" + String.valueOf(typeCustomerjComboBox.getSelectedIndex() + 1);

        String fullName = fullNamejTextField.getText();
        String gender = "-";
        if (menjCheckBox.isSelected()) {
            gender = "0";
        } else if (womenjCheckBox.isSelected()) {
            gender = "1";
        }
        String citizenship = "-";
        if (wnijCheckBox.isSelected()) {
            citizenship = "01";
        } else if (wnajCheckBox.isSelected()) {
            citizenship = "02";
        }
        String country = "Indonesia";
        String bornPlace = bornPlacejTextField.getText();
        String bornDate = bornDatejTextField.getText();
        String mother = motherjTextField.getText();
        String idCardType = "-";
        if (ktpjCheckBox.isSelected()) {
            idCardType = "01";
        } else if (simjCheckBox.isSelected()) {
            idCardType = "1";
        } else if (pasportjCheckBox.isSelected()) {
            idCardType = "02";
        }
        String numberId = idNumberjTextField.getText();
        String lastEducation = "-";
        if (sdjCheckBox.isSelected()) {
            lastEducation = "0";
        } else if (smpjCheckBox.isSelected()) {
            lastEducation = "1";
        } else if (sltajCheckBox.isSelected()) {
            lastEducation = "2";
        } else if (s1jCheckBox.isSelected()) {
            lastEducation = "3";
        } else if (s2jCheckBox.isSelected()) {
            lastEducation = "4";
        } else if (s3jCheckBox.isSelected()) {
            lastEducation = "5";
        }
        String religion = "-";
        if (islamjCheckBox.isSelected()) {
            religion = "0";
        } else if (katolikjCheckBox.isSelected()) {
            religion = "1";
        } else if (protestantjCheckBox.isSelected()) {
            religion = "2";
        } else if (hindujCheckBox.isSelected()) {
            religion = "3";
        } else if (budhajCheckBox.isSelected()) {
            religion = "4";
        } else if (otherjCheckBox.isSelected()) {
            religion = "5";
        }
        String marriageStatus = "-";
        if (lajangjCheckBox.isSelected()) {
            marriageStatus = "0";
        } else if (marriagejCheckBox.isSelected()) {
            marriageStatus = "1";
        } else if (jandaordudajCheckBox.isSelected()) {
            marriageStatus = "2";
        }
        String accountNumber = accountNumberjTextField.getText();
        String address = addressjTextField.getText();
        String rt = rt1jTextField.getText() + rt2rjTextField.getText() + rt3jTextField.getText();
        String rw = rw1jTextField.getText() + rw2jTextField.getText() + rw3jTextField.getText();
        String village = villagejTextField.getText();
        String kecamatan = kecamatanjTextField.getText();
        String kabupaten = cityjTextField.getText();
        String province = provincejTextField.getText();
        String postCode = postCodejTextField.getText();
        String phoneNumber = phoneNumberjTextField.getText();
        String email = emailNumberjTextField.getText();
        String alias = "-";
        String as_alias = "-";
        if (phonenumberasaliasjCheckBox.isSelected()) {
            emailjCheckBox.setSelected(false);
            alias = phoneNumberjTextField.getText();
            as_alias = "01";
        } else if (emailjCheckBox.isSelected()) {
            phonenumberasaliasjCheckBox.setSelected(false);
            alias = emailNumberjTextField.getText();
            as_alias = "02";
        }

        if (fullName.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Harus diisi");
        } else if (gender.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Jenis Kelamin Harus diisi");
        } else if (citizenship.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Kewarganegaraan Harus diisi");
        } else if (bornPlace.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Tempat  Harus diisi");
        } else if (bornDate.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Tanggal Lahir Harus diisi");
        } else if (mother.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Ibu Kandung Harus diisi");
        } else if (idCardType.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Jenis Kartu ID Harus diisi");
        } else if (numberId.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nomor Kartu ID Harus diisi");
        } else if (phoneNumber.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nomor Ponsel Harus diisi");
        } else if (email.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Email Harus diisi");
        } else if (alias.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Alias Harus diisi");
        } else if (lastEducation.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Pendidikan Terakhir Harus diisi");
        } else if (religion.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Agama Harus diisi");
        } else if (marriageStatus.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Status Perkawinan Harus diisi");
        } else if (address.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Alamat Harus diisi");
        } else if (rt.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "RT Harus diisi");
        } else if (rw.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "RW Harus diisi");
        } else if (village.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Desa Harus diisi");
        } else if (kecamatan.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kecamatan Harus diisi");
        } else if (kabupaten.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kabupaten/Kota Harus diisi");
        } else if (province.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Provinsi Harus diisi");
        } else {

            HashMap remitter = new LinkedHashMap();
            HashMap beneficiary = new LinkedHashMap();
            HashMap messageToServer = new LinkedHashMap();

            HashMap body = new LinkedHashMap();
            HashMap document = new LinkedHashMap();

            HashMap prxyRegn;
            HashMap grpHdr = new LinkedHashMap();
            HashMap sttlmInf = new LinkedHashMap();
            HashMap prxy = new LinkedHashMap();
            HashMap msgSndr = new LinkedHashMap();
            HashMap agt;
            HashMap regn = new LinkedHashMap();
            HashMap scndId = new LinkedHashMap();
            HashMap acct = new LinkedHashMap();
            HashMap cstmr = new LinkedHashMap();
            HashMap envlp = new LinkedHashMap();
            HashMap splmtryData = new LinkedHashMap();
            HashMap finInstnId;
            HashMap othr;
            HashMap id;
            HashMap tp;
            String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().getTime());
            String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime()) + String.valueOf(StringFunction.generateOTP(4));

            grpHdr.put("MsgId", rrn);
            grpHdr.put("CreDtTm", dateNow);

            othr = new LinkedHashMap();
            othr.put("Id", "CENAIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);

            agt = new LinkedHashMap();
            agt.put("FinInstnId", finInstnId);
            msgSndr.put("Agt", agt);
            grpHdr.put("MsgSndr", msgSndr);

            regn.put("RegnTp", "NEWR");

            prxy.put("Tp", as_alias);
            prxy.put("Val", alias);
            regn.put("Prxy", prxy);

            prxyRegn = new LinkedHashMap();
            prxyRegn.put("DsplNm", fullName);
            prxyRegn.put("RegnSts", "ACTV");
            prxyRegn.put("PreAuthrsd", "false");

            othr = new LinkedHashMap();
            othr.put("Id", "CENAIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);
            //            finInstnId.put("Nm", "Bank Indonesia");

            agt = new LinkedHashMap();
            agt.put("FinInstnId", finInstnId);
            prxyRegn.put("Agt", agt);

            id = new LinkedHashMap();
            othr = new LinkedHashMap();
            othr.put("Id", accountNumber);
            id.put("Othr", othr);
            acct.put("Id", id);
            acct.put("Nm", fullName);
            prxyRegn.put("Acct", acct);

            tp = new LinkedHashMap();
            tp.put("Prtry", "SVGS");
            prxyRegn.put("Tp", tp);

            scndId.put("Tp", idCardType);
            scndId.put("Val", numberId);
            prxyRegn.put("ScndId", scndId);
            regn.put("PrxyRegn", prxyRegn);

            cstmr.put("Tp", typeCustomer);
            cstmr.put("Val", numberId);
            cstmr.put("RsdntSts", citizenship);
            cstmr.put("TwnNm", "0300");
            envlp.put("Cstmr", cstmr);
            //        LinkedList a=new LinkedList();
            //        a.add(envlp);
            splmtryData.put("Envlp", envlp);

            prxyRegn = new LinkedHashMap();
            prxyRegn.put("GrpHdr", grpHdr);
            prxyRegn.put("Regn", regn);
            prxyRegn.put("SplmtryData", splmtryData);
            document.put("PrxyRegn", prxyRegn);
            body.put("Document", document);
            body.put("procCode", FieldParamater.registerProxyAlias);
            body.put("rrn", rrn);
            body.put("currentDate", dateNow);
            String response = SendMessage.sendMessage(body);
            HashMap respHasMap = JsonProcess.decodeJson(response);
            if (respHasMap.get("resp_code").equals("0000")) {
                DBConnection2 dBConnection = new DBConnection2();

                dBConnection.updateAccount(fullName, gender, citizenship, country, bornPlace, bornDate, mother, idCardType, numberId, lastEducation, religion, marriageStatus, address, rt, rw, village, kecamatan, kabupaten, province, postCode, alias, accountNumber, as_alias, typeCustomer);

            } else if (respHasMap.get("resp_code").equals("0002")) {
                showalertdialog("Perubahan Ditolak", respHasMap.get("resp_desc").toString());
            } else {
                System.out.println("Error : " + respHasMap.get("resp_desc"));
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String typeCustomer = "0" + String.valueOf(typeCustomerjComboBox.getSelectedIndex() + 1);

        String fullName = fullNamejTextField.getText();
        String gender = "-";
        if (menjCheckBox.isSelected()) {
            gender = "0";
        } else if (womenjCheckBox.isSelected()) {
            gender = "1";
        }
        String citizenship = "-";
        if (wnijCheckBox.isSelected()) {
            citizenship = "01";
        } else if (wnajCheckBox.isSelected()) {
            citizenship = "02";
        }
        String country = "Indonesia";
        String bornPlace = bornPlacejTextField.getText();
        String bornDate = bornDatejTextField.getText();
        String mother = motherjTextField.getText();
        String idCardType = "-";
        if (ktpjCheckBox.isSelected()) {
            idCardType = "01";
        } else if (simjCheckBox.isSelected()) {
            idCardType = "1";
        } else if (pasportjCheckBox.isSelected()) {
            idCardType = "02";
        }
        String numberId = idNumberjTextField.getText();
        String lastEducation = "-";
        if (sdjCheckBox.isSelected()) {
            lastEducation = "0";
        } else if (smpjCheckBox.isSelected()) {
            lastEducation = "1";
        } else if (sltajCheckBox.isSelected()) {
            lastEducation = "2";
        } else if (s1jCheckBox.isSelected()) {
            lastEducation = "3";
        } else if (s2jCheckBox.isSelected()) {
            lastEducation = "4";
        } else if (s3jCheckBox.isSelected()) {
            lastEducation = "5";
        }
        String religion = "-";
        if (islamjCheckBox.isSelected()) {
            religion = "0";
        } else if (katolikjCheckBox.isSelected()) {
            religion = "1";
        } else if (protestantjCheckBox.isSelected()) {
            religion = "2";
        } else if (hindujCheckBox.isSelected()) {
            religion = "3";
        } else if (budhajCheckBox.isSelected()) {
            religion = "4";
        } else if (otherjCheckBox.isSelected()) {
            religion = "5";
        }
        String marriageStatus = "-";
        if (lajangjCheckBox.isSelected()) {
            marriageStatus = "0";
        } else if (marriagejCheckBox.isSelected()) {
            marriageStatus = "1";
        } else if (jandaordudajCheckBox.isSelected()) {
            marriageStatus = "2";
        }
        String accountNumber = accountNumberjTextField.getText();
        String address = addressjTextField.getText();
        String rt = rt1jTextField.getText() + rt2rjTextField.getText() + rt3jTextField.getText();
        String rw = rw1jTextField.getText() + rw2jTextField.getText() + rw3jTextField.getText();
        String village = villagejTextField.getText();
        String kecamatan = kecamatanjTextField.getText();
        String kabupaten = cityjTextField.getText();
        String province = provincejTextField.getText();
        String postCode = postCodejTextField.getText();
        String phoneNumber = phoneNumberjTextField.getText();
        String email = emailNumberjTextField.getText();
        String alias = "-";
        String as_alias = "-";
        if (phonenumberasaliasjCheckBox.isSelected()) {
            emailjCheckBox.setSelected(false);
            alias = phoneNumberjTextField.getText();
            as_alias = "01";
        } else if (emailjCheckBox.isSelected()) {
            phonenumberasaliasjCheckBox.setSelected(false);
            alias = emailNumberjTextField.getText();
            as_alias = "02";
        }

        if (fullName.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Harus diisi");
        } else if (gender.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Jenis Kelamin Harus diisi");
        } else if (citizenship.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Kewarganegaraan Harus diisi");
        } else if (bornPlace.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Tempat  Harus diisi");
        } else if (bornDate.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Tanggal Lahir Harus diisi");
        } else if (mother.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nama Ibu Kandung Harus diisi");
        } else if (idCardType.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Jenis Kartu ID Harus diisi");
        } else if (numberId.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nomor Kartu ID Harus diisi");
        } else if (phoneNumber.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Nomor Ponsel Harus diisi");
        } else if (email.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Email Harus diisi");
        } else if (alias.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Alias Harus diisi");
        } else if (lastEducation.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Pendidikan Terakhir Harus diisi");
        } else if (religion.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Agama Harus diisi");
        } else if (marriageStatus.equals("-")) {
            showalertdialog("Data Belum Lengkap", "Status Perkawinan Harus diisi");
        } else if (address.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Alamat Harus diisi");
        } else if (rt.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "RT Harus diisi");
        } else if (rw.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "RW Harus diisi");
        } else if (village.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Desa Harus diisi");
        } else if (kecamatan.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kecamatan Harus diisi");
        } else if (kabupaten.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Kabupaten/Kota Harus diisi");
        } else if (province.isEmpty()) {
            showalertdialog("Data Belum Lengkap", "Provinsi Harus diisi");
        } else {

            HashMap remitter = new LinkedHashMap();
            HashMap beneficiary = new LinkedHashMap();
            HashMap messageToServer = new LinkedHashMap();

            HashMap body = new LinkedHashMap();
            HashMap document = new LinkedHashMap();

            HashMap prxyRegn;
            HashMap grpHdr = new LinkedHashMap();
            HashMap sttlmInf = new LinkedHashMap();
            HashMap prxy = new LinkedHashMap();
            HashMap msgSndr = new LinkedHashMap();
            HashMap agt;
            HashMap regn = new LinkedHashMap();
            HashMap scndId = new LinkedHashMap();
            HashMap acct = new LinkedHashMap();
            HashMap cstmr = new LinkedHashMap();
            HashMap envlp = new LinkedHashMap();
            HashMap splmtryData = new LinkedHashMap();
            HashMap finInstnId;
            HashMap othr;
            HashMap id;
            HashMap tp;
            String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().getTime());
            String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime()) + String.valueOf(StringFunction.generateOTP(4));

            grpHdr.put("MsgId", rrn);
            grpHdr.put("CreDtTm", dateNow);

            othr = new LinkedHashMap();
            othr.put("Id", "CENAIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);

            agt = new LinkedHashMap();
            agt.put("FinInstnId", finInstnId);
            msgSndr.put("Agt", agt);
            grpHdr.put("MsgSndr", msgSndr);

            regn.put("RegnTp", "NEWR");

            prxy.put("Tp", as_alias);
            prxy.put("Val", alias);
            regn.put("Prxy", prxy);

            prxyRegn = new LinkedHashMap();
            prxyRegn.put("DsplNm", fullName);
            prxyRegn.put("RegnSts", "ACTV");
            prxyRegn.put("PreAuthrsd", "false");

            othr = new LinkedHashMap();
            othr.put("Id", "CENAIDJA");

            finInstnId = new LinkedHashMap();
            finInstnId.put("Othr", othr);
            //            finInstnId.put("Nm", "BCA");

            agt = new LinkedHashMap();
            agt.put("FinInstnId", finInstnId);
            prxyRegn.put("Agt", agt);

            id = new LinkedHashMap();
            othr = new LinkedHashMap();
            othr.put("Id", accountNumber);
            id.put("Othr", othr);
            acct.put("Id", id);
            acct.put("Nm", fullName);
            prxyRegn.put("Acct", acct);

            tp = new LinkedHashMap();
            tp.put("Prtry", "SVGS");
            prxyRegn.put("Tp", tp);

            scndId.put("Tp", idCardType);
            scndId.put("Val", numberId);
            prxyRegn.put("ScndId", scndId);
            regn.put("PrxyRegn", prxyRegn);

            cstmr.put("Tp", typeCustomer);
            cstmr.put("Val", numberId);
            cstmr.put("RsdntSts", citizenship);
            cstmr.put("TwnNm", "0300");
            envlp.put("Cstmr", cstmr);
            //        LinkedList a=new LinkedList();
            //        a.add(envlp);
            splmtryData.put("Envlp", envlp);

            prxyRegn = new LinkedHashMap();
            prxyRegn.put("GrpHdr", grpHdr);
            prxyRegn.put("Regn", regn);
            prxyRegn.put("SplmtryData", splmtryData);
            document.put("PrxyRegn", prxyRegn);
            body.put("Document", document);
            body.put("procCode", FieldParamater.registerProxyAlias);
            body.put("rrn", rrn);
            body.put("currentDate", dateNow);
            String response = SendMessage.sendMessage2(body);
            HashMap respHasMap = JsonProcess.decodeJson(response);
            if (respHasMap.get("resp_code").equals("0000")) {
                DBConnection2 dBConnection = new DBConnection2();

                dBConnection.updateAccount(fullName, gender, citizenship, country, bornPlace, bornDate, mother, idCardType, numberId, lastEducation, religion, marriageStatus, address, rt, rw, village, kecamatan, kabupaten, province, postCode, alias, accountNumber, as_alias, typeCustomer);

            } else if (respHasMap.get("resp_code").equals("0002")) {
                showalertdialog("Perubahan Ditolak", respHasMap.get("resp_desc").toString());
            } else {
                System.out.println("Error : " + respHasMap.get("resp_desc"));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeCustomerjComboBoxjComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCustomerjComboBoxjComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeCustomerjComboBoxjComboBox6ActionPerformed

    private void emailjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjCheckBoxActionPerformed
        // TODO add your handling code here:
        phonenumberasaliasjCheckBox.setSelected(false);
    }//GEN-LAST:event_emailjCheckBoxActionPerformed

    private void phonenumberasaliasjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberasaliasjCheckBoxActionPerformed
        // TODO add your handling code here:
        emailjCheckBox.setSelected(false);
    }//GEN-LAST:event_phonenumberasaliasjCheckBoxActionPerformed

    private void emailNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailNumberjTextFieldjTextField13ActionPerformed

    private void phoneNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberjTextFieldjTextField13ActionPerformed

    private void kecamatanjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kecamatanjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatanjTextFieldjTextField13ActionPerformed

    private void addressjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressjTextFieldjTextField13ActionPerformed

    private void rw3jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rw3jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rw3jTextFieldActionPerformed

    private void rw2jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rw2jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rw2jTextFieldActionPerformed

    private void rw1jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rw1jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rw1jTextFieldActionPerformed

    private void rt1jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt1jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt1jTextFieldActionPerformed

    private void rt2rjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt2rjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt2rjTextFieldActionPerformed

    private void rt3jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt3jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rt3jTextFieldActionPerformed

    private void otherjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherjCheckBoxActionPerformed

    private void hindujCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hindujCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hindujCheckBoxActionPerformed

    private void budhajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budhajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_budhajCheckBoxActionPerformed

    private void protestantjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protestantjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_protestantjCheckBoxActionPerformed

    private void katolikjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katolikjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_katolikjCheckBoxActionPerformed

    private void islamjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islamjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_islamjCheckBoxActionPerformed

    private void jandaordudajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jandaordudajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jandaordudajCheckBoxActionPerformed

    private void marriagejCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriagejCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marriagejCheckBoxActionPerformed

    private void lajangjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lajangjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lajangjCheckBoxActionPerformed

    private void s2jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2jCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2jCheckBoxActionPerformed

    private void s1jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1jCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1jCheckBoxActionPerformed

    private void s3jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3jCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3jCheckBoxActionPerformed

    private void sltajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sltajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sltajCheckBoxActionPerformed

    private void smpjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smpjCheckBoxActionPerformed

    private void sdjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdjCheckBoxActionPerformed

    private void idNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberjTextFieldjTextField13ActionPerformed

    private void pasportjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasportjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasportjCheckBoxActionPerformed

    private void simjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simjCheckBoxActionPerformed

    private void ktpjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktpjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ktpjCheckBoxActionPerformed

    private void motherjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motherjTextFieldjTextField13ActionPerformed

    private void bornDatejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bornDatejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bornDatejTextFieldjTextField13ActionPerformed

    private void bornPlacejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bornPlacejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bornPlacejTextFieldjTextField13ActionPerformed

    private void wnijCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wnijCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wnijCheckBoxActionPerformed

    private void wnajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wnajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wnajCheckBoxActionPerformed

    private void menjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menjCheckBoxActionPerformed

    private void postCodejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodejTextFieldjTextField13ActionPerformed

    private void provincejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provincejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provincejTextFieldjTextField13ActionPerformed

    private void cityjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityjTextFieldjTextField13ActionPerformed

    private void villagejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villagejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_villagejTextFieldjTextField13ActionPerformed

    private void fullNamejTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNamejTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNamejTextFieldjTextField13ActionPerformed

    private HashMap getAccount(String accountNumber) {
        DBConnection2 dBConnection = new DBConnection2();
        HashMap userDataMap = dBConnection.getAccount(accountNumber);

        return userDataMap;
    }

    private void showalertdialog(String title, String msg) {
        JOptionPane.showMessageDialog(new JFrame(),
                msg,
                title,
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberBneficiaryjTextField;
    private javax.swing.JTextField accountNumberjTextField;
    private javax.swing.JTextField accountNumberjTextField1;
    private javax.swing.JTextField accountNumberjTextField10;
    private javax.swing.JTextField accountNumberjTextField11;
    private javax.swing.JTextField accountNumberjTextField12;
    private javax.swing.JTextField accountNumberjTextField2;
    private javax.swing.JTextField accountNumberjTextField3;
    private javax.swing.JTextField accountNumberjTextField4;
    private javax.swing.JTextField accountNumberjTextField5;
    private javax.swing.JTextField accountNumberjTextField6;
    private javax.swing.JTextField accountNumberjTextField7;
    private javax.swing.JTextField accountNumberjTextField8;
    private javax.swing.JTextField accountNumberjTextField9;
    private javax.swing.JCheckBox accountVerifijCheckBox;
    private javax.swing.JTextField addressBeneficiaryjTextField1;
    private javax.swing.JTextField addressBeneficiaryjTextField2;
    private javax.swing.JTextField addressRemitterjTextField;
    private javax.swing.JTextField addressRemitterjTextField1;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JComboBox<String> adminFeejComboBox;
    private javax.swing.JTextArea amountInWordjTextArea;
    private javax.swing.JTextField amountjTextField;
    private javax.swing.JTextField bornDatejTextField;
    private javax.swing.JTextField bornPlacejTextField;
    private javax.swing.JCheckBox budhajCheckBox;
    private javax.swing.JTextField cityBeneficiaryjTextField;
    private javax.swing.JTextField cityRemitterjTextField;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JComboBox<String> countryBeneficiaryjComboBox;
    private javax.swing.JComboBox<String> countryBeneficiaryjComboBox1;
    private javax.swing.JTextField emailBeneficiaryjTextField;
    private javax.swing.JTextField emailNumberjTextField;
    private javax.swing.JCheckBox emailjCheckBox;
    private javax.swing.JTextField fullNameBeneficiaryjTextField;
    private javax.swing.JTextField fullNameRemitterjTextField;
    private javax.swing.JTextField fullNamejTextField;
    private javax.swing.JCheckBox hindujCheckBox;
    private javax.swing.JTextField idNumberjTextField;
    private javax.swing.JCheckBox islamjCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JCheckBox jandaordudajCheckBox;
    private javax.swing.JCheckBox katolikjCheckBox;
    private javax.swing.JTextField kecamatanjTextField;
    private javax.swing.JCheckBox ktpjCheckBox;
    private javax.swing.JCheckBox lajangjCheckBox;
    private javax.swing.JCheckBox marriagejCheckBox;
    private javax.swing.JCheckBox menjCheckBox;
    private javax.swing.JTextField messagetoBeneficiaryjTextField1;
    private javax.swing.JTextField messagetoBeneficiaryjTextField2;
    private javax.swing.JTextField messagetoBeneficiaryjTextField3;
    private javax.swing.JTextField motherjTextField;
    private javax.swing.JCheckBox otherjCheckBox;
    private javax.swing.JCheckBox pasportjCheckBox;
    private javax.swing.JTextField phoneNumberjTextField;
    private javax.swing.JCheckBox phonenumberasaliasjCheckBox;
    private javax.swing.JTextField postCodeBeneficiaryjTextField;
    private javax.swing.JTextField postCodejTextField;
    private javax.swing.JTextField postCoderemitterjTextField;
    private javax.swing.JCheckBox protestantjCheckBox;
    private javax.swing.JTextField provinceBeneficiaryjTextField;
    private javax.swing.JTextField provinceRemitterjTextField;
    private javax.swing.JTextField provincejTextField;
    private javax.swing.JTextField purposePaymentjTextField;
    private javax.swing.JTextField referencesNumberjTextField;
    private javax.swing.JTextField rt1jTextField;
    private javax.swing.JTextField rt2rjTextField;
    private javax.swing.JTextField rt3jTextField;
    private javax.swing.JTextField rw1jTextField;
    private javax.swing.JTextField rw2jTextField;
    private javax.swing.JTextField rw3jTextField;
    private javax.swing.JCheckBox s1jCheckBox;
    private javax.swing.JCheckBox s2jCheckBox;
    private javax.swing.JCheckBox s3jCheckBox;
    private javax.swing.JCheckBox sdjCheckBox;
    private javax.swing.JCheckBox simjCheckBox;
    private javax.swing.JCheckBox sltajCheckBox;
    private javax.swing.JCheckBox smpjCheckBox;
    private javax.swing.JTextField sourceOfFundjTextField;
    private javax.swing.JComboBox<String> transferCurrencyjComboBox;
    private javax.swing.JTextField trxDatejTextField;
    private javax.swing.JComboBox<String> trxTypejComboBox;
    private javax.swing.JComboBox<String> typeCustomerjComboBox;
    private javax.swing.JTextField villagejTextField;
    private javax.swing.JCheckBox wnajCheckBox;
    private javax.swing.JCheckBox wnijCheckBox;
    private javax.swing.JCheckBox womenjCheckBox;
    // End of variables declaration//GEN-END:variables
}
