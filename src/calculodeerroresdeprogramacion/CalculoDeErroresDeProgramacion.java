package calculodeerroresdeprogramacion;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class CalculoDeErroresDeProgramacion {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        double real=0,aprox=0;
        boolean salir=false;
        do{
            System.out.println("\n_________________________________________");
            System.out.println("\nCÁLCULO DE ERRORES");
            System.out.println("      MENU         ");
            System.out.println("1.Error Absoluto");
            System.out.println("2.Error Relativo");
            System.out.println("3.Error Relativo Porcentual");
            System.out.println("4.Calcular todos los Errores anteriores");
            System.out.println("5.Salir");
            System.out.println("_________________________________________");
            System.out.println("¿Qué error quiere calcular?");
            int opcion=t.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.print("Ingrese el valor real: ");
                    real=t.nextDouble();
                    System.out.print("Ingrese el valor aproximado: ");
                    aprox=t.nextDouble();
                    Errores valores=new Errores(real,aprox);
                    System.out.println("\nEl valor Absoluto es: "+valores.ErrorAbsoluto());
                    break;
                case 2:
                    System.out.print("Ingrese el valor real: ");
                    real=t.nextDouble();
                    System.out.print("Ingrese el valor aproximado: ");
                    aprox=t.nextDouble();
                    valores=new Errores(real,aprox);
                    System.out.println("El valor Relativo es: "+valores.ErrorRelativo());
                    break;
                case 3:
                    System.out.print("Ingrese el valor real: ");
                    real=t.nextDouble();
                    System.out.print("Ingrese el valor aproximado: ");
                    aprox=t.nextDouble();
                    valores=new Errores(real,aprox);
                    System.out.println("El valor Relativo Porcentual es: "+valores.ErrorRelativoPorcentual()+" %");
                    break;
                case 4:
                    System.out.print("Ingrese el valor real: ");
                    real=t.nextDouble();
                    System.out.print("Ingrese el valor aproximado: ");
                    aprox=t.nextDouble();
                    valores=new Errores(real,aprox);
                    System.out.println("\nEl valor Absoluto es: "+valores.ErrorAbsoluto());
                    System.out.println("El valor Relativo es: "+valores.ErrorRelativo());
                    System.out.println("El valor Relativo Porcentual es: "+valores.ErrorRelativoPorcentual()+" %");
                    break;
                case 5:
                    salir=true;
                    System.out.println("ESTE PROGRAMA FUÉ HECHO POR JOSÉ MAURICIO CANUL CHUC - 19070026");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        }while(salir!=true);
        
    }
}