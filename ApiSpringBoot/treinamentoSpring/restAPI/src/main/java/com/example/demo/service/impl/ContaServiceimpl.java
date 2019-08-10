package com.example.demo.service.impl;

import com.example.demo.converter.ContaConverter;
import com.example.demo.dto.ContaDto;
import com.example.demo.repository.ContaRepository;
import com.example.demo.service.ContaService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceimpl implements ContaService {
	@Autowired
	ContaRepository contaRepository;

	@Override
	public ContaDto getUserById(Integer contaId) {
		return ContaConverter.entityToDto(contaRepository.getOne(contaId));
	}

	@Override
	public void saveUser(ContaDto contaDto) {
		contaRepository.save(ContaConverter.dtoToEntity(contaDto));
	}

	@Override
	public List<ContaDto> getAllUsers() {
		return contaRepository.findAll().stream().map(ContaConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public List<ContaDto> getUserByMes(String mes) {
		// TODO Auto-generated method stub
		return contaRepository.findAll().stream().map(ContaConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public void persistOrMerge(ContaDto contaDto) {
		contaRepository.save(ContaConverter.dtoToEntity(contaDto));
		
	}

	@Override
	public void delete(ContaDto contaDto) {
		contaRepository.delete(ContaConverter.dtoToEntity(contaDto));		
	}
}
