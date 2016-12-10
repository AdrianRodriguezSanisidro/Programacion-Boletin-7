
package boletin.pkg7;

/**
 *
 * @author Adry
 */
public class Boletin7 {

    public static void main(String[] args) {
     Libro libro1=new Libro();
     libro1.setLibro("Harry Potter");
     libro1.setAutor("J.K.Rowling");
     libro1.setNumExemplares(8);
     libro1.setNumPrestados(6);
     libro1.prestamo();
     libro1.devolucion();
     System.out.println(libro1.toString());
     
     Libro libro2=new Libro();
     libro2.setLibro("Prohibido");
     libro2.setAutor("Tabitha Suzuma");
     libro2.setNumExemplares(4);
     libro2.setNumPrestados(1);
     System.out.println(libro2.toString());
    }
    
}
