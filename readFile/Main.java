import java.io.*;
import java.nio.file.*;

public class Main {
	/*
		There are many type of file reader 
		FileReader, BufferReader, Scanner
	*/	
	public static void main(String[] args) throws Exception {		
		String data = fileAsString("day3.txt");
		System.out.println(data);
		// bufferR();	
	}	
	/*
		Reading a text file as a string
	*/
	public static String fileAsString(String fileName) throws Exception{
		String data = "";
		data = new String (Files.readAllBytes(Paths.get(fileName)));
		return data;
	}
	/*
		Each read request to be made of the underlying 
		character or byte stream.
		Wrap a bufferReader around any Reader who read()
		may be costly, such as FileReader and inputStreamReaders
	*/
	public static void bufferR() throws Exception {
		File file = new File("day3.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while( (st = br.readLine()) != null)
			System.out.println(st);
	}
}