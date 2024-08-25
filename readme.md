
### Documentação da API - Oficina

**Base URL:** `http://18.188.56.142:8080/api/pessoas`

---

#### 1. Listar todas as pessoas

- **Endpoint:** `/api/pessoas`
- **Método HTTP:** `GET`
- **Descrição:** Retorna uma lista de todas as pessoas cadastradas no sistema.

**Exemplo de Requisição:**

```http
GET http://18.188.56.142:8080/api/pessoas
```

**Exemplo de Resposta:**

```json
[
    {
        "id": 1,
        "nome": "João Silva",
        "endereco": "Rua A, 123",
        "cpf": "123.456.789-00",
        "cidade": "São Paulo",
        "telefone": "11 98765-4321"
    },
    {
        "id": 2,
        "nome": "Maria Oliveira",
        "endereco": "Rua B, 456",
        "cpf": "987.654.321-00",
        "cidade": "Rio de Janeiro",
        "telefone": "21 99876-5432"
    }
]
```

---

#### 2. Obter detalhes de uma pessoa por ID

- **Endpoint:** `/api/pessoas/{id}`
- **Método HTTP:** `GET`
- **Descrição:** Retorna os detalhes de uma pessoa específica pelo seu ID.
- **Parâmetros de URL:**
  - `id` (inteiro): O ID da pessoa que você deseja buscar.

**Exemplo de Requisição:**

```http
GET http://18.188.56.142:8080/api/pessoas/1
```

**Exemplo de Resposta (200 OK):**

```json
{
    "id": 1,
    "nome": "João Silva",
    "endereco": "Rua A, 123",
    "cpf": "123.456.789-00",
    "cidade": "São Paulo",
    "telefone": "11 98765-4321"
}
```

**Exemplo de Resposta (404 Not Found):**

```json
{
    "timestamp": "2024-08-25T15:30:20.123+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "Pessoa não encontrada",
    "path": "/api/pessoas/10"
}
```

---

#### 3. Criar uma nova pessoa

- **Endpoint:** `/api/pessoas`
- **Método HTTP:** `POST`
- **Descrição:** Cria uma nova pessoa no sistema.
- **Corpo da Requisição (JSON):**

```json
{
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 789",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

**Exemplo de Requisição:**

```http
POST http://18.188.56.142:8080/api/pessoas
Content-Type: application/json

{
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 789",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

**Exemplo de Resposta (201 Created):**

```json
{
    "id": 3,
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 789",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

---

#### 4. Atualizar uma pessoa existente

- **Endpoint:** `/api/pessoas/{id}`
- **Método HTTP:** `PUT`
- **Descrição:** Atualiza os dados de uma pessoa existente.
- **Parâmetros de URL:**
  - `id` (inteiro): O ID da pessoa que você deseja atualizar.
- **Corpo da Requisição (JSON):**

```json
{
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 1234",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

**Exemplo de Requisição:**

```http
PUT http://18.188.56.142:8080/api/pessoas/3
Content-Type: application/json

{
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 1234",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

**Exemplo de Resposta (200 OK):**

```json
{
    "id": 3,
    "nome": "Carlos Eduardo",
    "endereco": "Rua C, 1234",
    "cpf": "321.654.987-00",
    "cidade": "Belo Horizonte",
    "telefone": "31 91234-5678"
}
```

**Exemplo de Resposta (404 Not Found):**

```json
{
    "timestamp": "2024-08-25T15:30:20.123+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "Pessoa não encontrada",
    "path": "/api/pessoas/10"
}
```

---

#### 5. Deletar uma pessoa

- **Endpoint:** `/api/pessoas/{id}`
- **Método HTTP:** `DELETE`
- **Descrição:** Deleta uma pessoa existente pelo seu ID.
- **Parâmetros de URL:**
  - `id` (inteiro): O ID da pessoa que você deseja deletar.

**Exemplo de Requisição:**

```http
DELETE http://18.188.56.142:8080/api/pessoas/3
```

**Exemplo de Resposta (204 No Content):**

```http
HTTP/1.1 204 No Content
```

**Exemplo de Resposta (404 Not Found):**

```json
{
    "timestamp": "2024-08-25T15:30:20.123+00:00",
    "status": 404,
    "error": "Not Found",
    "message": "Pessoa não encontrada",
    "path": "/api/pessoas/10"
}
```

