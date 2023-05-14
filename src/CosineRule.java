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

    private JButton clear;
    private JButton go;

    public CosineRule() {
        super("Cosine Rule");
        // Input Labels
        firstSideLabel = new JLabel("Side AB:");
        secondSideJLabel = new JLabel("Side AC:");
        includedAngleLabel = new JLabel("Side BAC:");
        otherSideLabel = new JLabel("Side BC:");

        // Input Fields
        firstSide = new JTextField(10);
        secondSide = new JTextField(10);
        includedAngle = new JTextField(10);
        otherSide = new JTextField(10);

        // Primary button
        go = new JButton("Go");
        clear = new JButton("Clr");

        setLayout(new FlowLayout());

        // Input fields and labels
        add(firstSideLabel);
        add(firstSide);

        add(secondSideJLabel);
        add(secondSide);

        add(includedAngleLabel);
        add(includedAngle);

        add(otherSideLabel);
        add(otherSide);

        add(go);

        // Size
        setVisible(true);
        setLocation(300, 300);

        setSize(300, 300);

        go.addActionListener(new Handler());
        clear.addActionListener(new Handler());
    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == go) {
                double ab = Double.parseDouble(firstSide.getText());
                double ac = Double.parseDouble(secondSide.getText());
                double angle = Double.parseDouble(includedAngle.getText());
                double bc = ab * ab + ac * ac - 2 * ab * ac * Math.cos((angle * 180) / Math.PI);
                otherSide.setText(String.format("%.2f", bc) + "");

                // otherSide.setText(bc + "");/
            }
            if (ae.getSource() == clear) {
                firstSide.setText("");
                secondSide.setText("");
                includedAngle.setText("");
            }
        }
    }
}
