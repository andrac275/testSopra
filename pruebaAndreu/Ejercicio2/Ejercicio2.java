package pruebaAndreu.Ejercicio2;

public class Ejercicio2 {
    public static String sexoAleatorio(){
        int valor = (int)(Math.random() * 2);
        if (valor == 0) return "m";
        if (valor == 1) return "f";
        return "error sexo";
    }

    public static int edadAleatoria(){
        //Devuelve edad entre 0 y 90.
        return (int)(Math.random() * (91));
    }

    public static Persona[] leerPersonas(){
        Persona[] personas = new Persona[50];
        for (int pos = 0; pos < personas.length; pos++){
            personas[pos] = new Persona(sexoAleatorio(),edadAleatoria());
        }
        return personas;
    }

    public static void main(String[] args){
        Persona[] personas = leerPersonas();
        int mayorEdad = 0;
        int menorEdad = 0;
        int masculinoMayorEdad = 0;
        int femeninoMenorEdad = 0;
        int numeroMujeres = 0;

        for (int pos = 0; pos < personas.length; pos++){
            if (personas[pos].getEdad() >= 18){mayorEdad++;}
            if(personas[pos].getSexo().equals("m") 
                && personas[pos].getEdad() >= 18){
                    masculinoMayorEdad++;
                }
            if(personas[pos].getSexo().equals("f")
                && personas[pos].getEdad() <18){
                    femeninoMenorEdad++;
                }
            if(personas[pos].getSexo().equals("f")){
                numeroMujeres++;
            }
        }
        menorEdad = personas.length - mayorEdad;

        System.out.println("Mayores de edad: " + mayorEdad);
        System.out.println("Menores de edad: " + menorEdad);
        System.out.println("Masculino mayor de edad: " + masculinoMayorEdad);
        System.out.println("Femenino menor de edad: " + femeninoMenorEdad);
        System.out.println("Porcentaje mayores de edad: " + (mayorEdad * 100) / 50);
        System.out.println("Porcentaje de mujeres: " + (numeroMujeres * 100) /50);

    }
}
