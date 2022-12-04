
public class Caja {
	int dinero;
	boolean estado;
	Cliente[] cola;
	
	public Caja() {
		dinero = 0;
		estado = false;
		cola = new Cliente[5]; //maximo
	}

	public int getDinero() {
		return dinero
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void añadirCliente(Cliente cliente) {
		cola[getTamanioCola()]=cliente;
	}
	
	public int getTamanioCola() {
		int contador=0;
		for(int i=0;i<cola.length;i++) {
			if(cola[i]!=null) {
				contador++;
			}
		}
		return contador;
	}
	
	public void cobrar() {
		dinero+=cola[0].dineroAGastar;
		
		for(int x=0;x<4;x++) {
			cola[x]=cola[x+1];
		}
	}
}
