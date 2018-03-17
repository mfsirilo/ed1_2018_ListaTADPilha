package ed1_2018_listatadpilha;
public class Exercicio5 {
    
    public void Exercicio5(){
        Pilha pilha1 =  new Pilha();
        
        Criptografia(pilha1);
        System.out.println("\n---------------------\n");
        Descritografia(pilha1);
    }
    public static void Criptografia(Pilha p){
        String palavra = "hotorrinoLaringoloGista ";
        for(int i=0; i < palavra.length();i++){
            p.Push(palavra.charAt(i));
            System.out.println(p.Topo());
        }
    }
    
    public static void Descritografia(Pilha pp){
        while(!pp.isEmpty()){
            System.out.println(pp.Topo());
            pp.Pop();
        }
    }
    
}