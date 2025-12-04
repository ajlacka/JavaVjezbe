package projekat_pet;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameGUI gui = new GameGUI();
            gui.setLocationRelativeTo(null); // centriraj prozor
            gui.setVisible(true);
        });
    }
}