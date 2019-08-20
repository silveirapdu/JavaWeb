package cursojava.executable;

public class CursoJavaConditional {

	public static void main(String[] args) {
		
		int 	idade  	= 17;
		char	sexo 	= 'M';
	
		switch (sexo) {
		case 'F':
			
			if(idade >=18)
				System.out.println("Feminino sub 20! ");
			
			break;
		case 'M':
			if(idade < 18)
				System.out.println("Masulino sub 17! ");
			
			break;
	
		default:
			System.out.println("Idade não condiz com! ");
			break;
		} 
		
	}
}
