package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantCamion;
	
	public Camion(String pl, String nom, int pre, int pes, Fabricante fa,int ejes) {
		super(pl,2,80,nom,pre,pes,"4X2",fa);
		this.ejes=ejes;
		Camion.cantCamion+=1;
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
