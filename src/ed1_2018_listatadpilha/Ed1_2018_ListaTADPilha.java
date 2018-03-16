package ed1_2018_listatadpilha;

public class Ed1_2018_ListaTADPilha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercicio1 exe1 = new Exercicio1();
        Exercicio3 exe3 = new Exercicio3();
        Exercicio4 exe4 = new Exercicio4();

        System.out.println("Informe o exercicio a ser executado");
        int exe = scan.nextInt;

        while (exe != 0) {
            switch (exe) {
                case 1:
                    exe1.Exercicio1();
                    break;
                case 2:
                    exe2.Exercicio2();
                    break;
                case 3:
                    exe3.Exercicio3();
                    break;
                case 4:
                    exe4.Exercicio4();
                    break;
                case 5:
                    exe5.Exercicio5();
                    break;

            }
        }

    }

}
