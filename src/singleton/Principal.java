package singleton;

public class Principal {

    public static void main(String[] args) {
        
        SoyUnico persona = SoyUnico.getSingletonInstance("Persona");
        SoyUnico persona2 = SoyUnico.getSingletonInstance("Persona2");
        

 
    }
}