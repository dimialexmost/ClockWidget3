import javax.swing.*;
import java.awt.*;

public class GUI  extends JFrame {
//    private static final long serialVersionUID = 9L;
    private static JPanel panel = new JPanel();
    public static JLabel labelCurrentTime = new JLabel();
    public static JLabel labelCurrentDate = new JLabel();
    public GUI() {

        initGui();
        Clock.getTimeData();
    }
    public void initGui() {
        setTitle("myclock v1.02");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(360, 60);

        labelCurrentTime.setFont(new Font("Verdana", Font.BOLD, 22));
        labelCurrentTime.setForeground(Color.lightGray);

        labelCurrentDate.setFont(new Font("Verdana", Font.BOLD, 12));
        labelCurrentDate.setForeground(Color.DARK_GRAY);

        panel.setLayout(new GridLayout(1,0,-45,0));
        panel.setBackground(Color.gray);

        panel.add(labelCurrentTime);
        panel.add(labelCurrentDate);

        add(panel);
        setResizable(false);
        setVisible(true);
        setAlwaysOnTop(true);


    }
}