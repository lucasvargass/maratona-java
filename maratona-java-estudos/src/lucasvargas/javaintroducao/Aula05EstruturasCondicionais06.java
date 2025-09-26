package lucasvargas.javaintroducao;

public class Aula05EstruturasCondicionais06 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Estruturas Condicionais - Switch - EXERCICIO
        
        // Imprima os valores de 1 a 7, imprima se e dia util ou final de semana
        // Considerando 1 como domingo

        int dia = 10;
        String dia01 = "Domingo";
        String dia02 = "Segunda";
        String dia03 = "Terça";
        String dia04 = "Quarta";
        String dia05 = "Quinta";
        String dia06 = "Sexta";
        String dia07 = "Sabado";

        switch (dia) {
            case 1:
                System.out.println(dia01);
                System.out.println("Final de Semana!");
                break;
            case 2:
                System.out.println(dia02);
                break;
            case 3:
                System.out.println(dia03);
                break;
            case 4:
                System.out.println(dia04);
                break;
            case 5:
                System.out.println(dia05);
                break;
            case 6:
                System.out.println(dia06);
                break;
            case 7:
                System.out.println(dia07);
                System.out.println("Final de Semana!");
                break;
            default:
                System.out.println("Dia invalido!");
                break;
        }
    }
}
