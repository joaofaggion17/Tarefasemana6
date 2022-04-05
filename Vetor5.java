import java.util.Scanner;
public class Vetor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo [] = new int [5];
        String nome [] = new String [5];
        double preco [] = new double [5];

        for (int index = 0; index < preco.length; index++) {
            System.out.println("Digite o código do produto: ");
            codigo[index] = sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            nome[index] = sc.next();
            System.out.println("Digite o preço do produto: ");
            preco[index] = sc.nextDouble();   
        }

        for (int index = 0; index < preco.length; index++) {
            System.out.println("Código: " + codigo[index]);
            System.out.println("Nome: " + nome[index]);
            if (preco[index] > 120){
                System.out.println("Preço: " + (preco[index] + 20));
            }
            else{
                System.out.println("Preço: " + preco[index]);
            }
        }
        sc.close();
    }
}