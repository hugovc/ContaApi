package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Parcela {
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer parcelaId;
  
    @ManyToOne
    private Conta conta; 
    

	@Column(name = "valor")
    private Double valor;
    
       
  

    public Integer getParcelaId() {
		return parcelaId;
	}

	public void setParcelaId(Integer parcelaId) {
		this.parcelaId = parcelaId;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Parcela() {
    }

    public Parcela(Conta conta, Double valor) {
        this.conta = conta;
        this.valor = valor;
       

    }
}
