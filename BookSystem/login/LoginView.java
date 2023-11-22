package booksystem.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginView {
    
    public static void main(String args[]){
    
        JFrame frame;
        frame = new JFrame("Book System");
        frame.setSize(400,400);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panelLogin = new JPanel();
        panelLogin.setSize(400,400);
        panelLogin.setLayout(null);
        frame.add(panelLogin);

        JLabel title = new JLabel("LOGIN");
        title.setBounds(150, 10, 75, 75);
        title.setFont(new Font("Tahoma", Font.BOLD, 18));
        panelLogin.add(title);

        JLabel userName = new JLabel("USERNAME");
        userName.setBounds(30, 100, 150, 20);
        userName.setFont(new Font("Tahoma", Font.BOLD, 18));
        panelLogin.add(userName);

        JTextField userInput = new JTextField();
        userInput.setBounds(30, 125, 300, 25);
        panelLogin.add(userInput);

        JLabel passWord = new JLabel("PASSWORD");
        passWord.setBounds(30, 159, 150, 20);
        passWord.setFont(new Font("Tahoma", Font.BOLD, 18));
        panelLogin.add(passWord);
        
        JTextField passInput = new JTextField(null,null, 0);
        passInput.setBounds(135,230,100,30);
        panelLogin.add(passInput);

        JButton logBTN = new JButton("LOGIN", null);
        logBTN.setBounds(135, 230, 100, 30);
        panelLogin.add(logBTN);

        JButton regBTN = new JButton("REGISTER", null);
        regBTN.setBounds(135, 270, 100, 30);
        panelLogin.add(regBTN);

        frame.setVisible(true);
    }
}