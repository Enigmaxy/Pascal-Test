import javax.swing.*;

public class HelloWorldGUI {

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        // Erstellen des Fensters
        JFrame frame = new JFrame("Hallo Welt!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstellen des Labels
        JLabel label = new JLabel("Hallo Welt!");
        frame.getContentPane().add(label);

        // Fenstergröße anpassen und anzeigen
        frame.pack();
        frame.setVisible(true);
    }
}