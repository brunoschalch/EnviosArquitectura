import java.util.*;
class Cliente {

	private RFC rfc;
	private HashSet<EnvioBuilder> envios;

	public Cliente(RFC datos) {
		this.rfc = datos;
	}

	public RFC getRFC(){
		return this.rfc;
	}

	public void setRFC(RFC datos) {
		this.rfc = datos;
	}

	public void setEnvios(HashSet<EnvioBuilder> envios) {
		this.envios = envios;
	}

	public HashSet<EnvioBuilder> getEnvios() {
		return envios;
	}

}
