/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author faidfadjri
 */
public class ActionButton extends JButton{
    
    private boolean mousePressed;
    public ActionButton() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3,3,3,3));
        
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
               mousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               mousePressed = false; 
            }
            
        });
    }
    
    
}
