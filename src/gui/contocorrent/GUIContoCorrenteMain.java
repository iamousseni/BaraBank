/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.omg.SendingContext.RunTime;

/**
 *
 * @author Ousseni bara
 */
public class GUIContoCorrenteMain {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUIContoCorrente().setVisible(true);
                } catch (IOException ex) {}
            }
        });
    }
    
}
