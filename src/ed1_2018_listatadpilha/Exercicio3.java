package ed1_2018_listatadpilha;
import java.util.Scanner;

public class Exercicio3 {

    public void Exercicio3() {
    
        
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        
        String placa = "",opcao = "";
        
        Scanner scan = new Scanner(System.in);
        
             for(int i=0; i < 4;i++){
                 System.out.println("O que deseja: E ou S");
                 opcao = scan.next();
                 System.out.println("Placa:");
                 placa = scan.next();
                 
                 estacionarCarro(opcao,placa, pilha1, pilha2);
                }
             System.out.println("STOP");
    }
        public static void estacionarCarro(String opcao, String placa, Pilha pilha1, Pilha pilha2){
            
            switch (opcao){
            
            case "E":
            if(pilha1.isFull()){
                System.out.println("Estacionamento Cheio");
                break;
            }
            pilha1.Push(placa);
            break;
            
            case "S":
                String N1;
                String N2;
                int tam = pilha1.size();
                for(int i=0; i <= tam;i++){
                    N1 =(String) pilha1.Topo();
                    N2 =placa;
                    
                    if(N1.equals(N2)){
                        pilha1.Pop();
                        int tam2 = pilha2.size();
                        for(i=0; i <= tam2;i++){
                            pilha1.Push(pilha2.Topo());
                            pilha2.Pop();
                        }
                        break;
                    }else{
                        pilha2.Push(pilha1.Topo());
                        pilha1.Pop();
                    }
                }
                System.out.println("N° de manobras:"+ pilha1.contador);
            break;
            
            default:
                System.out.println("Tente novamente");
            }
        }
}