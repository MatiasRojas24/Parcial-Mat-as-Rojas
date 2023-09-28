import java.util.Scanner;
public class Calculadora_MatiasRojas {
    public static void main(String[] args) {
        double num1, num2, resultado;
        byte option = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido!");
        do{
            // Muestra lista de opciones
            System.out.println("¿Qué desea hacer?: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. División");
            System.out.println("4. Multiplicación");
            System.out.println("0. Salir");
            // Pide la selección de la opción
            option = sc.nextByte();
            //Verifica si la opcion es suma (1)
            if(option == 1) {
                System.out.println("Ha seleccionado suma");
                //Pide ambos números
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                // Llama a la función
                resultado = suma(num1, num2);
                // Muestra el resultado de la operación
                System.out.println("La suma: "+num1+" + "+num2+" = "+resultado);
            }
            //Verifica si la opcion es resta (2)
            if(option == 2) {
                System.out.println("Ha seleccionado Resta");
                //Pide ambos números
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                // Llama a la función
                resultado = resta(num1, num2);
                // Muestra el resultado de la operación
                System.out.println("La resta: "+num1+" - "+num2+" = "+resultado);
            }
            //Verifica si la opcion es división (3)
            if(option == 3) {
                System.out.println("Ha seleccionado división");
                //Pide ambos números
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                // Llama a la función
                resultado = division(num1, num2);
                // Muestra el resultado de la operación
                if (num2 != 0){System.out.println("La división: "+num1+" / "+num2+" = "+String.format("%.2f",resultado));}
            }
            //Verifica si la opcion es multiplicación (4)
            if(option == 4) {
                System.out.println("Ha seleccionado multiplicación");
                //Pide ambos números
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                // Llama a la función
                resultado = multiplicacion(num1, num2);
                // Muestra el resultado de la operación
                System.out.println("La multiplicación: "+num1+" * "+num2+" = "+resultado);
            }
            //Verifica si la opcion es salir (0)
        }while(option != 0);
        //Muestra mensaje de despedida
        System.out.println("Hasta luego!");
    }
    //Función que realiza la suma
    public static double suma(double x, double y){
        double resultado_suma;
        resultado_suma = x + y;
        return resultado_suma;
    }
    //Función que realiza la resta
    public static double resta(double x, double y){
        double resultado_resta;
        resultado_resta = x - y;
        return resultado_resta;
    }
    //Función que realiza la división
    public static double division(double x, double y){
        double resultado_division;
        // Verifica si el divisor es 0 y muestra un mensaje de error
        if (y == 0){
            System.out.println("No puede dividir por 0");
        }else{
        resultado_division = x / y;
        return resultado_division;
        }
        return 0;
    }
    //Función que realiza la multiplicación
    public static double multiplicacion(double x, double y){
        double resultado_multiplicacion;
        resultado_multiplicacion = x * y;
        return resultado_multiplicacion;
    }
}
