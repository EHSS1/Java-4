import java.util.Scanner;
public class Equals4 {
    public static void main(String[] args){
    //4.Peça ao usuário para inserir uma senha e, em seguida, solicite a confirmação da senha. Verifique se ambas são iguais.
    
    Scanner scan = new Scanner(System.in); 
    System.out.println("Digite um senha: ");
    String senha = scan.nextLine();

    System.out.println("Confirme sua senha: ");
    String confirmeSenha = scan.nextLine();

    if(senha.equals(confirmeSenha)){
        System.out.println("Acesso permitido.");
    }else {
        System.out.println("Acesso negado, senha inválida.");
    }
    }
}
