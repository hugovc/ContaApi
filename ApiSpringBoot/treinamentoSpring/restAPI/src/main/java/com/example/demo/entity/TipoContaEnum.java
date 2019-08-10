package com.example.demo.entity;


public enum TipoContaEnum {


APAGAR("APAGAR"), 
ARECEBER("ARECEBER"), ;

	

private String tipo;

	
private TipoContaEnum(String tipo) {
	
	this.tipo= tipo;
	}

	

public String getCodigo() {
	
	return tipo;
	}

	

public static TipoContaEnum valorOfCodigo(String tipo) {
	
for (TipoContaEnum tipoContaEnum : values()) {
			
if (tipoContaEnum.tipo.equalsIgnoreCase(tipo)) {
				
return tipoContaEnum;
	}
}
		
throw new IllegalArgumentException("tipo) não encontrado=" + tipo) ;
	}
}
