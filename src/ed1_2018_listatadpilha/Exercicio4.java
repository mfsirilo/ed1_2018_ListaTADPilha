package ed1_2018_listatadpilha;

public class Exercicio4 {

    private Pilha chegaNoDeposito(Pilha pilhaMae) {
        Pilha pilhaA = new Pilha();
        Pilha pilhaB = new Pilha();
        Pilha pilhaC = new Pilha();

        int auxMae = (int) pilhaMae.Topo();

        while (!(pilhaMae.isEmpty())) {

            if ((pilhaA.isEmpty()) || (auxMae <= (int) pilhaA.Topo())) {
                pilhaA.Push(auxMae);
                pilhaMae.Pop();
            } else {

                while (auxMae > (int) pilhaA.Topo()) {

                    int aux = (int) pilhaA.Topo();

                    if (aux == 5) {
                        pilhaB.Push(aux);
                    }
                    if (aux == 3) {
                        pilhaC.Push(aux);
                    }
                    pilhaMae.Pop();

                }
                while (!(pilhaB.isEmpty())) {
                    int aux = (int) pilhaB.Topo();
                    pilhaA.Push(aux);
                    pilhaB.Pop();
                }
                while (!(pilhaC.isEmpty())) {
                    int aux = (int)pilhaC.Topo();
                    pilhaA.Push(aux);
                    pilhaC.Pop();
                }
            }
            pilhaMae.Pop();
        }
        return pilhaA;
    }

    public void Exercicio4() {
        Pilha pilhaMae = new Pilha();

        for (int i = 0; i < 25; i++) {
            if (i < 8) {
                pilhaMae.Push(7);
            }
            if (i < 12) {
                pilhaMae.Push(5);
            }
            if (i <= 25) {
                pilhaMae.Push(7);
            }
        }
        chegaNoDeposito(pilhaMae);
    }

}
