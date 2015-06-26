package com.bem;

public enum AreaDoImovel {

		RIO_1("Centro"), RIO_2("Zona Sul"), RIO_3("Zona Norte"), RIO_4("Baixada");
		
		
		private String texto;

		private AreaDoImovel(String texto) {
			this.texto = texto;
		}

		public String getTexto() {
			return texto;
		}

	
		
	
}
