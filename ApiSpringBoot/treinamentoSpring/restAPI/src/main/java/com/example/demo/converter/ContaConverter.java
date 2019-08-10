package com.example.demo.converter;

import java.util.stream.Collectors;

import com.example.demo.dto.ContaDto;
import com.example.demo.entity.Conta;

public class ContaConverter {
	public static Conta dtoToEntity(ContaDto contaDto) {
		Conta user = new Conta(contaDto.getDescricao(), null,contaDto.getMes(), contaDto.getTipoConta(), contaDto.getStatusConta(), contaDto.getValor(), contaDto.getParcela());
		user.setContaId(contaDto.getUserId());
		user.setSkills(contaDto.getParcelasDto().stream().map(ParcelaConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static ContaDto entityToDto(Conta conta) {
		ContaDto contaDto = new ContaDto(conta.getContaId(), conta.getDescricao(), null, conta.getMes(), conta.getTipoConta(), conta.getStatusConta(), conta.getValor(), conta.getParcela());
		contaDto.setParcelasDto(conta.getParcelas().stream().map(ParcelaConverter::entityToDto).collect(Collectors.toList()));
		return contaDto;
	}
}
