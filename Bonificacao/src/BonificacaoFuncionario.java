import java.util.Scanner;

public class BonificacaoFuncionario {
	
	private Funcionario funcionario;
	
	
	public static void main(String[] args) {
		//scan receber qtda funcionario
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de funcionários: ");
		int qtdFuncionario = in.nextInt();
		
		Funcionario[] funcionarios = new Funcionario[qtdFuncionario];
		
		//receber nome e salario
		for(int i=0; i<funcionarios.length; i++) {
			in = new Scanner(System.in);
			System.out.println("Digite nome do funcionário: ");
			String nome = in.nextLine();
			in = new Scanner(System.in);
			System.out.println("Digite o salario do funcionario: ");
			double salario = in.nextDouble();
					
			funcionarios[i] = new Funcionario(nome, salario);
		}
		
		for(int i=0; i<funcionarios.length; i++) {
			//se menor de 1000 recebe 20/100
			if(funcionarios[i].getSalarioBruto() < 1000) {
				funcionarios[i].setBonificacao((20/100d * funcionarios[i].getSalarioBruto()));
				funcionarios[i].setSalarioLiquido(funcionarios[i].getSalarioBruto() + funcionarios[i].getBonificacao());
			}
				
			//se maior igual 1000 e menor igual 2000 recebe 10/100
			if(funcionarios[i].getSalarioBruto() >= 1000 && funcionarios[i].getSalarioBruto() <= 2000) {
				funcionarios[i].setBonificacao((10/100d * funcionarios[i].getSalarioBruto()));
				funcionarios[i].setSalarioLiquido(funcionarios[i].getSalarioBruto() + funcionarios[i].getBonificacao());
			}
			//se acima 2000 desconta 10%
			if(funcionarios[i].getSalarioBruto() > 2000) {
				funcionarios[i].setDesconto((10/100d * funcionarios[i].getSalarioBruto()));
				funcionarios[i].setSalarioLiquido(funcionarios[i].getSalarioBruto() - funcionarios[i].getDesconto());
			}
		}
		
		
		//exibir nome, salarioBruto, bonus ou desconto, salarioLiquido
		for(int i=0; i<funcionarios.length; i++) {
		//	System.out.println(funcionarios[i].getNome() +" "+ funcionarios[i].getSalarioBruto()+" "+funcionarios[i].getBonificacao()+" "+
		//	funcionarios[i].getSalarioLiquido());
			
			System.out.println("Nome do funcionário: " +funcionarios[i].getNome() );
			System.out.println("Salário Bruto: " +funcionarios[i].getSalarioBruto());
			if(funcionarios[i].getDesconto() != null && funcionarios[i].getDesconto() != 0) {
				System.out.println("Desconto: " +funcionarios[i].getDesconto());
			}else {
				System.out.println("Bonificação: " +funcionarios[i].getBonificacao());
			}
			
			System.out.println("Salário Líquido: "+funcionarios[i].getSalarioLiquido());
		}
	}
			

}