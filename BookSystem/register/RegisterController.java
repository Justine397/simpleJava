package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;
import java.io.*;






public class RegisterController{

	private RegisterView registerView;
	private Register register;
	public LoginView loginView = new LoginView();


	

	public RegisterController(RegisterView registerView){
		this.registerView = registerView;
		this.register = new Register();


	}



	public ActionListener getRegisterBtn(JFrame tempFrame,TextField nameText,TextField usernameText,JPasswordField passwordText){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){
				String getName = nameText.getText();
				String getUsername = usernameText.getText();
				String getPassword = new String(passwordText.getPassword());


				if (getName.isEmpty() || getUsername.isEmpty() || getPassword.isEmpty()){
					JOptionPane.showMessageDialog(tempFrame,"Please fill up all before Register");
				}

				else{

					
						



					register.registerFileHandling(getName,getUsername,getPassword);
								tempFrame.getContentPane().removeAll();
								tempFrame.repaint();
				
							loginView.loginGui(tempFrame);
													}



				




			

}

		};
	
}









	public ActionListener getCancelBtn(JFrame tempFrame){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){
				tempFrame.getContentPane().removeAll();
				tempFrame.repaint();
				
				loginView.loginGui(tempFrame);
				

				

			}



		};
	}












}