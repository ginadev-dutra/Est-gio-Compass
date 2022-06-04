import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsuarioSenha {

	public static void main(String[] args) {

		String login = "gina";
		String senha = "1234";

		LocalTime hourNow = LocalTime.now();
		
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
		  String text = hourNow.format(formatter);
		  //LocalDate parsedDate = LocalDate.parse(text, formatter);
		 
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu login: ");
		String loginDigitado = in.nextLine();

		System.out.println("Digite sua senha de 4 números: ");
		String senhaDigitada = in.nextLine();

		if (login.equals(loginDigitado) && senha.equals(senhaDigitada)) {
			System.out.println("Usuário " + login + " logado às " + text);
			int valorMinuto = hourNow.getHour() * 60 + hourNow.getMinute();

			int onze = (11 * 60) + 59;
			int seis = (6 * 60) + 59;
			if (valorMinuto >= seis && valorMinuto <= onze)
				System.out.println("Bom dia, você se logou ao nosso sistema.");

			int dezessete = (17 * 60) + 59;
			int doze = (12 * 60) + 59;
			if (valorMinuto >= doze && valorMinuto <= dezessete)
				System.out.println("Boa tarde, você se logou ao nosso sistema.");

			int vinteTres = (23 * 60) + 59;
			int dezoito = (18 * 60) + 59;
			if (valorMinuto >= dezoito && valorMinuto <= vinteTres)
				System.out.println("Boa noite, você se logou ao nosso sistema.");

			int zeroCinco = (5 * 60) + 59;
			if (valorMinuto >= 0 && valorMinuto <= zeroCinco)
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		} else {
			System.out.println("Usuário e/ou senha incorretos");
		}

	}
}
