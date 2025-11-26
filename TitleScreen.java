import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TitleScreen extends JFrame {

    public TitleScreen() {
        // Window settings
        setTitle("Lotus - Title Screen");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);

        // Background panel
        BackgroundPanel bg = new BackgroundPanel();
        bg.setLayout(new BorderLayout());

        // Title text
        JLabel titleLabel = new JLabel("Lotus");
        titleLabel.setFont(new Font("Consolas", Font.BOLD, 80));
        titleLabel.setForeground(Color.decode("#39ff14"));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Title container to add spacing above
        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(80, 0, 20, 0)); // top spacing

        // Logo label
        JLabel logo = new JLabel(new ImageIcon("Images/lotuslogo.png"));
        logo.setHorizontalAlignment(JLabel.CENTER);

        JPanel centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(titlePanel, BorderLayout.NORTH);
        centerPanel.add(logo, BorderLayout.CENTER);

        bg.add(centerPanel, BorderLayout.CENTER);

        // Button Panels
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new GridLayout(1, 3, 50, 0));

        Font buttonFont = new Font("Consolas", Font.BOLD, 26);

        JButton inventoryBtn = new JButton("Inventory");
        styleButton(inventoryBtn, buttonFont);

        JButton surveyBtn = new JButton("Survey");
        styleButton(surveyBtn, buttonFont);

        JButton educationBtn = new JButton("Education");
        styleButton(educationBtn, buttonFont);

        buttonPanel.add(inventoryBtn);
        buttonPanel.add(surveyBtn);
        buttonPanel.add(educationBtn);

        // Add button panel to bottom
        bg.add(buttonPanel, BorderLayout.SOUTH);

        add(bg);

        // Button Actins
        inventoryBtn.addActionListener(e -> new InventoryFrame());
        surveyBtn.addActionListener(e -> new SurveyFrame());
        educationBtn.addActionListener(e -> new EducationFrame());
    }

    // Neon button styling
    private void styleButton(JButton b, Font font) {
        b.setFont(font);
        b.setForeground(Color.decode("#39ff14"));
        b.setBackground(Color.black);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createLineBorder(Color.decode("#39ff14"), 3));
    }

    // Background + neon particles
    class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.black);
            g.fillRect(0, 0, getWidth(), getHeight());

            // neon particles
            g.setColor(new Color(57, 255, 20, 80));
            for (int i = 0; i < 350; i++) {
                int x = (int)(Math.random() * getWidth());
                int y = (int)(Math.random() * getHeight());
                g.fillOval(x, y, 3, 3);
            }
        }
    }

    // Placeholder frames for buttons
    class InventoryFrame extends JFrame {
        public InventoryFrame() {
            setTitle("Inventory Frame");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    class SurveyFrame extends JFrame {
        public SurveyFrame() {
            setTitle("Survey Frame");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    class EducationFrame extends JFrame {
        public EducationFrame() {
            setTitle("Education Frame");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
    
    // Event dispatch Thread

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TitleScreen().setVisible(true));
    }
}
