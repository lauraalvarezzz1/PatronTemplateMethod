package Example1;

/**
 * Created by lauraalvarez on 9/12/17.
 */
public class firstClass extends abstractClass {
        public firstClass(){
        }

        @Override
        public int multiplicar(int num)
        {
            return num * 5;
        }

        @Override
        public int sumarrestar( int num )
        {
            return num + 20;
        }
}
