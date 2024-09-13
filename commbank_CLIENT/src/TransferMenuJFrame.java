
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Parameter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class TransferMenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TransferMenuJFrame
     */
    public TransferMenuJFrame() {
        initComponents();

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

    private HashMap getAccount(String accountNumber) {
        DBConnection dBConnection = new DBConnection();
        HashMap userDataMap = dBConnection.getAccount(accountNumber);

        return userDataMap;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        trxTypejComboBox = new javax.swing.JComboBox<>();
        referencesNumberjTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        amountjTextField = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        transferCurrencyjComboBox = new javax.swing.JComboBox<>();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        amountInWordjTextArea = new javax.swing.JTextArea();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        purposePaymentjTextField = new javax.swing.JTextField();
        sourceOfFundjTextField = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        fullNameRemitterjTextField = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        addressRemitterjTextField1 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        addressRemitterjTextField2 = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        cityRemitterjTextField = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        provinceRemitterjTextField = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
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
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
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
        jLabel43 = new javax.swing.JLabel();
        trxDatejTextField = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Picture1 (2).png")); // NOI18N

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

        jLabel193.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel193.setText("Sumber Dana");

        jLabel194.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel194.setText("Source of Fund / ");

        jLabel195.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel195.setText("Tujuan Transaksi");

        jLabel196.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel196.setText("Purpose of Payment /");

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

        jLabel197.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel197.setText("Mata uang Pengiriman");

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
                    .addComponent(jLabel194)
                    .addComponent(jLabel193)
                    .addComponent(jLabel197)
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
                                .addComponent(jLabel195)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel196)
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
                                .addComponent(jLabel197)))
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
                        .addComponent(jLabel194)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel193))
                    .addComponent(sourceOfFundjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel196)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel195))
                    .addComponent(purposePaymentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remitter Detail / Deskripsi Pengirim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel157.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel157.setText("Nama Penerima");

        jLabel158.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel158.setText("Full Name /");

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

        jLabel165.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel165.setText("Address /");

        jLabel166.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel166.setText("Alamat");

        addressRemitterjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressRemitterjTextField2jTextField13ActionPerformed(evt);
            }
        });

        jLabel167.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel167.setText("Kota");

        jLabel168.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel168.setText("City /");

        cityRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel169.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel169.setText("Propinsi");

        jLabel170.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel170.setText("Province /");

        provinceRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceRemitterjTextFieldjTextField13ActionPerformed(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel171.setText("Post Code /");

        jLabel172.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel172.setText("Kode Pos");

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

        jLabel216.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel216.setText("Charge to /");

        jLabel217.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel217.setText("Biaya dibebankan ke");

        adminFeejComboBox.setBackground(new java.awt.Color(204, 204, 255));
        adminFeejComboBox.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        adminFeejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remitter / Pengirim", "Beneficiary / Penerima" }));
        adminFeejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminFeejComboBoxjComboBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel158)
                    .addComponent(jLabel157)
                    .addComponent(jLabel163)
                    .addComponent(jLabel164)
                    .addComponent(jLabel165)
                    .addComponent(jLabel166)
                    .addComponent(jLabel168)
                    .addComponent(jLabel167)
                    .addComponent(jLabel170)
                    .addComponent(jLabel169)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(jLabel216)
                    .addComponent(jLabel217))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminFeejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
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
                    .addComponent(addressRemitterjTextField2)
                    .addComponent(addressRemitterjTextField1)
                    .addComponent(fullNameRemitterjTextField)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(provinceRemitterjTextField)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel171)
                            .addComponent(jLabel172))
                        .addGap(18, 18, 18)
                        .addComponent(postCoderemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel157))
                    .addComponent(fullNameRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressRemitterjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel163)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel164)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressRemitterjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel165)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel166)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel168)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel167)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provinceRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel170)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel169))
                    .addComponent(postCoderemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel171)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel172)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel243))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(accountNumberBneficiaryjTextField)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel224))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(accountNumberBneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel226)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel225))
                    .addComponent(fullNameBeneficiaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(referencesNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(trxTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel43))
                                    .addGap(18, 18, 18)
                                    .addComponent(trxDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel43))
                            .addComponent(trxDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5))
                            .addComponent(referencesNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(trxTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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

    private void addressRemitterjTextField2jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressRemitterjTextField2jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressRemitterjTextField2jTextField13ActionPerformed

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

    private void trxDatejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trxDatejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trxDatejTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
        String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime());

        grpHdr.put("MsgId", "20210301INDOIDJA51012345678");
        grpHdr.put("CreDtTm", dateNow);
        grpHdr.put("NbOfTxs", "1");
        sttlmInf.put("SttlmMtd", "CLRG");
        grpHdr.put("SttlmInf", sttlmInf);

        pmtId.put("EndToEndId", "20210301INDOIDJA51012345678");
        pmtId.put("TxId", "20210301INDOIDJA51012345678");
        pmtId.put("ChrgBr", "DEBT");

        cdtTrfTxInf.put("PmtId", pmtId);
        cdtTrfTxInf.put("ntrBkSttlmAmt", "123.45");
        cdtTrfTxInf.put("Ccy", "IDR");

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
        othr.put("Id", "12345");

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
        String response = SendMessage.sendMessage(body);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

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
        String rrn = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime());

        grpHdr.put("MsgId", "20210301INDOIDJA51012345678");
        grpHdr.put("CreDtTm", dateNow);
        grpHdr.put("NbOfTxs", "1");
        sttlmInf.put("SttlmMtd", "CLRG");
        grpHdr.put("SttlmInf", sttlmInf);

        pmtId.put("EndToEndId", "20210301INDOIDJA51012345678");
        pmtId.put("TxId", "20210301INDOIDJA51012345678");
        pmtId.put("ChrgBr", "DEBT");

        cdtTrfTxInf.put("PmtId", pmtId);
        cdtTrfTxInf.put("ntrBkSttlmAmt", "123.45");
        cdtTrfTxInf.put("Ccy", "IDR");

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
        othr.put("Id", "12345");

        id = new LinkedHashMap();
        id.put("Othr", othr);

        cdtrAcct.put("Id", id);
        cdtTrfTxInf.put("CdtrAcct", cdtrAcct);

        fIToFICstmrCdtTrf.put("GrpHdr", grpHdr);
        fIToFICstmrCdtTrf.put("CdtTrfTxInf", cdtTrfTxInf);
        document.put("FIToFICstmrCdtTrf", fIToFICstmrCdtTrf);
        body.put("Document", document);
        body.put("procCode", FieldParamater.creditTransferWithProxy);
        body.put("rrn", rrn);
        body.put("currentDate", dateNow);
        String response = SendMessage.sendMessage(body);

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
        String addressRemitter = addressRemitterjTextField1.getText() + addressRemitterjTextField2.getText();
        String addressBeneficiary = addressBeneficiaryjTextField1.getText() + addressBeneficiaryjTextField2.getText();
        String message = messagetoBeneficiaryjTextField1.getText().toString() + " " + messagetoBeneficiaryjTextField2.getText().toString() + " " + messagetoBeneficiaryjTextField3.getText().toString();

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
        } else {

//            grpHdr.put("MsgId", "20210301INDOIDJA51012345678");
//            grpHdr.put("CreDtTm", dateNow);
//            grpHdr.put("NbOfTxs", "1");
//            sttlmInf.put("SttlmMtd", "CLRG");
//            grpHdr.put("SttlmInf", sttlmInf);
//
//            pmtId.put("EndToEndId", "20210301INDOIDJA51012345678");
//            pmtId.put("TxId", "20210301INDOIDJA51012345678");
//            pmtId.put("ChrgBr", "DEBT");
//
//            cdtTrfTxInf.put("PmtId", pmtId);
//            cdtTrfTxInf.put("ntrBkSttlmAmt", amount);
//            cdtTrfTxInf.put("Ccy", "IDR");
//
//            othr = new LinkedHashMap();
//            othr.put("Id", "INDOIDJA");
//
//            finInstnId = new LinkedHashMap();
//            finInstnId.put("Othr", othr);
//
//            dbtrAgt.put("FinInstnId", finInstnId);
//            cdtTrfTxInf.put("DbtrAgt", dbtrAgt);
//
//            othr = new LinkedHashMap();
//            othr.put("Id", "CENAIDJA");
//
//            finInstnId = new LinkedHashMap();
//            finInstnId.put("Othr", othr);
//
//            cdtAgt.put("FinInstnId", finInstnId);
//
//            cdtTrfTxInf.put("CdtrAgt", cdtAgt);
//
//            othr = new LinkedHashMap();
//            othr.put("Id", accountNumberBneficiary);
//
//            id = new LinkedHashMap();
//            id.put("Othr", othr);
//
//            cdtrAcct.put("Id", id);
//            cdtTrfTxInf.put("CdtrAcct", cdtrAcct);
//
//            fIToFICstmrCdtTrf.put("GrpHdr", grpHdr);
//            fIToFICstmrCdtTrf.put("CdtTrfTxInf", cdtTrfTxInf);
//            document.put("FIToFICstmrCdtTrf", fIToFICstmrCdtTrf);
//            body.put("Document", document);
//            body.put("procCode", "CT008");
//            body.put("rrn", rrn);
//            String response = SendMessage.sendMessage(body);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TransferMenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferMenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferMenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferMenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferMenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberBneficiaryjTextField;
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
    private javax.swing.JTextField addressBeneficiaryjTextField1;
    private javax.swing.JTextField addressBeneficiaryjTextField2;
    private javax.swing.JTextField addressRemitterjTextField1;
    private javax.swing.JTextField addressRemitterjTextField2;
    private javax.swing.JComboBox<String> adminFeejComboBox;
    private javax.swing.JTextArea amountInWordjTextArea;
    private javax.swing.JTextField amountjTextField;
    private javax.swing.JTextField cityBeneficiaryjTextField;
    private javax.swing.JTextField cityRemitterjTextField;
    private javax.swing.JComboBox<String> countryBeneficiaryjComboBox;
    private javax.swing.JTextField fullNameBeneficiaryjTextField;
    private javax.swing.JTextField fullNameRemitterjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
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
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
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
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField messagetoBeneficiaryjTextField1;
    private javax.swing.JTextField messagetoBeneficiaryjTextField2;
    private javax.swing.JTextField messagetoBeneficiaryjTextField3;
    private javax.swing.JTextField postCodeBeneficiaryjTextField;
    private javax.swing.JTextField postCoderemitterjTextField;
    private javax.swing.JTextField provinceBeneficiaryjTextField;
    private javax.swing.JTextField provinceRemitterjTextField;
    private javax.swing.JTextField purposePaymentjTextField;
    private javax.swing.JTextField referencesNumberjTextField;
    private javax.swing.JTextField sourceOfFundjTextField;
    private javax.swing.JComboBox<String> transferCurrencyjComboBox;
    private javax.swing.JTextField trxDatejTextField;
    private javax.swing.JComboBox<String> trxTypejComboBox;
    // End of variables declaration//GEN-END:variables
}
