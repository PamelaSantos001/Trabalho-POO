package br.uern.di.poo.unidade1.construcao;

public enum tiposdeporta {
	
	Porta_simples("feita  de madeira compensada", "com fechadura simples", 50.00),
	Porta_padrao("feita de madeira andiroba", "com fechadura de encaixe", 140.00),
	Porta_luxo("feita de madeira ipê", "com fechadura do tipo tetra", 350.00);
	
public String getTipodemadeira() {
		return tipodemadeira;
	}
	public void setTipodemadeira(String tipodemadeira) {
		this.tipodemadeira = tipodemadeira;
	}
	public String getTipodefechadura() {
		return tipodefechadura;
	}
	public void setTipodefechadura(String tipodefechadura) {
		this.tipodefechadura = tipodefechadura;
	}
	public double getValormadeiras() {
		return valormadeiras;
	}
	public void setValormadeiras(double valormadeiras) {
		this.valormadeiras = valormadeiras;
	}
private String tipodemadeira, tipodefechadura; 
private double valormadeiras;
private tiposdeporta(String tipodemadeira, String tipodefechadura, double valormadeiras) {
	this.tipodemadeira = tipodemadeira;
	this.tipodefechadura = tipodefechadura;
	this.valormadeiras = valormadeiras;
}

	
	
	
	


}



