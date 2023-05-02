package User;

public class Semestre {

	private Disciplina di1;
	private Disciplina di2;
	private Disciplina di3;
	private Disciplina di4;
	private Disciplina di5;
	private Disciplina di6;
	private Disciplina di7;
	public int nDisciplinas = 0;

	public int getnDisciplinas() {
		return nDisciplinas;
	}

	public void setnDisciplinas(int nDisciplinas) {
		this.nDisciplinas = nDisciplinas;
	}

	public Semestre(Disciplina di1, Disciplina di2, Disciplina di3, Disciplina di4) {
		this.di1 = di1;
		this.di2 = di2;
		this.di3 = di3;
		this.di4 = di4;
		nDisciplinas = 4;
	}

	public Semestre(Disciplina di1, Disciplina di2, Disciplina di3, Disciplina di4, Disciplina di5) {
		this.di1 = di1;
		this.di2 = di2;
		this.di3 = di3;
		this.di4 = di4;
		this.di5 = di5;
		nDisciplinas = 5;
	}

	public Semestre(Disciplina di1, Disciplina di2, Disciplina di3, Disciplina di4, Disciplina di5, Disciplina di6) {
		this.di1 = di1;
		this.di2 = di2;
		this.di3 = di3;
		this.di4 = di4;
		this.di5 = di5;
		this.di6 = di6;
		nDisciplinas = 6;
	}

	public Semestre(Disciplina di1, Disciplina di2, Disciplina di3, Disciplina di4, Disciplina di5, Disciplina di6,
			Disciplina di7) {
		this.di1 = di1;
		this.di2 = di2;
		this.di3 = di3;
		this.di4 = di4;
		this.di5 = di5;
		this.di6 = di6;
		this.di7 = di7;
		nDisciplinas = 7;
	}

	public Disciplina getDi1() {
		return di1;
	}

	public void setDi1(Disciplina di1) {
		this.di1 = di1;
	}

	public Disciplina getDi2() {
		return di2;
	}

	public void setDi2(Disciplina di2) {
		this.di2 = di2;
	}

	public Disciplina getDi3() {
		return di3;
	}

	public void setDi3(Disciplina di3) {
		this.di3 = di3;
	}

	public Disciplina getDi4() {
		return di4;
	}

	public void setDi4(Disciplina di4) {
		this.di4 = di4;
	}

	public Disciplina getDi5() {
		return di5;
	}

	public void setDi5(Disciplina di5) {
		this.di5 = di5;
	}

	public Disciplina getDi6() {
		return di6;
	}

	public void setDi6(Disciplina di6) {
		this.di6 = di6;
	}

	public Disciplina getDi7() {
		return di7;
	}

	public void setDi7(Disciplina di7) {
		this.di7 = di7;
	}

	@Override
	public String toString() {
		if (this.nDisciplinas == 7) {
			return "¦1¦ " + di1 + "¦2¦ " + di2 + "¦3¦ " + di3 + "¦4¦ " + di4
					+ "¦5¦ " + di5 + "¦6¦ " + di6 + "¦7¦ " + di7 + ".\n";
		} else if (this.nDisciplinas == 6) {
			return "¦1¦ " + di1 + "¦2¦ " + di2 + "¦3¦ " + di3 + "¦4¦ " + di4
					+ "¦5¦ " + di5 + "¦6¦ " + di6 + ".\n";
		} else if (this.nDisciplinas == 5) {
			return "¦1¦ " + di1 + "¦2¦ " + di2 + "¦3¦ " + di3 + "¦4¦ " + di4
					+ "¦5¦ " + di5 + ".\n";
		} else if (this.nDisciplinas == 4) {
			return "¦1¦ " + di1 + "¦2¦ " + di2 + "¦3¦ " + di3 + "¦4¦ " + di4
					+ ".\n";
		}
		return null;
	}

}
