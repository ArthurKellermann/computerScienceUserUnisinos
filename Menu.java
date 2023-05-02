package User;

import java.util.Scanner;

public class Menu {

	// Instanciação dos objetos semestre

	public static Semestre semestre1() {
		Disciplina fundamentos = new Disciplina("Algoritmos da Programação: Fundamentos", 8, "060964", false,
				"Cassiano");
		Disciplina algebra = new Disciplina("Álgebra Linear", 4, "060803", false, "Patrícia");
		Disciplina conceitos = new Disciplina("Conceitos e Tendências da Profissão", 4, "060965", false, "Luis");
		Disciplina dpp = new Disciplina("Desenvolvimento Profissional e Pessoal", 4, "010539", false, "Juliano");
		Disciplina raciocinio = new Disciplina("Raciocínio Lógico", 4, "060963", false, "Rosvita");
		Semestre semestre1 = new Semestre(fundamentos, algebra, conceitos, dpp, raciocinio);
		return semestre1;

	}

	public static Semestre semestre2() {
		Disciplina linear = new Disciplina("Algoritmos e Programação: Estrutura Lineares", 8, "060966", false);
		Disciplina dppLideranca = new Disciplina("Desenvolvimento Profissional e Pessoal: Liderança", 1, "010540",
				false);
		Disciplina matematica = new Disciplina("Matemática para computação", 4, "060662", false);
		Disciplina estatistica = new Disciplina("Probabilidade e Inferência Estatística", 4, "099274", false);
		Disciplina projeto = new Disciplina("Projeto de Sistemas digitais", 4, "060967", false);
		Semestre semestre2 = new Semestre(linear, dppLideranca, matematica, estatistica, projeto);
		return semestre2;
	}

	public static Semestre semestre3() {
		Disciplina arvores = new Disciplina("Algoritmos e Programação: Árvores e Ordenação", 4, "060970", false);
		Disciplina dppProtagonismo = new Disciplina("Desenvolvimento Profissional e Pessoal: Protagonismo", 1, "010541",
				false);
		Disciplina projetoAlgoritimos = new Disciplina("Análise e projeto de Algoritmos", 4, "060969", false);
		Disciplina calculo1 = new Disciplina("Cálculo Diferencial", 4, "060800", false);
		Disciplina engenharia = new Disciplina("Engenharia de Software: Requisitos", 4, "060971", false);
		Disciplina sistemas = new Disciplina("Fundamentos de Sistemas Operacionais", 4, "060968", false);
		Semestre semestre3 = new Semestre(arvores, dppProtagonismo, projetoAlgoritimos, calculo1, engenharia, sistemas);
		return semestre3;
	}

	public static Semestre semestre4() {
		Disciplina hashing = new Disciplina("Algoritmos e Programção:Grafos, Hashing e Heaps", 4, "060972", false);
		Disciplina analiseDeDados = new Disciplina("Análise de Dados para Tomada de Decisão", 4, "010533", false);
		Disciplina analiseOs = new Disciplina("Análise Aplicação de Sistemas Operacionais", 4, "060975", false);
		Disciplina dppInterfaces = new Disciplina("Desenvolvimento Profissional e Pessoal: Interfaces", 1, "010542",
				false);
		Disciplina engenhariaAnalise = new Disciplina("Engenharia de Software: Análise", 4, "060976", false);
		Disciplina fundamentosBD = new Disciplina("Fundamentos de Banco de Dados", 4, "060974", false);
		Disciplina redesAplicacao = new Disciplina("Redes de Computadores: Aplição e Transporte", 4, "060973", false);
		Semestre semestre4 = new Semestre(hashing, analiseDeDados, analiseOs, dppInterfaces, engenhariaAnalise,
				fundamentosBD, redesAplicacao);
		return semestre4;

	}

