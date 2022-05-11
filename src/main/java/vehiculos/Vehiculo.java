package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;

	
	
	public Vehiculo(String pl,int p,int vel,String nom,int pre,int pes,String tra,Fabricante fa ){
		placa=pl;
		puertas=p;
		velocidadMaxima=vel;
		nombre=nom;
		precio=pre;
		peso=pes;
		traccion=tra;
		fabricante=fa;
		cantidadVehiculos++;
		fabricante.getPais().unidadesVendidas+=1;
		fabricante.unidadesVendidas+=1;
		
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public long getPeso() {
		return peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	public void setVelocidadMaxima(int vel) {
		velocidadMaxima=vel;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	public static void setCantidadVehiculos(int cant) {
		cantidadVehiculos=cant;
	}
	
	public static String vehiculosPortipo() {
		return 
				"Automoviles: " + Automovil.getCantAutomovil()+ "/n" +
				"Camionetas: " + Camioneta.getCantCamioneta()+ "/n" + 
				"Caminones: " + Camion.getCantCamion();
	}
	
}
