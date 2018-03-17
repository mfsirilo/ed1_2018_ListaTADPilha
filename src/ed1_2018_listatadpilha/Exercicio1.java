package ed1_2018_listatadpilha;

public class Exercicio1 {

    private boolean testaPilha(Pilha pilha1, Pilha pilha2) {
        Pilha auxPilha1 = new Pilha();
        Pilha auxPilha2 = new Pilha();

        auxPilha1 = pilha1;
        auxPilha2 = pilha2;

        if (auxPilha1.size() != auxPilha2.size()) {
            return false;
        }

        while (!(auxPilha1.isEmpty())) {

            if (!(auxPilha1.Topo().equals(auxPilha2.Topo()))) {
                return false;
            } else {
                auxPilha1.Pop();
            }
            auxPilha2.Pop();
        }
        return false;
    }

    public void Exercicio1() {
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();

        for (int i = 0; i < 5; i++) {
            pilha1.Push(1 + i);
            pilha1.Push(i);
        }

        for (int i = 0; i < 5; i++) {
            pilha2.Push(i + 2);
            pilha2.Push(i);
        }
        if (testaPilha(pilha1, pilha2)) {
            System.out.println("Pilhas iguais");
        } else {
            System.out.println("Pilhas Deferentes");
        }
    }
}
