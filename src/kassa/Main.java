package kassa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/*@author ILLIA*/
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        CashWindow = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnterCash = new javax.swing.JTextField();
        CashWindowSum = new javax.swing.JLabel();
        DifferenceValue = new javax.swing.JLabel();
        PrintCheck = new javax.swing.JButton();
        SetQuantityWindow = new javax.swing.JDialog();
        SetQuntityField = new javax.swing.JTextField();
        CheckWindow = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        CheckBody = new javax.swing.JLabel();
        CloseCheckButton = new javax.swing.JButton();
        SelectByNameWindow = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        ByNameTable = new javax.swing.JTable();
        SelectByNameButton = new javax.swing.JButton();
        CancelByName = new javax.swing.JButton();
        LogIn = new javax.swing.JDialog();
        UserT = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        info2 = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        CheckPanel = new javax.swing.JPanel();
        CheckNumber = new javax.swing.JLabel();
        CheckDate = new javax.swing.JLabel();
        CheckTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GuiDateOfCheck = new javax.swing.JLabel();
        GuiTimeOfCheck = new javax.swing.JLabel();
        checkNumberValue = new javax.swing.JLabel();
        totalPriceValue = new javax.swing.JLabel();
        timeF = new java.awt.Label("00:00:00");
        Enterproduct = new javax.swing.JLabel();
        Input_barcode = new javax.swing.JTextField("");
        ByBarcode = new javax.swing.JRadioButton();
        ByName = new javax.swing.JRadioButton();
        MakePayment = new javax.swing.JButton();
        Recycle = new javax.swing.JButton();
        DeleteSelectedItem = new javax.swing.JButton();
        SetQuantityButton = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        CashWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CashWindow.setTitle("Cash");
        CashWindow.setLocation(new java.awt.Point(0, 0));
        CashWindow.setModal(true);
        CashWindow.setResizable(false);
        CashWindow.setSize(new java.awt.Dimension(300, 125));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buyer cash");
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Check sum");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Difference");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 25));

        EnterCash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EnterCash.setPreferredSize(new java.awt.Dimension(80, 25));
        EnterCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterCashActionPerformed(evt);
            }
        });
        EnterCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterCashKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EnterCashKeyTyped(evt);
            }
        });

        CashWindowSum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CashWindowSum.setMaximumSize(new java.awt.Dimension(80, 25));
        CashWindowSum.setMinimumSize(new java.awt.Dimension(80, 25));
        CashWindowSum.setPreferredSize(new java.awt.Dimension(80, 25));

        DifferenceValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DifferenceValue.setMaximumSize(new java.awt.Dimension(80, 25));
        DifferenceValue.setMinimumSize(new java.awt.Dimension(80, 25));
        DifferenceValue.setPreferredSize(new java.awt.Dimension(80, 25));

        PrintCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrintCheck.setText("<html><center>Print<br>Check<br><b>[Enter]</b></center></html>");
        PrintCheck.setToolTipText("Print Check");
        PrintCheck.setPreferredSize(new java.awt.Dimension(85, 85));
        PrintCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintCheckActionPerformed(evt);
            }
        });
        PrintCheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrintCheckKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout CashWindowLayout = new javax.swing.GroupLayout(CashWindow.getContentPane());
        CashWindow.getContentPane().setLayout(CashWindowLayout);
        CashWindowLayout.setHorizontalGroup(
            CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashWindowLayout.createSequentialGroup()
                        .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CashWindowSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DifferenceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CashWindowLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnterCash, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrintCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CashWindowLayout.setVerticalGroup(
            CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashWindowLayout.createSequentialGroup()
                        .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterCash, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CashWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CashWindowLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CashWindowLayout.createSequentialGroup()
                                .addComponent(CashWindowSum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DifferenceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CashWindowLayout.createSequentialGroup()
                        .addComponent(PrintCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Input_barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Input_barcode.setInputVerifier(new InputVerifier() {
            public boolean verify(JComponent comp) {
                JTextField textField = (JTextField) comp;
                try {
                    Integer.parseInt(textField.getText());
                    return true;
                } catch (NumberFormatException e) {
                    System.out.println("bad");
                }
                return false;
            }
        });

        EnterCash.setTransferHandler(null);

        CashWindow.setLocationRelativeTo(null);

        SetQuantityWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        SetQuantityWindow.setTitle("Set quantity");
        SetQuantityWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SetQuantityWindow.setLocation(new java.awt.Point(0, 0));
        SetQuantityWindow.setModal(true);
        SetQuantityWindow.setResizable(false);
        SetQuantityWindow.setSize(new java.awt.Dimension(177, 88));

        SetQuntityField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SetQuntityField.setToolTipText("");
        SetQuntityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetQuntityFieldActionPerformed(evt);
            }
        });
        SetQuntityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SetQuntityFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SetQuntityFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout SetQuantityWindowLayout = new javax.swing.GroupLayout(SetQuantityWindow.getContentPane());
        SetQuantityWindow.getContentPane().setLayout(SetQuantityWindowLayout);
        SetQuantityWindowLayout.setHorizontalGroup(
            SetQuantityWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetQuntityField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        SetQuantityWindowLayout.setVerticalGroup(
            SetQuantityWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetQuntityField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        SetQuntityField.setTransferHandler(null);

        SetQuantityWindow.setLocationRelativeTo(null);

        CheckWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        CheckWindow.setLocation(new java.awt.Point(0, 0));
        CheckWindow.setMinimumSize(new java.awt.Dimension(320, 470));
        CheckWindow.setModal(true);
        CheckWindow.setResizable(false);
        CheckWindow.setSize(new java.awt.Dimension(320, 470));
        CheckWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                CheckWindowWindowClosing(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CheckBody.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        CheckBody.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(CheckBody);

        CloseCheckButton.setText("<html><center>Close<br><b>[Enter]</b></center>");
        CloseCheckButton.setMinimumSize(new java.awt.Dimension(105, 58));
        CloseCheckButton.setPreferredSize(new java.awt.Dimension(105, 58));
        CloseCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseCheckButtonActionPerformed(evt);
            }
        });
        CloseCheckButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CloseCheckButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout CheckWindowLayout = new javax.swing.GroupLayout(CheckWindow.getContentPane());
        CheckWindow.getContentPane().setLayout(CheckWindowLayout);
        CheckWindowLayout.setHorizontalGroup(
            CheckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(CheckWindowLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(CloseCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CheckWindowLayout.setVerticalGroup(
            CheckWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        CheckWindow.setLocationRelativeTo(null);

        SelectByNameWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        SelectByNameWindow.setTitle("Select Product by Name");
        SelectByNameWindow.setMinimumSize(new java.awt.Dimension(500, 200));
        SelectByNameWindow.setModal(true);
        SelectByNameWindow.setResizable(false);
        SelectByNameWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                SelectByNameWindowWindowClosing(evt);
            }
        });

        ByNameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Product name", "Price", "Rest on store"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ByNameTable.setFocusable(false);
        ByNameTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ByNameTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ByNameTable);

        SelectByNameButton.setText("<html><center>Select item<br><b>[Enter]</b></center>");
        SelectByNameButton.setMinimumSize(new java.awt.Dimension(105, 58));
        SelectByNameButton.setPreferredSize(new java.awt.Dimension(105, 58));
        SelectByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectByNameButtonActionPerformed(evt);
            }
        });
        SelectByNameButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SelectByNameButtonKeyPressed(evt);
            }
        });

        CancelByName.setText("<html><center>Cancel<br><b>[Escape]</b></center>");
        CancelByName.setFocusable(false);
        CancelByName.setMaximumSize(new java.awt.Dimension(105, 58));
        CancelByName.setMinimumSize(new java.awt.Dimension(105, 58));
        CancelByName.setPreferredSize(new java.awt.Dimension(105, 58));
        CancelByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelByNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SelectByNameWindowLayout = new javax.swing.GroupLayout(SelectByNameWindow.getContentPane());
        SelectByNameWindow.getContentPane().setLayout(SelectByNameWindowLayout);
        SelectByNameWindowLayout.setHorizontalGroup(
            SelectByNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(SelectByNameWindowLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelectByNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(CancelByName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SelectByNameWindowLayout.setVerticalGroup(
            SelectByNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectByNameWindowLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectByNameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelByName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectByNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        SelectByNameWindow.setLocationRelativeTo(null);

        LogIn.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        LogIn.setTitle("Authorization");
        LogIn.setMinimumSize(new java.awt.Dimension(250, 130));
        LogIn.setModal(true);
        LogIn.setResizable(false);
        LogIn.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                LogInWindowClosing(evt);
            }
        });

        UserT.setText("User:");
        UserT.setMaximumSize(new java.awt.Dimension(72, 20));
        UserT.setMinimumSize(new java.awt.Dimension(72, 20));
        UserT.setPreferredSize(new java.awt.Dimension(72, 20));

        jLabel6.setText("Password:");
        jLabel6.setMaximumSize(new java.awt.Dimension(72, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(72, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(72, 20));

        LoginButton.setText("Log in");
        LoginButton.setToolTipText("<html><center>Please enter sellers username and password.<br>There are such accounts:<br>ILLIA - 123<br>User - user<br>Vasya - 123</center>");
        LoginButton.setMaximumSize(new java.awt.Dimension(73, 25));
        LoginButton.setMinimumSize(new java.awt.Dimension(73, 25));
        LoginButton.setPreferredSize(new java.awt.Dimension(73, 25));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.setMaximumSize(new java.awt.Dimension(73, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(73, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(73, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        UserName.setText("User");
        UserName.setToolTipText("<html><center>Please enter sellers username and password.<br>There are such accounts:<br>ILLIA - 123<br>User - user<br>Vasya - 123</center>");
        UserName.setMaximumSize(new java.awt.Dimension(150, 20));
        UserName.setMinimumSize(new java.awt.Dimension(150, 20));
        UserName.setPreferredSize(new java.awt.Dimension(150, 20));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        Password.setText("user");
        Password.setToolTipText("<html><center>Please enter sellers username and password.<br>There are such accounts:<br>ILLIA - 123<br>User - user<br>Vasya - 123</center>");
        Password.setMaximumSize(new java.awt.Dimension(150, 25));
        Password.setMinimumSize(new java.awt.Dimension(150, 25));
        Password.setPreferredSize(new java.awt.Dimension(150, 25));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jButton1.setText("?");
        jButton1.setMaximumSize(new java.awt.Dimension(40, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(40, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogInLayout = new javax.swing.GroupLayout(LogIn.getContentPane());
        LogIn.getContentPane().setLayout(LogInLayout);
        LogInLayout.setHorizontalGroup(
            LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogInLayout.createSequentialGroup()
                        .addComponent(UserT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogInLayout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(LogInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogInLayout.setVerticalGroup(
            LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        LogIn.setLocationRelativeTo(null);

        info2.setAlwaysOnTop(true);
        info2.setMaximumSize(new java.awt.Dimension(580, 400));
        info2.setMinimumSize(new java.awt.Dimension(580, 400));
        info2.setModal(true);
        info2.setPreferredSize(new java.awt.Dimension(580, 400));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setText("<html><table border=\"1\" cellpadding=\"3\" cellspacing=\"1\" style=\"width: 408px\"> <tbody> <tr> <td> <h2 style=\"text-align: center;\"> <span style=\"font-size:14px;\"><strong>Проект &quot;Рабочее место кассира&quot;</strong></span></h2> <h4> <span style=\"font-size:11px;\">Основная информация</span></h4> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Система предназначена для организации рабочего места кассира. Кассир производит поиск товара в базе данных продуктов по введенному им штрихкоду либо по имени товара (можно вводить не полное имя и будет показан список товаров с похожим именем). После формирования списка всех продуктов для данного чека кассир вводит сумму наличных от покупателя и печатает чек. Во время печати из таблицы БД продукты списываются товары из чека, в таблице учета всех чеков создается запись с основной информацией о чеке, а также добавляется копия чека в локальный отчетный файл.</span></div> <div> &nbsp;</div> <h4> <span style=\"font-size:11px;\">Требования к БД</span></h4> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; &nbsp;Для работы программы, она должна иметь доступ к MySQL Server с базой данных, созданной на основе скрипта ниже.</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Если у Вас нет возможности или желания установить MySQL Server, свяжитесь,&nbsp;пожалуйста со мной по Skype:illyazvyagin ,и я открою доступ к моему серверу и&nbsp;вышлю настройки для подключения к нему.</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">CREATE DATABASE Kassa;</span></div> <div> <span style=\"font-size:10px;\">USE Kassa;</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">CREATE TABLE Products (barcode INT AUTO_INCREMENT, product_name VARCHAR(30), price DOUBLE, total INT, PRIMARY KEY(barcode));</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Bread&#39;, 8.5, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Coca-cola&#39;, 9.2, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Milk&#39;, 15, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Egg&#39;, 1.5, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Beer&#39;, 12.5, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Chiken&#39;, 50, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Pie&#39;, 80, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Tea&#39;, 25.8, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Contex&#39;, 82.53, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Lays&#39;, 12.8, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;River fish&#39;, 50.99, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Red fish&#39;, 199.99, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Fat&#39;, 38.25, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Vodka&#39;, 63.2, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Korona&#39;, 18.5, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Jeck&#39;, 3.1, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Coffee&#39;, 73.65, 1000);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO Products (product_name, price, total) VALUES (&#39;Chupa-chups&#39;, 5.05, 1000);</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">CREATE TABLE all_checks (checknumber INT NOT NULL, check_price DOUBLE, date_ DATE, time_ TIME, seller VARCHAR(30), PRIMARY KEY(checknumber));</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">CREATE TABLE users (user_name VARCHAR(30), password VARCHAR(30), PRIMARY KEY(user_name));</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO users VALUES (&#39;ILLIA&#39;,&#39;123&#39;);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO users VALUES (&#39;Vasya&#39;,&#39;123&#39;);</span></div> <div> <span style=\"font-size:10px;\">INSERT INTO users VALUES (&#39;User&#39;,&#39;user&#39;);</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">GRANT ALL PRIVILEGES ON Kassa.* TO &#39;user&#39;@&#39;%&#39; IDENTIFIED BY &#39;ILLIA&#39; WITH GRANT OPTION;</span></div> <div> <span style=\"font-size:10px;\">FLUSH PRIVILEGES;</span></div> <div> &nbsp;</div> <h4> <span style=\"font-size:11px;\">Описание содержания БД</span></h4> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; Таблица &quot;Products&quot; содержит :</span></div> <div> <span style=\"font-size:10px;\">- Штрихкод</span></div> <div> <span style=\"font-size:10px;\">- Имя товара</span></div> <div> <span style=\"font-size:10px;\">- Цена товара</span></div> <div> <span style=\"font-size:10px;\">- Остаток товара на складе</span></div> <div> <span style=\"font-size:10px;\">Она заполнена 18 продуктами для примера (штрихкоды от 1 до 18).</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; Таблица &quot;all_checks&quot; служит для хранения списка таких данных чека:</span></div> <div> <span style=\"font-size:10px;\">- Номер чека</span></div> <div> <span style=\"font-size:10px;\">- Сумма чека</span></div> <div> <span style=\"font-size:10px;\">- Дата печати чека*</span></div> <div> <span style=\"font-size:10px;\">- Время печати чека*</span></div> <div> <span style=\"font-size:10px;\">- Имя учетной записи кассира</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">* - если произойдет ошибка во время работы программы, то сумма чека будет равняться нулю, а время и дата будут временем резервирования записи в таблицы для текущего чека</span></div> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Таблица &quot;users&quot; содержит список пользователей и паролей для подключения к БД. По умолчанию создано 3 пользователя:</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; &nbsp; &nbsp; ILLIA - 123</span></div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; &nbsp; &nbsp; User - user</span></div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; &nbsp; &nbsp; Vasya - 123</span></div> <div> &nbsp;</div> <h4> <span style=\"font-size:11px;\">Файл конфигурации</span></h4> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; Для подключения к БД нужно создать файл &quot;config.txt&quot; с таким содержанием:</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">DBPath=jdbc:mysql://localhost:3306/Kassa</span></div> <div> <span style=\"font-size:10px;\">DBLogin=user</span></div> <div> <span style=\"font-size:10px;\">DBPassword=ILLIA</span></div> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Файл &quot;config.txt&quot; должен находиться в той же директории, откуда выолняется запуск файла Kassa.jar. Если запуск &nbsp;программы выполнен из среды разработки, то файл конфигурации &quot;config.txt&quot; должен лежать в корне диска d:/.&nbsp;</span></div> <h4 style=\"text-align: justify;\"> <span style=\"font-size:11px;\">Работа программы</span></h4> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; После запуска программы открывается окно авторизации, где нужно указать имя клиента(до 30 символов) и пароль, и нажать &quot;Log in&quot;. В тестовой версии программы в поле авторизации уже будут введены данные для авторизации.</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; После авторизации пользователя открывается основное рабочее окно кассира и можно начинать работу.</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Товары вводятся по штрихкоду, либо выполняется поиск по имени товара (переключение между режимами выполняется клавишей F8). При поиске по имени будет показано дополнительное окно со списком продуктов с похожим именем. Выбор продукта из этого списка выполняется двойным кликом мыши, либо клавишами вверх/вниз, ввод.</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; После удачного поиска товара он добавляется в основной список товаров в виде таблицы в основном рабочем окне. Перемещаться по списку товаров чека можно мышью, либо клавишами вверх/вниз.</span></div> <div> &nbsp;</div> <div> <span style=\"font-size:10px;\">&nbsp; &nbsp; Таблицу товаров чека можно редактировать так:</span></div> <div> <span style=\"font-size:10px;\">- установить количество едениц выделенного товара F5</span></div> <div> <span style=\"font-size:10px;\">- удалить выделенный товар F6</span></div> <div> <span style=\"font-size:10px;\">- удалить все товары F7<span class=\"Apple-tab-span\" style=\"white-space: pre;\"> </span></span></div> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; После ввода и редактирования списка товаров чека необходимо нажать кнопку &quot;Payment&quot; F2(Оплата) и будет показано окно для ввода суммы наличных покупателя и общей суммой чека. Если наличные покупателя введены верно, то при нажатии клавиши &quot;Ввод&quot; либо &quot;Print Check&quot; будет выполнено:</span></div> <div> <span style=\"font-size:10px;\">- Печать чека</span></div> <div> <span style=\"font-size:10px;\">- В таблице &quot;all_checks&quot; будет выполнена запись данных о текущем чеке(в поле время будет указано время печати чека)</span></div> <div> <span style=\"font-size:10px;\">- В таблице &quot;Products&quot; будут уменьшены остатки товаров из чека</span></div> <div> <span style=\"font-size:10px;\">- Копия чека будет записана в фискальный отчет в виде файла &quot;Checks_report_index.html&quot;</span></div> <h4> <span style=\"font-size:11px;\">Фискальный отчет&nbsp;</span></h4> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Фискальный отчет представлен в виде файла &quot;Checks_report_index.html&quot; и будет создан при первой печати чека. Данный файл будет хранить в себе копии всех чеков, разделенных горизонтальной линией. Его можно открыть любым браузером.</span></div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Файл &quot;Checks_report_index.html&quot; будет создан в той директории, в которй запущен файл Kassa.jar. Если запуск &nbsp;программы выполнен из среды разработки, то отчет чеков будет лежать в корне диска d:/.</span></div> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Для завершения работы программы нужно нажать (F10 либо Escape).</span></div> <div> &nbsp;</div> <div style=\"text-align: justify;\"> <span style=\"font-size:10px;\">&nbsp; &nbsp; Для управления программой можно использовать как клавиатуру с мышкой, так и саму клавиатуру без мышки. В именах всех кнопок указаны дублирующие их физические клавиши клавиатуры.</span></div> <div> &nbsp;</div> <div> &nbsp;</div> <div> <span style=\"font-size:11px;\"><strong>Звягинцев Илья</strong></span></div> <div> <span style=\"font-size:11px;\"><strong>buster28@ya.ru</strong></span></div> </td> </tr> </tbody> </table> <p> &nbsp;</p></html>");
        jEditorPane1.setInheritsPopupMenu(true);
        jScrollPane3.setViewportView(jEditorPane1);

        javax.swing.GroupLayout info2Layout = new javax.swing.GroupLayout(info2.getContentPane());
        info2.getContentPane().setLayout(info2Layout);
        info2Layout.setHorizontalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        info2Layout.setVerticalGroup(
            info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        info2.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Images.mainIcon());
        setMinimumSize(new java.awt.Dimension(640, 480));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, UserT, org.jdesktop.beansbinding.ELProperty.create("${text}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFocusable(false);

        Table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Product name", "Price", "Quantity", "Total price", "Rest on store"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setToolTipText("");
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setFocusable(false);
        Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        // Код добавления компонентов в старший контейнер -·не отображается здесь

        CheckPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        CheckPanel.setToolTipText("");

        CheckNumber.setText("Check number:");

        CheckDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckDate.setText("Date:");

        CheckTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckTime.setText("Time:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("TOTAL:");

        GuiDateOfCheck.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GuiDateOfCheck.setText(GetTime.currentDate());

        GuiTimeOfCheck.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GuiTimeOfCheck.setText(GetTime.currentTime());

        checkNumberValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNumberValue.setText("");

        totalPriceValue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        totalPriceValue.setText("0.00");

        javax.swing.GroupLayout CheckPanelLayout = new javax.swing.GroupLayout(CheckPanel);
        CheckPanel.setLayout(CheckPanelLayout);
        CheckPanelLayout.setHorizontalGroup(
            CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckPanelLayout.createSequentialGroup()
                        .addComponent(CheckNumber)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CheckPanelLayout.createSequentialGroup()
                        .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckDate)
                            .addComponent(CheckTime)
                            .addComponent(jLabel4))
                        .addGap(52, 52, 52)
                        .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuiDateOfCheck)
                            .addComponent(GuiTimeOfCheck)
                            .addComponent(checkNumberValue)
                            .addComponent(totalPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        CheckPanelLayout.setVerticalGroup(
            CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckNumber)
                    .addComponent(checkNumberValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckDate)
                    .addComponent(GuiDateOfCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckTime)
                    .addComponent(GuiTimeOfCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalPriceValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LogIn.setVisible(true);
        Check.ReserveCheck(checkNumberValue, UserName.getText());

        timeF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timeF.setText("");

        Enterproduct.setText("Enter product:");

        Input_barcode.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Input_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_barcodeActionPerformed(evt);
            }
        });

        ByBarcode.setSelected(true);
        ByBarcode.setText("By barcode");
        ByBarcode.setFocusable(false);
        ByBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByBarcodeActionPerformed(evt);
            }
        });

        ByName.setText("<html>By name <b>[F8]</b>");
        ByName.setFocusable(false);
        ByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByNameActionPerformed(evt);
            }
        });

        MakePayment.setText("<html><center>Payment<br><b>[F2]</b></center>");
        MakePayment.setFocusable(false);
        MakePayment.setMaximumSize(new java.awt.Dimension(105, 58));
        MakePayment.setMinimumSize(new java.awt.Dimension(105, 58));
        MakePayment.setPreferredSize(new java.awt.Dimension(105, 58));
        MakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakePaymentActionPerformed(evt);
            }
        });

        Recycle.setText("<html><center>Delete all<br><b>[F7]</b></center>");
        Recycle.setFocusable(false);
        Recycle.setMaximumSize(new java.awt.Dimension(105, 58));
        Recycle.setMinimumSize(new java.awt.Dimension(105, 58));
        Recycle.setPreferredSize(new java.awt.Dimension(105, 58));
        Recycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecycleActionPerformed(evt);
            }
        });

        DeleteSelectedItem.setText("<html><center>Delete item<br><b>[F6]</b></center>");
        DeleteSelectedItem.setFocusable(false);
        DeleteSelectedItem.setMaximumSize(new java.awt.Dimension(105, 58));
        DeleteSelectedItem.setMinimumSize(new java.awt.Dimension(105, 58));
        DeleteSelectedItem.setPreferredSize(new java.awt.Dimension(105, 58));
        DeleteSelectedItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSelectedItemActionPerformed(evt);
            }
        });

        SetQuantityButton.setText("<html><center>Set quantity <b>[F5]</b></center>");
        SetQuantityButton.setFocusable(false);
        SetQuantityButton.setMaximumSize(new java.awt.Dimension(105, 58));
        SetQuantityButton.setMinimumSize(new java.awt.Dimension(105, 58));
        SetQuantityButton.setPreferredSize(new java.awt.Dimension(105, 58));
        SetQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetQuantityButtonActionPerformed(evt);
            }
        });

        Logout.setText("<html><center>Exit<br><b>[F10]</b></center>");
        Logout.setFocusable(false);
        Logout.setMaximumSize(new java.awt.Dimension(105, 58));
        Logout.setMinimumSize(new java.awt.Dimension(105, 58));
        Logout.setPreferredSize(new java.awt.Dimension(105, 58));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(timeF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enterproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(Input_barcode)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ByBarcode)
                                .addGap(18, 18, 18)
                                .addComponent(ByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SetQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteSelectedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Recycle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enterproduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ByBarcode)
                            .addComponent(ByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SetQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteSelectedItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Recycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        timeF.setFont(new Font("Arial", Font.PLAIN, 24));
        //javax.swing.Timer t = new javax.swing.Timer( 1000, new ActionListener()
            Timer t = new Timer( 1000, new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    timeF.setText(GetTime.currentTimeWithSeconds());
                    GuiDateOfCheck.setText(GetTime.currentDate());
                    GuiTimeOfCheck.setText(GetTime.currentTime());
                }
            } );
            t.start();
            Input_barcode.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent keyEvent) {
                    //formKeyPressed(keyEvent);
                }
            });

            bindingGroup.bind();

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void ByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByNameActionPerformed
        // TODO add your handling code here:
        ByName.setSelected(true);
        ByBarcode.setSelected(false);
        if(!Input_barcode.isFocusOwner()) Input_barcode.requestFocus();
    }//GEN-LAST:event_ByNameActionPerformed

    private void ByBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByBarcodeActionPerformed
        // TODO add your handling code here:
        ByBarcode.setSelected(true);
        ByName.setSelected(false);
        if(!Input_barcode.isFocusOwner()) Input_barcode.requestFocus();
    }//GEN-LAST:event_ByBarcodeActionPerformed

    private void Input_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_barcodeActionPerformed
        // TODO add your handling code here:  
        if(!Input_barcode.getText().isEmpty()){
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        try {
            Class.forName("java.sql.Driver");
            Connection connection = DriverManager.getConnection(Parameters.getDBPath(), Parameters.getDBLogin(), Parameters.getDBPassword());
            Statement statement = connection.createStatement();
            int barcode = 0;
            if(ByBarcode.isSelected()){
                try {barcode=Integer.parseInt(Input_barcode.getText());
                if(barcode<1) throw new NumberFormatException();
                }
                catch(NumberFormatException e){
                    Input_barcode.setText("");
                    JOptionPane.showMessageDialog(this, "Wrong format of barcode!");
                    return;
                }
            }
            
            if(ByName.isSelected()){
                    String s = Input_barcode.getText();
                    if(s.length()<1) //Set minimum number of charcters, when search by Name
                    {Input_barcode.setText("");
                    JOptionPane.showMessageDialog(this, "Request should not be less than 1 characters!");
                    return;}
                    if(s.contains("%")||s.contains("_"))
                    {Input_barcode.setText("");
                    JOptionPane.showMessageDialog(this, "Characters \"%\" and \"_\" are not allowed!");
                    return;}
                }
            
            String queryBarcode = "select * from products where barcode = "+ barcode + ";";
            String queryName = "select * from products where product_name like '%"+ Input_barcode.getText() + "%';";
            ResultSet result = statement.executeQuery(ByBarcode.isSelected()?queryBarcode:queryName);
            
            if (ByBarcode.isSelected()&&result.next()) {
            int d1 = result.getInt("barcode");
            String d2 = result.getString("product_name");
            double d3 = result.getDouble("price"); 
            String D3 = MyMath.double2String(d3);
            int d4 = result.getInt("total");
            
            double oldTotalPrice = Double.parseDouble(totalPriceValue.getText());
            
            boolean isAlredyInTable = false;
            int numberAlredyInTable = 0;
            
            for (; numberAlredyInTable < model.getRowCount(); numberAlredyInTable++) {
                int a = (int)model.getValueAt(numberAlredyInTable, 0);
                if(a==d1){isAlredyInTable = true; break;}
            }
            
            if(isAlredyInTable){
                Table.setRowSelectionInterval(numberAlredyInTable, numberAlredyInTable);
                double newTotalPrice = MyMath.sum(oldTotalPrice, d3);
                totalPriceValue.setText(MyMath.double2String(newTotalPrice));
                int newQuntity = (int)model.getValueAt(numberAlredyInTable, 3)+1;
                model.setValueAt(newQuntity, numberAlredyInTable, 3);
                double oldTotalProductPrice = Double.parseDouble((String) model.getValueAt(numberAlredyInTable, 4));
                double newTotalProductPrice = MyMath.sum(oldTotalProductPrice, d3);
                model.setValueAt(MyMath.double2String(newTotalProductPrice), numberAlredyInTable, 4);
                
                Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));               
            }
            else{
                model.addRow(new Object[]{d1,d2,D3,1,D3,d4});
                Table.setRowSelectionInterval(Table.getRowCount()-1, Table.getRowCount()-1);
                double newTotalPrice = MyMath.sum(oldTotalPrice, d3);
                totalPriceValue.setText(MyMath.double2String(newTotalPrice));
                Table.scrollRectToVisible(Table.getCellRect(model.getRowCount() - 1, 0, true));
            }
            
            }
            else if(!ByBarcode.isSelected()&&result.next()){
                DefaultTableModel modelByname = (DefaultTableModel)ByNameTable.getModel();
                result.beforeFirst();
                while(result.next()){
                    int d1 = result.getInt("barcode");
                    String d2 = result.getString("product_name");
                    double d3 = result.getDouble("price"); 
                    String D3 = MyMath.double2String(d3);
                    int d4 = result.getInt("total");
                    modelByname.addRow(new Object[]{d1,d2,D3,d4});
                } 
                ByNameTable.setRowSelectionInterval(0, 0);
                SelectByNameWindow.setVisible(true);
            }
            else {JOptionPane.showMessageDialog(this, "Product "+ Input_barcode.getText() + " is not present in database!");}
            result.close();
            statement.close();
            connection.close();
            
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Error in connectivity with Database!");
        }
        }
        
        Input_barcode.setText("");
    }//GEN-LAST:event_Input_barcodeActionPerformed

    private void MakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakePaymentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        if(model.getRowCount()>0){
            Input_barcode.setText("");
            CashWindowSum.setText(totalPriceValue.getText());
            CashWindowSum.setToolTipText(MyMath.cashInWords(Double.parseDouble(totalPriceValue.getText())));
            DifferenceValue.setText("0.00");
            EnterCash.setText("");
            EnterCash.setEditable(true);
            EnterCash.setFocusable(true);
            EnterCash.requestFocus();
            PrintCheck.setFocusable(false);
            CashWindow.setVisible(true);
            }
        Input_barcode.requestFocus();
        
    }//GEN-LAST:event_MakePaymentActionPerformed

    private void RecycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecycleActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        final int b = model.getRowCount();
        for (int i = 0; i < b; i++) {
            model.removeRow(0);
        }
        totalPriceValue.setText("0.00");
        Input_barcode.setText("");
        Input_barcode.requestFocus();
    }//GEN-LAST:event_RecycleActionPerformed

    private void DeleteSelectedItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSelectedItemActionPerformed
        // TODO add your handling code here:
        if(Table.getSelectedRow()>-1){
            DefaultTableModel model = (DefaultTableModel)Table.getModel();
            double oldCheckTotalPrice = Double.parseDouble(totalPriceValue.getText());//общая цена чека до измениния количества данного товара
            double itemTotalPrice = Double.parseDouble(Table.getValueAt(Table.getSelectedRow(), 4).toString());//общая цена удаляемой строки
            double newTotalPrice = MyMath.minus(oldCheckTotalPrice, itemTotalPrice);
            totalPriceValue.setText(MyMath.double2String(newTotalPrice));
            int removeRow = Table.getSelectedRow();
            model.removeRow(removeRow);
            if(Table.getRowCount()>0){
                if(removeRow==Table.getRowCount())
                    Table.setRowSelectionInterval(removeRow-1, removeRow-1);
                else
                    Table.setRowSelectionInterval(removeRow, removeRow);
                Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));
            }
            }
        Input_barcode.requestFocus();
    }//GEN-LAST:event_DeleteSelectedItemActionPerformed

    private void SetQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetQuantityButtonActionPerformed
        // TODO add your handling code here:
        if (Table.getSelectedRow()>-1){
            SetQuntityField.setText("");
            SetQuantityWindow.setVisible(true);}
        Input_barcode.requestFocus();
    }//GEN-LAST:event_SetQuantityButtonActionPerformed

    private void SetQuntityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetQuntityFieldActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        double oldCheckTotalPrice = Double.parseDouble(totalPriceValue.getText());//общая цена чека до измениния количества данного товара
        int oldQuntity = Integer.parseInt((model.getValueAt(Table.getSelectedRow(), 3)).toString());//старое количество
        int newQuntity;
        try {
            newQuntity = Integer.parseInt(SetQuntityField.getText());//новое количество наименования товара
            if(newQuntity<1||newQuntity>100) throw new NumberFormatException();
            }
        catch (NumberFormatException e){
            SetQuntityField.setText("");
            JOptionPane.showMessageDialog(null, "Quantity must be between 1 and 100!");
            return;
        }
        
        
        
        model.setValueAt(newQuntity, Table.getSelectedRow(), 3);
        
        double itemPrice = Double.parseDouble((model.getValueAt(Table.getSelectedRow(), 2)).toString());//цена еденицы
        
        double newCheckTotalPrice =
                MyMath.minus(oldCheckTotalPrice,MyMath.multiply(itemPrice,MyMath.minus(oldQuntity,newQuntity)));//новая общая цена чека
        totalPriceValue.setText(MyMath.double2String(newCheckTotalPrice));
        
        double newItemTotalPrice = MyMath.multiply(newQuntity,itemPrice);//новая общая цена наеминования
        model.setValueAt(MyMath.double2String(newItemTotalPrice), Table.getSelectedRow(), 4);
       
    
        SetQuntityField.setText("");
        SetQuantityWindow.setVisible(false);
        Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));
        Input_barcode.requestFocus();
    }//GEN-LAST:event_SetQuntityFieldActionPerformed

    private void EnterCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterCashActionPerformed
        // TODO add your handling code here:
        PrintCheckActionPerformed(null);
    }//GEN-LAST:event_EnterCashActionPerformed

    private void PrintCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintCheckActionPerformed
        // TODO add your handling code here:
        double checkSum = Double.parseDouble(totalPriceValue.getText());
        double cash = 0;
        try{cash = Double.parseDouble(EnterCash.getText());}
        catch(Exception e){/*Do nothing here*/}
        double dif = Double.parseDouble(DifferenceValue.getText());
                
        if(dif<0||(MyMath.sum(checkSum, dif)!=cash)){
            JOptionPane.showMessageDialog(this, "Cash error! Please, input again!");
            EnterCash.requestFocus();
            return;
        }
        
        CheckWindow.setTitle("Check number "+checkNumberValue.getText());
        String CheckForPrint = Check.doCheck(Table, checkNumberValue.getText(),totalPriceValue.getText());// Getting head and body of Check
        CheckForPrint+="<b>TOTAL</b>"+Check.spacesBetween("TOTAL", totalPriceValue.getText()+"  ", ".")+"<b>"+totalPriceValue.getText()+"</b>  <br>";
        CheckForPrint+=Check.spacesBetween("", "", "-")+"<br>";
        String eCash = MyMath.double2String(Double.parseDouble(EnterCash.getText()));
        CheckForPrint+="Cash"+Check.spacesBetween("Cash", eCash+"  ", ".")+eCash+"  <br>";
        CheckForPrint+="Difference"+Check.spacesBetween("Difference", DifferenceValue.getText()+"  ", ".")+DifferenceValue.getText()+"  <br>";
        CheckForPrint+=Check.spacesBetween("", "", "-")+"<br>";
        CheckForPrint+=Check.spacesOutside(Table.getRowCount()+" products")+"<br>";
        CheckForPrint+="Seller: " + UserName.getText()+"<br>";
        CheckForPrint+="<b>Check No "+checkNumberValue.getText() + "</b><br>";
        CheckForPrint+=GetTime.currentTimeWithSeconds()+" "+GetTime.currentDate();
        
        FileWorker.addText(PathFinder.getPath()+"Checks_report_index.html", "<HR>"+CheckForPrint);
        CheckBody.setText(CheckForPrint);
        
        JScrollBar jsb1 = jScrollPane2.getVerticalScrollBar();
        jsb1.setValue(jsb1.getMaximum());
        CashWindow.setVisible(false);
        CheckWindow.setVisible(true);             
                
    }//GEN-LAST:event_PrintCheckActionPerformed

    private void CloseCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseCheckButtonActionPerformed
        // TODO add your handling code here:
        Check.ReserveCheck(checkNumberValue,UserName.getText());
        totalPriceValue.setText("0.00");
        Enterproduct.setText("");
        ByBarcode.setSelected(true);
        ByName.setSelected(false);
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        final int b = model.getRowCount();
        for (int i = 0; i < b; i++) {
            model.removeRow(0);
        }
        CheckWindow.setVisible(false);
        Input_barcode.requestFocus();
    }//GEN-LAST:event_CloseCheckButtonActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to exit?","CashBox",JOptionPane.YES_NO_OPTION);
        if(confirm!=0) {
            Input_barcode.requestFocus();
            return;
        }
                
        String queryExit = "DELETE FROM all_checks WHERE checknumber = "+checkNumberValue.getText()+";";
        try {
            Connection connection = DriverManager.getConnection(Parameters.getDBPath(), Parameters.getDBLogin(), Parameters.getDBPassword());
            Statement statement = connection.createStatement();
            statement.executeUpdate(queryExit);

            statement.close();
            connection.close();
            checkNumberValue.setText("");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error to connect database!");
        }
        System.exit(0);
    }//GEN-LAST:event_LogoutActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_F2) MakePaymentActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_F1) info2.setVisible(true);
        else if(evt.getKeyCode()==KeyEvent.VK_F5) SetQuantityButtonActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_F6) DeleteSelectedItemActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_F7) RecycleActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_F10) LogoutActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) LogoutActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_F8) {
            if(ByBarcode.isSelected())ByNameActionPerformed(null);
            else if(ByName.isSelected()) ByBarcodeActionPerformed(null);
        }
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            int newSelectedRow = Table.getSelectedRow()+1;
            if(newSelectedRow<Table.getRowCount()){
            Table.setRowSelectionInterval(newSelectedRow, newSelectedRow);
            Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));
            }
        }
        else if(evt.getKeyCode()==KeyEvent.VK_UP){
            int newSelectedRow = Table.getSelectedRow()-1;
            if(newSelectedRow>-1){
            Table.setRowSelectionInterval(newSelectedRow, newSelectedRow);
            Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void SetQuntityFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetQuntityFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            SetQuantityWindow.setVisible(false);
        }
    }//GEN-LAST:event_SetQuntityFieldKeyPressed

    private void EnterCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterCashKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) {CashWindow.setVisible(false);}

    }//GEN-LAST:event_EnterCashKeyPressed

    private void PrintCheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrintCheckKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) PrintCheckActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) CashWindow.setVisible(false);
    }//GEN-LAST:event_PrintCheckKeyPressed

    private void CloseCheckButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CloseCheckButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) CloseCheckButtonActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) CloseCheckButtonActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            JScrollBar jsb1 = jScrollPane2.getVerticalScrollBar();
            jsb1.setValue(jsb1.getMaximum());
            }
        else if(evt.getKeyCode()==KeyEvent.VK_UP){
            JScrollBar jsb1 = jScrollPane2.getVerticalScrollBar();
            jsb1.setValue(jsb1.getMinimum());
            }
    }//GEN-LAST:event_CloseCheckButtonKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        LogoutActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void CheckWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_CheckWindowWindowClosing
        // TODO add your handling code here:
        CloseCheckButtonActionPerformed(null);
    }//GEN-LAST:event_CheckWindowWindowClosing

    private void SelectByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectByNameButtonActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelByNameTable = (DefaultTableModel)ByNameTable.getModel();
            DefaultTableModel modelMainTable = (DefaultTableModel)Table.getModel();
            double oldTotalPrice = Double.parseDouble(totalPriceValue.getText());
            
            int d1 = Integer.parseInt(modelByNameTable.getValueAt(ByNameTable.getSelectedRow(), 0).toString());
            String d2 = modelByNameTable.getValueAt(ByNameTable.getSelectedRow(), 1).toString();
            double d3 = Double.parseDouble(modelByNameTable.getValueAt(ByNameTable.getSelectedRow(), 2).toString()); 
            String D3 = MyMath.double2String(d3);
            int d4 = Integer.parseInt(modelByNameTable.getValueAt(ByNameTable.getSelectedRow(), 3).toString());
            
            boolean isAlredyInTable = false;
            int numberAlredyInTable = 0;
            
            for (; numberAlredyInTable < modelMainTable.getRowCount(); numberAlredyInTable++) {
                int a = (int)modelMainTable.getValueAt(numberAlredyInTable, 0);
                if(a==d1){isAlredyInTable = true; break;}
            }
            
            if(isAlredyInTable){
                Table.setRowSelectionInterval(numberAlredyInTable, numberAlredyInTable);
                double newTotalPrice = MyMath.sum(oldTotalPrice, d3);
                totalPriceValue.setText(MyMath.double2String(newTotalPrice));
                int newQuntity = (int)modelMainTable.getValueAt(numberAlredyInTable, 3)+1;
                modelMainTable.setValueAt(newQuntity, numberAlredyInTable, 3);
                double oldTotalProductPrice = Double.parseDouble((String) modelMainTable.getValueAt(numberAlredyInTable, 4));
                double newTotalProductPrice = MyMath.sum(oldTotalProductPrice, d3);
                modelMainTable.setValueAt(MyMath.double2String(newTotalProductPrice), numberAlredyInTable, 4);
                
                Table.scrollRectToVisible(Table.getCellRect(Table.getSelectedRow(), 0, true));               
            }
            else{
                modelMainTable.addRow(new Object[]{d1,d2,D3,1,D3,d4});
                Table.setRowSelectionInterval(Table.getRowCount()-1, Table.getRowCount()-1);
                double newTotalPrice = MyMath.sum(oldTotalPrice, d3);
                totalPriceValue.setText(MyMath.double2String(newTotalPrice));
                Table.scrollRectToVisible(Table.getCellRect(modelMainTable.getRowCount() - 1, 0, true));
            }
        
        final int b = modelByNameTable.getRowCount();
        for (int i = 0; i < b; i++) {
            modelByNameTable.removeRow(0);
        }
        SelectByNameWindow.setVisible(false);
        ByBarcodeActionPerformed(null);
    }//GEN-LAST:event_SelectByNameButtonActionPerformed

    private void CancelByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelByNameActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)ByNameTable.getModel();
        final int b = model.getRowCount();
        for (int i = 0; i < b; i++) {
            model.removeRow(0);
        }
        SelectByNameWindow.setVisible(false);
    }//GEN-LAST:event_CancelByNameActionPerformed

    private void SelectByNameWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_SelectByNameWindowWindowClosing
        // TODO add your handling code here:
        CancelByNameActionPerformed(null);
    }//GEN-LAST:event_SelectByNameWindowWindowClosing

    private void SelectByNameButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SelectByNameButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE) CancelByNameActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_ENTER) SelectByNameButtonActionPerformed(null);
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            int newSelectedRow = ByNameTable.getSelectedRow()+1;
            if(newSelectedRow<ByNameTable.getRowCount()){
            ByNameTable.setRowSelectionInterval(newSelectedRow, newSelectedRow);
            ByNameTable.scrollRectToVisible(ByNameTable.getCellRect(ByNameTable.getSelectedRow(), 0, true));
            }
        }
        else if(evt.getKeyCode()==KeyEvent.VK_UP){
            int newSelectedRow = ByNameTable.getSelectedRow()-1;
            if(newSelectedRow>-1){
            ByNameTable.setRowSelectionInterval(newSelectedRow, newSelectedRow);
            ByNameTable.scrollRectToVisible(ByNameTable.getCellRect(ByNameTable.getSelectedRow(), 0, true));
            }
        }
    }//GEN-LAST:event_SelectByNameButtonKeyPressed

    private void EnterCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterCashKeyTyped
        // TODO add your handling code here:
        String s = EnterCash.getText();
        boolean isNeedAddC = true;
        char c = evt.getKeyChar();
        
        if ((c==','||c=='.')&&!s.contains(".")) {
            evt.setKeyChar('.');
            isNeedAddC = false;
        }
        else if (!Character.isDigit(c)) {
            isNeedAddC = false;
            evt.consume();
        }
        
        if (s.contains(".")){
            String[]temp = s.split("\\.");
            if(temp.length==2){
                if(temp[1].length()>=2) {
                    isNeedAddC=false;
                    evt.consume();
                }
            }
        }
        
        double cash = 0;
        try {cash = Double.parseDouble(EnterCash.getText()+(isNeedAddC?c:""));}
        catch(Exception e){/*Nothing*/}
        double totalSumCheck = Double.parseDouble(totalPriceValue.getText());
        double dif = MyMath.minus(cash, totalSumCheck);
        DifferenceValue.setText(MyMath.double2String(dif));
        

    }//GEN-LAST:event_EnterCashKeyTyped

    private void ByNameTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ByNameTableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
            SelectByNameButtonActionPerformed(null);
    }//GEN-LAST:event_ByNameTableMouseClicked

    private void SetQuntityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SetQuntityFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_SetQuntityFieldKeyTyped

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String user = UserName.getText();
        String pass = "";
        char []passCharrarray = Password.getPassword();
        for (int i = 0; i < passCharrarray.length; i++) {
            pass+=passCharrarray[i];            
        }
        if(user.isEmpty()||pass.isEmpty()||user.length()>30){
            String message = "<html><center>Please enter sellers username and password.<br>"
                    + "There are such accounts:<br>"
                    + "ILLIA - 123<br>"
                    + "User - user<br>"
                    + "Vasya - 123"
                    + "</center>";
            JOptionPane.showMessageDialog(this, message);
            UserName.requestFocus();
            return;
        }
        
        try {
            Connection connection = DriverManager.getConnection(Parameters.getDBPath(), Parameters.getDBLogin(), Parameters.getDBPassword());
            Statement statement = connection.createStatement();
            String searchUser = "SELECT password FROM users WHERE user_name='"
                    + user
                    + "';";
            ResultSet result = statement.executeQuery(searchUser);
            
            
            if(!(result.next())) {
                JOptionPane.showMessageDialog(null, "Seller "+ user+ " not found!");
                return;
            }
            String passFromDB = result.getString("password");
            if(!pass.equals(passFromDB)){
                JOptionPane.showMessageDialog(null, "Wrong password for Seller "+ user+ " !");
                return;
            }
            result.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "<html><center>Error to connect database!<br>"
                    + "Please check file \"config.txt\".<br>"
                    + "For more information </center>");
            return;
        }
        
        
        UserT.setText("Cashbox - logged as " + UserName.getText());
        LogIn.setVisible(false);
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LogInWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LogInWindowClosing
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogInWindowClosing

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
        if(!UserName.getText().isEmpty())
        Password.requestFocus();
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        LoginButtonActionPerformed(null);
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // Info.setVisible(true);
        info2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
            SetQuantityButtonActionPerformed(null);
    }//GEN-LAST:event_TableMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });

        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JRadioButton ByBarcode;
    javax.swing.JRadioButton ByName;
    javax.swing.JTable ByNameTable;
    javax.swing.JButton CancelByName;
    javax.swing.JDialog CashWindow;
    javax.swing.JLabel CashWindowSum;
    javax.swing.JLabel CheckBody;
    javax.swing.JLabel CheckDate;
    javax.swing.JLabel CheckNumber;
    javax.swing.JPanel CheckPanel;
    javax.swing.JLabel CheckTime;
    javax.swing.JDialog CheckWindow;
    javax.swing.JButton CloseCheckButton;
    javax.swing.JButton DeleteSelectedItem;
    javax.swing.JLabel DifferenceValue;
    javax.swing.JTextField EnterCash;
    javax.swing.JLabel Enterproduct;
    javax.swing.JLabel GuiDateOfCheck;
    javax.swing.JLabel GuiTimeOfCheck;
    javax.swing.JTextField Input_barcode;
    javax.swing.JDialog LogIn;
    javax.swing.JButton LoginButton;
    javax.swing.JButton Logout;
    javax.swing.JButton MakePayment;
    javax.swing.JPasswordField Password;
    javax.swing.JButton PrintCheck;
    javax.swing.JButton Recycle;
    javax.swing.JButton SelectByNameButton;
    javax.swing.JDialog SelectByNameWindow;
    javax.swing.JButton SetQuantityButton;
    javax.swing.JDialog SetQuantityWindow;
    javax.swing.JTextField SetQuntityField;
    javax.swing.JTable Table;
    javax.swing.JTextField UserName;
    javax.swing.JLabel UserT;
    javax.swing.JLabel checkNumberValue;
    javax.swing.JDialog info2;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JEditorPane jEditorPane1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel6;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    java.awt.Label timeF;
    javax.swing.JLabel totalPriceValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
