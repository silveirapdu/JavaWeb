package cursojava.executable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes2.Disciplina;
import cursojava.classes2.Aluno;
import cursojava.classes2.Bimestre;

public class AlunoExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aluno> alunoList = new ArrayList<Aluno>();
		
		for (int qtdeA=1 ; qtdeA <=2; qtdeA ++){
		
		String sAluno = JOptionPane.showInputDialog("Informe o Nome do Aluno: ");
		String sIdade = JOptionPane.showInputDialog("Qual a idade do : "+ sAluno);
		String sDtMatricula = JOptionPane.showInputDialog("Data de Matricula do : " + sAluno);

		Aluno aluno = new Aluno();

		aluno.setNome(sAluno);
		aluno.setIdade(Integer.valueOf(sIdade));
		aluno.setDataMatricula(sDtMatricula);

		String sAnoLetivo = JOptionPane.showInputDialog("Informe o Ano Letivo para as notas de: "+sAluno);
		String sBimestre = JOptionPane.showInputDialog("Informe o Bimestre para as notas de: "+sAluno);

		Bimestre bimestre = new Bimestre();
		bimestre.setAno(sAnoLetivo);
		bimestre.setBimestre(sBimestre);
		
		

		for(int i=1; i<=2 ; i++){
			
			String sNomeDisciplina = JOptionPane.showInputDialog("Informe a Disciplina: ");
			String sNotaDisciplina = JOptionPane.showInputDialog("Informe a Nota Bimestral de "+sNomeDisciplina+": ");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setNomeDisciplina(sNomeDisciplina);
			disciplina.setNota(Double.valueOf(sNotaDisciplina));
	
			bimestre.getDisciplinas().add(disciplina);
			
		}
		
		aluno.getBimestres().add(bimestre);
		

		System.out.println("Dados toString : " + bimestre);
		System.out.println("Dados toString : " + aluno);

		aluno.showAluno();
		System.out.println("Media: " + aluno.getMediaAluno());
		System.out.println("Status Boolean: " +aluno.getAprovado());
		System.out.println("Status Aprovado: " +aluno.getAprovado2());
		
		
		//Remover Disciplinas
		
		int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover uma disciplina? ");
		
		if(resp == 0){
			
			String posDisc = JOptionPane.showInputDialog(null, "Informe a disciplina a remover: 1, 2?");
			
			bimestre.getDisciplinas().remove(Integer.parseInt(posDisc));
		}
		
		alunoList.add(aluno);
		System.out.println("Resposta: " + resp);
		System.out.println("Dados toString : " + aluno);
		System.out.println("Media: " + aluno.getMediaAluno());
		System.out.println("Dados toString : " + alunoList);
		
		}//fim alunos
		
		for (Aluno aluno2 : alunoList) {
			
			if(aluno2.getNome().equalsIgnoreCase("0")){
				alunoList.remove(aluno2);
				break;
			}else{
				System.out.println("Aluno: " + aluno2.getNome());
				System.out.println("Media: " + aluno2.getMediaAluno());
				System.out.println("Status Boolean: " +aluno2.getAprovado());
				System.out.println("Status Aprovado: " +aluno2.getAprovado2());
				System.out.println("--------------------------------------------");
			}
				
			}
			
			
	
		for (Aluno aluno2 : alunoList) {
			System.out.println("Aluno: " + aluno2.getNome());
			
			for(Bimestre bimestre : aluno2.getBimestres()){
				System.out.println("Bimestre: " + bimestre.getBimestre());
				for (Disciplina disciplina : bimestre.getDisciplinas()) {
					System.out.println("Disciplina: " + disciplina.getNomeDisciplina());
				}
			}
		}
		
		
		//iteração da lista com o for por getIndex
		for (int i = 0; i < alunoList.size(); i++) {
			
			Aluno aluno = alunoList.get(i);
			System.out.println("Aluno: " + aluno.getNome());
			
			for (int j = 0; j < aluno.getBimestres().size(); j++) {
				Bimestre bimestre = aluno.getBimestres().get(j);
				System.out.println("Bimestre: " + bimestre.getBimestre());
				
				for (int k = 0; k < bimestre.getDisciplinas().size(); k++) {
					Disciplina disciplina = bimestre.getDisciplinas().get(k);
					System.out.println("Bimestre: " + disciplina.getNomeDisciplina());
				}
				
			}
			
		}
		
		
		}
		
	}

