package User;

public class Aluno {
	
	private String nome;
	private int matricula;
	private int semestre;
	
	public Aluno(String nome, int matricula, int semestre) {
		this.nome = nome;
		this.matricula = matricula;
		this.semestre = semestre;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Matrícula: " + matricula + ", Semestre: " + semestre + ".";
	}
	
	
	
	

}
