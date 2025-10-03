package lucasvargas.javaintroducao;

public class Aula06EstruturasDeRepeticao05 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Estrutura sobre o Contine

        double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$" + valorParcela);
        }
    }
}
