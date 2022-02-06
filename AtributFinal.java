public class AtributFinal{
	final int x = 6;

	public static void main(String[] args){
		AtributFinal objec1 = new AtributFinal();
		objec1.x = 8; // hasilnya akan error karena dia memakai final
		System.out.println(objec1.x);
	}
}