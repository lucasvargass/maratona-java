package lucasvargas.javaintroducao;

public class Aula06EstruturasDeRepeticao03 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Estrutura sobre o BREAK
        
        // Imprima os primeiro 25 numeros de um dado valor, por exemplo 50

        int valorMaximo = 50;
        for(int i = 0; i <= valorMaximo; i++){
            if(i <= 25){
                System.out.println(i);
            }
        }

        // Resolução do Professor

        int valorMaximo01 = 50;
        for(int u = 0; u < valorMaximo01; u++){
            if(u > 25){
                break;
            }
            System.out.println(u);
        }
    }
}
