package com.serilazation.java;

import com.entity.Product;
import java.io.*;

public class Program01 {
	public static void main(String[] args) throws Exception{
		
		//writing products into file
		Product[] array = {
				new Product(1,"Chai",123.45),
				new Product(2,"Chang",22.4),
				new Product(3,"Sutta",23.45)
		};
		
		FileOutputStream fos = new FileOutputStream("Products.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(Product p : array) {
			oos.writeObject(p);
		}
		System.out.println("End");
		oos.close();
		fos.close();
	}
}
