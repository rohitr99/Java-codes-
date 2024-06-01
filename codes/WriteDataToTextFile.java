package codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("C:\\Users\\91702\\rohit.txt");
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("and much more excited while learning");
	bw.write("and may more to fun");
	System.out.println("finished");
	bw.close();

	}

}
