import java.util.Scanner;
public class Equals3 {
    public static void main(String[] args) {
    //3.Permita que o usuário digite comandos simples como "ajuda", "versão" e "sair". Realize ações diferentes para cada comando.
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um comando para cada ação que deseje realizar como: ajuda, versao ou sair");
    String comando = scan.nextLine();

    if(comando.equals("ajuda")){
        System.out.println("Comando ajuda selecionado. Aqui está a ajuda solicitada. Pede ajuda pra Joseneusa, pois o Salvador, viajou...");
    }else if(comando.equals("versao")){   
        System.out.println("Comando versão selecionado. Aqui está a versão do sistema solicitada."); 
    }else if(comando.equals("sair")){
        System.out.println("Saindo do programa...");
    }else{
        System.out.println("Comando inválido!");
    }    

  

    }
}
    