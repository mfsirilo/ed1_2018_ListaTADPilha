package ed1_2018_listatadpilha;

public class Exercicio1 {
    
    

    public void Exercicio1() {
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        
        for (int i = 0; i < 5; i++) {
            pilha1.Push(1+i);
            
        }
        
        for (int i = 0; i < 5; i++) {
            pilha2.Push(2+i);
            
        }
        
        if(!(pilha1.Topo().equals(pilha2.Topo()))){
            System.out.println("Pilhas Deferentes");
        }else 
            System.out.println("Pilhas iguais");
            
        

    }

}
