class Handphone{
	protected String one = "Infinix";
	public void menu(){
		System.out.println("---HP Andalan 2021");
	}
}

	class Infinix extends Handphone{
	private String two = "HP yang keren!!!";

	public static void main(String[] args){


		Infinix myInfinix = new Infinix();

		
		myInfinix.menu();

		System.out.println(myInfinix.one + "" + myInfinix.two);
	}

}