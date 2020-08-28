package br.com.projetoempregobackend.model.dto;

import lombok.Data;

public @Data class JobDto {
	
	public JobDto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	private int id;
	private String descricao;
	
}
