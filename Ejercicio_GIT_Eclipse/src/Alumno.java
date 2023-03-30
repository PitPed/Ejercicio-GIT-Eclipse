
public class Alumno {
	private String nombre, apellido, dni;

	public Alumno() {
		nombre="Sin nombre";
		apellido="Sin apellido";
		dni="sin DNI";
	}
	
	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	} 
	
	@Override
	public String toString() {
		String ret = "";
		
		ret += "__________________________";
		ret += "\nNombre:\t "+nombre;
		ret += "\nApellido:\t "+apellido;
		ret += "\nDNI:\t "+dni;
		
		return ret;
	}
	
}
