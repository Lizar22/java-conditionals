public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado
        String colour = "rojo";
        if (colour == "verde") {
            System.out.println("Puedes seguir");
        } else if (colour == "amarillo") {
            System.out.println("Ten cuidado");
        } else if (colour == "rojo") {
            System.out.println("¡¡¡Para!!!");
        } else {
            System.out.println("El semáforo está dañado");
        }
        //Cambia el valor de la variable, corre el programa y mira el resultado
    }
}
