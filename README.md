# Sistema de Gestão de Clientes (SGC)

## Descrição
O **SGC (Sistema de Gestão de Clientes)** é uma aplicação desenvolvida em **Java** para gerenciar informações de clientes. Ele permite o cadastro, edição, remoção e listagem de clientes de maneira simples e eficiente.

## Funcionalidades
- **Cadastro de clientes**: Adiciona novos clientes ao sistema.
- **Listagem de clientes**: Exibe todos os clientes cadastrados.
- **Edição de clientes**: Permite modificar os dados de um cliente.
- **Remoção de clientes**: Exclui um cliente do sistema.
- **Persistência de dados**: Armazena informações utilizando um banco de dados relacional.

## Tecnologias Utilizadas
- **Java** (versão X)
- **Spring Boot** (se aplicável)
- **Banco de Dados**: MySQL / PostgreSQL / SQLite
- **Hibernate / JPA** (se aplicável)
- **Maven** ou **Gradle** (para gerenciamento de dependências)
- **JUnit** (para testes unitários, se implementado)

## Requisitos
- **Java** instalado (versão X ou superior)
- **Banco de Dados** configurado
- **IDE** recomendada: IntelliJ IDEA / Eclipse / VS Code

## Como Executar
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/sgc.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd sgc
   ```
3. Compile o projeto:
   ```sh
   mvn clean install  # Se estiver usando Maven
   ```
   ou
   ```sh
   gradle build  # Se estiver usando Gradle
   ```
4. Execute a aplicação:
   ```sh
   java -jar target/sgc.jar  # Para execução via JAR
   ```
   ou, se for um projeto Spring Boot:
   ```sh
   mvn spring-boot:run
   ```

## Estrutura do Projeto
```
sgc/
│-- src/
│   │-- main/
│   │   │-- java/com/seuusuario/sgc/
│   │   │   │-- model/        # Modelos de dados
│   │   │   │-- repository/   # Repositórios
│   │   │   │-- service/      # Serviços de negócio
│   │   │   │-- controller/   # Controllers da API
│   │   │   └-- SgcApplication.java # Classe principal
│   │   └-- resources/
│   │       │-- application.properties  # Configuração do sistema
│   │       └-- data.sql  # (Opcional) Scripts de inicialização
│-- pom.xml (ou build.gradle)  # Gerenciador de dependências
│-- README.md  # Documentação
```

## Contribuição
Sinta-se à vontade para contribuir com melhorias. Para isso:
1. Faça um **fork** do repositório.
2. Crie uma **branch** com sua feature/correção: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -m 'Adicionando nova funcionalidade'`.
4. Faça push para a branch: `git push origin minha-feature`.
5. Abra um **Pull Request**.

## Licença
Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

---
**Autor:** [Vitor Durães](https://github.com/seu-usuario)

