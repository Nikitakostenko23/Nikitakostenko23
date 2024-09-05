import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        setTitle("ArrayList Window");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }
}
