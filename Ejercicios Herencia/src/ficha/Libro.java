package ficha;

public class Libro extends Ficha{


	public String autor;
	
	public String editorial; 
	

	public Libro(String titulo,String autor,String editorial) {
		super(titulo);
		if(autor!=null && !autor.isBlank()) {
			this.autor=autor;
		}
	
		if(editorial!=null && !editorial.isBlank()) {
			this.editorial=editorial;
		}
		
	}

	public String getAutor() {
		return autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	@Override
	public String prestar() {
		
		return null;
	}
	
}