	public static Semestre semestre5() {
		Disciplina calculo2 = new Disciplina("Cálculo Integral", 4, "060801", false);
		Disciplina conexoes = new Disciplina("Desenvolvimento Pessoal e Profissional Conexões", 1, "010543", false);
		Disciplina engenhariaProjeto = new Disciplina("Engenharia de Software: Projeto", 4, "060979", false);
		Disciplina inteligencia = new Disciplina("Inteligência Artificial e Aprendizado de Máquina", 4, "060978",
				false);
		Disciplina linguagens = new Disciplina("Linguagens Formais e Autômatos", 4, "060977", false);
		Disciplina paradigmas = new Disciplina("Paradigmas de Programação", 4, "060023", false);
		Disciplina processamento = new Disciplina("Processamento Gráfico", 4, "060375", false);
		Semestre semestre5 = new Semestre(calculo2, conexoes, engenhariaProjeto, inteligencia, linguagens, paradigmas,
				processamento);
		return semestre5;
	}

	public static Semestre semestre6() {
		Disciplina arquiteturaDigitais = new Disciplina("Arquitetura de Sistemas Digitais", 4, "060982", false);
		Disciplina elaboracaoProjetos = new Disciplina("Elaboração de Projetos", 4, "093903", false);
		Disciplina engenhariaImplementacao = new Disciplina("Engenharia de Software: Implementação e Teste", 4,
				"060984", false);
		Disciplina redesComputadores = new Disciplina(
				"Redes de Computadores: Internetworking, Roteamento e Transmissão", 4, "060980", false);
		Disciplina sgbd = new Disciplina("Sistemas de Gerenciamento de Banco de Dados", 4, "060981", false);
		Disciplina teoriaComp = new Disciplina("Teoria da Computação", 4, "060031", false);
		Disciplina teoriaInfo = new Disciplina("Teoria da Informação: Compressão e Criptografia", 4, "060983", false);
		Semestre semestre6 = new Semestre(arquiteturaDigitais, elaboracaoProjetos, engenhariaImplementacao,
				redesComputadores, sgbd, teoriaComp, teoriaInfo);
		return semestre6;
	}

	public static Semestre semestre7() {
		Disciplina desempenho = new Disciplina("Computação de Alto Desempenho", 4, "060986", false);
		Disciplina grafica = new Disciplina("Computação Gráfica", 4, "060989", false);
		Disciplina interacao = new Disciplina("Design de interação Humano-computador", 4, "060905", false);
		Disciplina distribuidos = new Disciplina("Sistemas Distribuídos", 4, "093923", false);
		Disciplina tradutores = new Disciplina("Tradutores", 4, "093926", false);
		Semestre semestre7 = new Semestre(desempenho, grafica, interacao, distribuidos, tradutores);
		return semestre7;

	}

	public static Semestre semestre8() {
		Disciplina bigData = new Disciplina("Ciência de dados e Big Data", 4, "060989", false);
		Disciplina internetDasCoisas = new Disciplina("Internet das Coisas: Sensores, Protocolos e Aplicações", 4,
				"060988", false);
		Disciplina livreEscolha = new Disciplina("Livre Escolha", 4, "000001", false);
		Disciplina simulacao = new Disciplina("Simulação e Montagem de Sistemas", 4, "065072", false);

		Semestre semestre8 = new Semestre(bigData, internetDasCoisas, livreEscolha, simulacao);
		return semestre8;
	}

	// Mostrar cadeiras de cada semestre com base em "já feitas = true" e "não feitas= false"

