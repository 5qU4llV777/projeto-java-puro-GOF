package nogueira.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author 5qU4llV777
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
