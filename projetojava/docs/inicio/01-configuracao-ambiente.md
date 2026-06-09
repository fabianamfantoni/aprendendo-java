# Configuração do Ambiente Java

## Configurar o ambiente de desenvolvimento Java utilizando JDK, Eclipse e VS Code.

***Instalação do JDK***

[Baixe o JDK](https://www.oracle.com/java/technologies/downloads) 
---

JDK : *Java Development Kit*

- Fornece todas as ferramentas necessárias para escrever, compilar e executar programas.

- Garante compatibilidade com a JVM, permitindo que o código rode em qualquer sistema.

- Também traz bibliotecas padrão e ferramentas úteis como java e javadoc aceleram o desenvolvimento.

---
## Instalação:

**Configure a variável de ambiente:**

**Windows:**

1. Vá em Painel de Controle -> Sistema -> Configurações Avançadas -> Variáveis de Ambiente.

2. Crie/edite a variável JAVA_HOME apontando para o diretório do JDK.

3. Adicione %JAVA_HOME%\bin ao PATH.


**Linux/macOS:**

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
## Configuração no Eclipse

[Baixe o Eclipse IDE](https://eclipseide.org)

1. Instale e abra o Eclipse.
2. Windows -> Preferences -> Java -> Installed JREs.
4. Clique em Add -> Standard VM e selecione o diretório do JDK.

- Crie um novo projeto Java: File -> New -> Java Project -> Defina o nome e finalize.
---

**Configuração no VS Code**

[Baixe a versão para seu sistema operacional](https://code.visualstudio.com/Download)

*Instale as extensões necessárias:*

- Vá em Extensions (ícone de quadradinho na barra lateral).
    - Extension Pack for Java (inclui suporte a linguagem, depuração e Maven/Gradle).
    - Debugger for Java.
    - Java Test Runner.

*Maven for Java:*

1. Vá em File -> Preferences -> Settings.
2. Pesquise por java.home e configure o caminho do JDK.
3. Crie um novo projeto: Use o atalho Ctrl+Shift+P → Java: Create Java Project.
4. Escolha Maven/Gradle ou projeto simples.