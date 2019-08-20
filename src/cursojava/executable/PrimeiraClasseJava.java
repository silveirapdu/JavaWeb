package cursojava.executable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Bimestre;
import cursojava.classes.Disciplina;


public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
		String idade = JOptionPane.showInputDialog("Informe a idade do Aluno: ");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));
		
		
		
		
			
		
			for(int posDisciplina=1; posDisciplina <=2; posDisciplina++){
				
				String nomeDisciplina = JOptionPane.showInputDialog("Informe a Disciplina"+posDisciplina+": ");
				String notaDisciplina = JOptionPane.showInputDialog("Informe nota para "+nomeDisciplina+": ");
				
				Disciplina disciplina = new Disciplina();
				
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno2.getDisciplinas().add(disciplina);
				
				Bimestre bimestre = new Bimestre();
				bimestre.setBimestre("1bim");
				List<Disciplina> disciplinas = null;
				bimestre.setDisciplinas((List<Disciplina>) disciplina);
				
				
				aluno2.getBimestres().add(bimestre);
				
			}
				
		System.out.println("Aluno " + aluno2.getNome());
		System.out.println("Disciplinas: " + aluno2);
		System.out.println("Bimestre: " + aluno2);
		System.out.println("Media das Notas " + aluno2.getMedia());
		System.out.println("Reultado: "+ (aluno2.getResultado()? "Aprovado" : "Reprovado"));
		
	
		

	}

}
