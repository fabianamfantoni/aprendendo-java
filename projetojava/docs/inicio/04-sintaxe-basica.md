# :point_up::nerd_face: Sintaxe Básica da Linguagem Java

:paperclip: *Java é uma linguagem orientada a objetos, e todo programa começa com uma **classe** e um **método principal** (`main`).*

---
*A sintaxe define como escrevemos instruções para que o compilador entenda e execute.*

- **() Parênteses**: Na sintaxe é usado para parâmetros de métodos e condições.

- **{ } Bloco**: Usado para delimitar escopos: corpo de classes, métodos, laços e condicionais.

- **[] Colchetes**: Representam arrays (listas de valores do mesmo tipo).

- **; Ponto e vírgula**: Indica o fim de uma instrução.

- **. Ponto**: Usado para acessar membros (métodos ou atributos) de classes/objetos.

##### :warning: *A falta ou o uso incorreto pode gerar erro no código!*

* Porque o compilador depende dessas regras para interpretar corretamente o programa. Por exemplo, esquecer o ; no final de uma linha ou usar () fora de contexto fará o código não compilar.

## :building_construction: Estrutura de um programa Java

---
- **Classe**: Definida com `class NomeDaClasse`(CamelCase começando com maiúsculas ).

    - A classe é a base da programação orientada a objetos. Ela funciona como um molde que descreve atributos (dados) e métodos (comportamentos) de um objeto. 
    
    - Sem classes, não seria possível estruturar programas de forma organizada e reutilizável.

- **Importância da classe**

    - Organização: agrupa código relacionado em um único bloco lógico.

    - Reutilização: permite criar múltiplos objetos a partir do mesmo molde.

    - Encapsulamento: protege dados e controla como são acessados.

    - Escalabilidade: facilita manutenção e expansão de sistemas grandes.
---

- **Métodos**: Os métodos são fundamentais porque permitem organizar o código em blocos reutilizáveis que executam tarefas específicas.

    - Eles tornam o programa mais legível, evitam repetição e facilitam a manutenção. 
    - Cada método pode receber parâmetros, realizar operações e retornar resultados, funcionando como pequenas “funções” dentro da classe.

- **Método principal**: `public static void main(String[] args)` é o ponto de entrada do programa.

    - Quando você executa um código Java, é esse método que o compilador procura para iniciar a execução. Sem ele, o programa não sabe por onde começar.


- **Comentários**: usados para explicar o código sem afetar a execução.

  - `// comentário de uma linha`
  - `/* comentário de múltiplas linhas */`

---

## Exemplo simples

```

public class Exemplo {
    public static void main(String[] args) {
        // Exibe uma mensagem no console
        System.out.println("Olá, mundo!");
    }
}
``` 
---

## :round_pushpin:Declaração de variáveis

**Sintaxe**: *tipo nome = valor;(CamelCase começando com minúscula)*
**Exemplos de tipos**:

- int : números inteiros
- double : números decimais
- String : texto 
- char : caracter unico

- final: Se uma variável levar a palavra final indica imutabilidade em Java (como const em outras linguagens)

---

```

public static void main(String[] args) {
    int idade = 25;
    double altura = 1.68;
    String nome = "Maria";//utiliza aspas duplas ("") no valor
    char sexo = 'f'; //utiliza aspas simples ('') no valor 

}

``` 

### :paperclips: Concatenação em Java

*Concatenação é o ato de unir valores, geralmente textos, em uma única sequência.*
*Em Java, isso é feito principalmente com o operador + ou com métodos da classe String.*

- Operador +: usado tanto para soma quanto para juntar textos.

- Método .concat(): faz parte da classe String.

- Objetos como StringBuilder: utilizam métodos (.append()) para concatenar.
