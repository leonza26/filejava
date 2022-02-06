import java.io.Console;

public class classConsole{

	public static void main(String[] args){

		String nama;
		int usia;

		//membuat scan console
		Console input = System.console();

		//kita cobak input
		System.out.print("nama: ");
		nama = input.readLine();

		System.out.print("Usia: ");
		usia = Integer.parseInt(input.readLine());

		System.out.println("nama kamu adalah: " + nama);
		System.out.print("Usia kamu adalah: " + usia + " tahun");
	}
}