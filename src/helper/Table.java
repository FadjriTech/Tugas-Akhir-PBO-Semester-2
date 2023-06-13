/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import database.Connection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author faidfadjri
 */
public class Table {
    
    
     public void onDeleteEvent(JTable table){
         
     }
    
     public void set(JTable table, DefaultTableModel tableModel, String queries, List<String> fieldList){
        // -- Ambil data dari database
        Connection database = new Connection();
        
        int rowHeight = 60;
        Font headerFont = new Font("Sans Serif", Font.PLAIN, 20);
        table.getTableHeader().setFont(headerFont);
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(227,240,243));
        table.getTableHeader().setForeground(new Color(16,118,171));
        table.setRowHeight(rowHeight);
        

        JTableHeader header = table.getTableHeader();
        header.setPreferredSize(new Dimension(header.getWidth(), rowHeight));
        
        
        tableModel.addColumn("Action");
        
        table.setModel(tableModel);
        
        
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                System.out.println("Deleted Row : " +  row);
            }
        };
        
        table.getColumnModel().getColumn(3).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditor(event));
        
        
        ResultSet res = database.runQueries(queries);
        try {
            int rowCount = 1; // Counter variable for the row number
            while(res.next()){
                Object[] rowData = new Object[fieldList.size() + 1];
                rowData[0] = rowCount;

                for (int i = 0; i < fieldList.size(); i++) {
                    String fieldValue = res.getString(fieldList.get(i));
                    rowData[i + 1] = fieldValue;
                }

                tableModel.addRow(rowData);

                rowCount++;
            }
        } catch(SQLException e){
            System.out.print(e.getErrorCode());
        }
        
        
        // -- set font size
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Set the font size and font family for the specific row
                int fontSize = 18; // Customize the font size as needed
                String fontFamily = "Sans Serif"; // Customize the font family as needed
                Font font = new Font(fontFamily, Font.PLAIN, fontSize);
                component.setFont(font);

                // Center align the rows
                ((DefaultTableCellRenderer) component).setVerticalAlignment(SwingConstants.CENTER);
                ((DefaultTableCellRenderer) component).setHorizontalAlignment(SwingConstants.CENTER);

                return component;
            }
        });
        
        // -- List selection listener
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && !selectionModel.isSelectionEmpty()) {
                    int selectedRow = selectionModel.getMinSelectionIndex();

                    // Retrieve data from the selected row
                    Object id = table.getValueAt(selectedRow, 0); // Assuming you want to retrieve data from the first column
                    Object item = table.getValueAt(selectedRow, 1); // Assuming you want to retrieve data from the first column
                    Object harga = table.getValueAt(selectedRow, 2); // Assuming you want to retrieve data from the first column
                }
            }
        });
    }
}
