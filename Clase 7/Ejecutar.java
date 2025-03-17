public class Ejecutar {
    public static void main(String[] args) {
    
    //Instanciar el objeto (creación)
    Estudiante objEst1 = Estudiante (1, "Gabriela", "Astorquiza", 15, "Ingeniera");
    Estudiante objEst2 = Estudiante (2,"Juan", "Castro",20, "Derecho");

    System.out.println(objEst1); //toString
    System.out.println(objEst2);

    //Modificar la edad del estudiante
    objEst1.setEdad(20);

    System.out.println(objEst1);

    }
}
