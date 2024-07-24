import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JTextField txtGreeting = new JTextField();
        txtGreeting.setBounds(100, 60, 180, 30);
        panel.add(txtGreeting);

        JTextField txtGrade = new JTextField();
        txtGrade.setBounds(100, 100, 180, 30);
        panel.add(txtGrade);

        JButton myButton = new JButton("Greeting");
        myButton.setBounds(100, 150, 100, 40);
        panel.add(myButton);

        JLabel labename = new JLabel("Name:");
        labename.setBounds(30, 60, 80, 25);
        panel.add(labename);

        JLabel labegrade = new JLabel("Grade:");
        labegrade.setBounds(30, 100, 80, 25);
        panel.add(labegrade);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String name = txtGreeting.getText();
                String gradetext = txtGrade.getText();
                int grade;

                try {
                    grade = Integer.parseInt(gradetext);
                    String gradeletter = Model.getGrade(grade);
                    JOptionPane.showMessageDialog(null,
                            "Hello: " + Model.name(name) + "\nYour grade is " + gradeletter);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input for grade.");
                }
            }
        });

        frame.setVisible(true);
    }
}