import java.util.Scanner;
public class Vetor6 {
    public static void main(String[] args) {
        int sala1 [][] = new int [2][6];
        Scanner sc = new Scanner (System.in);
        int somaSala1 = 0;
        int somaSala2 = 0;
        for (int index = 0; index < sala1.length; index++) {
            for (int index2 = 0; index2 < sala1.length; index2++) {
                System.out.println("Digite uma idade da sala: " + (index + 1));
                sala1[index][index2] = sc.nextInt();
                if (index == 0){
                    somaSala1 += sala1[index][index2];
                }
                else{
                    somaSala2 += sala1[index][index2];
                }
            }
        }
        sc.close();
        System.out.println("A soma das idades da sala 1: " + somaSala1);
        System.out.println("A soma das idades da sala 2: " + somaSala2);
    }   
}