package supermark.code;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Domicilio domicilio;
	private Long cel;
	
	public Usuario(Integer id, String nombre, String apellido, Integer dni, Domicilio domicilio, Long cel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.cel = cel;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public Long getCel() {
		return cel;
	}

	public void setCel(Long cel) {
		this.cel = cel;
	}
}
