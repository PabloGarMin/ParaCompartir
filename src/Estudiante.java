
public class Estudiante {

	private String nombre;
	private String apellidos;
	private String fecha;
	private String dni;
	private String estudios;
	private String telefono;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellidos, String fecha, String dni, String estudios, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.dni = dni;
		this.estudios = estudios;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", dni=" + dni
				+ ", estudios=" + estudios + ", telefono=" + telefono + "]";
	}
	
	
}
