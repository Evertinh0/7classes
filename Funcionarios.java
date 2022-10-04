/**
 *
 * @author Everton yan
 */
public class Funcionarios {

    //Atributos
    String nome;
    String função;
    int salario;
    int desconto;
    int liquido;
    
    //metodos
    void desconto(int descontosalario){
       desconto =-descontosalario;
    }
    
    void liquido(int liquidosalario){
        liquido-=liquidosalario;
    }
}
