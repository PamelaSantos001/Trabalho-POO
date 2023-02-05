package questao1;

import java.util.Scanner;

public class questaoA {

	public static void main(String[] args) {
		System.out.println("Digite uma palavra de 5 letras" );
		Scanner sc = new Scanner(System.in);
		String a = sc.next();	
	
		if (a.length()  == 5) {
			System.out.println("Palavra aceita");
			char[] pl = a.toCharArray();
			for (int i=0; i< 5 ; i++) {
				for (int j = 0; j < 5 ; j++) {
					for (int k = 0; k < 5 ; k++){
						if (!(i == j || j == k || i==k)) { 
						System.out.print(pl [i]);
						System.out.print(pl [j]);
						System.out.print(pl [k]);		
						System.out.println("");
						}			
					}
				}
			}	
			
				
			}
					
      
                           
     
				
else { 
			System.out.println("Digite novamente"); 
	
	}
	
	}

}