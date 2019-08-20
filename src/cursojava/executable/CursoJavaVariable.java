package cursojava.executable;

public class CursoJavaVariable {
	static int 		varGlobal = 100;
	static String 	nome, sobrenome;
	static int 		idade;
	static double 	nota;
	static boolean 	status;

	public static void main(String[] args) {
		
		nome = "Cleverson";
		sobrenome = "Vieira Silviera";
		idade 	= 39;
		nota 	= (8.0 + 8 + 8.0 +8)/4;
		status 	= true;
		
			
		if (status && (nota >= 8.0)) {
			showData();
			System.out.println("Parabens");
		} else {
			msgError();
		}
		
		
	}
	
	private static void showData(){
		System.out.println("My name is: " + nome + " " + sobrenome);
		System.out.println("I am: " + idade + " years old!");
		System.out.println("nota: " + nota);
	}
	
	private static void msgError() {
		System.out.println("A nota obtida foi: " + nota);
		System.out.println("Infelismete vc Reprovou!!");

	}
}
