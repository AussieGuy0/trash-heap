import javax.swing.*;

/**
 * Created by anthony on 16/07/16.
 */
public class Go {

    public static void main(String[] args) {
        Director director = new Director();
        director.setTitle("Chess");
        director.setSize(600, 800);
        director.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        director.setVisible(true);
    }
}
