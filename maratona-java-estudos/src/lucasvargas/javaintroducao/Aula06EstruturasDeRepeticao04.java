package lucasvargas.javaintroducao;

public class Aula06EstruturasDeRepeticao04 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Exercicio sobre o BREAK
        
        // Dado um valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        System.out.println("================================================");

        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + " R$" + valorParcela);
            }else {
                break;
            }
        } 
        
        System.out.println("================================================");

        // Resolução do Professor

        double valorTotal02 = 40000;
        for(int parcela02 = 1; parcela02 <= valorTotal02; parcela02++){
            double valorParcela02 = valorTotal02 / parcela02;
            if (valorParcela02 < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela02 + " R$" + valorParcela02);
        }

        System.out.println("================================================");
    }
}
