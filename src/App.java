import java.util.Scanner;
public class App {
    //PRUEBA 1
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World by Ani!");
    // }


    //PRUEBA 2
    // public static void main(String args[]){
    //     int num1= 10;
    //     int num2= 20;
    //     int result = num1 + num2;
    //     int promedio= result/2;
    //     System.out.println("El resultado es: " + result);
    //     System.out.println("El promedio es: " + promedio);
    //     if(promedio>12){
    //         System.out.println("aprobado");
    // } else{
    //     System.out.println("reprobado");
    // }
    //}

    //PRUEBA 3
    // public static void main(String[] args) {
    //     System.out.println("Ingrese su nombre");
    //     @SuppressWarnings("resource")
    //     Scanner entrada= new Scanner(System.in);
    //     String nombre= entrada.nextLine();

    //     System.out.println("¿quiere café o té?");
    //     @SuppressWarnings("resource")
    //     String eleccion= new Scanner(System.in).nextLine();
        
    //     System.out.println("Gracias "+ nombre + ", tu eleccion es: "+ eleccion);
    // }

    //! PRUEBA 4 swich -case
    // public static void main(String[] args){
    //     Scanner entrada= new Scanner(System.in);

    //     System.out.println("*************************************");
    //     System.out.println("Bienvenido al sistema Francachela");
    //     System.out.println("*************************************");
    //     System.out.print("Ingrese su nombre :");
    //     String nombre= entrada.nextLine();
    //     System.out.print("gracias "+ nombre+ "¿cual es su edad?: ");  
    //     int edad= entrada.nextInt();
    //     String esMayorDeEdad;
    //     if(edad>=18){
    //         esMayorDeEdad= "mayor";
    //     } else{
    //         esMayorDeEdad= "menor";
    //     }

    //     switch(esMayorDeEdad){
    //         case "mayor": System.out.println("Perfecto, usted es mayor de edad, estas son las ofertas ..."); 
    //         break; 
    //         case "menor": System.out.println("Lo siento, usted es menor de edad, no puede comprar aqui");	
    //         break;
    //         default: System.out.println("Error, no se ha podido identificar su edad");
    //         break;
    //     }
    // }

    //! PRUEBA 5 - for
    public static void main(String args[]){
        System.out.println("");

        // for(int i=1; i<=10; i++){
        //     System.out.print(i+" ,");
        // }

        // int num=99;
        // for(int i=1; i<=5; i++){
        //     System.out.print(i+" , "+ num-- +" , ");
        // }
        
        int ind0=0; //
        int ind1=0;
        for(int i=0; i<=10; i++){ 
            int result=ind0+ind1; //0
            System.out.print(result +" , "); //0,1,1
            ind0= ind1; //0
            ind1= result; //0
            
        }
    }
}
