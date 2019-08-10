package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;


@Entity
public class Conta implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer contaId;
    @Column
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Parcela> parcelas = new LinkedList<>();
    
    @Enumerated(EnumType.STRING)
	@Column(name = "status_conta")
	private StatusContaEnum statusConta;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_conta")
	private TipoContaEnum tipoConta;
	
	@Column(name = "valor")
    private double valor;
    
	
	@Column
   	private Integer parcela;
    
    
    
    @Column(nullable = false)
	private String mes;	
    
    
    public Integer getContaId() {
        return contaId;
    }

    public void setContaId(Integer contaId) {
        this.contaId = contaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setUserName(String descricao) {
        this.descricao = descricao;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setSkills(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
    
    
    

    public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Conta() {
    }

    public Conta(String descricao, List<Parcela> parcelas, String mes, TipoContaEnum tipoConta,StatusContaEnum statusConta, double valor, Integer parcela  ) {
        this.descricao = descricao;
        this.parcelas = parcelas;
        this.mes = mes;
        this.tipoConta= tipoConta;
        this.statusConta=statusConta;
        this.valor= valor;
        this.parcela =parcela; 
    }
}
