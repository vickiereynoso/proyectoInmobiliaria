package proyectoInmobiliaria;

public class Propiedad {

	private String direccion;
	private int cantAmbientes;
	private Zona zona;
	private double precio;
	private boolean enAlquiler = false;
	
	public Propiedad(String direccion, int cantAmbientes, Zona zona, double precio, boolean enAlquiler) {
		super();
		this.direccion = direccion;
		this.cantAmbientes = cantAmbientes;
		this.zona = zona;
		this.precio = precio;
		this.enAlquiler = enAlquiler;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public Zona getZona() {
		return zona;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isEnAlquiler() {
		return enAlquiler;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCantAmbientes(int cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setEnAlquiler(boolean enAlquiler) {
		this.enAlquiler = enAlquiler;
	}

	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", cantAmbientes=" + cantAmbientes + ", zona=" + zona + ", precio="
				+ precio + ", enAlquiler=" + enAlquiler + "]"+"\n";
	}
	
	
	
}
