import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
	/*
		We can store n-number of size elements in Vectors
		since there is no limit 
	*/	
	public static void main(String[] args) throws Exception {		
		Vector<String> vec = new Vector<String>();
		String data = fileAsString("../data/day3.txt");
		String[] rows = data.split("\n");
		for (String w : rows) {
			vec.add(w);
		}
		// the text is divided into 11 elements
		// now we have to vec[i+1][j+3] replace  
		// the char for O if == . or X if == #
		Iterator<String> itr = vec.iterator();
		while(itr.hasNext()){
			itr.next();
		System.out.println(its.get(1));
		}
		// bufferR();	
	}	
		// Reading a text file as a string
	public static String fileAsString(String fileName) throws Exception{
		String data = "";
		data = new String (Files.readAllBytes(Paths.get(fileName)));
		return data;
	}
}