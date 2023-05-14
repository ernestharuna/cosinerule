import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CosineRule extends JFrame {
    private JLabel firstSideLabel;
    private JLabel secondSideJLabel;
    private JLabel includedAngleLabel;
    private JLabel otherSideLabel;

    private JTextField firstSide;
    private JTextField secondSide;
    private JTextField includedAngle;
    private JTextField otherSide;

    private JButton go;

    public CosineRule() {
        super("Cosine Rule");
        firstSideLabel = new JLabel("Side AB:");
        secondSideJLabel = new JLabel("Side AC:");
        includedAngleLabel = new JLabel("Side BAC:");
        otherSideLabel = new JLabel("Side BC:");

        firstSide = new JTextField(10);
        secondSide = new JTextField(10);
        includedAngle = new JTextField(10);
        otherSide = new JTextField(10);

        go = new JButton("Go");

        setLayout(new FlowLayout());

        add(firstSideLabel);
        add(firstSide);

        add(secondSideJLabel);
        add(secondSide);

        add(includedAngleLabel);
        add(includedAngle);

        add(otherSideLabel);
        add(otherSide);

        add(go);

        setVisible(true);
        setLocation(300, 300);

        setSize(300, 300);
    }

    public static void main(String[] args) {
        new CosineRule();
    }
}
