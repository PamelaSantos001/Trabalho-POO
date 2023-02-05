package questao4;

public class Bola {

	ParOrdenado posicaodocentro;
	private int vh;
	private int  vv;
	private double raio;
   
public ParOrdenado getPc() {
		return posicaodocentro;
	}
	public void setPc(ParOrdenado pc, ParOrdenado posicaodocentro) {
		this.posicaodocentro = posicaodocentro;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
public int getVh() {
		return vh;
	}
	public void setVh(int vh) {
		this.vh = vh;
	}
	public int getVv() {
		return vv;
	}
	public void setVv(int vv) {
		this.vv = vv;
	}
		public Bola(ParOrdenado pc, int vh, int vv, double raio, ParOrdenado posicaodocentro) {
				super();
				this.posicaodocentro = posicaodocentro;
				this.vh = vh;
				this.vv = vv;
				this.raio = raio;
		}
		public void movimento() {
			posicaodocentro.setX(posicaodocentro.getX() + vh); 
			posicaodocentro.setY(posicaodocentro.getY() + vv); 
            
		}
   
}

