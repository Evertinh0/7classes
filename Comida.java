/**
 *
 * @author Everton yan
 */
public class Comida {

    //Atributos
    String diasdasemana;
    boolean cardapio1;
    boolean cardapio2;
    String nomerestaurante;
   
    // metodos
    void menu(){
        if(this.cardapio1 == true){
            System.out.println("Arroz, Feijao, Macarao, Almondegas e Frango assado.");
        }else{
            System.out.println("Feijoada, Arroz, Linguica, Frango");
        }
    }
    
    void menu01(){
        this.cardapio1 = true;
    }
    
    void menu02(){
        this.cardapio2 = false;
    }   
}
