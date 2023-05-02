package User;

public class Disciplina {
	
	private String nomeDisciplina;
	private int creditos;
	private String codigo;
	private boolean opcional = false;
	private String professor;
	private boolean feita;
	
	public Disciplina() {}
	
	
	public Disciplina(String nomeDisciplina, int creditos, String codigo, boolean opcional, String professor) {
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = creditos;
		this.codigo = codigo;
		this.opcional = opcional;
		this.professor = professor;
		this.feita = false;
	}
	public Disciplina(String nomeDisciplina, int creditos, String codigo, boolean opcional) {
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = creditos;
		this.codigo = codigo;
		this.opcional = opcional;
		this.feita = false;
		this.professor = "Professor Desconhecido";

	}


	public boolean isFeita() {
		return feita;
	}


	public void setFeita(boolean feita) {
		this.feita = feita;
	}


	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isOpcional() {
		return opcional;
	}
	public void setOpcional(boolean opcional) {
		this.opcional = opcional;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}


	@Override
	public String toString() {
		return nomeDisciplina + ", Créditos: " + creditos + ", Código: " + codigo
				+ ", Opcional: " + opcional + ", Professor: " + professor + "\n";
	}
	
	
	
}
