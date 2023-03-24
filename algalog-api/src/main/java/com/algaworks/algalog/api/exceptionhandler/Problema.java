package com.algaworks.algalog.api.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class Problema {

	private Integer status;
	private OffsetDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	@AllArgsConstructor
	@Getter
	public static class Campo {
		
		public Campo(String nome2, String mensagem2) {
			// TODO Auto-generated constructor stub
		}
		private String nome;
		private String mensagem;
		
	}

	public void setStatus(int value) {
		// TODO Auto-generated method stub
		
	}

	public void setDataHora(OffsetDateTime now) {
		// TODO Auto-generated method stub
		
	}

	public void setTitulo(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCampos(List<Campo> campos2) {
		// TODO Auto-generated method stub
		
	}
	
}
