/**
 *
 * @author Everton yan
 */
public class Filiais {

    //Atributos
    String nome; 
    String local;
    int totalfunc;
    int quantidadedia;
    int quantidadenoite;
    
    //metodos
    
    void noite(int funcnoite){
        quantidadenoite-=funcnoite;
    }
    
    void dia(int funcdia){
        quantidadedia-=funcdia;
    }
}
