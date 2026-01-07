package AAFramework;

public class AAException extends Exception {
    
    public AAException(String e, String clase, String metodo) {
        //grabar el log
        //System.out.println("[ERROR APP --> LOG] " + clase + "." + metodo + " : " + e);
    }

    @Override
    public String toString() {
        return " ¿Qué Miras? D: ";
    }
}
