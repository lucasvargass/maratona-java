package lucasvargas.javaintroducao;

public class Aula02TiposPrimitivos {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // int, double, Float, char, byte, short, long, boolean

        int idade = 19;
        System.out.println("A sua idade é: " + idade);

        long numeroGrande = 10000L;
        System.out.println("O numero grande e: " + numeroGrande);

        double salarioDouble = 2000D;
        System.out.println("O seu salario e: " + salarioDouble);

        float salarioFloat = 2500f;
        System.out.println("O seu salario e: " + salarioFloat);

        byte idadeByte = -128;
        System.out.println("A sua idade é: " + idadeByte);

        short idadeShort = 32000;
        System.out.println("A sua idade é: " + idadeShort);

        boolean verdadeiro = true;
        System.out.println("A sua afirmação e: " + verdadeiro);

        boolean falso = false;
        System.out.println("A sua afirmação é: " + falso);

        char caractere = 'M';
        String sexo = "Masculino";
        System.out.println("A sua idade é: " + caractere + sexo);

        String caractereString = "LUCAS";
        System.out.println("A seu nome é: " + caractereString);

        // CASTING

        double dinheiroDouble = (float) 2300;
        System.out.println("O seu dinheiro e " + dinheiroDouble);

        long dinheiroLong = (long) 156.86;
        System.out.println("A distancia e " + dinheiroLong);

        // STRING = CLASSE

        String nome = "Lucas";
        System.out.println("O meu nome é " + nome);

        var nome02 = "Luciana";
        System.out.println("O nome dela é " + nome02);
    }
}
