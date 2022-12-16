import java.util.Scanner;

public class MenuOperaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el pirmer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Introduce: ");
		System.out.println("1.Para realizar una suma.");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("La suma es: "+(num1+num2));
			break;
		case 2:
			
			break;
			
		case 3:
			
			break;
		}

	}

}
