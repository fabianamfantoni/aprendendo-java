# :gear: Configuração do Ambiente Java

:hourglass: ***Configurando o ambiente de desenvolvimento Java utilizando JDK, Eclipse e VS Code.***

## ***Instalação do JDK***

:arrow_down:[Baixe o JDK](https://www.oracle.com/java/technologies/downloads) 

---	
:point_up::nerd_face: JDK : *Java Development Kit*

- Fornece todas as ferramentas necessárias para escrever, compilar e executar programas.

- Garante compatibilidade com a JVM, permitindo que o código rode em qualquer sistema.

- Também traz bibliotecas padrão e ferramentas úteis como java e javadoc aceleram o desenvolvimento.

---

## Instalação:

:gear: **Configure a variável de ambiente:**

:window: **Windows:**

1. Vá em Painel de Controle -> Sistema -> Configurações Avançadas -> Variáveis de Ambiente.

2. Crie/edite a variável JAVA_HOME apontando para o diretório do JDK.

3. Adicione %JAVA_HOME%\bin ao PATH.
---

	
:penguin: **Linux/macOS:**

Edite o arquivo ~/.bashrc ou ~/.zshrc adicionando:
```
    -- bash --
    export JAVA_HOME=/usr/lib/jvm/java-XX
    export PATH=$JAVA_HOME/bin:$PATH

    *Verifique a instalação com:*

    -- bash --
    java -version
    javac -version

```
---
## :gear: Configuração no Eclipse

:link: [Baixe o Eclipse IDE](https://eclipseide.org)

1. Instale e abra o Eclipse.
2. Windows -> Preferences -> Java -> Installed JREs.
4. Clique em Add -> Standard VM e selecione o diretório do JDK.

- Crie um novo projeto Java: File -> New -> Java Project -> Defina o nome e finalize.
---

:gear: **Configuração no VS Code**

:link: [Baixe a versão para seu sistema operacional](https://code.visualstudio.com/Download)

*Instale as extensões necessárias:*

- Vá em Extensions (ícone de quadradinho na barra lateral).
    - Extension Pack for Java (inclui suporte a linguagem, depuração e Maven/Gradle).
    - Debugger for Java.
    - Java Test Runner.
---

:feather: *Maven for Java:*

1. Vá em File -> Preferences -> Settings.
2. Pesquise por java.home e configure o caminho do JDK.
3. Crie um novo projeto: Use o atalho Ctrl+Shift+P → Java: Create Java Project.
4. Escolha Maven/Gradle ou projeto simples.
---
:paperclip: *" O Apache Maven é a ferramenta de automação de compilação e gerenciamento de dependências padrão no ecossistema Java. Ele elimina a necessidade de baixar e incluir arquivos .jar manualmente, padronizando a estrutura do projeto e simplificando a compilação, testes e empacotamento da aplicação."*

- **As principais funções do Maven incluem:**

    - Gerenciamento de Dependências
    - Automação de Build
    - Arquivo pom.xml
---
