package lucasvargas.javaintroducao;

public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        
        // Estruturas de Repetição - While, do While e For

        int numero01 = 13;
        while (numero01 < 10) {
            System.out.println(numero01); // ou numero01++ dentro do sout
            numero01 = numero01 + 1; // ou numero01++
        }

        // DO WHILE
        
        do { 
            System.out.println("Dentro do-While");
        } while (numero01 < 10);
        System.out.println("Condição Invalida!");

        // FOR

        for(int numero02 = 0; numero02 < 10; numero02++) {
            System.out.println("For: " + numero02);
        }

        for(int i=10; i<=20; i++){
            System.out.println("Para: " + i);
        }
    }
}