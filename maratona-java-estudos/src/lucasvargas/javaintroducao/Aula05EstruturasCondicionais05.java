package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais05 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Estruturas Condicionais - Switch

        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;
        String dia01 = "Domingo";
        String dia02 = "Segunda";
        
        if (dia == 1){
            System.out.println(dia01);
        }else if (dia == 2) {
            System.out.println(dia02);
        }

        // SWITCH

        switch (dia) {
            case 1:
                System.out.println(dia01); 
                break;
            case 2:
                System.out.println(dia02); 
                break;
            case 3:
                System.out.println("Terça"); 
                break;
            case 4:
                System.out.println("Quarta"); 
                break;
            case 5:
                System.out.println("Quinta"); 
                break;
            case 6:
                System.out.println("Sexta"); 
                break;
            case 7:
                System.out.println("Sabado"); 
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }

        // Imprima quando for sexo masculino e feminino

        char sexo = 1;
        String masculino = "Masculino";
        String feminino = "Mulher";

        switch (sexo) {
            case 1:
                System.out.println(masculino);
                break;
            case 2:
                System.out.println(feminino);
                break;
            default:
                System.out.println("Sexo Inesxistente!!");
                break;
        }
    }
}
