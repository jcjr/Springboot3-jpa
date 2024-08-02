
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
O projeto criado seguindo as aulas do curso "Java COMPLETO Programação Orientada a Objetos + Projetos" do professor Nélio Alves da plataforma Udemy. Este projeto é destino a estudante que
estão aprendendo as tecnologias Java, Springbot3 e banco de dados MySQL. Parte do código foi otimizado para melhor performace da aplicação.

## Funcionalidades

**Operações de CRUD**
**Integração com MySQL**
**API Rest**

## Técnicas e Tecnologias Utilizadas

- **Java 17 (Ou superior)** 
- **Spring Boot 3** 
- **Em memória com console H2 do Spring Boot**
- **Spring Tools for Eclipse** 
- **Paradigma de orientação a objetos** 

## Instalação e Configuração

### Pré-requisitos

- Java 17 ou superior
- Spring Boot 4 for Eclipse
- Maven

### Passos para Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/jcjr/Springboot3-jpa.git
    ```
2. Navegue até o diretório do projeto baixado no seu PC:
    ```bash
    cd seu-repositorio
    ```
3. Atualize o arquivo `application-test.properties` em `src/main/resources` com suas configurações de banco de dados:

    # DTASOURCE
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.url=jdbc:h2mem:testdb (Nome do DB: testedb - Modifique se desejar)
    spring.datasource.usrname=root (Usuário: root)
    spring.datasoure.password= (Senha: Sem senha. Insira uma a seu critério (Sem espaço))

    # H2 CLIENT
    spring.h2.console.enabled=true
    spring.h2.console.path=/h2-console

    # JPA, SQL
    spring.jpa.defer-datasource-initialization=true
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true

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

### Exemplo de no navegador

```http

http://localhost/users/
http://localhost/users/1

```

### Resultados no navegador

```json
{"id": 1, "nome": "Exemplo"}

```

### Acessando banco de dados
Para acessar o banco de dados em memória você deve colocar o seguinte endereço no navegador:

http://localhost/h2-console

## Contribuição

1. Fork o projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`).
4. Push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request para o repositório original.

OBS: Agradeço se puder fazer o pull request para mim para enriquece o projeto original e disponibilizar para outros desenvlvedores.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Contato

- Nome: José Carlos Júnior
- Email: josecarlosjr.atc@gmail.com
- LinkedIn: [Meu LinkedIn](https://linkedin.com/in/jcjreletrotecnico)
