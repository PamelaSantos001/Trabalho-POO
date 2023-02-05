package UERNBet;

public class Evento {


		   String nome,time1,time2;
		   double num1,num2,num3;
		   Resultado resultado;

		public Evento(String nome, String time1, String time2, double num1, double num2, double num3) {
		    super();
		    this.nome = nome;
		    this.time1 = time1;
		    this.time2 = time2;
		    this.num1 = num1;
		    this.num2 = num2;
		    this.num3 = num3;
		}

		public Resultado getResultado() {
		    return resultado;
		}

		public void setResultado(Resultado resultado) {
		    this.resultado = resultado;
		}

		public double getNum1() {
		    return num1;
		}

		public void setNum1(double num1) {
		    this.num1 = num1;
		}

		public double getNum2() {
		    return num2;
		}

		public void setNum2(double num2) {
		    this.num2 = num2;
		}

		public double getNum3() {
		    return num3;
		}

		public void setNum3(double num3) {
		    this.num3 = num3;
		}

		}