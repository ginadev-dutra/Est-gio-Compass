import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questionario {
	
	private List<String> questions = new ArrayList<String>();
	private List<Boolean> answers = new ArrayList<Boolean>();

	private String usuario;
	private int qtdaRight;
	private int qtdaWrong;
	
	public Questionario() {
		questions.add("Qual a capital do Afeganistão?");
		questions.add("Qual a capital da Bélgica?");
		questions.add("Qual a capital da Colômbia?");
		questions.add("Qual a capital do Egito?");
		questions.add("Qual a capital da Itália?");
		
	}

	public static void main(String[] args) {
		
		Questionario questionario = new Questionario();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		questionario.setUsuario(in.nextLine());
		
	
		System.out.println("Digite a resposta certa das questões a seguir: ");
		
		// questão 1
		System.out.println(questionario.getQuestions().get(0));
		System.out.println("[1] Jalalabad");
		System.out.println("[2] Cabul");
		System.out.println("Digite sua resposta: ");
		String resposta1 = in.nextLine();
		
		if(resposta1.equals("2")) {
			System.out.println("Resposta Correta!");
			questionario.answers.add(true);
		}else {
			System.out.println("Resposta Errada!");
			questionario.answers.add(false);
		}
		
		System.out.println();
		
	
		// questão 2
		System.out.println(questionario.getQuestions().get(1));
		System.out.println("[1] Bruxelas");
		System.out.println("[2] Bruges");
		System.out.println("Digite sua resposta: ");
		resposta1 = in.nextLine();
		
		if(resposta1.equals("1")) {
			System.out.println("Resposta Correta!");
			questionario.answers.add(true);
		}else {
			System.out.println("Resposta Errada!");
			questionario.answers.add(false);
		}
		System.out.println();
		
	
		// questão 3
		System.out.println(questionario.getQuestions().get(2));
		System.out.println("[1] Medelín");
		System.out.println("[2] Bogotá");
		System.out.println("Digite sua resposta: ");
		resposta1 = in.nextLine();
		
		if(resposta1.equals("2")) {
			System.out.println("Resposta Correta!");
			questionario.answers.add(true);
		}else {
			System.out.println("Resposta Errada!");
			questionario.answers.add(false);
		}
		System.out.println();
		
	
		// questão 4
		System.out.println(questionario.getQuestions().get(3));
		System.out.println("[1] Cairo");
    	System.out.println("[2] Luxor");
		System.out.println("Digite sua resposta: ");
		resposta1 = in.nextLine();
		
		if(resposta1.equals("1")) {
			System.out.println("Resposta Correta!");
			questionario.answers.add(true);
		}else {
			System.out.println("Resposta Errada!");
			questionario.answers.add(false);
		}
		System.out.println();
		
		
		// questão 5
		System.out.println(questionario.getQuestions().get(4));
		System.out.println("[1] Milão");
		System.out.println("[2] Roma");
		System.out.println("Digite sua resposta: ");
		resposta1 = in.nextLine();
		
		if(resposta1.equals("2")) {
			System.out.println("Resposta Correta!");
			questionario.answers.add(true);
		}else {
			System.out.println("Resposta Errada!");
			questionario.answers.add(false);
		}
		System.out.println();
		
		for(Boolean resposta:questionario.answers){
			if(resposta == true)
				questionario.qtdaRight += 1;
			else
				questionario.qtdaWrong += 1;
		}
		
		
		System.out.println("Usuário: "+questionario.getUsuario());
		System.out.println("Resposta Corretas:"+ questionario.qtdaRight);
		System.out.println("Resposta Errada:" + questionario.qtdaWrong);
			
		
	}
	
	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void insertQuestions(String question) {
		questions.add(question);
	}
	public List<Boolean> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Boolean> answers) {
		this.answers = answers;
	}

}
