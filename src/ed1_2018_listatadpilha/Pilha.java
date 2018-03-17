package ed1_2018_listatadpilha;
public class Pilha {

    public int tam = 100;
    public Object vetor[] = new Object[tam];
    public int posicaoPilha = -1;
    public int contador;
    
    public int getContador(){
        return contador;
    }

    /* empilhando */
    public void Push(Object valor) {
        if (isFull()) {
            System.out.println("A pilha esta cheia");
        }
        ++posicaoPilha;
        this.vetor[posicaoPilha] = valor;
    }

    /* desempilhando */
    public void Pop() {
        if (isEmpty()) {
            System.out.println("A pilha esta vazia");
        }
        contador++;
        posicaoPilha--;
    }
    
    /* não faz parte da pilha */
    public int size (){
        if(this.isEmpty()){
            return 0;
        }
        return this.posicaoPilha +1;
    }

    /* verifica se cheio */
    public boolean isFull() {
        if (posicaoPilha == tam) {
            return true;
        }
        return false;
    }

    /* verificas se vazio */
    public boolean isEmpty() {
        if (posicaoPilha <= -1) {
            return true;
        }
        return false;
    }

    /* mostra o topo da pilha */
    public Object Topo() {
        Valor p = new Valor();
        if(isEmpty()){
            return p;
        }
        return vetor[posicaoPilha];
    }

}
