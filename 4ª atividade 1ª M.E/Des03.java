import java.util.Scanner;

public class Des03 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
    
        System.out.println("Digite sua idade: ");
        int idade = myObj.nextInt();   
        if(idade >= 16 && 69 >= idade){
            System.out.println("Voce esta apto para doar.");
            if (idade >= 16 && idade < 18){
                System.out.println("Voce precisa uma autorizacao para doar.");
        }
        }
        else {
            System.out.println("Voce nao esta apto para doar.");
        }
        System.out.println("Voce nasceu em " + (2024-idade));
        myObj.close();
    }
}