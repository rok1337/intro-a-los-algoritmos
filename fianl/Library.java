package bb;

import java.util.ArrayList;

/**
 * Administra los libros de una biblioteca. 
 * Library representa una biblioteca, con su nombre, capacidad máxima de 
 * la biblioteca (cuántos libros puede alojar), y lista de libros de la biblioteca.
 * 
 * @author N. Aguirre 
 * @version 0.1
 */
public class Library
{
    // nombre de la biblioteca
    private String name;
    // capacidad de la biblioteca (cuántos libros puede alojar como máximo)
    private int bookCapacity;
    // La lista de libros de la biblioteca
    private ArrayList<Book> books;

    /**
     * Constructor de Library.
     */
    public Library(String name, int bookCapacity)
    {
        if (name == null || name.equals("")) throw new IllegalArgumentException();
        if (bookCapacity <= 0) throw new IllegalArgumentException();
        this.books = new ArrayList<Book>();
        this.name = name;
        this.bookCapacity = bookCapacity;
    }

    /**
     * Agrega un libro a la biblioteca
     * @param book es el libro a agregar
     * Precondición: Agregar el libro no debe exceder la capacidad de la biblioteca (ejemplares de los libros existentes 
     * más los nuevos ejemplares no debe superar la capacidad).
     * Precondición: No debe haber en la biblioteca un libro con el mismo id que el que se agrega.
     * Postcondición: se agrega el libro a la lista de libros de la biblioteca. La lista de libros se debe mantener
     * ordenada por id, con lo cual la inserción debe ubicar el libro en la posición ordenada correspondiente.
     */
    public void addBook(Book book)
    {
        //TODO: Implementar este método, incluyendo chequeo de precondición.
    }
    
    /**
     * Presta un ejemplar de un libro a la biblioteca
     * @param id es el id del libro a prestar.
     * Precondición: Existe un libro con el id indicado, y hay al menos una copia en existencia para prestar.
     * Postcondición: Se actualiza el número de copias en existencia del libro correspondiente, disminuyendo la
     * candidad de copias disponibles en uno.
     * Importante: Este algoritmo debe tener complejidad O(log n) en el peor caso.
     */
    public void lendBook(int id)
    {
        
    }
    
    
    /**
     * Retorna el libro de la biblioteca con la mayor cantidad de palabras en el título.
     * Por ejemplo, "Rayuela" tiene una palabra, y "El Aleph" tiene dos palabras. Este método
     * retorna el libro con mayor cantidad de palabras, entre todos los pertenecientes a la 
     * biblioteca.
     * Precondición: debe haber al menos un libro almacenado en la biblioteca.
     * @return el libro (objeto) con mayor cantidad de palabras entre los de la biblioteca.
     * Si hay más de uno con la misma cantidad máxima de palabras, debe retornarse el primero de la 
     * lista entre ellos (es decir, el de id más chico).
     */
    public Book mostWordsInTitle()
    {
        return null;
        //TODO Implementar este método, incluyendo posiblemente chequeo de precondición
    }
    
    /**
     * Elimina de la biblioteca todos los libros cuyo autor coincida con el autor pasado como parámetro.
     * @param author es el autor cuyos libros hay que eliminar.
     * Precondición: el parámetro author debe ser no nulo y no vacío.
     */
    public void deleteBooksWithAuthor(String author)
    {
        //TODO Implementar este método, incluyendo posiblemente chequeo de precondición
    }
    
    /**
     * Invariante de clase de Library (biblioteca). Una biblioteca se considera válida, o
     * internamente consistente, si su nombre no es nulo ni vacío, la capacidad es mayor a cero,
     * la lista de libros no contiene null, los libros están ordenados crecientemente por id,
     * cada libro es internamente consistente (satisface su respectivo repOK()), y la suma de 
     * ejemplares de los libros no excede la capacidad de la biblioteca. 
     * @return true si y sólo si el objeto satisface el invariante de clase.
     */
    public boolean repOK()
    {
        //TODO Implementar este método
        return false;
    }
    
}
