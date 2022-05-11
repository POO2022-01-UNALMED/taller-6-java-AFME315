package vehiculos;

import java.util.*;

public class Fabricante {
	private Pais pais;
	private String nombre;
	public int unidadesVendidas;
	private static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricas.add(this);
	}
	
	public Pais getPais() {
		return pais;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante masVendidos =new Fabricante("LLantas_Colombia_SAS", new Pais("Colombia"));
		
		for (Fabricante f: fabricas) {
			if (f.unidadesVendidas>masVendidos.unidadesVendidas) {
				masVendidos=f;
			}
		}
		return masVendidos;
	}
}
