package questao4;

public class CampoRetangular {

	private ParOrdenado pcsec; //posicao do canto superior esquerdo do campo
	private double altura, largura;//, cima, baixo;
	private Bola umabolasemovendo;// uma bola esta se movendo nesse campo
	public CampoRetangular(ParOrdenado pcsec, double altura, double largura, Bola umabolasemovendo) {
		super();
		this.pcsec = pcsec;
		this.altura = altura;
		this.largura = largura;
		this.umabolasemovendo = umabolasemovendo;
	}
	public boolean bolaTocaBordaEsquerda () {	
		if (umabolasemovendo.getPc().getX()- umabolasemovendo.getRaio() >= this.altura-2) {
			return true;
		}
		return false;
	}
	public boolean BolaTocaDireita () {
		if (umabolasemovendo.getPc().getX()+ umabolasemovendo.getRaio() >= this.largura/2) {
			return true;
		}
			return false;
		}
	public boolean  BolaTocaBordaSuperior() {
		if (umabolasemovendo.getPc().getY()+ umabolasemovendo.getRaio() >= this.altura/2){
			
			return true;
		}
		return false;
	}
  
	public boolean bolaTocaBordaBaixo () {
		if (umabolasemovendo.getPc().getX()- umabolasemovendo.getRaio() >= this.largura-2) {
			return true;
		}
		
		return true;
	}
     public void Movimentabola() {
    	 	umabolasemovendo.movimento();
    	 	if (bolaTocaBordaBaixo()){
    	 		umabolasemovendo.setVv(umabolasemovendo.getVv()*-1);
    	 		
    	 	}
    	 	if (BolaTocaBordaSuperior()) {
    	 		umabolasemovendo.setVv(umabolasemovendo.getVv()*1);
    	 	}
    	 	if (BolaTocaDireita()) {
    	 		umabolasemovendo.setVh(umabolasemovendo.getVh()*-1);		
    	
    	 	if (bolaTocaBordaEsquerda()) {
    	 		umabolasemovendo.setVh(umabolasemovendo.getVh()*1);
    	 	}
    	 		
    	 	}
     }
	public ParOrdenado getPcsec() {
		return pcsec;
	}
	public void setPcsec(ParOrdenado pcsec) {
		this.pcsec = pcsec;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public Bola getUmabolasemovendo() {
		return umabolasemovendo;
	}
	public void setUmabolasemovendo(Bola umabolasemovendo) {
		this.umabolasemovendo = umabolasemovendo;
		
	}
	
	
   }

