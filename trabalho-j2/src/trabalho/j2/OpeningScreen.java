package trabalho.j2;

import javax.swing.*;
import java.awt.*;

public class OpeningScreen extends JDialog {
    
    private boolean started = false;
    private JLabel logoLabel;
    private JButton startButton;
    private String gifFileName;
    
    public OpeningScreen(JFrame parent, String gifFileName) {
        super(parent, "FATE FORGED", false);
        this.gifFileName = gifFileName;
        
        // Get screen size for full screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        
        setSize(width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(false); // Remove decorations for full screen effect
        
        // Load and SCALE GIF background to fill entire screen
        ImageIcon backgroundGif = null;
        try {
            String basePath = System.getProperty("user.dir");
            String gifPath = basePath + "/icons/" + gifFileName;
            backgroundGif = new ImageIcon(gifPath);
            
            System.out.println("GIF carregado com sucesso - Dimensões: " + 
                             backgroundGif.getIconWidth() + "x" + backgroundGif.getIconHeight());
        } catch (Exception e) {
            System.out.println("Erro ao carregar GIF: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Create background label FULL SCREEN
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, width, height);
        backgroundLabel.setOpaque(true);
        
        if (backgroundGif != null && backgroundGif.getIconWidth() > 0) {
            backgroundLabel.setIcon(backgroundGif);
        } else {
            // Fallback: dark background
            backgroundLabel.setBackground(new Color(30, 30, 30));
        }
        
        // Load and scale logo PNG
        ImageIcon logo = null;
        try {
            String basePath = System.getProperty("user.dir");
            String logoPath = basePath + "/icons/logo.png";
            logo = new ImageIcon(logoPath);
        } catch (Exception e) {
            System.out.println("Erro ao carregar logo: " + e.getMessage());
            e.printStackTrace();
        }
        
        if (logo != null && logo.getIconWidth() > 0) {
            // Scale logo proportionally
            int logoWidth = 720;
            int logoHeight = 383;
            
            Image originalImage = logo.getImage();
            Image scaledImage = originalImage.getScaledInstance(
                logoWidth, logoHeight, Image.SCALE_SMOOTH
            );
            ImageIcon scaledLogo = new ImageIcon(scaledImage);
            
            // Center logo horizontally, position in upper-middle area
            int logoPosX = (width - logoWidth) / 2;
            int logoPosY = height / 6; // Upper third
            
            logoLabel = new JLabel(scaledLogo);
            logoLabel.setBounds(logoPosX, logoPosY, logoWidth, logoHeight);
            logoLabel.setOpaque(false);
            backgroundLabel.add(logoLabel); //------------------------------------------------
        }
        
        // Create start button - CENTERED
        int buttonWidth = 200;
        int buttonHeight = 50;
        int buttonPosX = (width - buttonWidth) / 2;
        int buttonPosY = (height * 3) / 4; // Lower area
        
        startButton = new JButton("START GAME");
        startButton.setFont(new Font("Arial", Font.BOLD, 24));
        startButton.setBounds(buttonPosX, buttonPosY, buttonWidth, buttonHeight);
        startButton.setBackground(Color.WHITE);
        startButton.setForeground(Color.BLACK);
        startButton.setFocusPainted(false);
        startButton.setBorderPainted(false);
        startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Button hover effect
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton.setBackground(new Color(222, 184, 135));
                startButton.setForeground(Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton.setBackground(Color.WHITE);
                startButton.setForeground(Color.BLACK);
            }
        });
        
        // Button click action
        startButton.addActionListener(e -> {
            started = true;
            hideStartElements();
        });
        
        backgroundLabel.add(startButton); //------------------------------------------------
        add(backgroundLabel);
        
        setVisible(true);
    }
    
    public void hideStartElements() {
        if (logoLabel != null) {
            logoLabel.setVisible(false);
        }
        if (startButton != null) {
            startButton.setVisible(false);
        }
    }
    
    public boolean wasStarted() {
        return started;
    }
}