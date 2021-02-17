package ordenamientoSeleccion;

class Persona  {
	private String nombre;
	private int edad;
	private int dpi;
	
	public Persona()
	{
		nombre = "";
		edad = 0;
		dpi = 0;
	}
	
	public Persona(String n, int e, int d)
	{
		nombre = n;
		edad = e;
		dpi = d;
		
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	

}
