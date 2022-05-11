package vehiculos;

public class Automovil extends Vehiculo  {
	private int puestos;
	private static int cantAutomovil;
	
	public Automovil(String pl,int p,int vel,String nom,int pre,int pes,String tra,Fabricante fa,int puestos ) {
		super(pl,p=4,vel=100,nom,pre,pes,tra="FWD",fa);
		this.puestos=puestos;
		cantAutomovil++;
		
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
