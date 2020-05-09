package Tarea_4;

public class Pelicula {
	final int id;
	private Integer Id;
	private String Nombre;
	private Genero Tipo;
	
	private static int cont = 0;
	
	
	public Pelicula(String nombre) {
		super();
		cont++;
        this.id = cont;
		Nombre = nombre;
		this.Tipo = new Genero(Id, nombre);
	}



	public Pelicula() {
		super();
		cont++;
        this.id = cont;
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	@Override
	public String toString() {
		return "Id=" + Id + ", Nombre=" + Nombre + ", Genero=" + Tipo;
	}

	
	
}
