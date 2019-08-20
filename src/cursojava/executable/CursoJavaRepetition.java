package cursojava.executable;

public class CursoJavaRepetition {

		public static void main(String[] args) {
			int numero = 0;
			
			while(numero <=10){
				
				System.out.println("Valor: " + numero);
				numero ++;
			}
			
			numero = 10;
			do{
				System.out.println("Valor: " + numero);
				numero --;
				
			}while(numero >= 0);
			
			for (numero = 10; numero >= 0; numero -= 2) {
				System.out.println("-------------------------------------");
				System.out.println("Valor: " + numero);
				
				if (numero == 4){
					System.out.println("Valor Encontrado: " + numero);
					System.out.println("Realizar nova busca? ");
					break;
					
				}
				
			}
		}
}
