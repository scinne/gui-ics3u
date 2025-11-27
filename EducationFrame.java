import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EducationFrame extends JFrame implements ActionListener {

    //buttons for left side
    private JButton cpuButton, ramButton, storageButton, gpuButton, batteryButton;

    //info JLabels for right side
    private JLabel infoLabel;

    public EducationFrame() {
        setTitle("Education Frame");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //thing for full control

        //background panel
        JPanel background = new JPanel();
        background.setLayout(null);
        background.setBackground(Color.black);
        background.setBounds(0, 0, 1920, 1080);
        add(background);

        //menu
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.white);

        JMenuItem home = new JMenuItem("Home");
        JMenuItem survey = new JMenuItem("Survey");
        JMenuItem education = new JMenuItem("Education");

        menuBar.add(home);
        menuBar.add(survey);
        menuBar.add(education);

        setJMenuBar(menuBar);

        //title
        JLabel titleLabel = new JLabel("What to look for when");
        JLabel titleLabel2 = new JLabel("purchasing a Laptop");

        titleLabel.setForeground(Color.white);
        titleLabel2.setForeground(Color.white);

        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel2.setFont(new Font("Arial", Font.BOLD, 36));

        titleLabel.setBounds(650, 120, 800, 50);
        titleLabel2.setBounds(650, 170, 800, 50);

        background.add(titleLabel);
        background.add(titleLabel2);

        //buttons on left side
        cpuButton = createNeonButton("CPU");
        ramButton = createNeonButton("RAM");
        storageButton = createNeonButton("Storage");
        gpuButton = createNeonButton("GPU");
        batteryButton = createNeonButton("Battery");

        cpuButton.setBounds(120, 250, 150, 55);
        ramButton.setBounds(120, 330, 150, 55);
        storageButton.setBounds(120, 410, 150, 55);
        gpuButton.setBounds(120, 490, 150, 55);
        batteryButton.setBounds(120, 570, 150, 55);

        background.add(cpuButton);
        background.add(ramButton);
        background.add(storageButton);
        background.add(gpuButton);
        background.add(batteryButton);

        //ation listeners for when buttons are pressed
        cpuButton.addActionListener(this);
        ramButton.addActionListener(this);
        storageButton.addActionListener(this);
        gpuButton.addActionListener(this);
        batteryButton.addActionListener(this);

        //info that shows up on right side when button is clicked
        infoLabel = new JLabel("Info shows up for each button clicked on the right side");
        infoLabel.setForeground(new Color(0, 255, 0));
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        infoLabel.setBounds(700, 330, 1000, 300);

        background.add(infoLabel);
        
    }

    //neon green buttons
    private JButton createNeonButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(new Color(80, 255, 80));
        button.setForeground(Color.black);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        button.setOpaque(true);
        return button;
    }

    //button actions upd info label when pressed
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cpuButton) {
            infoLabel.setText("<html><b>CPU:</b> Determines speed and performance.</html>");
        }
        else if (event.getSource() == ramButton) {
            infoLabel.setText("<html><b>RAM:</b> More RAM allows better multitasking.</html>");
        }
        else if (event.getSource() == storageButton) {
            infoLabel.setText("<html><b>Storage:</b> SSDs are faster than HDDs.</html>");
        }
        else if (event.getSource() == gpuButton) {
            infoLabel.setText("<html><b>GPU:</b> Important for gaming and graphics work.</html>");
        }
        else if (event.getSource() == batteryButton) {
            infoLabel.setText("<html><b>Battery:</b> Larger batteries last longer.</html>");
        }
    }
    
    
    //event dispatcher

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EducationFrame().setVisible(true));
    }
}
