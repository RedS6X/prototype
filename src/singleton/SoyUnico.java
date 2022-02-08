package singleton;
public class SoyUnico {

    private String nombre;
    private static SoyUnico soyUnico;


    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SoyUnico getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new SoyUnico(nombre);
        }
        else{
            System.out.println("No se puede crear a " + nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return soyUnico;
    }




}