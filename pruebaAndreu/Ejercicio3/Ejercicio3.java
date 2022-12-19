package pruebaAndreu.Ejercicio3;

public class Ejercicio3 {
    public static int leerHorasTrabajadas() throws Exception {
        System.out.println("Introduce cuantas horas ha trabajado???");   
        try{
            return Integer.parseInt(System.console().readLine());
        }catch(NumberFormatException e){
            throw new Exception("Introduce un número entero de horas.");
        }
    }

    public static double leerTarifa() throws Exception{
        System.out.println("Introduce el precio por hora a percibir: ");
        try{
            return Double.parseDouble(System.console().readLine());
        }catch(NumberFormatException e){
            throw new Exception("Introduce un número entero o con decimales.");
        }
    }

    public static double calcularImportePagar(int horasTrabajadas, double tarifa){
        if(horasTrabajadas > 40){
            int horasExtras = horasTrabajadas - 40;
            return (40 * tarifa) + (horasExtras * tarifa * 1.5);
        }else{
            return horasTrabajadas * tarifa;
        }

    }

    public static void main (String[] args){
        try{
            int horasTrabajadas = leerHorasTrabajadas();
            double tarifa = leerTarifa();
            double importePagar = calcularImportePagar(horasTrabajadas, tarifa);
            System.out.println("Ha trabajado " + horasTrabajadas + " horas, a un precio de " 
            + tarifa + " por hora. \nLas cuales suman un importe a pagar de: "+importePagar);
        }catch(Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
