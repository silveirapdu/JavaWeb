package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Bimestre {
	
	public String bimestre;
	
	public List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Bimestre(String Bim, List<Disciplina> disc){
		
		this.bimestre = Bim;
		this.disciplinas = disc;
	}

	public Bimestre() {
		// TODO Auto-generated constructor stub
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getBimestre() {
		return bimestre;
	}

	public void setBimestre(String bimestre) {
		this.bimestre = bimestre;
	}

	@Override
	public String toString() {
		return "Bimestre [bimestre=" + bimestre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bimestre == null) ? 0 : bimestre.hashCode());
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
		if (bimestre == null) {
			if (other.bimestre != null)
				return false;
		} else if (!bimestre.equals(other.bimestre))
			return false;
		return true;
	}
	
	

}
