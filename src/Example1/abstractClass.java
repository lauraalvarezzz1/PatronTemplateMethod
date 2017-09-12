package Example1;

/**
 * Created by lauraalvarez on 9/12/17.
 */
public abstract class abstractClass {

    public int obtener(int num) {
        int numero = this.multiplicar(num);
        numero = this.sumarrestar(numero);
        return numero;
    }

    // Métodos que deberán implementar las subclases
    public abstract int multiplicar(int num);
    public abstract int sumarrestar(int num);
}
