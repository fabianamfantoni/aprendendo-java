# :game_die: Tipos de dados

:paperclip: *Em Java, os tipos de dados definem como as informações são armazenadas e manipuladas no programa.*
 
:bulb: *Eles se dividem em **tipos primitivos**, que guardam valores simples como números e caracteres, e **tipos de referência**, que representam objetos mais complexos.*

---

## :page_with_curl: Tipos primitivos:


:card_index_dividers:***São os mais básicos, armazenam valores simples diretamente na memória. Eles são divididos em:***

---
*Inteiros (sem casas decimais)*

- byte (8 bits) -> números inteiros de -128 a 127

- short (16 bits) ->  inteiros de -32.768 a 32.767

- int (32 bits)->  inteiros de -2.147.483.648 a 2.147.483.647

- long (64 bits)->  inteiros muito grandes (até 9 quintilhões)
---

*Ponto flutuante (com casas decimais)*

- float ->  números decimais de precisão simples (32 bits)

- double ->  números decimais de precisão dupla (64 bits)
---

*Caractere*

- char (16 bits) ->  um único caractere Unicode (ex: 'A', '9', 'ç')
---

*Lógico*

- boolean (1 bit) -> valores lógicos: true ou false
---
## :compass: Tipos de referência

---
:file_cabinet: ***São usados para armazenar objetos e estruturas mais complexas:***

- *Strings* -> texto (ex: "Olá Mundo")

- *Arrays* -> coleções de elementos do mesmo tipo (ex: int[] numeros)

- *Classes e Objetos* -> instâncias criadas a partir de classes definidas pelo programador

- *Interfaces* -> contratos que definem métodos sem implementação

- *Enums* -> conjuntos de constantes nomeadas

---

## :warning: Importante:

 *Saber os tipos de dados e seus respectivos valores é essencial porque garante que o programa manipule informações corretamente, evitando erros de execução. Além disso, permite otimizar memória e desempenho, já que cada tipo ocupa um espaço específico. Essa compreensão também facilita a escolha adequada de estruturas e operações para resolver problemas de forma eficiente.*

 **Ex:** 
 
 - Imagine que você está desenvolvendo um sistema de cadastro de clientes. 
 - O campo idade deve ser um número inteiro, porque não faz sentido ter casas decimais. 
 - Já o campo nome precisa ser uma sequência de caracteres (String). 
 - Se você escolher o tipo errado, como armazenar idade em texto, não conseguirá fazer cálculos (ex.: média de idades).
 
---

```
    public class Cliente {
	
        public static void main(String[]args) {

            String nome = "Maria"; 
            String cpf = "999.999.999-99";// é interpretado como texto
            int idade = 25;    // pode ser calculado  
            
            System.out.println(idade + 5) // 30
            System.out.println(nome+" "+ cpf) //será concatenado(juntado) = Maria 999.999.999-99 
    }
```
--- 

