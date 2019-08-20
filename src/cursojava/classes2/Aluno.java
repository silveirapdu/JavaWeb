package cursojava.classes2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String dataMatricula;

	private List<Bimestre> bimestres = new ArrayList<Bimestre>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public List<Bimestre> getBimestres() {
		return bimestres;
	}

	public void setBimestres(List<Bimestre> bimestres) {
		this.bimestres = bimestres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bimestres == null) ? 0 : bimestres.hashCode());
		result = prime * result
				+ ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (bimestres == null) {
			if (other.bimestres != null)
				return false;
		} else if (!bimestres.equals(other.bimestres))
			return false;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataMatricula="
				+ dataMatricula + ", bimestres=" + bimestres + "]";
	}

	public void showAluno() {

		System.out.println("Aluno: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Data da Matricula: " + getDataMatricula());

		for (Bimestre bimestre : bimestres) {
			System.out.println(bimestre.getBimestre() + " do Ano Letivo: "
					+ bimestre.getAno());

			for (Disciplina disciplina : bimestre.getDisciplinas()) {
				System.out.println("Disciplina: "
						+ disciplina.getNomeDisciplina() + " Nota: "
						+ disciplina.getNota());

			}
		}
		

	}
	public double getMediaAluno(){
		double media = 0.0;
		double somaNota = 0.0;
		
		for (Bimestre bimestre : bimestres) {
			
			for (Disciplina disciplina : bimestre.getDisciplinas()) {
				somaNota += disciplina.getNota();
			}
			media += somaNota / bimestre.getDisciplinas().size();
		}
		
		return media;
	}
	public boolean getAprovado(){
		if (this.getMediaAluno() >= 7){
			return true;
		}else{
			return false;
		}
	}
	
	public String getAprovado2(){
		
		if(this.getMediaAluno()< 5){
			return "Reprovado";
		}else{
			if(this.getMediaAluno()< 7){
				return "Recuperação";
			}else{
				return "Aprovado";
			}
		}
	}

}
