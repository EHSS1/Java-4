import java.util.Scanner;
 public class Equals1{

 public static void main(String[] args){
   /* Crie um sistema de login simples onde o usuário precisa inserir um nome de usuário e senha. Compare-os com um nome de usuário e senha pré-definidos em variáveis. */ 
   
   Scanner scan = new Scanner(System.in);
   // declarando as variáveis 
   String senhaOriginal = "cabelo";
   boolean valor;

   //lendo a senha
   System.out.println("Qual a senha?");
    String senhaLida = scan.nextLine();
    
   //verificar se as senhas são iguais
   valor = senhaOriginal.equals(senhaLida);
   if(valor == true) 
      System.out.println("senha correta");
   else
      System.out.println("senha incorreta");   

    

    
 }
 }