/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author faidfadjri
 */
public class TableActionCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        PanelAction action = new PanelAction();

        // Center the action vertically and horizontally within the cell
        if (com instanceof javax.swing.JLabel) {
            javax.swing.JLabel label = (javax.swing.JLabel) com;
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        }

        return action;
    }
    
}
