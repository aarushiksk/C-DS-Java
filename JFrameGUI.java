import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameGUI {
    public static void main(String[] args) {
        System.out.println("JFrame is used to build GUI Java application");
        JFrame jFrame = new JFrame("JFrame Example");

        // to get the input from user: JTextField
        // to display any message to user: JLabel
        // to perform any action by click on the button: JButton

        JLabel userWeightLabel = new JLabel("Enter your weight in kg");
        userWeightLabel.setBounds(150, 50, 300, 30);
        jFrame.add(userWeightLabel);

        JTextField userWeightTextField = new JTextField();
        userWeightTextField.setBounds(150, 80, 200, 30);
        jFrame.add(userWeightTextField);

        JLabel userHeightLabel = new JLabel("Enter your height in m");
        userHeightLabel.setBounds(150, 120, 200, 30);
        jFrame.add(userHeightLabel);

        JTextField userHeightTextField = new JTextField();
        userHeightTextField.setBounds(150, 150, 200, 30);
        jFrame.add(userHeightTextField);

        JButton calculatebmi = new JButton("Calculate BMI");
        calculatebmi.setBounds(150, 190, 200, 30);
        jFrame.add(calculatebmi);

        calculatebmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float weight = Float.parseFloat(userWeightTextField.getText());
                float height = Float.parseFloat(userHeightTextField.getText());
                float bmiValue = weight / (height * height);
                calculatebmi.setText(String.valueOf(bmiValue));
            }
        });

        jFrame.setLayout(null);

        // to add the size in frame
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}