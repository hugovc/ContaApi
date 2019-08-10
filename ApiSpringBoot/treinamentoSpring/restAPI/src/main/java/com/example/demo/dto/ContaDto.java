package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.demo.entity.StatusContaEnum;
import com.example.demo.entity.TipoContaEnum;


public class ContaDto {
    Integer contaId;
    String descricao;
    List<ParcelaDto> parcelasDto= new ArrayList<>();
    String mes;
    StatusContaEnum statusConta;
  	TipoContaEnum tipoConta;
  	double valor;
  	Integer parcela;

    public ContaDto(Integer contaId, String descricao, List<ParcelaDto> parcelasDto, String mes,TipoContaEnum tipoConta, StatusContaEnum statusConta,double valor, Integer parcela ) {
        this.contaId = contaId;
        this.descricao = descricao;
        this.parcelasDto = parcelasDto;
        this.mes = mes;
        this.tipoConta= tipoConta;
        this.statusConta= statusConta;
        this.valor =valor;
        this.parcela=parcela;

    }

    public ContaDto() {
    }

    public Integer getUserId() {
        return contaId;
    }

    public void setConta(Integer contaId) {
        this.contaId = contaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ParcelaDto> getParcelasDto() {
        return parcelasDto;
    }

    public void setParcelasDto(List<ParcelaDto> parcelasDto) {
        this.parcelasDto = parcelasDto;
    }

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public StatusContaEnum getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(StatusContaEnum statusConta) {
		this.statusConta = statusConta;
	}

	public TipoContaEnum getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoContaEnum tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}
	
    
}
