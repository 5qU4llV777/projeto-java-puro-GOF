package nogueira.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author 5qU4llV777
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
