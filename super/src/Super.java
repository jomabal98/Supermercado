
public class Super {

	
	Caja caja1;
	Caja caja2;
	boolean estado;
	int ganancias=0;
	String nombre;
	int contador_Clientes=0;
	
	public Super(String nombre) {
		this.nombre=nombre;
		ganancias=0;
		caja2= new Caja();
		caja1= new Caja();
		estado=true;
		caja1.setEstado(true);
	}
	
	
	
	public void entraCliente(Cliente client) {
		if(caja1.getEstado()) {
			contador_Clientes++;
		}
		colocarse(client);
	}
	
	
	public void colocarse(Cliente cliente) {
		
		if(caja1.getTamanioCola()<=caja2.getTamanioCola()&&caja1.getEstado()) {
			caja1.añadirCliente(cliente);
		}
		else if(caja2.getTamanioCola()<caja1.getTamanioCola()&&caja2.getEstado()) {
			caja2.añadirCliente(cliente);
		}
		else if(caja2.getTamanioCola()<caja1.getTamanioCola()&&!caja2.getEstado()) {
			caja1.añadirCliente(cliente);
		}
		
	}
	
	
	public void cobrar(Caja caja) {
			caja.cobrar();
			contador_Clientes--;
	}
	
	
	public void cambiarEstadoCaja(Caja caja) {
		if(caja.getEstado())
			caja.setEstado(false);
		else
			caja.setEstado(true);
		
		if(!caja1.getEstado())
			estado = false;
	}
	
	
	public void imprimirEstado() {
		String texto="";
		texto+="El supermercado esta ";
		if(estado) {
			texto+="abierto.\n";
			texto+="La caja 1 esta abierta.\n";
			
			if(caja2.getEstado()) {
				texto+="La caja 2 esta abierta.\n";
			}
			else
				texto+="La caja 2 esta cerrada.\n";
			
		}
		else
			texto+="cerrado.\n";
			texto+="Ganancias: "+(caja1.getDinero()+caja2.getDinero()+".\n");
		
		texto+="Tiene "+contador_Clientes+" clientes dentro.\n";
		
		
		System.out.println(texto);
		
	}
	
}
