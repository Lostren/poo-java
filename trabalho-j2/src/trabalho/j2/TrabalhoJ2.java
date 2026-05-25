/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.j2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author gabriel-oliveira-brito
 */
public class TrabalhoJ2 {

    public static void main(String[] args) {
        
        // Show opening screen (GIF + Logo + Button only)
        JFrame hiddenFrame = new JFrame();
        hiddenFrame.setUndecorated(true);
        hiddenFrame.setSize(1, 1);
        hiddenFrame.setLocationRelativeTo(null);

        // Show opening screen - waits for button
        OpeningScreen opening = new OpeningScreen(hiddenFrame, "opening.gif");

        // Wait for button to be clicked
        while (!opening.wasStarted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

       // Start Round 1 audio
       //audioManager.play("audio/round1.wav");

        
       
       // Close R1 opening screen and show new one for Round 2
        opening.dispose();
        OpeningScreen opening2 = new OpeningScreen(hiddenFrame, "opening2.gif");
        
        // Wait for button to be clicked
        while (!opening2.wasStarted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       
    }
    
}
