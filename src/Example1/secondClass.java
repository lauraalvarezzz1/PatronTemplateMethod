package Example1;

/**
 * Created by lauraalvarez on 9/12/17.
 */
public class secondClass extends abstractClass {
    public secondClass() {
    }

    @Override
    public int multiplicar(int num) {
        return num * 50;
    }

    @Override
    public int sumarrestar(int num) {
        return num - 200;
    }
}

