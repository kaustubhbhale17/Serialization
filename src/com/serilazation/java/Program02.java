package com.serilazation.java;

import java.io.*;

public class Program02 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("Products.dat");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		
		while(true) {
			try {
				Object read = ois.readObject();
				System.out.println(read);
			}catch(EOFException e) {
				break;
			}
		}
		
		ois.close();
		fis.close();
	}
}
