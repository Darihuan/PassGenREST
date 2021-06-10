package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Especifications;
import com.example.demo.model.Password;
@Service
public class PasswordService implements BaseService<Password> {

	
	public Password generatePassword( Especifications espec) {
		Integer largo=espec.getLargo();
		boolean especialchars=espec.isEspecialChars();
		boolean mayuschars=espec.isMayusChars();
		boolean numbers=espec.isNumbers();
		String stringpass="";
		while(stringpass.length()<largo) {
			stringpass+=randomchar(especialchars,mayuschars,numbers);
		}
		Password generate=new Password(stringpass);
				
		
		return generate;
	}
	
	private char randomchar(boolean especialchars,boolean mayuschars,boolean numbers) {
		int opcion=randomnumber(4);
		if(opcion==1 &&especialchars==true) {
			return randomespecialchar();
		}
		else if(opcion==2&&mayuschars==true){
			return randommayuschar();
		}
		else if(opcion==3&& numbers==true) {
			return (char) randomnumberchar();
		}else {
			return randomchar();
		}
		
	}
	private char randomnumberchar() {
		String numbers="0123456789";
		char random=numbers.charAt(randomnumber(numbers.length()));
		return random;
	}

	private char randomchar() {
		
		String universe="abcdefghifklmnopqrstuvwxyz";
		char random=universe.charAt(randomnumber(universe.length()));
		return random;
	}

	public char randomespecialchar() {
		String especialuniverse="!#$%&*@";
		char random=especialuniverse.charAt(randomnumber(especialuniverse.length()));
		return random;
	}

	private char randommayuschar() {
		String universe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char random=universe.charAt(randomnumber(universe.length()));
		return random;
	}
	

	public int randomnumber(int limite) {
		
		return (int) Math.floor(Math.random()*limite);
	}
	
	
	
	
	
	

}
