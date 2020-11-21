package com.prueba.git;

public class Casa {

	private int numeroPersonas;
	private String mensaje;

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Casa [numeroPersonas=" + numeroPersonas + ", mensaje=" + mensaje + "]";
	}	
	
}
