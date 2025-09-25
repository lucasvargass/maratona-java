package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais03 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // MINI EXERCICIO

        double salario = 4000;
        String mensagem01 = "Eu vou doar 500 para LVP DIGITAL!";
        String mensagem02 = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if (salario >= 5000) {
            resultado = mensagem01;
        }else{
            resultado = mensagem02;
        }
        System.out.println(resultado);
        
        // OPERADOR TERNARIO

        double salario02 = 5000;
        String texto01 = "Voce vai dar 600 reais!";
        String texto02 = "Voce não tem dinheiro!";
        // (condição) ? verdadeiro : falso
        String resultado02 = salario02 >= 5000 ? texto01 : texto02;
        System.out.println(resultado02);

    }

}
