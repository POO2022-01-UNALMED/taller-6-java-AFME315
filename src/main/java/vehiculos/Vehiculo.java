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

	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos+=1;
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
	public int getCantidadVehiculos() {
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
	public void setCantidadVehiculos(int cant) {
		cantidadVehiculos=cant;
	}
	
	public static String vehiculosPorTipo() {
		return 
				"Automoviles: " + Automovil.getCantidad() + "\n" + 
				"Camionetas: " + Camioneta.getCantidad() + "\n" + 
				"Camiones: " + Camion.getCantidad();
	}
	
}
