import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  extends JFrame {

    private JLabel helpLabel = new JLabel();
    public static JButton btn1 = new JButton();
    public static JButton btn2 = new JButton();
    public static JButton btn3 = new JButton();
    public static JButton btn4 = new JButton();
    public static JButton btn5 = new JButton();
    public static JButton btn6 = new JButton();
    public static JButton btn7 = new JButton();
    public static JButton btn8 = new JButton();
    public static JButton btn9 = new JButton();
    public static JLabel label1 = new JLabel();
    public static JLabel label2 = new JLabel();
    public static JLabel label3 = new JLabel();
    public static JLabel label4 = new JLabel();
    public static JLabel label5 = new JLabel();
    public static JLabel label6 = new JLabel();
    public static JLabel label7 = new JLabel();
    public static JLabel label8 = new JLabel();
    public static JLabel label9 = new JLabel();

    public GUI() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        int frameWidth = 400;
        int frameHeight = 400;
        setSize(frameWidth, frameHeight);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (screenSize.width - getSize().width) / 2;
        int y = (screenSize.height - getSize().height) / 2;
        setLocation(x, y);

        helpLabel.setText("<html><p>You are X, the enemy is O</p></html>");
        helpLabel.setSize(125, 25);
        helpLabel.setLocation(225, 40);

        int btnWidth = 40;
        int btnHeight = 40;
        int btnX = 30;
        int btnY = 35;

        btn1.setSize(btnWidth, btnHeight);
        btn2.setSize(btnWidth, btnHeight);
        btn3.setSize(btnWidth, btnHeight);
        btn4.setSize(btnWidth, btnHeight);
        btn5.setSize(btnWidth, btnHeight);
        btn6.setSize(btnWidth, btnHeight);
        btn7.setSize(btnWidth, btnHeight);
        btn8.setSize(btnWidth, btnHeight);
        btn9.setSize(btnWidth, btnHeight);

        label1.setSize(btnWidth, btnHeight);
        label2.setSize(btnWidth, btnHeight);
        label3.setSize(btnWidth, btnHeight);
        label4.setSize(btnWidth, btnHeight);
        label5.setSize(btnWidth, btnHeight);
        label6.setSize(btnWidth, btnHeight);
        label7.setSize(btnWidth, btnHeight);
        label8.setSize(btnWidth, btnHeight);
        label9.setSize(btnWidth, btnHeight);

        btn1.setLocation(btnX, btnY);
        btn2.setLocation(btnX + 60, btnY);
        btn3.setLocation(btnX + 120, btnY);
        btn4.setLocation(btnX, btnY + 60);
        btn5.setLocation(btnX + 60, btnY + 60);
        btn6.setLocation(btnX + 120, btnY + 60);
        btn7.setLocation(btnX, btnY + 120);
        btn8.setLocation(btnX + 60, btnY + 120);
        btn9.setLocation(btnX + 120, btnY + 120);

        label1.setLocation(btnX, btnY);
        label2.setLocation(btnX + 60, btnY);
        label3.setLocation(btnX + 120, btnY);
        label4.setLocation(btnX, btnY + 60);
        label5.setLocation(btnX + 60, btnY + 60);
        label6.setLocation(btnX + 120, btnY + 60);
        label7.setLocation(btnX, btnY + 120);
        label8.setLocation(btnX + 60, btnY + 120);
        label9.setLocation(btnX + 120, btnY + 120);

        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        label9.setHorizontalAlignment(SwingConstants.CENTER);

        Container cp = getContentPane();
        cp.setLayout(null);
        cp.add(helpLabel);

        cp.add(btn1);
        cp.add(btn2);
        cp.add(btn3);
        cp.add(btn4);
        cp.add(btn5);
        cp.add(btn6);
        cp.add(btn7);
        cp.add(btn8);
        cp.add(btn9);

        cp.add(label1);
        cp.add(label2);
        cp.add(label3);
        cp.add(label4);
        cp.add(label5);
        cp.add(label6);
        cp.add(label7);
        cp.add(label8);
        cp.add(label9);

        setResizable(false);
        setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Buttons.btn1Clicked(event);
            }
        });

    }
}
