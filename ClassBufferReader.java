import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassBufferReader{
	public static void main(String[] args) throws IOException{
		String nama;

		//objek inputstream
		InputStreamReader isr = new InputStreamReader(System.in);

		// membuat objek buffrered reader
		BufferedReader br = new BufferedReader(isr);

		//mengisi varibale dengan nama
		System.out.print("Inputkan nama: ");
		nama = br.readLine();

		System.out.println("Nama kamu adalah " + nama);
	}
}