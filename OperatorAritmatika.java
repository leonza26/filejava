import java.util.*;

public class OperatorAritmatika{
	public static void main(String[] args){

		//type data
		int angka1, angka2, hasil;

		Scanner input = new Scanner(System.in);

		System.out.println("---operasi penjumlahan---\n");
		System.out.print("masukkan angka1 : ");
		angka1 = input.nextInt();
		System.out.print("masukkan angka2 : ");
		angka2 = input.nextInt();

		// pertambahan
		hasil = angka1 + angka2;
		System.out.println("hasil = " + hasil);
		System.out.println();

		System.out.println("---operasi pengurangan---\n");
		System.out.print("masukkan angka1 : ");
		angka1 = input.nextInt();
		System.out.print("masukkan angka2 : ");
		angka2 = input.nextInt();

		// pengurangan
		hasil = angka1 - angka2;
		System.out.println("hasil = " + hasil);
		System.out.println();

		System.out.println("---operasi perkalian---\n");
		System.out.print("masukkan angka1 : ");
		angka1 = input.nextInt();
		System.out.print("masukkan angka2 : ");
		angka2 = input.nextInt();

		// perkalian
		hasil = angka1 * angka2;
		System.out.println("hasil = " + hasil);
		System.out.println();

		System.out.println("---operasi pembagian---\n");
		System.out.print("masukkan angka1 : ");
		angka1 = input.nextInt();
		System.out.print("masukkan angka2 : ");
		angka2 = input.nextInt();

		// pembagian
		hasil = angka1 / angka2;
		System.out.println("hasil = " + hasil);
		System.out.println();

		System.out.println("---operasi modulus---\n");
		System.out.print("masukkan angka1 : ");
		angka1 = input.nextInt();
		System.out.print("masukkan angka2 : ");
		angka2 = input.nextInt();

		// sisa bagi
		hasil = angka1 % angka2;
		System.out.println("hasil = " + hasil);
	}
}