package questaob;
/*14.19 (Imprimindo datas em vários formatos) 
As datas são impressas em vários formatos comuns. 
Dois dos formatos mais comuns em inglês são 04/25/1955 e April 25, 1955 
Elabore um aplicativo que lê uma data no primeiro formato e imprime no segundo
formato*/


import java.util.Scanner;

public class questaob 
{

    public static void main(String args[]){
    int dia,mes,ano;

    try (Scanner input = new Scanner(System.in)) {
		String mes_e[] = {"January", "February", "March", "April",
		         "May", "June", "July", "August", "September", "October",
		         "November December"};

		 System.out.println("Digite mes: enter");
		 System.out.println("Digite dia: enter");
		 System.out.println("Digite ano: enter");
  
		mes=input.nextInt();
		dia=input.nextInt();
		ano=input.nextInt();
 
		System.out.println("Você Digitou: " + mes + "/" + dia + "/" + ano); //printando nossa data depois de digitado
		System.out.println(mes_e[mes-1] +" "+ dia+", "+ano); //escrendo de forma diferente
//quando terminado o 0 irá desaparecer, pois não é considerado um mês
	}
    }
}