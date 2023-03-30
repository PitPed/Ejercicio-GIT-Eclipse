
public class Alumno {
	private String nombre, apellido, dni;

	public Alumno() {
		nombre="Alumno";
		apellido="Por defecto";
		dni="00000000 ";
	}
	
	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	} 
	
	@Override
	public String toString() {
		String ret = "";
		
		ret += "____________________________";
		ret += "\nNombre:\t\t "+nombre;
		ret += "\nApellido:\t "+apellido;
		ret += "\nDNI:\t\t "+dni;
		ret += "____________________________";
		
		return ret;
	}
	
}
