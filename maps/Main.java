import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws Exception {		

		String data = fileAsString("../data/day4.txt");
		String[] rows = data.split("\n\r");

		String[] fields = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid", "cid"}; 
		int ln = rows.length;
		Map<String, Boolean> hm = new HashMap<String, Boolean>(ln-1); 
  	
  	String[] dataArr;
	  	// encontrar cuando haya dos puntos : y colocar , 
  		// iterate through each of the fileds
  		// and check if fields[all] word is there
		System.out.println(rows.length);
  	String[] regx;
  	for (int i = 0; i < rows.length; ++i) {
	  	regx = new String[rows.length];
  		for (int j = 0; j < fields.length; ++j) {
		  	regx[i] = rows[i].replaceAll("[:]", ",");
		  	dataArr = regx[i].split(",");
		  	// now we have an array of strings
		  	// we just have to check if the fileds are there
				Pattern pat = Pattern.compile(fields[j]);
  			Matcher found = pat.matcher(rows[i]);
  			if (found.find()) {
			    hm.put(fields[j], new Boolean(true)); 
		  	} else {
			    hm.put(fields[j], new Boolean(false)); 
		  	}	  	
  		}
  			System.out.println(hm); 
  		// After cheking all the fileds, add each row to another collection
  	}
    // Traversing through the map 
    // for (Map.Entry<String, Boolean> me : hm.entrySet()) { 
    //     System.out.print(me.getKey() + ":"); 
    //     System.out.println(me.getValue()); 
    // } 
	
		// System.out.println(Arrays.toString(rows));
		
	}	
		// Reading a text file as a string
	public static String fileAsString(String fileName) throws Exception{
		String data = "";
		data = new String (Files.readAllBytes(Paths.get(fileName)));
		return data;
	}
}