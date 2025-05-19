public class Armas {
    private String nombre;
    private int danioExtra;

    //inicializa el topping con el respectivo nombre y su daño extra
    public Armas (String nombre, int danioExtra) {
        this.nombre = nombre;
        this.danioExtra = danioExtra;
    }

    //accede al daño extra y el nombre del topping
    public int getDanioExtra() {
        return danioExtra;
    }

    public String getNombre(){
        return nombre;
    }
}
    
    
