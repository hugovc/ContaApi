package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ParcelaDto;
import com.example.demo.dto.ContaDto;
import com.example.demo.service.ContaService;
import com.example.demo.utils.Constants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value= "API REST CONTA")
@RequestMapping("/conta")
@RestController
public class ContaController {
	@Autowired
	ContaService contaService;
    
	@ApiOperation("BUSCA CONTA PELO ID")
	@RequestMapping(Constants.GET_CONTA_BY_ID)
	public ContaDto getUserById(@PathVariable Integer userId) {
		return contaService.getUserById(userId);
	}
    
	@ApiOperation("LISTA  CONTAS AS CONTAS")
	@RequestMapping(Constants.GET_ALL_CONTAS)
	public List<ContaDto> getAllUsers() {
		return contaService.getAllUsers();
	}
    @ApiOperation("SALVA AS CONTAS")
	@RequestMapping(value= Constants.SAVE_CONTA, method= RequestMethod.POST)
	public void saveConta(@RequestBody ContaDto contaDto) {
		contaService.saveUser(contaDto);
	}
	
    @ApiOperation("BUSCA CONTA PELO MES")
	@RequestMapping(Constants.GET_CONTA_BY_MES)
	public Double getContaByMes(@PathVariable String mes) {
		Double somaApagar = 0.0;
		Double somaAReceber = 0.0;
		Double saldo = 0.0;
		List<ContaDto> listaContas= contaService.getUserByMes(mes);

		for (ContaDto contaModel : listaContas) {
			if (contaModel.getTipoConta().getCodigo().equals("APAGAR")) {
				somaApagar = somaApagar + contaModel.getValor();

			}else {
			  somaAReceber=somaAReceber +contaModel.getValor();
			}
			
			saldo = somaApagar - somaAReceber;
		return saldo;
		
	}
		return saldo;
	}
    @ApiOperation("BUSCA ATUALIZA CONTA COM STATUS PERMANENTE")
	@RequestMapping(value= Constants.ATUALIZA_CONTA, method= RequestMethod.PUT)
	public void buscarConta(@RequestBody ContaDto contaDto) {
		if (contaDto.getTipoConta().getCodigo().equals("PERMANENTE")) {
			contaService.persistOrMerge(contaDto);

		}

	}
    @ApiOperation("DELETA CONTA")
	@RequestMapping(value= Constants.DELETE_CONTA, method= RequestMethod.DELETE)
	public void deleteConta(@RequestBody ContaDto contaDto) {
		contaService.delete(contaDto);
	
	}
}
