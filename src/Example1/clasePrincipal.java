package Example1;

public class clasePrincipal {

    public static void main(String[] args) {
        System.out.println("Método Template");

        firstClass c1= new firstClass();
        secondClass c2= new secondClass();

        // Obtener el resultado de multiplicar 3 por 5 y sumarle 20
        int num1 = c1.obtener(3);
        System.out.println( "Primer resultado: " + num1 );

        // Obtener el resultado de multiplicar 8 por 50 y restarle 200
        int num2 = c2.obtener(8);
        System.out.println( "Segundo Resultado: " + num2 );

    }
}
