package book.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;

public class GuiFrame extends JFrame{

    public LoginView loginView;
    


    public GuiFrame(){

        setTitle("Book System");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginView = new LoginView();
        

        loginView.loginGui(this);
        
        setVisible(true);

    }
}