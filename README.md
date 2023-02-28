# Projeto E-diaristas

Projeto desenvolvido em conjunto com a imersão Multi Stack da [TreinaWeb](http://treinaweb.com.br/) utilizando a linguagem Java junto com o framework Spring Boot.

## Dependências usadas

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- Bean Validation
- Banco H2

## Dependências de Desenvolvimento

- Spring Boot DevTools
- Lombok

## Requisitos

- Java 17
- Maven 3.8

## Como testar esse projeto na minha máquina?

- É preciso clonar este repositório e em seguida entrar na pasta do projeto.

```sh
git clone https://github.com/guilhermemlp/e-diaristas-spring-thymeleaf.git
cd e-diaristas-spring-thymeleaf
```

- Atualize as configurações de acesso ao banco de dados no arquivo [application.properties](src/main/resources/application.properties).
- Acesse o Banco de Dados de teste através de [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/).

```properties
spring.datasource.url=jdbc:mysql://host:porta/nome_do_banco
spring.datasource.username=usuario
spring.datasource.password=senha
```

- Execute o projeto através do Maven.

```sh
mvn spring-boot:run
```

- Acesse a aplicação em [http://localhost:8080/admin/servicos](http://localhost:8080/admin/servicos).