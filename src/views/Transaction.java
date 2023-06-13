/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import database.Connection;
import helper.Table;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author faidfadjri
 */
public final class Transaction extends javax.swing.JInternalFrame {

    /**
     * Creates new form Transaction
     */
    public Transaction() {
        initComponents();
        initTable();
    }
    
    void initTable(){
        Table table = new Table();
        
        
        
        Connection db = new Connection();
        int saldo = db.getCash();
        cash.setText(String.valueOf(saldo));
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("No");
        tableModel.addColumn("Barang");
        tableModel.addColumn("Total");
        
        
        List<String> fieldList = new ArrayList<>();
        fieldList.add("barang");
        fieldList.add("harga");
        
        
        table.set(transactionTable, tableModel, "SELECT * FROM transaksi", fieldList);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sayHello1 = new javax.swing.JLabel();
        sayHello = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        backToStok = new javax.swing.JButton();
        addTransaksi = new javax.swing.JButton();

        sayHello1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sayHello1.setForeground(new java.awt.Color(153, 153, 153));
        sayHello1.setText("Enjoy the easiest way of manage your own business. Good Luck!");

        sayHello.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        sayHello.setForeground(new java.awt.Color(16, 118, 171));
        sayHello.setText("Welcome fellas!");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 737));
        setPreferredSize(new java.awt.Dimension(1366, 737));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 118, 171));
        jLabel1.setText("Transaction");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Manage your business income and outcome easily");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wallet.png"))); // NOI18N

        cash.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        cash.setForeground(new java.awt.Color(16, 118, 171));
        cash.setText("Rp. 500.000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(cash)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cash)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        transactionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(transactionTable);

        backToStok.setBackground(new java.awt.Color(254, 254, 254));
        backToStok.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        backToStok.setForeground(new java.awt.Color(49, 157, 212));
        backToStok.setText("Kembali");
        backToStok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 157, 212), 2));
        backToStok.setFocusable(false);
        backToStok.setRolloverEnabled(false);
        backToStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToStokActionPerformed(evt);
            }
        });

        addTransaksi.setBackground(new java.awt.Color(61, 164, 225));
        addTransaksi.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        addTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        addTransaksi.setText("Tambah Transaksi");
        addTransaksi.setFocusable(false);
        addTransaksi.setRolloverEnabled(false);
        addTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(addTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backToStok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToStok, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToStokActionPerformed
        Menu pages = new Menu();
        pages.setVisible(true);
        this.getDesktopPane().add(pages);
        this.dispose();
    }//GEN-LAST:event_backToStokActionPerformed

    private void addTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTransaksiActionPerformed
        AddTransaction dialog = null;
        try {
            dialog = new AddTransaction(null, closable);
        } catch (SQLException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        dialog.setVisible(true);
      
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                initTable();
            }
        });
    }//GEN-LAST:event_addTransaksiActionPerformed

    private void transactionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTableMouseClicked
        int row = transactionTable.rowAtPoint(evt.getPoint());
        int column = transactionTable.columnAtPoint(evt.getPoint());
    
        if (row >= 0 && column >= 0) {
            Object value = transactionTable.getValueAt(row, column);
            System.out.println("Clicked Value: " + value);
        }
    }//GEN-LAST:event_transactionTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTransaksi;
    private javax.swing.JButton backToStok;
    private javax.swing.JLabel cash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sayHello;
    private javax.swing.JLabel sayHello1;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables
}
