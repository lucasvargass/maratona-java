package lucasvargas.javaintroducao;

public class Aula04Operadores {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Operadores Basicos - + / *

        int numero01 = 20;
        int numero02 = 20;
        System.out.println(numero01 + numero02);
        System.out.println("Valor: " + numero01 + numero02);
        System.out.println(numero01 + numero02 +" Valor: " + numero01 + numero02);
        
        int resultadosoma = numero01 + numero02;
        System.out.println("Valor: " + resultadosoma);

        int resultadomult = numero01 * numero02;
        System.out.println("Valor da Multiplicação: " + resultadomult);

        int resultadodiv = numero01 / numero02;
        double valordivdouble = numero01 / numero02;
        System.out.println("Valor da Divisão: " + resultadodiv);
        System.out.println("Valor da Divisão: " + valordivdouble);

        int resultadosub = numero01 - numero02;
        System.out.println("Valor da Subtração: " + resultadosub);

        // Operadores Relacionais %

        int resto = 20 % 8;
        System.out.println("O resto e: " + resto);

        int number1 = 90;
        int numeber2 = 56;
        int resto02 = numero01 % numeber2;
        System.out.println("O resto e: " + resto02);

        // Operadores Logicos < > <= >= == != (semrpe vao retornar valores boolean)

        boolean maior = 10 > 29;
        System.out.println("E maior 10 e 29? " + maior);

        boolean menor = 10 < 29;
        System.out.println("E menor 10 e 29? " + menor);

        boolean igual = 10 == 20;
        System.out.println("E igual 10 e 20? " + igual);

        boolean igual02 = 20 == 20;
        System.out.println("E igual 20 e 20? " + igual02);

        boolean diferente01 = 10 != 10;
        System.out.println("E diferente 10 e 10? " + diferente01);

        boolean diferente02 = 10 != 20;
        System.out.println("E diferente 10 e 20? " + diferente02);

        // Operadores Logicos && (and/e) || (or/ou)

        int idade = 29;
        float salario = 3500;
        boolean DentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println("Dentro da Lei Maior que Trinte: " + DentroDaLeiMaiorQueTrinta);

        boolean DentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da Lei Menor que Trinte: " + DentroDaLeiMenorQueTrinta);

        // OR - EXERCICIOS

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupança = 10000;
        float ValorPlayStation = 5000f;

        boolean IsPlayStationCincoCompravel = ValorTotalContaCorrente > ValorPlayStation || ValorTotalContaPoupança > ValorPlayStation;
        System.out.println("O playstation cinco e compravel?: " + IsPlayStationCincoCompravel);

        // Operadores Logicos de Atribuição = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Valor e: "  + bonus);

        // ++ --

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // pode ser tbm ++contador;
        contador--; // pode ser tbm --contador;
        System.out.println("A contagem e: " + contador);
    }
}
