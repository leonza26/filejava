import java.util.*;

public class LuasSegitiga{
	public static void main(String[] args){

		// type data
		double luas;
		int alas, tinggi;

		Scanner kon = new Scanner(System.in);

		System.out.println("----Menghitung Luas Segitiga Dengan Konversi----\n");

		System.out.print("Masukkan nilai alas   : ");
		alas = kon.nextInt();

		System.out.print("Masukkan nilai tinggi : ");
		tinggi = kon.nextInt();

		//hasil
		luas = Double.valueOf((alas * tinggi) /2 );

		//output
		System.out.print("Luas = " + luas);
	}
}