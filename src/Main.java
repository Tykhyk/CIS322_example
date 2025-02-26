import javax.swing.*;
import Exploration_game.Exploration_game;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
           JFrame frame = new JFrame ("Exploration frame");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(new Exploration_game());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}
