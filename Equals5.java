import java.util.Scanner;
public class Equals5 {
    public static void main(String[] args){
       //5.Escolha uma palavra-chave e peça ao usuário para tentar adivinhá-la. Informe se acertou ou errou usando a comparação de strings.
        Scanner scan = new Scanner(System.in);
        //Palavra a ser adivinhada
        String palavraChave = "cachorro";
        
        System.out.println("Escolha uma palavra-chave dentre as seguintes e digite abaixo: cachorro, piriquito e papagaio.");
        String tentativa = scan.nextLine();
        
        if(tentativa.equals(palavraChave)){
            System.out.println("Parabéns você acertou a palvra-chave!");
        }else {
            System.out.println("Desculpe, você não acertou!");
        }


    }
}
