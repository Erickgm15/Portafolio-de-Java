import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("/n/n");
            System.out.println(" Bienvenidos a mi  POLLO  java [Pollo Version 1.0]");
            System.out.println("");

        System.out.println("  ____   ___  _     _     ___  ");
        System.out.println(" |  _ \\ / _ \\| |   | |   / _ \\ ");
        System.out.println(" | |_) | | | | |   | |  | | | |");
        System.out.println(" |  __/| |_| | |___| |__| |_| |");
        System.out.println(" |_|    \\___/|_____|_____\\___/ "); 
        System.out.println("");   
        System.out.println("");

        System.out.println("[?] Selecciona una Opcion para Continuar ");
        System.out.println("--> Proyecto Iniciado -->  Mar 18 8:45 am  2025");
        System.out.println("");


            // MENU
            System.out.println("[1] La suma de 2 numeros  :");
            System.out.println("[2] Opcion 2 :");
            System.out.println("[3] Opcion 3 :");
            System.out.println("[0] Salir:");
            System.out.print("[?]");
            opcion =   scanner.nextInt();

            // Opciones del menu 
            switch(opcion) {

                case 1:
            System.out.println("Introduce el numero 1 : ");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el numero 2 : ");
            int num2 = scanner.nextInt();
            int suma = num1 + num2;
            System.out.println("La suma de los numeros es : "+suma);
            System.out.println("------------------------");
                    break;
                    
                case 2:
                    ;
                    break;
                case 3:
                    
                    break;
                case 0:
                    
                    break;
                default: System.out.println(" Opcion no valida ");
                   
                    break;
            }
         }while(opcion != 0);
}
}