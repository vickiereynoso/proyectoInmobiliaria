package proyectoInmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Propiedad> propiedades = new ArrayList<>();

	public Inmobiliaria() {
		
	}
	
	public void ingresarPropiedad(Propiedad propiedad) {
		if(buscarPropiedad(propiedad.getDireccion())== null) {
			this.propiedades.add(propiedad);
			System.out.println("Propiedad correctamente registrada.");
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
		}else if(buscarPropiedad(direccion)!= null && buscarPropiedad(direccion).isEnAlquiler()==false){
			buscarPropiedad(direccion).setEnAlquiler(true);
			System.out.println("Alquiler efectuado.");
		}else{
			System.out.println("La propiedad "+buscarPropiedad(direccion).getDireccion()+" de "+buscarPropiedad(direccion).getCantAmbientes()+" ambientes, en la zona "+buscarPropiedad(direccion).getZona()+ " ya está alquilada.");
			System.out.println("Te mostramos otras propiedades libres para la cantidad de ambientes y zona deseada: ");
			System.out.println(mostrarPropiedadesLibresSegunCantAmbYZona(buscarPropiedad(direccion).getCantAmbientes(), buscarPropiedad(direccion).getZona()));
		}
	}
	
	
	private ArrayList mostrarPropiedadesLibresSegunCantAmbYZona(int cantAmbientes, Zona zona) {
		ArrayList<Propiedad>propiedadesLibres = new ArrayList<>();
		for(int i=0; i<this.propiedades.size(); i++) {
			if(this.propiedades.get(i).getCantAmbientes()== cantAmbientes && this.propiedades.get(i).getZona() == zona && this.propiedades.get(i).isEnAlquiler()==false) {
				propiedadesLibres.add(this.propiedades.get(i));
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
	
	public ArrayList mostrarPropiedadesOcupadas() {
		ArrayList<Propiedad>propiedadesOcupadas = new ArrayList<>();
		for(Propiedad p : this.propiedades) {
			if(p.isEnAlquiler()==true) {
				propiedadesOcupadas.add(p);
			}
		} 
		return propiedadesOcupadas;
	}
	
	public void mostrarPorcentajeOcupación() {
		int cantOcupZona = 0;
		int cantpropZona = 0;
		for(int i=0; i<Zona.values().length; i++) {
			cantOcupZona = 0;
			cantpropZona = 0;
			for(int j=0; j<this.propiedades.size(); j++) {
				if(this.propiedades.get(j).getZona() == Zona.values()[i]) {
					cantpropZona++;		
				}if((this.propiedades.get(j).getZona() == Zona.values()[i])&&(this.propiedades.get(j).isEnAlquiler()== true)) {
					cantOcupZona++;
				}
			}
			//System.out.println(cantpropZona);
			//System.out.println(cantOcupZona);
			System.out.println("El porcentaje de ocupación en la zona "+ Zona.values()[i]+" es de "+ ((cantOcupZona*100)/cantpropZona)+"%.");

		}
	}
	
	
	
}
