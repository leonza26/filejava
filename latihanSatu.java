import java.util.Scanner;

public class latihanSatu{
	static void luasSegitiga(){

	int alas, tinggi, hasil;

	Scanner input = new Scanner(System.in);

	System.out.println("------Operasi Luas Segitiga-------\n");

	System.out.print("Masukkan nilai alas    : ");
	alas = input.nextInt();

	System.out.print("Masukkan nilai tinggi  : ");
	tinggi = input.nextInt();

	hasil = alas * tinggi / 2;

	System.out.println();
	System.out.println("hasil dari luas segitiga adalah: " + hasil);
	System.out.println("Selamat Operasi Kamu Berhasil....");


	}

	public static void main(String[] args){
		luasSegitiga();

	}
}