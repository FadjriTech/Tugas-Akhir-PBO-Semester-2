/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

/**
 *
 * @author faidfadjri
 */
public class Menu extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionButton = new javax.swing.JButton();
        stokButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sayHello = new javax.swing.JLabel();
        sayHello1 = new javax.swing.JLabel();
        logoutMenuButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 737));
        setPreferredSize(new java.awt.Dimension(1366, 737));

        transactionButton.setBackground(new java.awt.Color(227, 240, 243));
        transactionButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        transactionButton.setForeground(new java.awt.Color(16, 118, 171));
        transactionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transaction.png"))); // NOI18N
        transactionButton.setText("  TRANSACTION");
        transactionButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 173, 232), 2, true));
        transactionButton.setFocusPainted(false);
        transactionButton.setFocusable(false);
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });

        stokButton.setBackground(new java.awt.Color(255, 255, 243));
        stokButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        stokButton.setForeground(new java.awt.Color(203, 139, 17));
        stokButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/package.png"))); // NOI18N
        stokButton.setText("    INVENTORY");
        stokButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 173, 60), 2, true));
        stokButton.setFocusPainted(false);
        stokButton.setFocusable(false);
        stokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pc.jpeg"))); // NOI18N

        sayHello.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        sayHello.setForeground(new java.awt.Color(16, 118, 171));
        sayHello.setText("Welcome fellas!");

        sayHello1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sayHello1.setForeground(new java.awt.Color(153, 153, 153));
        sayHello1.setText("Enjoy the easiest way of manage your own business. Good Luck!");

        logoutMenuButton.setBackground(new java.awt.Color(240, 240, 240));
        logoutMenuButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        logoutMenuButton.setForeground(new java.awt.Color(220, 70, 16));
        logoutMenuButton.setText("LOGOUT");
        logoutMenuButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 70, 16), 2, true));
        logoutMenuButton.setContentAreaFilled(false);
        logoutMenuButton.setFocusable(false);
        logoutMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoutMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sayHello)
                            .addComponent(sayHello1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transactionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokButton, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(sayHello)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sayHello1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(stokButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(logoutMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionButtonActionPerformed
        TransactionView pages = new TransactionView();
        pages.setVisible(true);
        this.getDesktopPane().add(pages);
        this.dispose();
    }//GEN-LAST:event_transactionButtonActionPerformed

    private void stokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokButtonActionPerformed
        Stock home = new Stock();
        home.setVisible(true);
        this.getDesktopPane().add(home);
        this.dispose();
    }//GEN-LAST:event_stokButtonActionPerformed

    private void logoutMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuButtonActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.getDesktopPane().add(login);
        this.dispose();
    }//GEN-LAST:event_logoutMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutMenuButton;
    private javax.swing.JLabel sayHello;
    private javax.swing.JLabel sayHello1;
    private javax.swing.JButton stokButton;
    private javax.swing.JButton transactionButton;
    // End of variables declaration//GEN-END:variables
}
