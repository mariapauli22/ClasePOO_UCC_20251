import java.nio.file.StandardOpenOption;

public class Variables{
    public static void main(String [] EGS){

        //Declaracion de una variable de tipo entero.
        int edad= 25;

        //Declaracion de una variavle de tipo real.
        double altura= 1.75;

        //Declaracion de una varible de cadena.
        String nombre= "juan";

        //Declaracion de una variable de tipo boolean.
        boolean esEstudiante = true;

        /*
        Con la instrucion System.out.println se mostraran 
        las variables y cada una de ellas estara concatenada con el signo (+)
        y la leyenda
         */

        System.out.println("Nombre: " + nombre + ", Edad: " + edad + "Altura: " + altura);
        System.out.println("Estudiante: " + esEstudiante);



}
}