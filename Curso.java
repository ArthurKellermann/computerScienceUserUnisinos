package User;

public class Curso {

	private String nome = "Ciências da Computação";
	private Semestre dis1sem;
	private Semestre dis2sem;
	private Semestre dis3sem;
	private Semestre dis4sem;
	private Semestre dis5sem;
	private Semestre dis6sem;
	private Semestre dis7sem;
	private Semestre dis8sem;
	
	
	public Curso(Semestre dis1sem, Semestre dis2sem, Semestre dis3sem, Semestre dis4sem, Semestre dis5sem,
			Semestre dis6sem, Semestre dis7sem, Semestre dis8sem) {
		this.dis1sem = dis1sem;
		this.dis2sem = dis2sem;
		this.dis3sem = dis3sem;
		this.dis4sem = dis4sem;
		this.dis5sem = dis5sem;
		this.dis6sem = dis6sem;
		this.dis7sem = dis7sem;
		this.dis8sem = dis8sem;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", dis1sem=" + dis1sem + ", dis2sem=" + dis2sem + ", dis3sem=" + dis3sem
				+ ", dis4sem=" + dis4sem + ", dis5sem=" + dis5sem + ", dis6sem=" + dis6sem + ", dis7sem=" + dis7sem
				+ ", dis8sem=" + dis8sem + "]";
	}
	
	
}
