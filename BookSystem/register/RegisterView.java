package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class RegisterView {

	private RegisterController rController;
	




	public void RegisterGui(JFrame tempFrame){

		rController = new RegisterController(this);


			
		JPanel registerPanel = new JPanel();

		registerPanel.setSize(400,500);
		registerPanel.setBackground(new Color(232,209,132));
		registerPanel.setLayout(null);






		JLabel registerNameLabel = new JLabel("Name");
		registerNameLabel.setBounds(40,50,300,26);

		registerPanel.add(registerNameLabel);


		TextField registerNameText = new TextField();
		registerNameText.setBounds(40,80,300,26);

		registerPanel.add(registerNameText);




		


		JLabel registerUsernameLabel = new JLabel("Username");
		registerUsernameLabel.setBounds(40,120,300,26);

		registerPanel.add(registerUsernameLabel);


		TextField registerUsernameText = new TextField();
		registerUsernameText.setBounds(40,150,300,26);

		registerPanel.add(registerUsernameText);






		JLabel registerPasswordLabel = new JLabel("Password");
		registerPasswordLabel.setBounds(40,220,300,26);
		registerPanel.add(registerPasswordLabel);


		JPasswordField registerPasswordText = new JPasswordField();
		registerPasswordText.setBounds(40,250,300,26);
		registerPanel.add(registerPasswordText);






		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(130,320,120,30);
		registerBtn.addActionListener(rController.getRegisterBtn(tempFrame,registerNameText,registerUsernameText,registerPasswordText));
		registerPanel.add(registerBtn);



		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(130,380,120,30);
		cancelBtn.addActionListener(rController.getCancelBtn(tempFrame));


		registerPanel.add(cancelBtn);






		tempFrame.add(registerPanel);








			





	}









}