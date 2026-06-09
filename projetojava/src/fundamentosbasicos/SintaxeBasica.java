package fundamentosbasicos;

public class SintaxeBasica {
public static void main(String[]args) {
		
		//Output - (System.out.println())- Exibe mensagem no console

		System.out.println("Hello, world");

	// ------------------------Declarando variáveis:-------------------------------

		//tipo nomeDaVariavel = valorAtribuidoAoTipo

		String nome = "Maria"; // String texto (vários caracteres) usa-se "" 
		char c = 'm';//char caracter unico ($,a,_) usa-se '' 
		
		int idade = 25;//inteiro
		double peso = 60.25;
		
		final boolean d = true; //para verdadeiro / false - para falso
		
		System.out.println(nome +": "+idade+" "+peso+" "+c+" "+d);//+ = concatena(junta) valores a string

	//-------------------------Sintaxe Concatenação-------------------------------------------

		// Concatenação usando operador +
        System.out.println("Nome: " + nome + " | Idade: " + idade);

        // Concatenação usando método concat()
        String saudacao = "Olá".concat(" ").concat(nome);
        System.out.println(saudacao);

        // Concatenação com StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Usuário: ").append(nome).append(" - Idade: ").append(idade);
        System.out.println(sb.toString());	


		
	}
	
	
}
