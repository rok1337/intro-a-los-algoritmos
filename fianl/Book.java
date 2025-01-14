package bb;


/**
 * Representa un libro de una biblioteca. 
 * Los detalles del libro son su id, título, autor, cantidad de páginas, cantidad de ejemplares,
 * y cantidad de ejemplares en existencia (no prestados). 
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class Book
{
    // id del libro
    private int id;
    // título del libro
    private String title;
    // autor del libro
    private String author;
    // cantidad de páginas
    private int pages;
    // cantidad de ejemplares
    private int copies;
    // cantidad de ejemplares en existencia (no prestados)
    private int copiesAvailable;

    /**
     * Crea un nuevo libro con id, título, autor, cantidad de páginas
     * y ejemplares.
     * El título no puede ser null ni vacío. 
     * El autor no puede ser null ni vacío. 
     * El id debe ser positivo.
     * La cantidad de páginas debe ser un número positivo.
     * La cantidad de copias debe ser un número positivo.
     * La cantidad de copias disponibles (en existencia) se setea con
     * el mismo valor que la cantidad de copias.
     */
    public Book(int id, String title, String author, int pages, int copies)
    {
        //TODO implementar este método incluyendo chequeo de precondición
    }

    /**
     * Retorna los detalles del libro, como
     * cadena de caracteres.
     * @return detalles del libro en una cadena de caracteres,
     * usando el formato "<id>: <title> (by <author>). <pages> pages. Copies: <copies> (<copiesAvailable> available)".
     */
    public String toString()
    {
        //TODO Implementar este método
        return null;
    }
    
    /**
     * Invariante de la clase Book.
     * Un libro es internamente consistente si su id es positivo, 
     * su título y autor no son nulos ni vacíos, la cantidad de páginas es positiva,
     * la cantidad de copias es positiva, y la cantidad de copias disponibles está entre cero
     * y la cantidad de copias.
     * @return true ssi el objeto es internamente consistente (satisface el invariante de clase).
     */
    public boolean repOK() 
    {
        //TODO Implementar este método
        return false;    
    }

    /**
     * Presta una copia del libro. La cantidad de copias disponible tiene que ser mayor a cero
     * para poder prestar una copia. El método debe disminuir en uno la cantidad de copias disponibles.
     */
    public void lendCopy() 
    {
        //TODO implementar este método incluyendo posiblemente chequeo de precondición
    }
    
    /**
     * Devuelve una copia del libro. Tiene que haber libros prestados para poder devolver un ejemplar. 
     * El método debe incrementar en uno la cantidad de copias disponibles.
     */
    public void returnCopy() 
    {
        //TODO implementar este método incluyendo posiblemente chequeo de precondición
    }
}
