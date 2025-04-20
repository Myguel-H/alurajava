package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println();
		int idade = 16;
		int quantidadeDePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("O usuario é maior que 18 anos !");
		}else {
			
			if (quantidadeDePessoas >= 2) {
				System.out.println("Acompanhado de 2 ou mais pessoa? Pode entrar !");
				
			}else {
				
				System.out.println("O usuario é menor de idade ! Ou não esta acompanhando de 2 ou mais pessoas");

			}
		}
	}

}
