/**
 * Represents the product created by the builder.
 */
import java.util.*;

class Envio {

    private String ID;
    private String direccionEntrega;
    private int CpEntrega;
    private String direccionRemitente;
    private int CpRemitente;
    private float peso;
    private HashSet<String> etiquetas;

    public Iterator<String> etiquetasIterator() {
      return etiquetas.iterator();
  	}

  	public void addEtiqueta(String etiqueta){
  		this.etiquetas.add(etiqueta);
  	}

  	public void setEtiquetas(HashSet<String> etiquetas) {
  		this.etiquetas = etiquetas;
  	}

  	public HashSet<String> getEtiquetas() {
  		return this.etiquetas;
  	}

    public String getID() {
      return ID;
    }

    public void setID(String ID) {
      this.ID = ID;
    }

    public String getDireccionEntrega() {
      return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
      this.direccionEntrega = direccionEntrega;
    }

    public int getCpEntrega() {
      return CpEntrega;
    }

    public void setCpEntrega(int CpEntrega) {
      this.CpEntrega = CpEntrega;
    }

    public String getDireccionRemitente() {
      return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
      this.direccionRemitente = direccionRemitente;
    }

    public int getCpRemitente() {
      return CpRemitente;
    }

    public void setCpRemitente(int CpRemitente) {
      this.CpRemitente = CpRemitente;
    }

    public float getPeso() {
      return peso;
    }

    public void setPeso(float peso) {
      this.peso = peso;
    }

    public Envio() {
		  etiquetas = new HashSet<String>();
    }

    @Override
    public String toString(){
      return "Envio: \n" + ID + "\n"+direccionEntrega;
	  }
}
