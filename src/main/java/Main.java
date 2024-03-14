import java.util.Scanner;

public class Main {


  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    System.out.println("Insira o 1º número: ");
    int n1 = ler.nextInt();
    System.out.println("insira o 2º número: ");
    int n2 = ler.nextInt();
    
    calc.soma(n1, n2);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}