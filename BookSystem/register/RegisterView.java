package booksystem.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegisterView {
    public void RegGui(){

        JFrame frame;
        frame = new JFrame("Book System");
        frame.setSize(400, 400);
        frame.setLayout(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel2 = new JPanel();
        panel2.setSize(400,400);
        panel2.setLayout(null);
        frame.add(panel2);

        JLabel titleReg = new JLabel("REGISTER");
        titleReg.setBounds(150, 10, 150, 75);
        titleReg.setFont(new Font("Tahoma",Font.BOLD, 18));
        panel2.add(titleReg);

        JLabel nameLab = new JLabel("NAME: ");
        nameLab.setBounds(30, 100, 150, 20);
        nameLab.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel2.add(nameLab);

        JTextField nameInput = new JTextField();
        nameInput.setBounds(90, 100, 250, 25);
        panel2.add(nameInput);
        
        JLabel usernameLab = new JLabel("USERNAME: ");
        usernameLab.setBounds(7, 140, 150, 20);
        usernameLab.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel2.add(usernameLab);

        JTextField usernInput = new JTextField();
        usernInput.setBounds(90, 140, 250, 25);
        panel2.add(usernInput);

        JLabel passLab = new JLabel("PASSWORD:");
        passLab.setBounds(7, 180, 150, 20);
        passLab.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel2.add(passLab);

        JTextField passwordInput = new JTextField();
        passwordInput.setBounds(90, 180, 250, 25);
        panel2.add(passwordInput);

        JButton regBtn = new JButton("REGISTER", null);
        regBtn.setBounds(250, 300, 100, 30);
        panel2.add(regBtn);

        JButton cancelBtn = new JButton("CANCEL", null);
        cancelBtn.setBounds(130, 300, 100, 30);
        panel2.add(cancelBtn);

        frame.setVisible(true);
    }
}