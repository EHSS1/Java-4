import java.util.Scanner;
public class Equals2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//Peça ao usuário para inserir uma mensagem. Se a mensagem for "Olá", responda com "Olá, como você está?". Se a mensagem for "Tchau", responda com "Até logo!".
System.out.println("Digite uma mensagem:");
String texto = scan.nextLine();

if(texto.equals("Ola")) 
    System.out.println("Olá, como você está?");

else if (texto.equals("Tchau"))
    System.out.println("Até logo!");

else
    System.out.println("Digite uma mensagem valida");    

    }
}