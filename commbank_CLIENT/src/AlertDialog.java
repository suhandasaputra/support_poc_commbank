
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AlertDialog {
     public void showalertdialog(String title, String msg) {
        JOptionPane.showMessageDialog(new JFrame(),
                msg,
                title,
                JOptionPane.PLAIN_MESSAGE);
    }
    
}
