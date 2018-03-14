package ed1_2018_listatadpilha;

public class Exercicio4 {
    
    public int chegaNoDeposito (int valor){
        if(valor ==7){
            return valor;
        }
        if(valor ==7){
            return valor;
        }
        return 0;
    }

    public void Exercicio4() {
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        Pilha pilha3 = new Pilha();
        
        chegaNoDeposito(0);

        for (int i = 0; i <25; i++) {
            if (i < 8) {
                pilha1.Push(7);
            }
            if (i < 12) {
                pilha1.Push(5);
            }
            if (i <= 25) {
                pilha1.Push(7);
            }
        }
    }

}

