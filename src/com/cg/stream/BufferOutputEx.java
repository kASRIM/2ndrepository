package com.cg.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputEx {
	public static void main(String[]args) {
		FileOutputStream fo =null;
		BufferedOutputStream buffer=null;
		try {
			fo =new FileOutputStream("C:\\Users\\HP\\Pictures\\Saved Pictures.Buffer.txt");
		    buffer=new BufferedOutputStream(fo);
			buffer.write('a');
			buffer.write('b');
			buffer.write('c');
			buffer.write('d');
			buffer.write('e');
			//System.out.println(5/0);//
			buffer .write('f');
			buffer.write('g');
			buffer.close();
			System.out.println("done...");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
	finally {
		try {
			buffer.close();
		}catch(IOException e) {
			e.printStackTrace();
		
		
	}
		
	}

	}
}

