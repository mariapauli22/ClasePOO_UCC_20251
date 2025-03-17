public class Estudiante {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String facultad;


    //constructor de la clase_me permite inicializar la clase
    // this--> autoreferencia a los atributos de la clase
    public Estudiante (int id, String nombre, String apellido, int edad, String facultad){ 

        this.id= id ;
        this.nombre = nombre ;
        this.apellido= apellido;
        this.edad= edad;
        this.facultad= facultad;

    }

    //métodos get y set ó (getter and setter)
    public int getId(){
        return id;

    }

    public void setId(int id){
        this.id=id;

    }

    public void setNombre(String nombre){ 
        this.nombre= nombre;

    }

    public void setApellido(String Apelido){ 
        this.apellido = apellido;

    }
    
    public void setFacultad(String facultad){ 
        this.facultad= facultad;

    }


    public String getApellido(){ 
        return apellido;

    }


    //Métodos de la clase
    public void matricularCursos(String curso){
        System.out.println("Curso: " + curso + " Matriculado!!.");
    }
    
    public String verificarCreditos(int creditos){
        String cad = "";
        if(creditos < 10){
            cad = "No puede matricular menos de 10 créditos";
        }else{
            cad = "Sus créditos cumplen con lo requerido";
        }
        return cad;
    
    }


    public String toString() {
        return "Estudiante { id:" + id +
                " nombre:" + nombre +
                " apellido:" + apellido +
                " edad:" + edad +
                " facultad:" + facultad + "}";
    }
}
