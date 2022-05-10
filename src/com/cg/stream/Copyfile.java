package com.cg.stream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {
	public static void main(String[]args) {
		FileInputStream io=null;
		FileOutputStream op=null;

			try {
				FileInputStream fi= new FileInputStream("\"C:\\\\Users\\\\HP\\\\Pictures\\\\Saved Pictures\\\\.Data.txt\"");
	           FileInputStream f0=new   FileInputStream("C:\\Users\\HP\\Pictures\\Saved Pictures\\\\.Data.txt\"");
	            int ch=0;
	             while((ch-io.read())!=-1){
	            	 op.write((char)ch);
	             }
	            	 System.out.println("copy text");
	             }
			
	             catch(FileNotFoundException e) {
	            	 e.printStackTrace();
	            	 
	             } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            	 
	             
		}
	}
            

