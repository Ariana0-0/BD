package AAFramework;

public class AAException extends Exception {
    private String clase;
    private String metodo;

    public AAException(String mensaje, String clase, String metodo) {
        super(mensaje); // 🔥 ESTO ES CLAVE
        this.clase = clase;
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "[ERROR] " + clase + "." + metodo + " -> " + getMessage();
    }
}
