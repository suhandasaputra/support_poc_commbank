
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class RegistrationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationJFrame
     */
    public RegistrationJFrame() {
        initComponents();

        menjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                womenjCheckBox.setSelected(false);
            }
        });
        womenjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                menjCheckBox.setSelected(false);
            }
        });

        wnijCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                wnajCheckBox.setSelected(false);
            }
        });
        wnajCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                wnijCheckBox.setSelected(false);
            }
        });

        ktpjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                simjCheckBox.setSelected(false);
                pasportjCheckBox.setSelected(false);
            }
        });
        simjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                ktpjCheckBox.setSelected(false);
                pasportjCheckBox.setSelected(false);
            }
        });

        pasportjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                simjCheckBox.setSelected(false);
                ktpjCheckBox.setSelected(false);
            }
        });

        sdjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                smpjCheckBox.setSelected(false);
                sltajCheckBox.setSelected(false);
                s1jCheckBox.setSelected(false);
                s2jCheckBox.setSelected(false);
                s3jCheckBox.setSelected(false);
            }
        });
        smpjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                sdjCheckBox.setSelected(false);
                sltajCheckBox.setSelected(false);
                s1jCheckBox.setSelected(false);
                s2jCheckBox.setSelected(false);
                s3jCheckBox.setSelected(false);
            }
        });
        sltajCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                smpjCheckBox.setSelected(false);
                sdjCheckBox.setSelected(false);
                s1jCheckBox.setSelected(false);
                s2jCheckBox.setSelected(false);
                s3jCheckBox.setSelected(false);
            }
        });
        s1jCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                smpjCheckBox.setSelected(false);
                sltajCheckBox.setSelected(false);
                sdjCheckBox.setSelected(false);
                s2jCheckBox.setSelected(false);
                s3jCheckBox.setSelected(false);
            }
        });
        s2jCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                smpjCheckBox.setSelected(false);
                sltajCheckBox.setSelected(false);
                s1jCheckBox.setSelected(false);
                sdjCheckBox.setSelected(false);
                s3jCheckBox.setSelected(false);
            }
        });
        s3jCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                smpjCheckBox.setSelected(false);
                sltajCheckBox.setSelected(false);
                s1jCheckBox.setSelected(false);
                s2jCheckBox.setSelected(false);
                sdjCheckBox.setSelected(false);
            }
        });

        islamjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                katolikjCheckBox.setSelected(false);
                protestantjCheckBox.setSelected(false);
                budhajCheckBox.setSelected(false);
                hindujCheckBox.setSelected(false);
                otherjCheckBox.setSelected(false);
            }
        });
        katolikjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                islamjCheckBox.setSelected(false);
                protestantjCheckBox.setSelected(false);
                budhajCheckBox.setSelected(false);
                hindujCheckBox.setSelected(false);
                otherjCheckBox.setSelected(false);
            }
        });
        protestantjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                islamjCheckBox.setSelected(false);
                katolikjCheckBox.setSelected(false);
                budhajCheckBox.setSelected(false);
                hindujCheckBox.setSelected(false);
                otherjCheckBox.setSelected(false);
            }
        });
        budhajCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                islamjCheckBox.setSelected(false);
                katolikjCheckBox.setSelected(false);
                protestantjCheckBox.setSelected(false);
                hindujCheckBox.setSelected(false);
                otherjCheckBox.setSelected(false);
            }
        });
        hindujCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                islamjCheckBox.setSelected(false);
                katolikjCheckBox.setSelected(false);
                budhajCheckBox.setSelected(false);
                protestantjCheckBox.setSelected(false);
                otherjCheckBox.setSelected(false);
            }
        });
        otherjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                islamjCheckBox.setSelected(false);
                katolikjCheckBox.setSelected(false);
                budhajCheckBox.setSelected(false);
                hindujCheckBox.setSelected(false);
                protestantjCheckBox.setSelected(false);
            }
        });

        lajangjCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                marriagejCheckBox.setSelected(false);
                jandaordudajCheckBox.setSelected(false);
            }
        });
        marriagejCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                lajangjCheckBox.setSelected(false);
                jandaordudajCheckBox.setSelected(false);
            }
        });

        jandaordudajCheckBox.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                lajangjCheckBox.setSelected(false);
                marriagejCheckBox.setSelected(false);
            }
        });

        rt1jTextField.getDocument().addDocumentListener(new DocumentListener() {

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

                if (rt1jTextField.getText().length() == 1) {
                    rt2rjTextField.requestFocus();
                    rt2rjTextField.setEditable(true);
                    rt1jTextField.setEditable(false);
                }
            }
        });
        rt2rjTextField.getDocument().addDocumentListener(new DocumentListener() {

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

                if (rt2rjTextField.getText().length() == 1) {
                    rt3jTextField.requestFocus();
                    rt3jTextField.setEditable(true);
                    rt2rjTextField.setEditable(false);
                }
            }
        });
        if (rt2rjTextField.getText().isEmpty()) {
            rt2rjTextField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        rt1jTextField.requestFocus();
                        rt1jTextField.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        rt3jTextField.getDocument().addDocumentListener(new DocumentListener() {

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

//                if (rt3jTextField.getText().length() == 1) {
//                    rt3jTextField.requestFocus();
//                    rt3jTextField.setEditable(true);
//                    rt2rjTextField.setEditable(false);
//                }
            }
        });
        if (rt3jTextField.getText().isEmpty()) {
            rt3jTextField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        rt2rjTextField.requestFocus();
                        rt2rjTextField.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        rw1jTextField.getDocument().addDocumentListener(new DocumentListener() {

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

                if (rw1jTextField.getText().length() == 1) {
                    rw2jTextField.requestFocus();
                    rw2jTextField.setEditable(true);
                    rw1jTextField.setEditable(false);
                }
            }
        });
        rw2jTextField.getDocument().addDocumentListener(new DocumentListener() {

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

                if (rw2jTextField.getText().length() == 1) {
                    rw3jTextField.requestFocus();
                    rw3jTextField.setEditable(true);
                    rw2jTextField.setEditable(false);
                }
            }
        });
        if (rw2jTextField.getText().isEmpty()) {
            rw2jTextField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        rw1jTextField.requestFocus();
                        rw1jTextField.setEditable(true);
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        rw3jTextField.getDocument().addDocumentListener(new DocumentListener() {

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

//                if (rt3jTextField.getText().length() == 1) {
//                    rt3jTextField.requestFocus();
//                    rt3jTextField.setEditable(true);
//                    rt2rjTextField.setEditable(false);
//                }
            }
        });
        if (rw3jTextField.getText().isEmpty()) {
            rw3jTextField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {
                        rw2jTextField.requestFocus();
                        rw2jTextField.setEditable(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        fullNameRemitterjTextField = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        accountNumberjTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Picture1 (2).png")); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data / Data Pribadi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel157.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel157.setText("Nama Penerima");

        jLabel158.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel158.setText("Full Name /");

        fullNameRemitterjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameRemitterjTextFieldjTextField13ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel202))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameRemitterjTextField)
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
                                                .addComponent(otherjCheckBox)))))
                                .addContainerGap())
                            .addComponent(idNumberjTextField)))
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
                            .addComponent(phonenumberasaliasjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel157))
                    .addComponent(fullNameRemitterjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jButton1.setText("Daftar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(544, 544, 544)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel159)
                            .addComponent(jLabel160)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(accountNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))))
                .addContainerGap(839, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel159)
                .addGap(0, 0, 0)
                .addComponent(jLabel160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void fullNameRemitterjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameRemitterjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameRemitterjTextFieldjTextField13ActionPerformed

    private void lajangjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lajangjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lajangjCheckBoxActionPerformed

    private void marriagejCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriagejCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marriagejCheckBoxActionPerformed

    private void jandaordudajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jandaordudajCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jandaordudajCheckBoxActionPerformed

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

    private void addressjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressjTextFieldjTextField13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fullName = fullNameRemitterjTextField.getText();
        String gender = "-";
        if (menjCheckBox.isSelected()) {
            gender = "0";
        } else if (womenjCheckBox.isSelected()) {
            gender = "1";
        }
        String citizenship = "-";
        if (wnijCheckBox.isSelected()) {
            citizenship = "0";
        } else if (wnajCheckBox.isSelected()) {
            citizenship = "1";
        }
        String country = "Indonesia";
        String bornPlace = bornPlacejTextField.getText();
        String bornDate = bornDatejTextField.getText();
        String mother = motherjTextField.getText();
        String idCardType = "-";
        if (ktpjCheckBox.isSelected()) {
            idCardType = "0";
        } else if (simjCheckBox.isSelected()) {
            idCardType = "1";
        } else if (pasportjCheckBox.isSelected()) {
            idCardType = "2";
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
            as_alias = "1";
        } else if (emailjCheckBox.isSelected()) {
            phonenumberasaliasjCheckBox.setSelected(false);
            alias = emailNumberjTextField.getText();
            as_alias = "0";
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

        }

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
        HashMap respHasMap = JsonProcess.decodeJson(response);
        if (respHasMap.get("resp_code").equals("0000")) {
            DBConnection dBConnection = new DBConnection();

            dBConnection.createAlias(fullName, gender, citizenship, country, bornPlace, bornDate, mother, idCardType, numberId, lastEducation, religion, marriageStatus, address, rt, rw, village, kecamatan, kabupaten, province, postCode, alias, "698178626762",as_alias);

        } else {
            System.out.println("Error : " + respHasMap.get("resp_desc"));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showalertdialog(String title, String msg) {
        JOptionPane.showMessageDialog(new JFrame(),
                msg,
                title,
                JOptionPane.ERROR_MESSAGE);
    }
    private void kecamatanjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kecamatanjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatanjTextFieldjTextField13ActionPerformed

    private void phoneNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberjTextFieldjTextField13ActionPerformed

    private void emailNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailNumberjTextFieldjTextField13ActionPerformed

    private void menjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menjCheckBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menjCheckBoxActionPerformed

    private void phonenumberasaliasjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberasaliasjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberasaliasjCheckBoxActionPerformed

    private void emailjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjCheckBoxActionPerformed

    private void accountNumberjTextFieldjTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberjTextFieldjTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberjTextFieldjTextField13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        DBConnection dBConnection = new DBConnection();
        HashMap userDataMap = dBConnection.getAccount(accountNumberjTextField.getText());
        if (userDataMap.size() > 0) {
            fullNameRemitterjTextField.setText(userDataMap.get("name").toString());
            bornPlacejTextField.setText(userDataMap.get("born_place").toString());
            bornDatejTextField.setText(userDataMap.get("born_date").toString());
            bornDatejTextField.setText(userDataMap.get("born_date").toString());
            motherjTextField.setText(userDataMap.get("biological_mother").toString());
            idNumberjTextField.setText(userDataMap.get("number_id").toString());
            phoneNumberjTextField.setText(userDataMap.get("phone_number").toString());
            emailNumberjTextField.setText(userDataMap.get("email").toString());
            addressjTextField.setText(userDataMap.get("address").toString());
            kecamatanjTextField.setText(userDataMap.get("kecamatan").toString());
            cityjTextField.setText(userDataMap.get("kabupaten").toString());
            postCodejTextField.setText(userDataMap.get("post_code").toString());
            provincejTextField.setText(userDataMap.get("province").toString());

            if (userDataMap.get("gender").equals("0")) {
                menjCheckBox.setSelected(true);
            } else if (userDataMap.get("gender").equals("1")) {
                womenjCheckBox.setSelected(true);
            }
            
            if (userDataMap.get("citizenship").equals("0")) {
                wnijCheckBox.setSelected(true);
            } else if (userDataMap.get("citizenship").equals("1")) {
                wnajCheckBox.setSelected(true);
            }
            
            if (userDataMap.get("type_id").equals("0")) {
                ktpjCheckBox.setSelected(true);
            } else if (userDataMap.get("type_id").equals("1")) {
                simjCheckBox.setSelected(true);
            } else if (userDataMap.get("type_id").equals("2")) {
                pasportjCheckBox.setSelected(true);
            }
            
            if (userDataMap.get("last_education").equals("0")) {
                sdjCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("1")) {
                smpjCheckBox.setSelected(true);
            } else if (userDataMap.get("last_education").equals("2")) {
                sltajCheckBox.setSelected(true);
            }else if (userDataMap.get("last_education").equals("3")) {
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
            }else if (userDataMap.get("religion").equals("3")) {
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
            
            if (userDataMap.get("as_alias").equals("0")) {
                emailjCheckBox.setSelected(true);
            } else if (userDataMap.get("as_alias").equals("1")) {
                phonenumberasaliasjCheckBox.setSelected(true);
            }
             
            rt1jTextField.setText(userDataMap.get("rt").toString().substring(0,1));
            rt2rjTextField.setText(userDataMap.get("rt").toString().substring(1,2));
            rt3jTextField.setText(userDataMap.get("rt").toString().substring(2));
            
            rw1jTextField.setText(userDataMap.get("rw").toString().substring(0,1));
            rw2jTextField.setText(userDataMap.get("rw").toString().substring(1,2));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         String fullName = fullNameRemitterjTextField.getText();
        String gender = "-";
        if (menjCheckBox.isSelected()) {
            gender = "0";
        } else if (womenjCheckBox.isSelected()) {
            gender = "1";
        }
        String citizenship = "-";
        if (wnijCheckBox.isSelected()) {
            citizenship = "0";
        } else if (wnajCheckBox.isSelected()) {
            citizenship = "1";
        }
        String country = "Indonesia";
        String bornPlace = bornPlacejTextField.getText();
        String bornDate = bornDatejTextField.getText();
        String mother = motherjTextField.getText();
        String idCardType = "-";
        if (ktpjCheckBox.isSelected()) {
            idCardType = "0";
        } else if (simjCheckBox.isSelected()) {
            idCardType = "1";
        } else if (pasportjCheckBox.isSelected()) {
            idCardType = "2";
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
            as_alias = "1";
        } else if (emailjCheckBox.isSelected()) {
            phonenumberasaliasjCheckBox.setSelected(false);
            alias = emailNumberjTextField.getText();
            as_alias = "0";
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

        }

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
        HashMap respHasMap = JsonProcess.decodeJson(response);
        if (respHasMap.get("resp_code").equals("0000")) {
            DBConnection dBConnection = new DBConnection();

            dBConnection.updateAccount(fullName, gender, citizenship, country, bornPlace, bornDate, mother, idCardType, numberId, lastEducation, religion, marriageStatus, address, rt, rw, village, kecamatan, kabupaten, province, postCode, alias, accountNumber,as_alias,"");

        } else {
            System.out.println("Error : " + respHasMap.get("resp_desc"));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberjTextField;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JTextField bornDatejTextField;
    private javax.swing.JTextField bornPlacejTextField;
    private javax.swing.JCheckBox budhajCheckBox;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JTextField emailNumberjTextField;
    private javax.swing.JCheckBox emailjCheckBox;
    private javax.swing.JTextField fullNameRemitterjTextField;
    private javax.swing.JCheckBox hindujCheckBox;
    private javax.swing.JTextField idNumberjTextField;
    private javax.swing.JCheckBox islamjCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jandaordudajCheckBox;
    private javax.swing.JCheckBox katolikjCheckBox;
    private javax.swing.JTextField kecamatanjTextField;
    private javax.swing.JCheckBox ktpjCheckBox;
    private javax.swing.JCheckBox lajangjCheckBox;
    private javax.swing.JCheckBox marriagejCheckBox;
    private javax.swing.JCheckBox menjCheckBox;
    private javax.swing.JTextField motherjTextField;
    private javax.swing.JCheckBox otherjCheckBox;
    private javax.swing.JCheckBox pasportjCheckBox;
    private javax.swing.JTextField phoneNumberjTextField;
    private javax.swing.JCheckBox phonenumberasaliasjCheckBox;
    private javax.swing.JTextField postCodejTextField;
    private javax.swing.JCheckBox protestantjCheckBox;
    private javax.swing.JTextField provincejTextField;
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
    private javax.swing.JTextField villagejTextField;
    private javax.swing.JCheckBox wnajCheckBox;
    private javax.swing.JCheckBox wnijCheckBox;
    private javax.swing.JCheckBox womenjCheckBox;
    // End of variables declaration//GEN-END:variables
}
