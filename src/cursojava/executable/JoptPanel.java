package cursojava.executable;

import javax.swing.JOptionPane;

public class JoptPanel {
	public static void main(String[] args) {
				
	int resposta = JOptionPane.showConfirmDialog(null, "Realize a Escolha clicando em OK, Nao ou Fechando a Janela","Caixa de Escolha", 0);
	
	if(resposta != -2){
		
		System.out.println("Resposta: " + resposta);
	}
	
	}

}
