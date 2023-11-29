package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.register.RegisterView;
import book.system.user.UserView;





public class LoginController{

	private Login login;
	public LoginView loginView;
	public RegisterView registerView;
	public UserView userView;


	public LoginController(LoginView loginView){

		this.loginView = loginView;
		this.registerView = new RegisterView();
		this.login = new Login();
		this.userView = new UserView();

	}



	public ActionListener getLoginButton(JFrame tempFrame,TextField getUsername,JPasswordField pass){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){

				String getUser = getUsername.getText();
				String getPass = new String (pass.getPassword());

				

				if(getUser.isEmpty() || getPass.isEmpty()){
					
					JOptionPane.showMessageDialog(null,"Please Fill up all Before Login");

				}else{

					String displayname = login.LoginFileHandling(getUser,getPass);

					if(displayname != null){
					
					tempFrame.getContentPane().removeAll();
					tempFrame.repaint();
					userView.userGui(tempFrame,displayname);



					JOptionPane.showMessageDialog(null,"login");
				}
				else{
						JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
				}




				}












			}






		};
	}







	public ActionListener getRegisterButton(JFrame tempFrame){
		return new ActionListener(){

			public void actionPerformed(ActionEvent e){
					tempFrame.getContentPane().removeAll();
					tempFrame.repaint();


					registerView.RegisterGui(tempFrame);


			}






		};
	}

















}