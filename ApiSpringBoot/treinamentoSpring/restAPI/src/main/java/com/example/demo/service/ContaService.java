package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ContaDto;


public interface ContaService {
    ContaDto getUserById(Integer contaId);
    void saveUser(ContaDto contaDto);
    List<ContaDto> getAllUsers();
    List<ContaDto> getUserByMes(String mes);
	public void persistOrMerge(ContaDto contaDto) ;
	public void delete(ContaDto contaDto);

}
