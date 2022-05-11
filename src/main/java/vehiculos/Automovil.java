package vehiculos;

public class Automovil extends Vehiculo  {
	private int puestos;
	private static int cantAutomovil;
	
	public Automovil(String pl, int p, String nom, int pre, int pes,
			Fabricante fa, boolean volco) {
		super(pl,4,100,nom,pre,pes,"FWD",fa);
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
