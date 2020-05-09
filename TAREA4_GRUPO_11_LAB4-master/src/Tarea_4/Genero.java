package Tarea_4;

public class Genero {

	Integer Id;
	String Tipo;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return Tipo;
	}
	public void setNombre(String tipo) {
		Tipo = tipo;
	}
	@Override
	public String toString() {
		return "Tipo";
	}
	public Genero(Integer id, String tipo) {
		super();
		Id = id;
		Tipo = tipo;
	}
	
	
	
	
	
}
