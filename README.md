
# Banco de dados com Java e Springboot

## Tabela de Conteúdos

1. [Descrição](#descrição)
2. [Funcionalidades](#funcionalidades)
3. [Tecnologias Utilizadas](#tecnologias-utilizadas)
4. [Instalação e Configuração](#instalação-e-configuração)
5. [Uso](#uso)
6. [Contribuição](#contribuição)
7. [Licença](#licença)
8. [Contato](#contato)

## Descrição

O projeto criado seguindo as aulas do curso "Java COMPLETO Programação Orientada a Objetos +
Projetos" do professor Nélio Alves da plataforma Udemy. Este projeto é destino a estudante que
estão aprendendo as tecnologias Java, Springbot3 e banco de dados MySQL. Parte do código foi
otimizado para melhor performace da aplicação.

## Funcionalidades

- Operações de CRUD
- Integração com MySQL
- API Rest

## Tecnologias Utilizadas

- **Linguagem de Programação:** Java 17
- **Framework:** Spring Boot 3
- **Banco de Dados:** MySQL
- **Conexão com Banco de Dados:** MySQL Connector/J
- **IDE Utilizada:** Spring Tools for Eclipse

## Instalação e Configuração

### Pré-requisitos

- Java 17 ou superior
- Spring Boot 4 for Eclipse
- MySQL 8.0.30 (Somente necessário se o banco não for em memória)
- MySQL Connector/J 8 ou superior
- Maven


### Passos para Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/jcjr/Springboot3-jpa.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```
3. Atualize o arquivo `application.properties` em `src/main/resources` com suas configurações de banco de dados:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
    spring.datasource.username=seu_usuario (Usuário do projeto: root)
    spring.datasource.password=sua_senha (Senha do projeto: sem senha)

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

## Uso

O aplicativo trabalha inicialmente com um banco de dados em memória fazendo todas as operações de CRUD normalmente. Utilizando o Postman com as requisições (GET, POST e PUT) é possível inserir, lê, editar e excluir os dados em memória. O projeto tem o intuito de integração de software desktop e web.

### Exemplo de Uso

```http
GET /users/
GET /user/1

```
### Resultados no Postman

```json
{
  "id": 1,
  "nome": "Exemplo"
}
```

## Contribuição

1. Fork o projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`).
4. Push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Contato

- Nome: José Carlos Júnior
- Email: josecarlosjr.atc@gmail.com
- LinkedIn: [Meu LinkedIn](https://linkedin.com/in/jcjreletrotecnico)
