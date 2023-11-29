package book.system.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;




class Login {


	public String LoginFileHandling(String lUsername , String lPassword){
		try(BufferedReader reader = new BufferedReader(new FileReader("D:\\Downloads(2)\\For Programming\\BookSystem\\database\\users.dat"))){

			String line;

			if((line = reader.readLine() ) !=null){
				String[] parts = line.split(", ");

				String username = parts[1];
				String password = parts[2];
				String name = parts[0];

				if (lUsername.equals(username) && lPassword.equals(password)){
					return name;
				}





			}	
				
			



		}catch (IOException e){
			e.printStackTrace();
		}

		return null;



	}






}