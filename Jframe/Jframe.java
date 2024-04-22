import javax.swing.*;

public class Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello There");
        final JLabel label = new JLabel("General Kenobi");
        frame.getContentPane().add(label);
        // frame.setDefaultCloseOperation();
    }
}
