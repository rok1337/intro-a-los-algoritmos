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
        //assert nuevoAnho < 1582 : "ya no se puede cumplier";
        if(nuevoAnho < 1582){throw new IllegalArgumentException("Esta fuera de rango el año");}
        if(nuevoMes < 1 || nuevoMes > 12){throw new IllegalArgumentException("Esta fuera de rango el mes");}
        int maxDias = cantDias(nuevoMes, nuevoAnho);
        if (nuevoDia < 1 || nuevoDia > maxDias) {
            throw new IllegalArgumentException("Día fuera de rango válido para el mes y año proporcionados");
        }
        this.dia = nuevoDia;
        this.mes = nuevoMes;
        this.anho = nuevoAnho;

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
        if(1 <= nuevoDia && nuevoDia <= 31){
            throw new IllegalArgumentException("Esta fuera de rango el dia");
        }
        dia = nuevoDia;
    }

    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes, int dDias, int aAnio) {
        if (nuevoMes < 1 || nuevoMes > 12) {
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12.");
        }
        //nueva variable
        int mxDiasMes = cantDias(nuevoMes, anho);
        if(dia > mxDiasMes){
            dia = mxDiasMes;
        }
        mes = nuevoMes;
    }

    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        if(nuevoAnho < 1582){
            throw new IllegalArgumentException("Este año no es valido");
        }
        anho = nuevoAnho;
    }

    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return dia == otraFecha.dia && mes == otraFecha.mes && anho == otraFecha.anho;
    }

    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        //ver si el anho es igual o anterior. tener en cuenta que lo que devuelve es un true/false
        if (anho < otraFecha.anho) {
            return true;
        } else if (anho == otraFecha.anho) {
            if (mes < otraFecha.mes) {
                return true;
            } else if (mes == otraFecha.mes) {
                return dia < otraFecha.dia;
            }
        }
        return false;
    }

    /**
     * Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int cantidad(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        //assert equals(this) || esAnterior(this) : "Fecha invalida";
        int dias = 0;
        Fecha corriente = new Fecha(dia, mes, anho);
        while(corriente.esAnterior(otraFecha)){
            if(corriente.obtenerDia() < cantDias(corriente.obtenerMes(), corriente.obtenerAnho())){
                corriente.dia++;
            }else{
                corriente.dia = 1;
                if(corriente.obtenerMes() < 12){
                    corriente.mes++;
                }else{
                    corriente.mes = 1;
                    corriente.anho++;
                }
            }
            dias++;
        }
        System.out.println("la cantidad de dias es" + dias);
        return dias;
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
          return esBisiesto(unAnho) ? 29 : 28;
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
