public class myMethod{
	// method standard(level 1)
	static void kuyang(){
		System.out.println("Leonza Ganteng");
	}

	// method untuk menambah nilai string (level 2 method)
	static void lumba(String namalengkap, int tinggi){
		System.out.println(namalengkap + " Leonza " + tinggi);
	}
	//method untuk memasukkan nilai x (level3 method)
	static int myMethod(int x) {
  		return 5 + x;
}
//Create a checkAge() method with an integer variable called age (level 4)
	static void checkAge (int age) {

  // If age is less than 18, print "Access denied"
  
	if (age < 18) {
    System.out.println("Access denied"); 

  // If age is greater than, or equal to, 18, print "Access granted"
  } 
	else {
    System.out.println("Access granted"); 
  }

}
	public static void main(String[] args){
		kuyang();
		lumba("Muhammad ", 176);
		System.out.println(myMethod(3));
		checkAge(7);

	}
}