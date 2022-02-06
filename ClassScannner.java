import java.util.Scanner;

public class ClassScannner{

	public static void main(String[] args){
		String nama, nim;
		int usia;

		Scanner input = new Scanner(System.in);

		System.out.println("Berikut adalah nama Mahasiswa Universitas Riau");
		System.out.print("Berikut adalah namanya: ");
		nama = input.nextLine();

		System.out.println();
		System.out.print("Silahkan masukkan nim: ");
		nim = input.nextLine();

		System.out.println();
		System.out.print("Masukkan usia Anda: ");
		usia = input.nextInt();

		//deklarasikan semua


		System.out.println("-------------------");
		System.out.println("Nama Mahasiswa: " + nama);
		System.out.println("Nim: " + nim);
		System.out.println("Usia: " + usia);
		


	}
}