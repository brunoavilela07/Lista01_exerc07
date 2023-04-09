import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double area;
        double ladosquadrado;
        double dobro;
        // Programa que calcule a área de um quadrado
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto mede cada lado do quadrado?");
        ladosquadrado = input.nextDouble();
        area = Math.pow(ladosquadrado, 2);
        System.out.println("Sendo assim, a área do quadrado é de: " + area);
        // mostre o dobro desta área para o usuário
        dobro = area * 2;
        System.out.println("Então, conclui-se que o dobro da área desse quadrado é de: " + dobro);
    }
}