#  Freezer API - Cadastro de Alimentos com Spring Boot

Uma API REST desenvolvida com **Spring Boot** para gerenciamento de alimentos armazenados em um freezer. O projeto permite cadastrar, listar, atualizar e remover comidas como 🍕🍔🥦, utilizando boas práticas de organização em camadas.

---

## 🚀 Objetivo do Projeto

Criar uma API completa utilizando Spring Boot para praticar:

- Configuração de projeto no IntelliJ IDEA
- Uso das principais anotações do Spring
- Integração com banco de dados usando JPA
- Desenvolvimento de endpoints RESTful
- Testes de requisições com Postman
- Organização profissional de código

---

## 🛠️ Tecnologias Utilizadas

✔ IntelliJ IDEA  
✔ Spring Boot 3  
✔ Spring Web  
✔ Spring Data JPA  
✔ H2 Database  
✔ Postman  
✔ Maven  
✔ Arquitetura MVC

---

## 🗄️ Configuração do Banco H2

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
    driver-class-name: org.h2.Driver
    username: sa
    password:

  h2:
    console:
      enabled: true
      path: /h2-console

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

Acessar console:

```
http://localhost:8080/h2-console
```

JDBC URL:
```
jdbc:h2:mem:testdb
```

---

## 🔥 Endpoints REST

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | /foods | Lista todos os alimentos |
| GET | /foods/{id} | Busca alimento por ID |
| POST | /foods | Cadastra novo alimento |
| PUT | /foods/{id} | Atualiza alimento |
| DELETE | /foods/{id} | Remove alimento |

---

## 📬 Testando com Postman

### ➜ Criar alimento (POST)

```
POST http://localhost:8080/foods
```

Body (JSON):

```json
{
  "name": "Pizza",
  "quantity": 2,
  "expirationDate": "2026-02-20"
}
```

---

## 🧼 Boas Práticas Aplicadas

✅ Separação em camadas (Controller, Service, Repository, Model)  
✅ Uso correto das anotações do Spring  
✅ Injeção de dependência via construtor  
✅ Uso de DTOs (recomendado para evolução futura)  
✅ Banco H2 para desenvolvimento rápido  

---

## 📚 O que você aprende com esse projeto

- Como estruturar uma API profissional
- Como o Spring Boot funciona internamente
- Como integrar JPA com banco de dados
- Como testar endpoints REST
- Como organizar código de forma escalável

---

## 🎯 Conclusão

Este projeto é ideal para quem quer aprender **Spring Boot rápido e direto ao ponto**, criando uma API real com persistência em banco de dados e endpoints REST completos.

Se você quer dominar backend com Java, esse é um excelente ponto de partida. 🚀
