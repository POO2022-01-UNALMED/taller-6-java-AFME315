package vehiculos;

public class Automovil extends Vehiculo  {
	private int puestos;
	private static int cantAutomovil;
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		Automovil.cantAutomovil+=1;
		
	}
	public int getPuestos(){
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos=puestos;
	}
	public static int getCantAutomovil() {
		return cantAutomovil;
	}
}
