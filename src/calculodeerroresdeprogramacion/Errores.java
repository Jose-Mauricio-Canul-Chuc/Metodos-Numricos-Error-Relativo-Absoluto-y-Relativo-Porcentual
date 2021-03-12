package calculodeerroresdeprogramacion;
/**
 *
 * @author Mauricio
 */
public class Errores {
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
        double absoluto,resultado;
        
        absoluto=ValorReal-ValorAproximado;
        if(absoluto<0)
            return resultado=(-1)*absoluto;
        else
            return resultado=absoluto;
    }
    
    public double ErrorRelativo(){
        double relativo,resultado;
        
        relativo=ErrorAbsoluto()/ValorReal;
        
        if(relativo<0)
            return resultado=(-1)*relativo;
        else
            return resultado=relativo;
    }
    
    public double ErrorRelativoPorcentual(){
        double porcentual,resultado;
        
        porcentual=ErrorRelativo()*100;
        
        if(porcentual<0)
            return resultado=(-1)*porcentual;
        else
            return resultado=porcentual;
    }
}