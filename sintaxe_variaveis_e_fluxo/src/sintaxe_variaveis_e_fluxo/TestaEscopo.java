package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	
	public static void main(String[] args) {

		int idade = 19;
		int quantidadeDePessoas = 3;
		boolean acompanhado;
		
		if(quantidadeDePessoas >= 2) {
			 acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("O usuario é maior que 18 anos ! Ou Esta acompanhado de 2 ou mais pessoa, pode entrar !");
		}else {
				
				System.out.println("O usuario é menor de idade ! E não esta acompanhando de 2 ou mais pessoas");

			}
		
	}

}
