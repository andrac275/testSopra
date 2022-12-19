package pruebaAndreu.Ejercicio2;

public class Persona {
    //Valores de sexo -> m:masculino f:femenino
    String sexo;
    int edad;

    public Persona(String sexo, int edad){
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getEdad(){
        return this.edad;
    }
}
