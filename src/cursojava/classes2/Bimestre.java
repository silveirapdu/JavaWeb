package cursojava.classes2;

import java.util.ArrayList;
import java.util.List;

public class Bimestre {

	private String ano;
	private String bimestre;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getBimestre() {
		return bimestre;
	}

	public void setBimestre(String bimestre) {
		this.bimestre = bimestre;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result
				+ ((bimestre == null) ? 0 : bimestre.hashCode());
		result = prime * result
				+ ((disciplinas == null) ? 0 : disciplinas.hashCode());
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
		Bimestre other = (Bimestre) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (bimestre == null) {
			if (other.bimestre != null)
				return false;
		} else if (!bimestre.equals(other.bimestre))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bimestre [ano=" + ano + ", bimestre=" + bimestre
				+ ", disciplinas=" + disciplinas + "]";
	}

	

}
