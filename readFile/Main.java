import java.io.*;
/*
	There are many type of file reader 
	FileReader, BufferReader, Scanner
*/
class Main {
	public static void main(String[] args) throws Exception {		
		bufferR();	
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