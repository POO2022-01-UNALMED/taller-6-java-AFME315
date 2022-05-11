package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantCamion;
	
	public Camion(String pl,int p,int vel,String nom,int pre,int pes,String tra,Fabricante fa,int ejes) {
		super(pl,p=2,vel=80,nom,pre,pes,tra="4X2",fa);
		this.ejes=ejes;
		cantCamion++;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
	public static int getCantCamion() {
		return cantCamion;
	}
}
