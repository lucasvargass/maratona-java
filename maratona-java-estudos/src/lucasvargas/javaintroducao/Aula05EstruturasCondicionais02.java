package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais02 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Estrutura ELSE IF
        
        // idade < 15 categoria infantil
        // idade >= 15 categoria juvenil
        // idade >= 18 categoria adulto

        int idade02 = 17;

        int idade01 = 18;
        if (idade01 < 15) {
            System.out.println("Categoria Infantil");
        }
        if (idade01 >= 15) {
            System.out.println("Categori Juvenil");
        }
        if (idade01 >= 18) {
            System.out.println("Categoria adulto");
        }

        /////////////////////////////////////////////////

        if (idade02 < 15) {
            System.out.println("Voce e da catgoria INFANTIL");

        }else if (idade02 >= 15 && idade02 < 18) {
            System.out.println("Voce e da categoria JUVENIL");

        }else{
            System.out.println("Voce e da categoria ADULTO");
        }

        /////////////////////////////////////////////////

        String categoria;
        if (idade02 < 15) {
            categoria = "Voce e da categoria infantil!";
        }else if (idade02 >= 15 && idade02 < 18) {
            categoria = "Voce e da categoria juvenil!";
        }else{
            categoria = "Voce e da categoria ADULTO!";
        }
        System.out.println(categoria);

        // OUU - MODELO TERNARIO //

        categoria = idade02 < 15 ? "Voce e da categoria infantil!" : idade02 >= 15 && idade02 < 18 ? "Voce e da categoria juvenil!" : "Voce e da categoria ADULTO!";

        
    }
}
