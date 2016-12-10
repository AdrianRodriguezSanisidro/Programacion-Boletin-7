package boletin.pkg7;

/**
 *
 * @author Adry
 */
public class Libro {
    private String libro,autor;
    private int numExemplares,numPrestados;

    public Libro() {
    }

    public Libro(String libro, String autor, int numExemplares, int numPrestados) {
        this.libro = libro;
        this.autor = autor;
        this.numExemplares = numExemplares;
        this.numPrestados = numPrestados;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    public boolean prestamo (){
        if (numExemplares<=numPrestados){
            System.out.println("Libro no disponible");
            return false;
        }else{
            numPrestados=numPrestados+1;
            System.out.println("Libro disponible para prestar,libros disponibles:"+(numExemplares-numPrestados));
            return true;
        }
    }
    public boolean devolucion(){
        if (numPrestados==0){
            System.out.println("No se puede devolver");
            return false;
        }else{
            numPrestados=numPrestados-1;
            System.out.println("Libro devuelto");
            return true;
        }
    }

    @Override
    public String toString() {
        return ("Hay "+numExemplares+" del libro: " + libro + ", del autor/a " + autor +" de los cuales estan prestaodos "+ numPrestados);
    }
    
}
