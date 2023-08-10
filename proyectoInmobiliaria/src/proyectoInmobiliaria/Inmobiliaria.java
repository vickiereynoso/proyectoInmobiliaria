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
			System.out.println(mostrarPropiedadesLibresSegunCantAmbYZona(buscarPropiedad(direccion).getCantAmbientes(), buscarPropiedad(direccion).getZona()));
		}
	}
	
	
	public ArrayList mostrarPropiedadesLibresSegunCantAmbYZona(int cantAmbientes, Zona zona) {
		ArrayList<Propiedad>propiedadesLibres = new ArrayList<>();
		int i = 0;
		while(i<this.propiedades.size()) {
			if(this.propiedades.get(i).getCantAmbientes()== cantAmbientes && this.propiedades.get(i).getZona() == zona && this.propiedades.get(i).isEnAlquiler()==false) {
				propiedadesLibres.add(this.propiedades.get(i));
			}else {
				i++;
			}
		}
		return propiedadesLibres;
	}
	
	public ArrayList mostrarPropiedadesLibres() {
		ArrayList<Propiedad>propiedadesLibres = new ArrayList<>();
		for(Propiedad p : this.propiedades) {
			if(p.isEnAlquiler()==false) {
				propiedadesLibres.add(p);
			}
		} 
		return propiedadesLibres;
	}
	
	public void mostrarPorcentajeOcupación() {
		int cantOcupZona=0;
		int cantpropZona=0;
		for(int i=0; i<Zona.values().length; i++) {
			for(int j=0; j<this.propiedades.size(); j++) {
				if(this.propiedades.get(i).isEnAlquiler()== true) {
					cantOcupZona++;
				}if(this.propiedades.get(i).getZona() == Zona.values()[i] ) {
					cantpropZona++;
				}
			}
			System.out.println("El porcentaje de ocupación en la zona "+ Zona.values()+" es de "+ ((cantOcupZona*100)/cantpropZona)+"%.");
		}
	}
	
	
	
}
