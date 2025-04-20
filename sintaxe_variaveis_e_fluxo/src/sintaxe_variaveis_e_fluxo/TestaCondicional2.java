package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println();
		int idade = 13;
		int quantidadeDePessoas = 1;
		boolean acompanhado = false;
		
		if (idade >= 18 || quantidadeDePessoas >= 2 || acompanhado) {
			System.out.println("O usuario é maior que 18 anos ! Ou Esta acompanhado de 2 ou mais pessoa, pode entrar !");
		}else {
				
				System.out.println("O usuario é menor de idade ! E não esta acompanhando de 2 ou mais pessoas");

			}
		
	}

}
