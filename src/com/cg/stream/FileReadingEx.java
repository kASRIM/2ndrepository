package com.cg.stream;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class FileReadingEx {	
	public static void main(String[] args) {
		try {
			FileInputStream fi= new FileInputStream("\"C:\\\\Users\\\\HP\\\\Pictures\\\\Saved Pictures\\\\.Data.txt\"");
             int ch=0;
             while(ch!=-1) {
            	 ch=fi.read();
            	 System.out.println((char) ch);
             }
/*int ch=fi.read();//reads 1 byte of data, returns -1 if it reaches End of File
			System.out.println((char)  ch);
			ch=fi.read();//reads 1 byte of data
			System.out.println((char)ch);*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


