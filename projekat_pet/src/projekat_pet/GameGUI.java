package projekat_pet;

import javax.swing.*;
import java.awt.*;
import java.util.List;

class GameGUI extends JFrame {
    private JTextField txtIme, txtHealth, txtX, txtY;
    private JComboBox<String> cmbCollider;
    private JTextArea txtOutput;
    private Game game;

    public GameGUI() {
        setTitle("Game Setup");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 5, 5));

        txtIme = new JTextField("BMW X7");
        txtHealth = new JTextField("100");
        txtX = new JTextField("100");
        txtY = new JTextField("100");
        String[] shapes = {"Rectangle", "Circle"};
        cmbCollider = new JComboBox<>(shapes);

        JButton pokreniButton = new JButton("Pokreni igru");

        formPanel.add(new JLabel("Ime"));
        formPanel.add(txtIme);

        formPanel.add(new JLabel("Health (0 - 100)"));
        formPanel.add(txtHealth);

        formPanel.add(new JLabel("X pozicija"));
        formPanel.add(txtX);

        formPanel.add(new JLabel("Y pozicija"));
        formPanel.add(txtY);

        formPanel.add(new JLabel("Kolajder"));
        formPanel.add(cmbCollider);

        formPanel.add(new JLabel(" "));
        formPanel.add(pokreniButton);

        add(formPanel, BorderLayout.NORTH);

        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Log"));
        add(scrollPane, BorderLayout.CENTER);

        pokreniButton.addActionListener(e -> runGameLogic());
    }

    private void runGameLogic() {
        try {
            String ime = txtIme.getText().trim();
            if (ime.isEmpty()) {
                throw new IllegalArgumentException("Ime ne moze biti prazno.");
            }

            int hp = Integer.parseInt(txtHealth.getText().trim());
            int x = Integer.parseInt(txtX.getText().trim());
            int y = Integer.parseInt(txtY.getText().trim());

            Collidable collider;
            if (cmbCollider.getSelectedIndex() == 0) {
                collider = new RectangleCollider(x, y, 32, 32);
            } else {
                collider = new CircleCollider(x, y, 16);
            }

            Player player = new Player(x, y, collider, ime, hp);
            game = new Game(player);

            List<Enemy> ucitani = Game.loadEnemiesFromCSV("enemies.csv");
            for (Enemy enemy : ucitani) {
                game.addEnemy(enemy);
            }

            game.resolveCollisions();

            StringBuilder sb = new StringBuilder();
            sb.append("IGRAC\n");
            sb.append(player.toString()).append("\n\n");

            sb.append("SVI ENEMY\n");
            for (Enemy e : game.getEnemies()) {
                sb.append(e.toString()).append("\n");
            }

            sb.append("\nKOLIZIJE\n");
            List<Enemy> collisions = game.collidingWithPlayer();
            if (collisions.isEmpty()) {
                sb.append("Nema kolizija.\n");
            } else {
                for (Enemy e : collisions) {
                    sb.append("Sudar sa: ").append(e.getTip()).append("\n");
                }
            }

            sb.append("\nLOG DOGADJAJA\n");
            for (String log : game.getEventLog()) {
                sb.append(log).append("\n");
            }

            txtOutput.setText(sb.toString());

            if (player.getHealth() <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Igra je gotova! Igrac je porazen.",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Igrac je prezivio!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Unesite brojeve za HP i pozicije.",
                    "Greska",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Greska",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Greska: " + ex.getMessage(),
                    "Greska",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}