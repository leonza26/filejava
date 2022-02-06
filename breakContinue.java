public class breakContinue{

	// break for
	static void aku(){

	for ( int i = 0; i < 7 ; i++){
		if (i == 4){
			break;
		}
		System.out.println(i);
	}System.out.println();
}

	// continue for
	static void kamu(){

	for ( int i = 0; i < 7 ; i++){
		if (i == 4){
			continue;
		}
		System.out.println(i);
	}
		System.out.println();
	}


	public static void main(String args[]){
		aku();
		kamu();
		
		int i = 0;
		while (i < 4){
			System.out.println(i);
			i++;
			if (i==2){
				break;
			}
		}
		while (i < 4){
			System.out.println(i);
			i++;
			if (i==2){
				continue;
			}
		}

	}
}