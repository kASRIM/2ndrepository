package com.cg.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriteEX1 {
	public static void main(String[]args) {
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Users\\HP\\Pictures\\Saved Pictures\\.Data.txt");
			fo.write('a');
			fo.write('b');
			fo.write('c');
			fo.write('d');
			System.out.println("done");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}
			
		
	}

}
