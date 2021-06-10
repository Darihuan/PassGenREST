package com.example.demo.service;

import com.example.demo.model.Especifications;
import com.example.demo.model.Password;

public interface BaseService <E extends Password>{
	
	E generatePassword(Especifications espec);
	

}
