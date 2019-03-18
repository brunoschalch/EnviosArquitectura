import java.util.*;
class Cliente {

	private RFC rfc;
	private HashSet<Envio> envios;

	public Cliente(RFC datos) {
		this.rfc = datos;
	}

	public RFC getRFC(){
		return this.rfc;
	}

	public void setRFC(RFC datos) {
		this.rfc = datos;
	}

	public void setEnvios(HashSet<Envio> envios) {
		this.envios = envios;
	}

	public HashSet<Envio> getEnvios() {
		return envios;
	}

}
