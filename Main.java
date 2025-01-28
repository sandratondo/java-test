import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //IMC ejercio 1
            System.out.println("Introduce tú peso: ");
            double peso = scanner.nextDouble();
            System.out.println("Introduce tú altura: ");
            double alturaCm = scanner.nextDouble();

            double altura = alturaCm / 100; // Convertir altura de cm a metros
            String resultadoIMC = calcularIMC(peso, altura); //llamar función
            System.out.println(resultadoIMC);

            //Números N ejercicio2
            System.out.println("Introduce un número N:");
            int n = scanner.nextInt();
            int sumaNumeros = sumarNumeros(n);
            System.out.println("La suma de números de n: "+n+" es: "+sumaNumeros);

            //array ejercicio3
            Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
            moverCeros(array);

            //mostrar array modificado
            for (Object num : array){
                System.out.println(num+" ");
            }


        } finally {
            scanner.close(); // cerrar scanner
        }
        
    }

    public static String calcularIMC(double peso, double altura) {
       double imc = peso  / (altura * altura); //calcular imc
       
       if(imc <= 18.5){
            return "Infrapeso";
       }else if(imc <= 25.0){
            return "normal";
       }else if(imc <= 30){
            return "sobrepeso";
       }else{
            return "obeso";
       }
    }

    public static int sumarNumeros(int n){
        int sumaTotal = 0;

        for (int i = 1; i <= n; i++){
            int num = i;

            // Sumar todos los números de un número
            while (num > 0) {
                sumaTotal += num % 10; // Extraer el último número
                num /= 10; // borrar último número
                
            }
        }
        return sumaTotal;
    }


    public static void moverCeros(Object[] array) {
        int indiceNoCero = 0;

        for (int i = 0; i < array.length; i++){   

            // Verifico si el valor actual no es igual a 0
            if(!Objects.equals(array[i], 0)){
                 // Si es un valor no cero, intercambio el valor
                Object temporal = array[indiceNoCero];
                array[indiceNoCero] = array[i];
                array[i] = temporal;
                indiceNoCero++;
            }
        }
    }

    
}
