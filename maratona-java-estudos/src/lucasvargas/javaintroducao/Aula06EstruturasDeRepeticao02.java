package lucasvargas.javaintroducao;

public class Aula06EstruturasDeRepeticao02 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // EXERCICIO PARA FIXAÇÃO
        // Imprima todos os numero pares de 0 ate 10000
        
        for (int numeroPar = 0; numeroPar <= 10000; numeroPar+=2){
            System.out.println("Numeros Pares: " + numeroPar);
        }

        // RESOLUÇÃO DO PROFESSOR
        
        for(int i=0; i<=10000; i+=2) {
            if(i % 2 == 0) // para saber se e par ou impar diante de qualquer variavel
            System.out.println(i);
        }
    }
}
