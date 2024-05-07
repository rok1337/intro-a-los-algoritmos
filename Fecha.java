
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, cómputos de días,
 * etc.
 * 
 * @author N. Aguirre 
 * @version 0.1
 */
public class Fecha
{
    // dia de la fecha
    private int dia;
    
    // mes de la fecha
    private int mes;
    
    // año de la fecha
    private int anho;

    /**
     * Constructor por defecto, para la clase fecha.
     * Crea como fecha por defecto la fecha inicial del 
     * calendario gregoriano (15/10/1582)
     */
    public Fecha()
    {
        dia = 15;
        mes = 10;
        anho = 1582;
    }

    /**
     * Constructor de la clase Fecha, que recibe la fecha a 
     * crear como parámetro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creación de
     * fechas válidas, en relación a número de días en los
     * meses, años bisiestos, etc.
     */
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAnho)
    {
        // Implementar este constructor
    }
    
    /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        // Implementar este método, reemplazando la línea siguiente
        return dia;
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este método, reemplazando la línea siguiente
        return mes;
    }
    
    /**
     * Retorna el año de la fecha
     */
    public int obtenerAnho() {
        // Implementar este método, reemplazando la línea siguiente
        return anho;
    }
    
    /**
     * Cambia el día de la fecha. El nuevo día debe ser válido
     * para el mes y año actuales.
     */
    public void cambiarDia(int nuevoDia) {
        assert (nuevoDia >= 1 && nuevoDia <= cantDias(obtenerMes()));
        dia = nuevoDia;
    }
    
    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes, int dDias, int aAnio) {
        assert (nuevoMes >= 1 && nuevoMes <= 12 && cantDias(nuevoMes) >= dDias);
        if(esBisiesto(aAnio)){
            return dDia ;
        }
        mes = nuevoMes;
    }
    
    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        assert(nuevoAnho >= 1582 ) : "agrega un nuevo mas grande";
        /*if(obtenerMes() == 2){
            if(obtenerAnho() == 29 && esBisiesto(nuevoAnho)){
                anho = nuevoAnho;
            }else{
                System.out.println("error");
            }
           
        } else{
            anho = nuevoAnho;
        }*/
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    
    /**
     * Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int cantidad(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Computa la cantidad de días de un mes dado. El parámetro
     * debe corresponder a un mes válido.
     */
    private int cantDias(int unMes, int unAnho) 
    {
        assert (unMes>=1 || unMes<=12) : "Ingresar un mes valido";
        if(unMes == 1 || unMes == 3 || unMes == 5 || unMes == 7 || unMes == 8 || unMes == 10 || unMes == 12){
            return 31;
        }else if(unMes == 2){
            if(esBisiesto(unAnho)){
            return 29;
            } else {
            return 28;
            }
        }else{
            return 30;
        }
        // Implementar este método, reemplazando la línea siguiente
        //return 0;
    }
    
    /**
     * Decide si un año dado es bisiesto o no. Un año es bisiesto
     * si es múltiplo de 4, salvo los múltiplos de 100 que no son 
     * múltiplos de 400.
     * El parámetro debe corresponder a un año válido.
     */
    private boolean esBisiesto(int unAnho) 
    {
        assert (unAnho >= 1582) : "Ingrese un anho mayor a 1582";
        // Implementar este método, reemplazando la línea siguiente
        return (unAnho % 4 == 0 && unAnho % 100 != 0) || unAnho % 400 == 0;
    }
}