	public static void mostrarSemestre1(Semestre semestre1) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 1:");
		System.out.println(semestre1);
		System.out.println("Semestre 1 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre1.getDi1().setFeita(true);
			semestre1.getDi2().setFeita(true);
			semestre1.getDi3().setFeita(true);
			semestre1.getDi4().setFeita(true);
			semestre1.getDi5().setFeita(true);

		} else {

			System.out.println("Digite as cadeiras já feitas (0 para sair)");
			int cadeirasFeitas;
			for (int i = 0; i < 6; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre1.getDi1().setFeita(true);
						break;
					case 2:
						semestre1.getDi2().setFeita(true);
						break;
					case 3:
						semestre1.getDi3().setFeita(true);
						break;
					case 4:
						semestre1.getDi4().setFeita(true);
						break;
					case 5:
						semestre1.getDi5().setFeita(true);
						break;
					}
				}
			}
			
		}
	}

	public static void mostrarSemestre2(Semestre semestre2) {
		Scanner in = new Scanner(System.in);

		System.out.println("Cadeiras Semestre 2:");
		System.out.println(semestre2);
		System.out.println("Semestre 2 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre2.getDi1().setFeita(true);
			semestre2.getDi2().setFeita(true);
			semestre2.getDi3().setFeita(true);
			semestre2.getDi4().setFeita(true);
			semestre2.getDi5().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas (0 para sair)");
			int cadeirasFeitas;
			for (int i = 0; i < 6; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre2.getDi1().setFeita(true);
						break;
					case 2:
						semestre2.getDi2().setFeita(true);
						break;
					case 3:
						semestre2.getDi3().setFeita(true);
						break;
					case 4:
						semestre2.getDi4().setFeita(true);
						break;
					case 5:
						semestre2.getDi5().setFeita(true);
						break;
					}
				}
			}
		}
	}

	public static void mostrarSemestre3(Semestre semestre3) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 3:");
		System.out.println(semestre3);
		System.out.println("Semestre 3 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre3.getDi1().setFeita(true);
			semestre3.getDi2().setFeita(true);
			semestre3.getDi3().setFeita(true);
			semestre3.getDi4().setFeita(true);
			semestre3.getDi5().setFeita(true);
			semestre3.getDi6().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas (0 para sair)");
			int cadeirasFeitas;
			for (int i = 0; i < 7; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre3.getDi1().setFeita(true);
						break;
					case 2:
						semestre3.getDi2().setFeita(true);
						break;
					case 3:
						semestre3.getDi3().setFeita(true);
						break;
					case 4:
						semestre3.getDi4().setFeita(true);
						break;
					case 5:
						semestre3.getDi5().setFeita(true);
						break;
					case 6:
						semestre3.getDi6().setFeita(true);
						break;
					}
				}
			}
		}
	}

	public static void mostrarSemestre4(Semestre semestre4) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 2:");
		System.out.println(semestre4);
		System.out.println("Semestre 4 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre4.getDi1().setFeita(true);
			semestre4.getDi2().setFeita(true);
			semestre4.getDi3().setFeita(true);
			semestre4.getDi4().setFeita(true);
			semestre4.getDi5().setFeita(true);
			semestre4.getDi6().setFeita(true);
			semestre4.getDi7().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas (0 para sair)");
			int cadeirasFeitas;
			for (int i = 0; i < 8; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre4.getDi1().setFeita(true);
						break;
					case 2:
						semestre4.getDi2().setFeita(true);
						break;
					case 3:
						semestre4.getDi3().setFeita(true);
						break;
					case 4:
						semestre4.getDi4().setFeita(true);
						break;
					case 5:
						semestre4.getDi5().setFeita(true);
						break;
					case 6:
						semestre4.getDi6().setFeita(true);
						break;
					case 7:
						semestre4.getDi7().setFeita(true);
						break;
					}
				}
			}
		}
	}

	public static void mostrarSemestre5(Semestre semestre5) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 5:");
		System.out.println(semestre5);
		System.out.println("Semestre 5 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre5.getDi1().setFeita(true);
			semestre5.getDi2().setFeita(true);
			semestre5.getDi3().setFeita(true);
			semestre5.getDi4().setFeita(true);
			semestre5.getDi5().setFeita(true);
			semestre5.getDi6().setFeita(true);
			semestre5.getDi7().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas (0 para sair)");
			int cadeirasFeitas;
			for (int i = 0; i < 8; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre5.getDi1().setFeita(true);
						break;
					case 2:
						semestre5.getDi2().setFeita(true);
						break;
					case 3:
						semestre5.getDi3().setFeita(true);
						break;
					case 4:
						semestre5.getDi4().setFeita(true);
						break;
					case 5:
						semestre5.getDi5().setFeita(true);
						break;
					case 6:
						semestre5.getDi6().setFeita(true);
						break;
					case 7:
						semestre5.getDi7().setFeita(true);
						break;
					}
				}
			}
		}
	}

	public static void mostrarSemestre6(Semestre semestre6) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 6:");
		System.out.println(semestre6);
		System.out.println("Semestre 6 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre6.getDi1().setFeita(true);
			semestre6.getDi2().setFeita(true);
			semestre6.getDi3().setFeita(true);
			semestre6.getDi4().setFeita(true);
			semestre6.getDi5().setFeita(true);
			semestre6.getDi6().setFeita(true);
			semestre6.getDi7().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas");
			int cadeirasFeitas;
			for (int i = 0; i < 8; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre6.getDi1().setFeita(true);
						break;
					case 2:
						semestre6.getDi2().setFeita(true);
						break;
					case 3:
						semestre6.getDi3().setFeita(true);
						break;
					case 4:
						semestre6.getDi4().setFeita(true);
						break;
					case 5:
						semestre6.getDi5().setFeita(true);
						break;
					case 6:
						semestre6.getDi6().setFeita(true);
						break;
					case 7:
						semestre6.getDi7().setFeita(true);
						break;
					}
				}
			}
		}
	}

	public static void mostrarSemestre7(Semestre semestre7) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 7:");
		System.out.println(semestre7);
		System.out.println("Semestre 7 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre7.getDi1().setFeita(true);
			semestre7.getDi2().setFeita(true);
			semestre7.getDi3().setFeita(true);
			semestre7.getDi4().setFeita(true);
			semestre7.getDi5().setFeita(true);

		} else {
			System.out.println("Digite as cadeiras já feitas");
			int cadeirasFeitas;
			for (int i = 0; i < 6; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre7.getDi1().setFeita(true);
						break;
					case 2:
						semestre7.getDi2().setFeita(true);
						break;
					case 3:
						semestre7.getDi3().setFeita(true);
						break;
					case 4:
						semestre7.getDi4().setFeita(true);
						break;
					case 5:
						semestre7.getDi5().setFeita(true);
						break;

					}
				}
			}
		}
	}

	public static void mostrarSemestre8(Semestre semestre8) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cadeiras Semestre 8:");
		System.out.println(semestre8);
		System.out.println("Semestre 8 completo? (Sim/Não)");
		String completo = in.nextLine();

		if (completo.equalsIgnoreCase("Sim")) {
			semestre8.getDi1().setFeita(true);
			semestre8.getDi2().setFeita(true);
			semestre8.getDi3().setFeita(true);
			semestre8.getDi4().setFeita(true);
		} else {
			System.out.println("Digite as cadeiras já feitas");
			int cadeirasFeitas;
			for (int i = 0; i < 5; i++) {
				cadeirasFeitas = in.nextInt();
				if (cadeirasFeitas == 0) {
					break;
				} else {
					switch (cadeirasFeitas) {
					case 1:
						semestre8.getDi1().setFeita(true);
						break;
					case 2:
						semestre8.getDi2().setFeita(true);
						break;
					case 3:
						semestre8.getDi3().setFeita(true);
						break;
					case 4:
						semestre8.getDi4().setFeita(true);
						break;

					}
				}
			}
		}
	}

	public static void main(String[] args) {

		Semestre semestre1 = Menu.semestre1();
		Semestre semestre2 = Menu.semestre2();
		Semestre semestre3 = Menu.semestre3();
		Semestre semestre4 = Menu.semestre4();
		Semestre semestre5 = Menu.semestre5();
		Semestre semestre6 = Menu.semestre6();
		Semestre semestre7 = Menu.semestre7();
		Semestre semestre8 = Menu.semestre8();

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = in.nextLine();
		System.out.print("Digite sua matrícula: ");
		int matricula = in.nextInt();
		System.out.print("Digite seu semestre: ");
		int semestre = in.nextInt();
		Aluno aluno = new Aluno(nome, matricula, semestre);

		switch (semestre) {
		case 1:
			Menu.mostrarSemestre1(semestre1);
			break;
		case 2:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			break;
		case 3:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			break;
		case 4:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			Menu.mostrarSemestre4(semestre4);
			break;
		case 5:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			Menu.mostrarSemestre4(semestre4);
			Menu.mostrarSemestre5(semestre5);
			break;
		case 6:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			Menu.mostrarSemestre4(semestre4);
			Menu.mostrarSemestre5(semestre5);
			Menu.mostrarSemestre6(semestre6);
			break;
		case 7:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			Menu.mostrarSemestre4(semestre4);
			Menu.mostrarSemestre5(semestre5);
			Menu.mostrarSemestre6(semestre6);
			Menu.mostrarSemestre7(semestre7);
			break;
		case 8:
			Menu.mostrarSemestre1(semestre1);
			Menu.mostrarSemestre2(semestre2);
			Menu.mostrarSemestre3(semestre3);
			Menu.mostrarSemestre4(semestre4);
			Menu.mostrarSemestre5(semestre5);
			Menu.mostrarSemestre6(semestre6);
			Menu.mostrarSemestre7(semestre7);
			Menu.mostrarSemestre8(semestre8);
			break;
		}

		int x = 0;
		do {

			System.out.println("Olá, " + aluno.getNome()
					+ "! Você quer ver as matérias já feitas (1), as que faltam (2) ou sair (0):");
			Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			switch (x) {
			case 1:
				System.out.println("Matérias já feitas: ");
				System.out.println();

				// Semestre 1 - disciplinas

				if (semestre1.getDi1().isFeita()) {
					System.out.println(semestre1.getDi1().toString());
				}
				if (semestre1.getDi2().isFeita()) {
					System.out.println(semestre1.getDi2().toString());
				}
				if (semestre1.getDi3().isFeita()) {
					System.out.println(semestre1.getDi3().toString());
				}
				if (semestre1.getDi4().isFeita()) {
					System.out.println(semestre1.getDi4().toString());
				}
				if (semestre1.getDi5().isFeita()) {
					System.out.println(semestre1.getDi5().toString());
				}

				// Semestre 2 - disciplinas
				if (semestre2.getDi1().isFeita()) {
					System.out.println(semestre2.getDi1().toString());
				}
				if (semestre2.getDi2().isFeita()) {
					System.out.println(semestre2.getDi2().toString());
				}
				if (semestre2.getDi3().isFeita()) {
					System.out.println(semestre2.getDi3().toString());
				}
				if (semestre2.getDi4().isFeita()) {
					System.out.println(semestre2.getDi4().toString());
				}
				if (semestre2.getDi5().isFeita()) {
					System.out.println(semestre2.getDi5().toString());
				}

				// Semestre 3 - disciplinas
				if (semestre3.getDi1().isFeita()) {
					System.out.println(semestre3.getDi1().toString());
				}
				if (semestre3.getDi2().isFeita()) {
					System.out.println(semestre3.getDi2().toString());
				}
				if (semestre3.getDi3().isFeita()) {
					System.out.println(semestre3.getDi3().toString());
				}
				if (semestre3.getDi4().isFeita()) {
					System.out.println(semestre3.getDi4().toString());
				}
				if (semestre3.getDi5().isFeita()) {
					System.out.println(semestre3.getDi5().toString());
				}
				if (semestre3.getDi6().isFeita()) {
					System.out.println(semestre3.getDi6().toString());
				}

				// Semestre 4 - disciplinas
				if (semestre4.getDi1().isFeita()) {
					System.out.println(semestre4.getDi1().toString());
				}
				if (semestre4.getDi2().isFeita()) {
					System.out.println(semestre4.getDi2().toString());
				}
				if (semestre4.getDi3().isFeita()) {
					System.out.println(semestre4.getDi3().toString());
				}
				if (semestre4.getDi4().isFeita()) {
					System.out.println(semestre4.getDi4().toString());
				}
				if (semestre4.getDi5().isFeita()) {
					System.out.println(semestre4.getDi5().toString());
				}
				if (semestre4.getDi6().isFeita()) {
					System.out.println(semestre4.getDi6().toString());
				}
				if (semestre4.getDi7().isFeita()) {
					System.out.println(semestre4.getDi7().toString());
				}

				// Semestre 5 - disciplinas
				if (semestre5.getDi1().isFeita()) {
					System.out.println(semestre5.getDi1().toString());
				}
				if (semestre5.getDi2().isFeita()) {
					System.out.println(semestre5.getDi2().toString());
				}
				if (semestre5.getDi3().isFeita()) {
					System.out.println(semestre5.getDi3().toString());
				}
				if (semestre5.getDi4().isFeita()) {
					System.out.println(semestre5.getDi4().toString());
				}
				if (semestre5.getDi5().isFeita()) {
					System.out.println(semestre5.getDi5().toString());
				}
				if (semestre5.getDi6().isFeita()) {
					System.out.println(semestre5.getDi6().toString());
				}
				if (semestre5.getDi7().isFeita()) {
					System.out.println(semestre5.getDi7().toString());
				}
				// Semestre 6 - disciplinas
				if (semestre6.getDi1().isFeita()) {
					System.out.println(semestre6.getDi1().toString());
				}
				if (semestre6.getDi2().isFeita()) {
					System.out.println(semestre6.getDi2().toString());
				}
				if (semestre6.getDi3().isFeita()) {
					System.out.println(semestre6.getDi3().toString());
				}
				if (semestre6.getDi4().isFeita()) {
					System.out.println(semestre6.getDi4().toString());
				}
				if (semestre6.getDi5().isFeita()) {
					System.out.println(semestre6.getDi5().toString());
				}
				if (semestre6.getDi6().isFeita()) {
					System.out.println(semestre6.getDi6().toString());
				}
				if (semestre6.getDi7().isFeita()) {
					System.out.println(semestre6.getDi7().toString());
				}

				// Semestre 7 - disciplinas
				if (semestre7.getDi1().isFeita()) {
					System.out.println(semestre7.getDi1().toString());
				}
				if (semestre7.getDi2().isFeita()) {
					System.out.println(semestre7.getDi2().toString());
				}
				if (semestre7.getDi3().isFeita()) {
					System.out.println(semestre7.getDi3().toString());
				}
				if (semestre7.getDi4().isFeita()) {
					System.out.println(semestre7.getDi4().toString());
				}
				if (semestre7.getDi5().isFeita()) {
					System.out.println(semestre7.getDi5().toString());
				}

				// Semestre 8 - disciplinas
				if (semestre8.getDi1().isFeita()) {
					System.out.println(semestre8.getDi1().toString());
				}
				if (semestre8.getDi2().isFeita()) {
					System.out.println(semestre8.getDi2().toString());
				}
				if (semestre8.getDi3().isFeita()) {
					System.out.println(semestre8.getDi3().toString());
				}
				if (semestre8.getDi4().isFeita()) {
					System.out.println(semestre8.getDi4().toString());
				}
				break;
			case 2:
				System.out.println("Matérias não feitas: ");
				System.out.println();
				if (semestre1.getDi1().isFeita() == false) {
					System.out.println(semestre1.getDi1().toString());
				}
				if (semestre1.getDi2().isFeita() == false) {
					System.out.println(semestre1.getDi2().toString());
				}
				if (semestre1.getDi3().isFeita() == false) {
					System.out.println(semestre1.getDi3().toString());
				}
				if (semestre1.getDi4().isFeita() == false) {
					System.out.println(semestre1.getDi4().toString());
				}
				if (semestre1.getDi5().isFeita() == false) {
					System.out.println(semestre1.getDi5().toString());
				}

				// Semestre 2 - disciplinas
				if (semestre2.getDi1().isFeita() == false) {
					System.out.println(semestre2.getDi1().toString());
				}
				if (semestre2.getDi2().isFeita() == false) {
					System.out.println(semestre2.getDi2().toString());
				}
				if (semestre2.getDi3().isFeita() == false) {
					System.out.println(semestre2.getDi3().toString());
				}
				if (semestre2.getDi4().isFeita() == false) {
					System.out.println(semestre2.getDi4().toString());
				}
				if (semestre2.getDi5().isFeita() == false) {
					System.out.println(semestre2.getDi5().toString());
				}

				// Semestre 3 - disciplinas
				if (semestre3.getDi1().isFeita() == false) {
					System.out.println(semestre3.getDi1().toString());
				}
				if (semestre3.getDi2().isFeita() == false) {
					System.out.println(semestre3.getDi2().toString());
				}
				if (semestre3.getDi3().isFeita() == false) {
					System.out.println(semestre3.getDi3().toString());
				}
				if (semestre3.getDi4().isFeita() == false) {
					System.out.println(semestre3.getDi4().toString());
				}
				if (semestre3.getDi5().isFeita() == false) {
					System.out.println(semestre3.getDi5().toString());
				}
				if (semestre3.getDi6().isFeita() == false) {
					System.out.println(semestre3.getDi6().toString());
				}

				// Semestre 4 - disciplinas
				if (semestre4.getDi1().isFeita() == false) {
					System.out.println(semestre4.getDi1().toString());
				}
				if (semestre4.getDi2().isFeita() == false) {
					System.out.println(semestre4.getDi2().toString());
				}
				if (semestre4.getDi3().isFeita() == false) {
					System.out.println(semestre4.getDi3().toString());
				}
				if (semestre4.getDi4().isFeita() == false) {
					System.out.println(semestre4.getDi4().toString());
				}
				if (semestre4.getDi5().isFeita() == false) {
					System.out.println(semestre4.getDi5().toString());
				}
				if (semestre4.getDi6().isFeita() == false) {
					System.out.println(semestre4.getDi6().toString());
				}
				if (semestre4.getDi7().isFeita() == false) {
					System.out.println(semestre4.getDi7().toString());
				}

				// Semestre 5 - disciplinas
				if (semestre5.getDi1().isFeita() == false) {
					System.out.println(semestre5.getDi1().toString());
				}
				if (semestre5.getDi2().isFeita() == false) {
					System.out.println(semestre5.getDi2().toString());
				}
				if (semestre5.getDi3().isFeita() == false) {
					System.out.println(semestre5.getDi3().toString());
				}
				if (semestre5.getDi4().isFeita() == false) {
					System.out.println(semestre5.getDi4().toString());
				}
				if (semestre5.getDi5().isFeita() == false) {
					System.out.println(semestre5.getDi5().toString());
				}
				if (semestre5.getDi6().isFeita() == false) {
					System.out.println(semestre5.getDi6().toString());
				}
				if (semestre5.getDi7().isFeita() == false) {
					System.out.println(semestre5.getDi7().toString());
				}
				// Semestre 6 - disciplinas
				if (semestre6.getDi1().isFeita() == false) {
					System.out.println(semestre6.getDi1().toString());
				}
				if (semestre6.getDi2().isFeita() == false) {
					System.out.println(semestre6.getDi2().toString());
				}
				if (semestre6.getDi3().isFeita() == false) {
					System.out.println(semestre6.getDi3().toString());
				}
				if (semestre6.getDi4().isFeita() == false) {
					System.out.println(semestre6.getDi4().toString());
				}
				if (semestre6.getDi5().isFeita() == false) {
					System.out.println(semestre6.getDi5().toString());
				}
				if (semestre6.getDi6().isFeita() == false) {
					System.out.println(semestre6.getDi6().toString());
				}
				if (semestre6.getDi7().isFeita() == false) {
					System.out.println(semestre6.getDi7().toString());
				}

				// Semestre 7 - disciplinas
				if (semestre7.getDi1().isFeita() == false) {
					System.out.println(semestre7.getDi1().toString());
				}
				if (semestre7.getDi2().isFeita() == false) {
					System.out.println(semestre7.getDi2().toString());
				}
				if (semestre7.getDi3().isFeita() == false) {
					System.out.println(semestre7.getDi3().toString());
				}
				if (semestre7.getDi4().isFeita() == false) {
					System.out.println(semestre7.getDi4().toString());
				}
				if (semestre7.getDi5().isFeita() == false) {
					System.out.println(semestre7.getDi5().toString());
				}

				// Semestre 8 - disciplinas
				if (semestre8.getDi1().isFeita() == false) {
					System.out.println(semestre8.getDi1().toString());
				}
				if (semestre8.getDi2().isFeita() == false) {
					System.out.println(semestre8.getDi2().toString());
				}
				if (semestre8.getDi3().isFeita() == false) {
					System.out.println(semestre8.getDi3().toString());
				}
				if (semestre8.getDi4().isFeita() == false) {
					System.out.println(semestre8.getDi4().toString());
				}
			case 0:
				break;
			default:
				System.out.println("Você digitou um valor inválido, " + aluno.getNome());
			}
		} while (x != 0);

		System.out.println("Adeus " + aluno.getNome() + "!");
		in.close();
	}
}