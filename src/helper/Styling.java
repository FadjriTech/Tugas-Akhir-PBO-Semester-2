/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author faidfadjri
 */
public class Styling {
    public void setPadding(JTextField textfield, int paddingTop, int paddingBottom, int paddingLeft, int paddingRight){
        textfield.setBorder(BorderFactory.createCompoundBorder(
        textfield.getBorder(), 
        BorderFactory.createEmptyBorder(paddingTop, paddingLeft, paddingBottom, paddingRight)));
    }
}
