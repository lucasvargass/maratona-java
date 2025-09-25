package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais01 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        if (true) {
            System.out.println("Dentro do IF");
        }

        System.out.println("Fora do IF");

        int idade01 = 15;
        if (idade01 >= 18) {
            System.out.println("Voce e maior de idade");
        }

        int idade02 = 15;
        boolean AutorizadoComprarBebida = idade02 >= 18;
        if (AutorizadoComprarBebida) {
            System.out.println("Voce esta autorizado a comprar bebida!");
        }
        if (AutorizadoComprarBebida == false) { // OU COLOCAR O ( ! ) NO INICIO PRA NEGAÇÃO DE COMPARAÇÃO
            System.out.println("Voce NÃO esta autorizado a comprar bebida!");
        }

        ///////////////////////////////////////////////////////////////////

        int idade03 = 17;
        if (idade03 >= 18) {
            System.out.println("Voce e maior de idade!");
        }else{
            System.out.println("Voce nao e maior de idade!");
        }
    }
}
