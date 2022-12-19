package pruebaAndreu.Ejercicio1;

public class Ejercicio1{
    public static int leerNumero(){
        System.out.println("Escribe un numero");
        return Integer.parseInt(System.console().readLine());
    }

    public static void escribePares(int numero){
        if (numero == 0){
            System.out.println(numero);
            return;
        }
        System.out.println(numero);
        escribePares(numero -2);
    }

    public static void escribeInPares(int numero){
        if (numero == 1){
            System.out.println(numero);
            return;
        }
        System.out.println(numero);
        escribeInPares(numero -2);
    }

    public static void main(String[] args){
        try{
            int numero = leerNumero();
            if (numero % 2 == 0){
                escribePares(numero);
            }
            if (numero % 2 == 1){
                escribeInPares(numero);
            }
        }catch(NumberFormatException e){
            System.out.println("Escribe un numero entero");
        }
    }
}