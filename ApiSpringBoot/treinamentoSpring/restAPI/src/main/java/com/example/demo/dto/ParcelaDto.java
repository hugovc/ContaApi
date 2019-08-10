package com.example.demo.dto;

import java.math.BigDecimal;
import java.sql.Date;


public class ParcelaDto {
    Integer parcelaId;
    Double Valor;
  /*
    Date DataVencimento;
    Date DataPagamento;
*/
    public ParcelaDto(Integer parcelaId, Double valor) {
        this.parcelaId = parcelaId;
        Valor = valor;
       
    }

    public ParcelaDto() {
    }
    
    

    
    
/*
	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		DataPagamento = dataPagamento;
	}
*/
	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public Integer getParcelaId() {
        return parcelaId;
    }

    public void setParcelaId(Integer parcelaId) {
        this.parcelaId = parcelaId;
    }

  
}
