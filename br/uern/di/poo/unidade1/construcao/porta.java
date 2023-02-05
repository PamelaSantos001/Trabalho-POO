package br.uern.di.poo.unidade1.construcao;

public enum porta {
 
	
	private tiposdeporta portass;
	private double alt, lar;
    private boolean pivoltante;
	private final double valor = 350.00;
	private final double alturap = 1.8 , largurap = 0.7;
	
	porta () {
		this.portass = tiposdeporta.Porta_simples;	
		this.alt = alturap;
		this.lar = largurap;
		pivoltante = false;
	}
    
	
	porta(tiposdeporta portass, double alt, double lar, boolean pivoltante) {
		this.portass = portass;
		this.alt = alt;
		this.lar = lar;
		this.pivoltante = pivoltante;
		

	}


	public tiposdeporta getPortass() {
		return portass;
	}


	public void setPortass(tiposdeporta portass) {
		this.portass = portass;
	}


	public double getAlt() {
		return alt;
	}


	public void setAlt(double alt) {
		this.alt = alt;
	}


	public double getLar() {
		return lar;
	}


	public void setLar(double lar) {
		this.lar = lar;
	}


	public boolean getPivoltante() {
		return pivoltante;
	}


	public void setPivoltante(boolean pivoltante) {
		this.pivoltante = pivoltante;
	}


	public double getValor() {
		return valor;
	}


	public double getAlturap() {
		return alturap;
	}


	public double getLargurap() {
		return largurap;
	}
public double calculaPreco () 
{
	
	double soma;
	double valor = 0;
	double area;
	soma = alt * lar;
	 System.out.print(soma);

 
   
 
	
	//colocar metodo de calcular depois
	//depois calcular servico 
	//main
  	return 0;
}
	public void exibePorta () {
		System.out.println(portass.getTipodemadeira() + portass.getTipodefechadura());
		
	}

	
	
}