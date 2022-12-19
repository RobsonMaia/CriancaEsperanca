import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d;
		double v = 0;
		
		System.out.println("-------------------------------");
	    System.out.println("       CRIANÇA ESPERANÇA       ");
	    System.out.println("-------------------------------");
	    System.out.println("   MUITO OBRIGADO POR AJUDAR   ");
	    System.out.println("-------------------------------");
	    System.out.println("[1] para doar R$10 ");
	    System.out.println("[2] para doar R$25 ");
	    System.out.println("[3] para doar R$50 ");
	    System.out.println("[4] para doar outros valores ");
	    System.out.println("[5] para doar para cancelar ");
	    d = sc.nextInt();
	    switch (d) {
	    case 1:
	    	v = 10;
	    	break;
	    case 2:
	    	v = 25;
	    	break;
	    case 3:
	    	v = 50;
	    	break;
	    case 4:
	    	System.out.print("Qual o valor da doação? ");
	    	v = sc.nextDouble();
	    	break;
	    case 5:
	    	v = 0;
	    	break;
	    default:
	    	System.out.println("INVALIDO...");
	   	}
	   	System.out.println("-------------------------------");
        System.out.printf("Sua doação foi de R$ " + "%.2f%n", v);
        System.out.println("MUITO OBRIGADO!");
	    System.out.println("-------------------------------");
	    	
	sc.close();

}

	
}