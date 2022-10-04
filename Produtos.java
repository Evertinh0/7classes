/**
 *
 * @author Everton yan
 */
public class Produtos {
    
    //Atributos
    String nome;
    String tipo;
    int quantidade;
    boolean azul;
    boolean rosa;
    
    //metodo
      void fragancia(){
        if(this.rosa == true){
            System.out.println("Rosa");
        }else{
            System.out.println("Azul");
        }
    }
    
    void fragancia01(){
        this.rosa = true;
    }
    
    void fragancia02(){
        this.azul = false;
    } 
}
