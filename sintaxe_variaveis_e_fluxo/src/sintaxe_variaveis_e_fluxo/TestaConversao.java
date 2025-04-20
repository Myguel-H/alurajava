package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		
	double salario = 1270.50;
	int valor = (int) salario; // (int) se chama casting ele serve para arredondar um double. Ex: 2.50 = 2
	System.out.println(valor);
	
	}
}
