package QuestDois;

import java.util.Scanner;

public class VerificandoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra=sc.nextLine();
        int cont=0;
        for(int i=0;i<letra.length();i++){
            String caractere=String.valueOf(letra.charAt(i));
            if(caractere.equalsIgnoreCase("a")){
                cont++;
            }
        }
        System.out.println("A letra 'a' "+ "se repete "+cont+" vezes");
    }
}
