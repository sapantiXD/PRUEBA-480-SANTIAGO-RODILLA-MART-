import java.util.Scanner;

public class PRUEBA480_SANTIAGO {

    public static void main(String[] args) {

    
       
        Scanner teclado = new Scanner(System.in);
                
        int numAsignaturas, k, suspensos, todosDiez;
        double nota, suma, media;
        String acumulador;
        
        acumulador = "";
        suma = 0;
        suspensos = 0;
        todosDiez = 1;
        k = 1;
        
        System.out.println("===CALCULADORA===DE===NOTAS===");
        
        //El uso del bucle do-while se repite mientras el número que 
        //esté fuera del rango 1-10. Esto garantiza que siempre tengamos
        //un valor válido.
        
        do { 
            System.out.print("¿Cuántas asignaturas tienes? (1-10): ");
            numAsignaturas = teclado.nextInt();
            if (numAsignaturas < 1 || numAsignaturas > 10) {
                System.out.println("Error: debe ser entre 1 y 10");
            }
        } while (numAsignaturas < 1 || numAsignaturas > 10);
        
        //Pedimos la nota de cada asignatura una por una
        
        for(k = 1; k <= numAsignaturas;k++){
    
                System.out.print("Nota de la asignatura " + k + " (0-10): ");
                nota = teclado.nextDouble();
                
                //Aqui en esta parte utilizamos un while para que valide que
                //La nota este entre 0-10.
                
                while(nota < 0 || nota > 10)
                {
                    System.out.println("Error: debe ser entre 0 y 10");
                    System.out.print("Nota de la asignatura " + k + " (0-10): ");
                    nota = teclado.nextDouble();
                }
            
            //En esta parte esta la contrucción del String Acumulador
            
            if (k == 1) {
                acumulador = acumulador + nota;
            } else {
                acumulador = acumulador + ", " + nota;
            }
        
            suma = suma + nota;
            if (nota < 5) {
                suspensos++;
            }
            if (nota != 10) {
                todosDiez = 0;
            }

        } 
        
        //Calculo de la media
        
        media = suma / numAsignaturas;
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Estas son tus notas: " + acumulador);
        System.out.println("Nota media: " + media);
        System.out.println("Asignaturas suspensas: " + suspensos);
        
        System.out.print("Resultado final: ");
        if (media >= 5 && suspensos <= 1) {
            System.out.print("APROBADO ;)");
        } else {
            System.out.print("SUSPENDIDO");
        }
      
        System.out.println();
        
    }
}