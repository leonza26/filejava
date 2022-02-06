public class forLoop{
	static void fl(){
		for (int i = 0; i <= 5; i++) {
		System.out.println(i);
	}
	}
	static void fa(){
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
	}

public static void main(String[] args){

	fl();
	fa();
}
}