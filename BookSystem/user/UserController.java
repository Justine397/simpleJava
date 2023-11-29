package book.system.user;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;


public class UserController{

	public LoginView loginView;
	private UserView userView;
	


	public UserController(UserView userView){


		this.userView = userView;
		this.loginView = new LoginView();






	}



	public ActionListener getLogoutButton(JFrame tempFrame){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e ){
				tempFrame.getContentPane().removeAll();
				tempFrame.repaint();
				

				loginView.loginGui(tempFrame);
				JOptionPane.showMessageDialog(null,"logout successfully!");

				

			}


		};
	}






























}