# 🚀 Inventory SaaS

Sistema backend para **gerenciamento de estoque empresarial** desenvolvido com **Spring Boot**, **MySQL** e **Docker**.

A aplicação fornece uma **API REST escalável** capaz de gerenciar empresas, produtos, usuários e movimentações de estoque.

Este projeto foi construído com foco em:

* arquitetura limpa
* organização de código
* preparação para sistemas distribuídos

---

# 📚 Visão Geral

O sistema permite gerenciar o estoque de empresas através de uma API moderna.

### Funcionalidades atuais

* ✔ Cadastro de empresas
* ✔ Cadastro de produtos
* ✔ Controle de usuários
* ✔ Registro de movimentações de estoque
* ✔ API documentada automaticamente com **Swagger**

---

### Evoluções planejadas

O projeto foi planejado para evoluir com:

* Autenticação **JWT**
* Mensageria com **Kafka**
* Testes automatizados
* Deploy em **cloud**

---

# 🧰 Tecnologias Utilizadas

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA

### Banco de Dados

* MySQL

### Infraestrutura

* Docker
* Docker Compose

### Documentação

* Swagger / OpenAPI

### Build

* Maven

---

# 🏗 Arquitetura da Aplicação

A aplicação segue o padrão **Layered Architecture**.

```
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

---

## Controller

Responsável por expor os **endpoints REST da aplicação**.

Exemplo:

```
ProductController
UserController
CompanyController
StockMovementController
```

---

## Service

Responsável pela **lógica de negócio da aplicação**.

```
ProductService
UserService
CompanyService
StockMovementService
```

---

## Repository

Responsável pela comunicação com o banco de dados utilizando **Spring Data JPA**.

```
ProductRepository
UserRepository
CompanyRepository
StockMovementRepository
```

---

## Entity

Representa as **tabelas do banco de dados**.

```
Product
User
Company
StockMovement
```

---

# 📂 Estrutura do Projeto

Baseada na estrutura atual do código.

```
src/main/java/com/inventory/saas

controller
 ├── CompanyController.java
 ├── ProductController.java
 ├── StockMovementController.java
 └── UserController.java

entity
 ├── Company.java
 ├── Product.java
 ├── StockMovement.java
 └── User.java

repository
 ├── CompanyRepository.java
 ├── ProductRepository.java
 ├── StockMovementRepository.java
 └── UserRepository.java

service
 ├── CompanyService.java
 ├── ProductService.java
 ├── StockMovementService.java
 └── UserService.java

InventorySaasApplication.java
```

---

# 🗄 Modelagem do Banco de Dados

O sistema possui quatro entidades principais.

### Company

Representa empresas cadastradas no sistema.

### User

Usuários que podem interagir com o sistema.

### Product

Produtos pertencentes a uma empresa.

### StockMovement

Registra movimentações de estoque.

Exemplos de movimentação:

* Entrada de produtos
* Saída de produtos
* Ajustes de inventário

---

# 🔗 Endpoints da API

### Produtos

```
GET /products
POST /products
GET /products/{id}
PUT /products/{id}
DELETE /products/{id}
```

---

### Usuários

```
GET /users
POST /users
GET /users/{id}
PUT /users/{id}
DELETE /users/{id}
```

---

### Empresas

```
GET /companies
POST /companies
GET /companies/{id}
PUT /companies/{id}
DELETE /companies/{id}
```

---

### Movimentação de Estoque

```
GET /stock-movements
POST /stock-movements
```

---

# 📘 Documentação da API

A API possui documentação interativa gerada automaticamente.

Após iniciar o projeto acesse:

```
http://localhost:8080/swagger-ui/index.html
```

Isso permite testar todos os endpoints diretamente pelo navegador.

---

# 🐳 Executando com Docker

### Construir containers

```
docker compose up --build
```

### Executar novamente

```
docker compose up
```

### Parar containers

```
docker compose down
```

---

# ▶️ Executando Localmente

### Clonar repositório

```
git clone https://github.com/seu-usuario/inventory-saas
```

### Entrar na pasta

```
cd inventory-saas
```

### Rodar aplicação

```
./mvnw spring-boot:run
```

---

# 📊 Roadmap do Projeto

## Testes

* testes unitários com **JUnit**
* testes de integração

---

## Segurança

* autenticação **JWT**
* controle de acesso

---

## Arquitetura distribuída

Eventos com **Apache Kafka**.

Exemplo:

```
product-created-event
stock-updated-event
```

---

## Infraestrutura

Deploy em nuvem com:

* AWS
* Docker
* CI/CD

---

## 📷 Screenshots

### Swagger UI

![Swagger](https://raw.githubusercontent.com/JoaoVitorMeloDev/Inventory-Management-API/refs/heads/main/inventory-saas/screenshots/post-product.png)

### Docker Containers

![Docker](https://github.com/JoaoVitorMeloDev/Inventory-Management-API/blob/main/inventory-saas/screenshots/docker-containers.png?raw=true)

### API Endpoint Test

![POST Product](https://github.com/JoaoVitorMeloDev/Inventory-Management-API/blob/main/inventory-saas/screenshots/post-product.png?raw=true)



---

# 🎯 Objetivo do Projeto

Este projeto foi criado para demonstrar conhecimentos em:

* desenvolvimento backend com **Spring Boot**
* **arquitetura em camadas**
* construção de **APIs REST**
* **containerização com Docker**
* **modelagem de banco de dados**

---
