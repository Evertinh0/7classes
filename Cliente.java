/**
 *
 * @author Everton yan
 */
public class Cliente {

    //Atributos
    String nome;
    String localidade;
    int quantidadecomprasmes;
    boolean fevereiro;
    boolean março;
    int quantidadetotal;
    
    //metodo
    void mes(){
        if(this.fevereiro == true){
            System.out.println("Fevereiro.");
        }else{
            System.out.println("Março.");
        }
    }
    
    void mes01(){
        this.fevereiro = true;
    }
    
    void mes02(){
        this.março = false;
    } 
}
