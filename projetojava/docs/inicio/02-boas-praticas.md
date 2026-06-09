#  Boas práticas ao usar a linguagem Java:

## Declaração de classes e variáveis:

- Use nomes claros e significativos (ex: Cliente, saldoConta).

- **Classes** devem começar com letra maiúscula e seguir o padrão CamelCase(*A primeira letra de todas as palavras começam maiúscula*).

- **Variáveis** e **métodos** começam com letra minúscula e também usam camelCase.

- Evite abreviações confusas ou nomes genéricos como x, data1(uso apenas para estudo).
 > Em projetos, mantenha nomes claros para que, quando precisar ampliar ou fazer manutenção, não haja maiores problemas.

## Organização: 

- Mantenha cada classe em seu próprio arquivo.

- Use indentação e espaçamento consistentes para facilitar a leitura.

- Agrupe pacotes(package) por funcionalidade (ex: model, service, controller).
    - Packages em Java devem ser escritos em letras minúsculas contínuas, sem espaços, acentos ou underscores. - Isso evita conflitos e segue o padrão oficial da linguagem.
    - O padrão é lowercase contínuo, podendo usar pontos (.) para separar níveis hierárquicos.
    - *Ex*: *fundamentosbasicos;*, *com.empresa.projeto;*, *br.com.minhaapp.utilidades;* [...]

- Use a pasta src(contém o código-fonte da aplicação) -> Dentro de src, criam-se pacotes (pastas) que agrupam classes relacionadas.

- Em projetos comente apenas quando necessário, sem excesso, explicando o porquê e não apenas o que.

## Cuidados

- Inicialize variáveis antes de usar para evitar erros.

- Prefira constantes (final) para valores fixos.

- Evite duplicação de código: use métodos reutilizáveis.



