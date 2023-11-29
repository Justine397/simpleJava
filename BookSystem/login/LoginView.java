package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class LoginView {



	



	private LoginController LController;




	public void loginGui(JFrame guiFrame){





		LController = new LoginController(this);


		
			
		JPanel loginPanel = new JPanel();



		loginPanel.setSize(400,500);
		loginPanel.setBackground(new Color(22, 64, 214));
		loginPanel.setLayout(null);
		


		JLabel loginUsernameLabel = new JLabel("Username");
		loginUsernameLabel.setBounds(40,120,300,26);

		loginPanel.add(loginUsernameLabel);


		TextField loginUsernameText = new TextField();
		loginUsernameText.setBounds(40,150,300,26);

		loginPanel.add(loginUsernameText);






		JLabel loginPasswordLabel = new JLabel("Password");
		loginPasswordLabel.setBounds(40,220,300,26);
		loginPanel.add(loginPasswordLabel);


		JPasswordField loginPasswordText = new JPasswordField();
		loginPasswordText.setBounds(40,250,300,26);
		loginPanel.add(loginPasswordText);






		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(130,320,120,30);
		loginBtn.addActionListener(LController.getLoginButton(guiFrame,loginUsernameText,loginPasswordText));
		loginPanel.add(loginBtn);



		JButton loginRegisterBtn = new JButton("Register");
		loginRegisterBtn.setBounds(130,380,120,30);
		loginRegisterBtn.addActionListener(LController.getRegisterButton(guiFrame));
		loginPanel.add(loginRegisterBtn);






		guiFrame.add(loginPanel);








			





	}









}