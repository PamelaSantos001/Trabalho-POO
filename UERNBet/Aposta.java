package UERNBet;


	public class Aposta {
	    Evento evento;
	    Resultado resultado;
	    int valor;

	    public Aposta(Evento evento, Resultado resultado, int valor) {
	        super();
	        this.evento = evento;
	        this.resultado = resultado;
	        this.valor = valor;
	    }

	    public Resultado getResultado() {
	        return resultado;
	    }

	    public void setResultado(Resultado resultado) {
	        this.resultado = resultado;
	    }

	    public double calculaLucro(Evento evento) {
	        double lucro = 0;
	        Evento valorevento = null;
			if(evento.getResultado()== Resultado.TIME1) {
	            lucro=valorevento.getNum1();
	        }
	        if(evento.getResultado()== resultado.EMPATE) {
	            lucro=valorevento.getNum2();
	        }
	        if(evento.getResultado()== resultado.TIME2) {
	            lucro=valor*evento.getNum3();
	        }
	        return lucro;
	    }

	    public int getValorApostado() {
	        return valor;
	    }
	}