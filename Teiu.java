/**
 *
 * @author Everton yan
 */
public class Teiu {


    public static void main(String args[]) {
        

        //filiais
        
        Filiais filiais1 = new Filiais();
        filiais1.nome = "Teiu";
        filiais1.local = "Vitoria da conquista-Ba";
        filiais1.totalfunc = 600;
        filiais1.quantidadedia = 600;
        filiais1.quantidadenoite = 600;
        
        filiais1.noite(325);
        filiais1.dia(275);
        
        System.out.println("A empresa " + filiais1.nome+ " esta localizada em " +filiais1.local+ " e contam com aproximadamente " +filiais1.totalfunc + " funcionarios, " + filiais1.quantidadenoite + " trabalham pelo turno da noite e " + filiais1.quantidadedia +" pelo turno do dia.");
        System.out.println("------------------------------------------------------------------------------------");
        //setor
        
        Setor setorA = new Setor();
        setorA.nome = "Contabilidade";
        setorA.gerenteResponsavel = "joao";
        setorA.beneficios = "10 minutos mais cedo";
        setorA.salario01();
        
       
        System.out.println("O gerente " +setorA.gerenteResponsavel + " da " + setorA.nome + " libera "+ setorA.beneficios +" e paga um salario");setorA.salario();
        System.out.println("----------------------------------------------------------------------------------------");
        // funcionarios
        
        Funcionarios funcionarios1 = new Funcionarios();
        funcionarios1.nome = "Pedro";
        funcionarios1.função = "Assistente administrativo";
        funcionarios1.salario = 5000;
        funcionarios1.desconto = 5000 ;
        funcionarios1.liquido = 5000 ;
        
        funcionarios1.desconto(75);
        funcionarios1.liquido(75);
        
        System.out.println("O funcionario " +funcionarios1.nome + " é "+ funcionarios1.função + " é ganha "+ funcionarios1.salario+" mensal, ele trabalha 44 horas semanais. "+funcionarios1.nome+" faltou 2 dias e foi descontado "+ funcionarios1.desconto + ", ele irá receber. "+ funcionarios1.liquido);
        System.out.println("--------------------------------------------------------------------------------------------");
        //comida
        
        Comida comida1 = new Comida();
        comida1.diasdasemana = "Segunda-feira";
        comida1.nomerestaurante = "Lemos passos";
        comida1.menu02();
        
        System.out.println("O restaurante " +comida1.nomerestaurante+ " faz toda " +comida1.diasdasemana+ ": ");
        comida1.menu();
        System.out.println("-------------------------------------------------------------------------------------------");
        //cliente
        
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Atacadão";
        cliente1.localidade = "Sergipe";
        cliente1.quantidadecomprasmes = 1000;
        cliente1.mes01();
        
        
        System.out.println("O " +cliente1.nome+ " do estado de " +cliente1.localidade+ " comprou "+ cliente1.quantidadecomprasmes + " caixas do produto Agua sanitaria 1L no mes de");cliente1.mes();
        System.out.println("---------------------------------------------------------------------------------------------");
        //produto
        
        Produtos produtos1 = new Produtos();
        produtos1.nome = "Amaciante ";
        produtos1.tipo = "Rosa 2L";
        produtos1.quantidade = 2000 ;
        produtos1.fragancia01();
        
        System.out.println("A maquina de envase produziu " +produtos1.quantidade+" caixas esse mes, do produto "+produtos1.nome); produtos1.fragancia();
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
