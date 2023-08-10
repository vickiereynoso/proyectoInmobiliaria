package proyectoInmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Propiedad> propiedades = new ArrayList<>();

	public Inmobiliaria() {
		
	}
	
	public void ingresarPropiedad(Propiedad propiedad) {
		if(buscarPropiedad(propiedad.getDireccion())== null) {
			this.propiedades.add(propiedad);
		}else if(buscarPropiedad(propiedad.getDireccion())!= null) {
			System.out.println("Error. La propiedad ya se encuentra registrada.");
		}
	}
	
	public Propiedad buscarPropiedad(String direccion) {
		Propiedad propiedadBuscada = null;
		int i =0;
		while(i<this.propiedades.size() && propiedadBuscada == null) {
			if(this.propiedades.get(i).getDireccion() == direccion) {
				propiedadBuscada = this.propiedades.get(i);
			}else {
				i++;
			}		
		}
		return propiedadBuscada;
	}

	
	public void alquilarPropiedad(String direccion) {
		if(buscarPropiedad(direccion)== null) {
			System.out.println("No existe la propiedad.");
		}if(buscarPropiedad(direccion)!= null && buscarPropiedad(direccion).isEnAlquiler()==false){
			buscarPropiedad(direccion).setEnAlquiler(true);
			System.out.println("Alquiler efectuado.");
		}else{
			System.out.println("Propiedad ya alquilada.");
			System.out.println("Te mostramos otras propiedades libres para la cantidad de ambientes y zona deseada: "+"\n");
			mostrarPropiedadesLibresSegunCantAmbYZona(buscarPropiedad(direccion).getCantAmbientes(), buscarPropiedad(direccion).getZona());
		}
	}
	
	
	public void mostrarPropiedadesLibresSegunCantAmbYZona(int cantAmbientes, Zona zona) {
		int i = 0;
		while(i<this.propiedades.size()) {
			if(this.propiedades.get(i).getCantAmbientes()== cantAmbientes && this.propiedades.get(i).getZona() == zona && this.propiedades.get(i).isEnAlquiler()==false) {
				System.out.println(this.propiedades.get(i));
			}else {
				i++;
			}
		}
	}
	
	
	
	
}
