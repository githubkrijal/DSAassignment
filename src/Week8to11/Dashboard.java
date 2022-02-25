package Week8to11;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class Dashboard {
    public static void main(String[] args) {

//        Initializing components in swing
        JButton loginBtn, registerBtn;
        JLabel titleLabel;
        JFrame f = new JFrame("Shortest Path Finder");
        loginBtn = new JButton("LOGIN");
        registerBtn = new JButton("REGISTER");
        titleLabel = new JLabel("SHORTEST PATH FINDER");
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 45));

//        Adding components to frame
        f.add(titleLabel).setBounds(40, 30, 3000, 100);
        f.add(loginBtn).setBounds(50, 150, 500, 50);
        f.add(registerBtn).setBounds(50, 250, 500, 50);

        loginBtn.addActionListener(e -> {
            f.dispose();
            new LoginFrame();
        });

        registerBtn.addActionListener(e -> {
            new RegisterFrame();
            f.dispose();
        });

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setBounds(200, 120, 600, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.getContentPane().setBackground( Color.decode("#8075D5") );

    }
}