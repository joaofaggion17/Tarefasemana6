import java.util.Scanner;
public class Vetor2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String funcionarios [] = new String [n];
        for (int index = 0; index < funcionarios.length; index++) {
            System.out.println("Digite o nome do funcionário: ");
            funcionarios[index] = sc.next();
        }
         for (int index = 0; index < funcionarios.length; index++) {
             System.out.println(funcionarios[index]);    
         }
         sc.close();
     }
}