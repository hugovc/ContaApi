package com.example.demo.entity;

public enum StatusContaEnum {
	PARCELADA("PARCELADA"),
	 PERMANENTE( "PERMANENTE");

		private String status;

		
		private StatusContaEnum(String status) {
			
			this.status= status;
			}

			

		public String getCodigo() {
			
			return status;
			}

			

		public static StatusContaEnum valorOfCodigo(String status) {
			
		for (StatusContaEnum statusContaEnum : values()) {
					
		if (statusContaEnum.status.equalsIgnoreCase(status)) {
						
		return statusContaEnum;
			}
		}
				
		throw new IllegalArgumentException("status) não encontrado=" + status) ;
			}
}
