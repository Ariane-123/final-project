import javax.swing.*; // Essential import for Swing components

public class Graphics {
    public static void main(String[] args) {
        // Use invokeLater to ensure thread safety for the GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My First Swing App"); // Create window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop app on close
            frame.setSize(400, 300); // Set dimensions
            
            JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER); // Add text
            frame.add(label);
            
            frame.setVisible(true); // Make the window appear
        });
    }
}
