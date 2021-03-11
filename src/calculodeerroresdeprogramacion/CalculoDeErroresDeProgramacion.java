package calculodeerroresdeprogramacion;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class CalculoDeErroresDeProgramacion {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        System.out.println("CÁLCULO DE ERRORES\n");
        System.out.print("Unidad de medida del valor(Abreviado): ");
        String unidad=t.next();
        System.out.print("Ingrese el valor real: ");
        double real=t.nextDouble();
        System.out.print("Ingrese el valor aproximado: ");
        double aprox=t.nextDouble();
        
        Errores valores=new Errores(real,aprox);
        
        double res=valores.ErrorAbsoluto();
        System.out.println("\nEl valor Absoluto es: "+res+" "+unidad);
        res=valores.ErrorRelativo();
        System.out.println("El valor Relativo es: "+res);
        res=valores.ErrorRelativoPorcentual();
        System.out.println("El valor Relativo Porcentual es: "+res+" %");
    }
}

class Errores{ //Clase llamada Errores
    private double ValorReal;
    private double ValorAproximado;
    
    //Métodos get y set
    public double getValorReal() {
        return ValorReal;
    }

    public void setValorReal(double ValorReal) {
        this.ValorReal = ValorReal;
    }

    public double getValorAproximado() {
        return ValorAproximado;
    }

    public void setValorAproximado(double ValorAproximado) {
        this.ValorAproximado = ValorAproximado;
    }
    
    //Constructor
    Errores (double ValorReal,double ValorAproximado){
        this.ValorReal=ValorReal;
        this.ValorAproximado=ValorAproximado;
    }
    
    //Métodos Para el cálculo del Error Absoluto, Error Relativo y Error Relativo Porcentual
    public double ErrorAbsoluto(){
        double error,resultado;
        
        error=ValorReal-ValorAproximado;
        if(error<0)
            resultado=(-1)*error;
        else
            resultado=error;
        
        return resultado;
    }
    
    public double ErrorRelativo(){
        double error,resultado;
        
        error=(ValorReal-ValorAproximado)/ValorReal;
        
        if(error<0)
            resultado=(-1)*error;
        else
            resultado=error;
        
        return resultado;
    }
    
    public double ErrorRelativoPorcentual(){
        double error,resultado;
        
        error=((ValorReal-ValorAproximado)/ValorReal)*100;
        
        if(error<0)
            resultado=(-1)*error;
        else
            resultado=error;
        
        return resultado;
    }
}

//FALTÓ LA REUTILIZACION DE FUNCIONES, ESTUVE INVESTIGANDO Y NO ENCONTRE COMO REUTILIZARLOS