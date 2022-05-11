package vehiculos;

import java.util.*;
public class Pais {
	private String nombre;
	public int unidadesVendidas;
	private static ArrayList<Pais> paises=new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public static Pais paisMasVendedor() {
		Pais masVendidos= new Pais("Colombia");
		for(Pais p: paises) {
			if (p.unidadesVendidas>masVendidos.unidadesVendidas) {
				masVendidos=p;
			}
		}
	return masVendidos;
	}
}
