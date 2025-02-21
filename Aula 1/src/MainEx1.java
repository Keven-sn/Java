public class MainEx1 {
    public static void main(String[] args) {
        int x = 1;
        int repetir = 0;
        do{
            System.out.println( "  Caso escolha....");
            switch (x) {
                case 1:
                    System.out.println("Ótima escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 2,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            System.out.print("Para repetir, digite 0");
        }while(repetir ==0);
    }

}

