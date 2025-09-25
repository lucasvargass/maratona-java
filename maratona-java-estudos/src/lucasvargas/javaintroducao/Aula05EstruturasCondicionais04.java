package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais04 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // RESOLUÇÃO DE EXERCICO
        
        // $0 $34,712 9.70%
        // $34,712 $68,507 37.35$
        // $68,507 49.50%
        
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double ValorImposto;

        if (salarioAnual <= 34712){
            ValorImposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34712 && salarioAnual <= 68507){
            ValorImposto = salarioAnual * segundaFaixa;
        }else{
            ValorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(ValorImposto);
        System.out.println(salarioAnual);
    }
}
