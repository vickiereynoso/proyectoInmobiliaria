package proyectoInmobiliaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inmobiliaria i = new Inmobiliaria();
		
		i.ingresarPropiedad(new Propiedad("Corrientes 4A", 2, Zona.NORTE, 3000, false));
		i.ingresarPropiedad(new Propiedad("Corrientes 4A", 2, Zona.NORTE, 3000, false)); //Error por duplicado.
		i.ingresarPropiedad(new Propiedad("Segurola 5C", 3, Zona.SUR, 2500, false));
		i.ingresarPropiedad(new Propiedad("San Nicolás 6A", 3, Zona.BOSQUE, 1850, false));
		i.ingresarPropiedad(new Propiedad("San Martín 784 3H", 5, Zona.BOSQUE, 1850, false));
		i.ingresarPropiedad(new Propiedad("Sarmiento 2543 8A", 3, Zona.BOSQUE, 1850, false));
		i.ingresarPropiedad(new Propiedad("Directorio 789 10B", 4, Zona.NORTE, 5000, false));
		i.ingresarPropiedad(new Propiedad("Ugarte 2038 PB A", 5, Zona.BOSQUE, 8000, false));
		i.ingresarPropiedad(new Propiedad("Rivadavia 1845 8E", 2, Zona.SUR, 1120, false));
		i.ingresarPropiedad(new Propiedad("Maipu 10313 15F", 4, Zona.NORTE, 15000, false));
		i.ingresarPropiedad(new Propiedad("Riera 2728 2D", 2, Zona.CENTRO, 3000, false));
		i.ingresarPropiedad(new Propiedad("Libertador 6023 18A", 2, Zona.CENTRO, 18000, false));
		i.ingresarPropiedad(new Propiedad("Rodriguez Peña 1634 7D", 2, Zona.CENTRO, 4700, false));
		i.ingresarPropiedad(new Propiedad("Jonte 4999 PB C", 3, Zona.BOSQUE, 3000, false));
		i.ingresarPropiedad(new Propiedad("Conte 324 2E", 2, Zona.NORTE, 3000, false));
		i.ingresarPropiedad(new Propiedad("Albastro 679 14C", 2, Zona.NORTE, 3000, false));
		i.ingresarPropiedad(new Propiedad("Vallese 3481 1A", 3, Zona.CENTRO, 4700, false));
		i.ingresarPropiedad(new Propiedad("Montañeses 2893 1F", 3, Zona.CENTRO, 4700, false));
		i.ingresarPropiedad(new Propiedad("Jauregui 781 9F", 2, Zona.CENTRO, 4700, false));
		i.ingresarPropiedad(new Propiedad("Salguero 8356 17D", 3, Zona.SUR, 3000, false));
		i.ingresarPropiedad(new Propiedad("Vicente López 4598 7D", 3, Zona.SUR, 3000, false));
		i.ingresarPropiedad(new Propiedad("Bonaparte 9621 5F", 2, Zona.CENTRO, 4700, false));
		System.out.println("");
		
		//De zona norte hay 5 prop, alquiladas 3.
		//De zona sur hay 4 prop, alquilada 1.
		//De zona centro hay 7 prop, alquiladas 4.
		//De zona bosque hay 5 prop, alquiladas 3.
		
		i.alquilarPropiedad("Carlos Calvo 2871"); //Error porque no existe.
		//ZONA NORTE:
		i.alquilarPropiedad("Corrientes 4A");
		i.alquilarPropiedad("Corrientes 4A"); //Error. Ya está alquilado.
		i.alquilarPropiedad("Directorio 789 10B");
		i.alquilarPropiedad("Maipu 10313 15F");
		//ZONA SUR:
		i.alquilarPropiedad("Segurola 5C");
		i.alquilarPropiedad("Segurola 5C"); //Error. Ya está alquilado.
		//ZONA CENTRO:
		i.alquilarPropiedad("Riera 2728 2D");
		i.alquilarPropiedad("Libertador 6023 18A");
		i.alquilarPropiedad("Libertador 6023 18A");//Error. Ya está alquilado.
		i.alquilarPropiedad("Vallese 3481 1A");
		i.alquilarPropiedad("Bonaparte 9621 5F");
		//ZONA BOSQUE:
		i.alquilarPropiedad("Ugarte 2038 PB A");
		i.alquilarPropiedad("San Nicolás 6A");
		i.alquilarPropiedad("Sarmiento 2543 8A"); 
		i.alquilarPropiedad("Sarmiento 2543 8A"); ////Error. Ya está alquilado.  
		System.out.println("");
		System.out.println(i.mostrarPropiedadesLibres());
		System.out.println("");
		System.out.println(i.mostrarPropiedadesOcupadas());
		System.out.println("");
		i.mostrarPorcentajeOcupación();
		
		
	}

}
