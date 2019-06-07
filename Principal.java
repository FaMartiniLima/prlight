package rlightpack;

import  java.io.IOException ;
import  java.nio.file.Files ;
import  java.nio.file.Paths ;
import java.util.ArrayList;

	public class Principal {
		
		public static void main(String[] args) 
		throws IOException {
			
			ArrayList<User> listaUser = new ArrayList();
			
			Files.lines(Paths.get("file.csv"))
			 	 .skip(1)
			 	 .map(line -> line.split(";"))
			 	 .map(str -> new User(str[0], str[1], Integer.parseInt(str[2]), str[3], str[4]))
			 	 .forEach(user -> listaUser.add(user));
			
			for(User user : listaUser) {
	         		System.out.println(user.getAddress() + user.getCpf() + user.getName());
	        	}
		}
	}