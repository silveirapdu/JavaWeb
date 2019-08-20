package cursojava.classes;

public class Disciplina {

	public String Disciplina;
	public double nota;
	
	
	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Disciplina == null) ? 0 : Disciplina.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (Disciplina == null) {
			if (other.Disciplina != null)
				return false;
		} else if (!Disciplina.equals(other.Disciplina))
			return false;
		if (Double.doubleToLongBits(nota) != Double
				.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [Disciplina=" + Disciplina + ", nota=" + nota
				+"]";
	}
	

	

	

}
