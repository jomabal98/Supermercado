
public class Start {

	public static void main(String[] args) {
		Super mercadona = new Super("Mercadona");
		mercadona.entraCliente(new Cliente(100));
		mercadona.entraCliente(new Cliente(100));
		mercadona.entraCliente(new Cliente(100));
		mercadona.entraCliente(new Cliente(100));
		mercadona.imprimirEstado();
		
		mercadona.cambiarEstadoCaja(mercadona.caja2);
		mercadona.entraCliente(new Cliente(100));
		mercadona.entraCliente(new Cliente(100));
		mercadona.imprimirEstado();
		
		mercadona.cobrar(mercadona.caja1);
		mercadona.cobrar(mercadona.caja1);
		mercadona.cobrar(mercadona.caja1);
		mercadona.cobrar(mercadona.caja1);
		
		mercadona.cambiarEstadoCaja(mercadona.caja2);
		
	
		mercadona.cobrar(mercadona.caja2);
		mercadona.cobrar(mercadona.caja2);
		
		mercadona.imprimirEstado();
		
//		mercadona.entraCliente(new Cliente(30));
//		mercadona.entraCliente(new Cliente(130));
		
		
	}

}
