public class EJercicio2 {

    public static void main(String[] args) {
        
        /*
         Se tienen N empleados...
         */


         
         //sueldo de los empleados

        double[] A={1000.0,135.0,900.0};
        //Asignaciones totales de cada empleado
        double[] B= {100.0, 230.0,150.0};
        //Deducciones de cada empleado
        double[] C= {20.0,35.0,10.0};


        //Arreglo que almacena el neto a pagar de cada empeado
        double[] T=new double [A.length];
        
        //Asignacion de la formula a cada posicion del arreglo

        for(int i= 0 ; < T.length; i++){
            T[i]=A[i]+B[i]-C[i];


        //Mostrar el neto a pagar de los empleados



    }
}