package com.example.demo.converter;

import com.example.demo.dto.ParcelaDto;
import com.example.demo.entity.Parcela;


public class ParcelaConverter {
	public static Parcela dtoToEntity(ParcelaDto ParcelaDto) {
		Parcela Parcela = new Parcela( null, ParcelaDto.getValor());
		Parcela.setParcelaId(ParcelaDto.getParcelaId());
		return Parcela;
	}

	public static ParcelaDto entityToDto(Parcela parcela) {
		return new ParcelaDto(parcela.getParcelaId(),parcela.getValor());
	}
}
