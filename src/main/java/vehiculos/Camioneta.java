package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantCamioneta;
	
	public Camioneta(String pl,int p,int vel,String nom,int pre,int pes,String tra,Fabricante fa,boolean volco) {
		super(pl,p,90,nom,pre,pes,"4X4",fa);
		this.volco=volco;
		Camioneta.cantCamioneta+=1;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco=volco;
	}
	public static int getCantCamioneta() {
		return cantCamioneta;
	}
}
