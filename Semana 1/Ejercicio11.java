public class Ejercicio11 {

    public static void main(String[] args) {

        // creacion del arreglo a de enteros de n elementos

        // Declaracion del arreglo de tamaño n

        int n = (int) (math.random() * (30 - 15)) + 15;
        int[] a = new int[n];

        // llenar el arreglo con numeros comprendidos entre -20 y 20

        for (int i = 0; i < b.length; i++) {
            a[i] = (int) (Math.random() * (20 + 20)) - 20;

        }

        // Mostrar e arreglo para validar que se esta guardando los elementos

        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i]);

        }

        System.out.println();

        // Se va a recorrer el arreglo para determinar cuantos numeros son positivos,
        // negativos y cero
        int contadorPositivos = 0, contadorPositivos = 0, contadorPositivos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contadorPositivos++;
            } else if (a[i] < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;

            }

        }


        //Crear los numeros que almacenaran los numeros positivos,negativos y ceros

        int[]positivos= new int[contadorPositivos];
        int[]negativos= new int[contadorNegativos];
        int[]ceros = new int [contadorCeros];

        //Guardar los elementos que les corresponde a cada arreglo
        int j=0, k=0, q=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                positivos[j]=a[i];
                j++;
            }else if (a[i]<0){
                negativos[k]=a[i];
                k++;
            }else{
                ceros[q]=a[i];
                q++;

            }

        }

        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        System.out.println(Arrays.toString(ceros));
        




    }
}