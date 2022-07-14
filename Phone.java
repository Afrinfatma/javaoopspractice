package com.javaoopspractice;

import java.util.*;

class Phone{
	
	double number;
    
	public Phone (double number ) {
		this.number=number;
		
	}
	public void addMusicPlayer()
	{
		System.out.println("Music player added ");
	}
	
	 
	class SmartPhone extends Phone{
		 
		int modelno;
		public SmartPhone (double number, int modelno) {
		    super( number);
			this.modelno=modelno;
		}
		public void setCamera() {
			System.out.println("Camera features added");
		}
	}
	
	
public class Test{
    public static void main(String[] args){
    	SmartPhone sp= new SmartPhone(9523455565,9080);
    	System.out.println("sp.toString");
    	sp.addMusicPlayer();
    	sp.setCamera(); 
    }
}
}
