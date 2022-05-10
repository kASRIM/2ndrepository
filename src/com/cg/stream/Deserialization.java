package com.cg.stream;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class Deserialization { 
	public static void main(String[] args) {
		ObjectInputStream objInp=null;
		FileInputStream fi=null;
		try {
			fi=new FileInputStream("C:\\Users\\HP\\Pictures\\Serialization\\ emp.ser");
			objInp=new ObjectInputStream(fi);
			Employee e=(Employee) objInp.readObject();
				System.out.println("Object restored back.....");
				System.out.println(e.getName()+"\t"+e.getAddress());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
	}
	
