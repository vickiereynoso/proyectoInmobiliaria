package proyectoInmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Propiedad> propiedades = new ArrayList<>();

	public Inmobiliaria() {
		
	}
	
	public void ingresarPropiedad(Propiedad propiedad) {
		
		
	}
	
	public Propiedad buscarPropiedad(Propiedad propiedad) {
		Propiedad propiedadBuscada = null;
		int i =0;
		while(i<this.propiedades.size() && propiedadBuscada == null) {
			if(this.propiedades.get(i).getDireccion() == propiedad.getDireccion()) {
				propiedadBuscada = this.propiedades.get(i);
			}else {
				i++;
			}		
		}
		return propiedadBuscada;
	}
	
	
}
