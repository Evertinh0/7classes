/**
 *
 * @author Everton yan
 */
public class Setor {
    
    //caracteristica -> Atributos
    
    String nome;
    String gerenteResponsavel;
    String beneficios;
    int salario;
    boolean remunera01;
    boolean remunera02;
    
    // metodos
    void salario(){
        if(this.remunera01 == true){
            System.out.println(" otimo.");
        }else{
            System.out.println(" pessinmo");
        }
    }
    
    void salario01(){
        this.remunera01 = true;
    }
    
    void salario02(){
        this.remunera02 = false;
    } 
}
