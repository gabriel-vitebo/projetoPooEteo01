import java.util.Scanner;
import entities.Product;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o título do produto: ");
		String title = sc.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		double price = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		int amount = sc.nextInt();
		
		Product product = new Product(title, price, amount);
		
		System.out.println(product.productInfo());
		System.out.println(product.quantityInfo());
		
		int option = 0;
		while (option != 3) {
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar nova quantidade");
			System.out.println("2 - Remover quantidade");
			System.out.println("3 - Finalizar!");
			System.out.println("Escolha uma opção: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Digite a quantidade para adicionar: ");
				int addAmount = sc.nextInt();
				product.addQuantities(addAmount);
				System.out.println("A nova quantidade é: " + product.getAmount());
				break;
			case 2:
				System.out.print("Digite a quantidade para remover: ");
				int removeAmount = sc.nextInt();
				product.removeQuantities(removeAmount);
				System.out.println("A quantidade de produto é: " + product.getAmount());
				break;
			case 3:
				System.out.println("Opreção finalizada!");
				System.out.println("Informações finais do produto: ");
				System.out.println(product.productInfo());
				System.out.println(product.quantityInfo());
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				
			}
			
		}
		
		sc.close();

	}

}
