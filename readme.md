

### Documentação da API para `18.188.56.142:8080`

---

#### **Clientes**

**Base URL**: `http://18.188.56.142:8080/api/clientes`

1. **Criar um novo Cliente**
   - **Endpoint**: `/api/clientes`
   - **Método**: `POST`
   - **Corpo da Requisição**:
     ```json
     {
       "nome": "string",
       "telefone": "string",
       "endereco": "string",
       "cpf": "string",
       "cidade": "string"
     }
     ```
   - **Descrição**: Cria um novo cliente com as informações fornecidas.
   - **Respostas**:
     - **200 OK**: Cliente criado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **400 Bad Request**: Dados inválidos fornecidos na requisição.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

2. **Listar todos os Clientes**
   - **Endpoint**: `/api/clientes`
   - **Método**: `GET`
   - **Descrição**: Retorna uma lista de todos os clientes cadastrados.
   - **Respostas**:
     - **200 OK**: Lista de clientes retornada com sucesso.
       ```json
       [
         {
           "id": 1,
           "nome": "string",
           "telefone": "string",
           "endereco": "string",
           "cpf": "string",
           "cidade": "string"
         },
         ...
       ]
       ```
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

3. **Obter um Cliente por ID**
   - **Endpoint**: `/api/clientes/{id}`
   - **Método**: `GET`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do cliente a ser recuperado.
   - **Descrição**: Retorna as informações de um cliente específico pelo ID.
   - **Respostas**:
     - **200 OK**: Cliente encontrado e retornado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **404 Not Found**: Cliente não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

4. **Atualizar um Cliente por ID**
   - **Endpoint**: `/api/clientes/{id}`
   - **Método**: `PUT`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do cliente a ser atualizado.
   - **Corpo da Requisição**:
     ```json
     {
       "nome": "string",
       "telefone": "string",
       "endereco": "string",
       "cpf": "string",
       "cidade": "string"
     }
     ```
   - **Descrição**: Atualiza as informações de um cliente específico.
   - **Respostas**:
     - **200 OK**: Cliente atualizado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **400 Bad Request**: Dados inválidos fornecidos na requisição.
     - **404 Not Found**: Cliente não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

5. **Deletar um Cliente por ID**
   - **Endpoint**: `/api/clientes/{id}`
   - **Método**: `DELETE`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do cliente a ser deletado.
   - **Descrição**: Deleta um cliente específico pelo ID.
   - **Respostas**:
     - **204 No Content**: Cliente deletado com sucesso.
     - **404 Not Found**: Cliente não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

---

#### **Mecânicos**

**Base URL**: `http://18.188.56.142:8080/api/mecanicos`

1. **Criar um novo Mecânico**
   - **Endpoint**: `/api/mecanicos`
   - **Método**: `POST`
   - **Corpo da Requisição**:
     ```json
     {
       "nome": "string",
       "telefone": "string",
       "endereco": "string",
       "cpf": "string",
       "cidade": "string"
     }
     ```
   - **Descrição**: Cria um novo mecânico com as informações fornecidas.
   - **Respostas**:
     - **200 OK**: Mecânico criado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **400 Bad Request**: Dados inválidos fornecidos na requisição.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

2. **Listar todos os Mecânicos**
   - **Endpoint**: `/api/mecanicos`
   - **Método**: `GET`
   - **Descrição**: Retorna uma lista de todos os mecânicos cadastrados.
   - **Respostas**:
     - **200 OK**: Lista de mecânicos retornada com sucesso.
       ```json
       [
         {
           "id": 1,
           "nome": "string",
           "telefone": "string",
           "endereco": "string",
           "cpf": "string",
           "cidade": "string"
         },
         ...
       ]
       ```
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

3. **Obter um Mecânico por ID**
   - **Endpoint**: `/api/mecanicos/{id}`
   - **Método**: `GET`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do mecânico a ser recuperado.
   - **Descrição**: Retorna as informações de um mecânico específico pelo ID.
   - **Respostas**:
     - **200 OK**: Mecânico encontrado e retornado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **404 Not Found**: Mecânico não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

4. **Atualizar um Mecânico por ID**
   - **Endpoint**: `/api/mecanicos/{id}`
   - **Método**: `PUT`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do mecânico a ser atualizado.
   - **Corpo da Requisição**:
     ```json
     {
       "nome": "string",
       "telefone": "string",
       "endereco": "string",
       "cpf": "string",
       "cidade": "string"
     }
     ```
   - **Descrição**: Atualiza as informações de um mecânico específico.
   - **Respostas**:
     - **200 OK**: Mecânico atualizado com sucesso.
       ```json
       {
         "id": 1,
         "nome": "string",
         "telefone": "string",
         "endereco": "string",
         "cpf": "string",
         "cidade": "string"
       }
       ```
     - **400 Bad Request**: Dados inválidos fornecidos na requisição.
     - **404 Not Found**: Mecânico não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

5. **Deletar um Mecânico por ID**
   - **Endpoint**: `/api/mecanicos/{id}`
   - **Método**: `DELETE`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do mecânico a ser deletado.
   - **Descrição**: Deleta um mecânico específico pelo ID.
   - **Respostas**:
     - **204 No Content**: Mecânico deletado com

 sucesso.
     - **404 Not Found**: Mecânico não encontrado com o ID fornecido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

---



#### 1. Criar um Novo Veículo

- **Método HTTP:** `POST`
- **URL:** `/veiculos`
- **Descrição:** Cria um novo veículo com os dados fornecidos.
- **Cabeçalhos:**
  - `Content-Type: application/json`
- **Corpo da Requisição (JSON):**

```json
{
  "descricao": "Carro Sedan",
  "placa": "ABC-1234",
  "anoModelo": 2021,
  "cliente": {
    "id": 1
  }
}
```

- **Exemplo de Resposta (201 Created):**

```json
{
  "id": 1,
  "descricao": "Carro Sedan",
  "placa": "ABC-1234",
  "anoModelo": 2021,
  "cliente": {
    "id": 1,
    "nome": "João da Silva",
    "cpf": "123.456.789-00"
  }
}
```

#### 2. Listar Todos os Veículos

- **Método HTTP:** `GET`
- **URL:** `/veiculos`
- **Descrição:** Retorna uma lista de todos os veículos.
- **Exemplo de Resposta (200 OK):**

```json
[
  {
    "id": 1,
    "descricao": "Carro Sedan",
    "placa": "ABC-1234",
    "anoModelo": 2021,
    "cliente": {
      "id": 1,
      "nome": "João da Silva",
      "cpf": "123.456.789-00"
    }
  },
  {
    "id": 2,
    "descricao": "Moto",
    "placa": "XYZ-5678",
    "anoModelo": 2019,
    "cliente": {
      "id": 2,
      "nome": "Maria Souza",
      "cpf": "987.654.321-00"
    }
  }
]
```

#### 3. Buscar Veículo por ID

- **Método HTTP:** `GET`
- **URL:** `/veiculos/{id}`
- **Descrição:** Retorna os detalhes de um veículo específico com base no ID fornecido.
- **Parâmetros da URL:**
  - `{id}`: O ID do veículo a ser buscado.
- **Exemplo de Resposta (200 OK):**

```json
{
  "id": 1,
  "descricao": "Carro Sedan",
  "placa": "ABC-1234",
  "anoModelo": 2021,
  "cliente": {
    "id": 1,
    "nome": "João da Silva",
    "cpf": "123.456.789-00"
  }
}
```

- **Exemplo de Resposta (404 Not Found):**
  ```json
  {
    "error": "Veículo não encontrado para este id :: {id}"
  }
  ```

#### 4. Buscar Veículos por Placa

- **Método HTTP:** `GET`
- **URL:** `/veiculos/placa/{placa}`
- **Descrição:** Retorna uma lista de veículos que correspondem à placa fornecida.
- **Parâmetros da URL:**
  - `{placa}`: A placa do veículo a ser buscada.
- **Exemplo de Resposta (200 OK):**

```json
[
  {
    "id": 1,
    "descricao": "Carro Sedan",
    "placa": "ABC-1234",
    "anoModelo": 2021,
    "cliente": {
      "id": 1,
      "nome": "João da Silva",
      "cpf": "123.456.789-00"
    }
  }
]
```

#### 5. Buscar Veículos por Ano

- **Método HTTP:** `GET`
- **URL:** `/veiculos/ano/{ano}`
- **Descrição:** Retorna uma lista de veículos que correspondem ao ano fornecido.
- **Parâmetros da URL:**
  - `{ano}`: O ano do modelo dos veículos a serem buscados.
- **Exemplo de Resposta (200 OK):**

```json
[
  {
    "id": 1,
    "descricao": "Carro Sedan",
    "placa": "ABC-1234",
    "anoModelo": 2021,
    "cliente": {
      "id": 1,
      "nome": "João da Silva",
      "cpf": "123.456.789-00"
    }
  },
  {
    "id": 3,
    "descricao": "Caminhão",
    "placa": "DEF-9876",
    "anoModelo": 2021,
    "cliente": {
      "id": 3,
      "nome": "Carlos Oliveira",
      "cpf": "234.567.890-11"
    }
  }
]
```

#### 6. Buscar Veículos por Placa e Ano

- **Método HTTP:** `GET`
- **URL:** `/veiculos/search`
- **Descrição:** Retorna uma lista de veículos que correspondem tanto à placa quanto ao ano fornecidos.
- **Parâmetros de Consulta (Query Parameters):**
  - `placa`: A placa do veículo a ser buscada.
  - `ano`: O ano do modelo dos veículos a serem buscados.
- **Exemplo de Requisição:**
  - `/veiculos/search?placa=ABC-1234&ano=2021`
- **Exemplo de Resposta (200 OK):**

```json
[
  {
    "id": 1,
    "descricao": "Carro Sedan",
    "placa": "ABC-1234",
    "anoModelo": 2021,
    "cliente": {
      "id": 1,
      "nome": "João da Silva",
      "cpf": "123.456.789-00"
    }
  }
]
```

#### 7. Atualizar Veículo

- **Método HTTP:** `PUT`
- **URL:** `/veiculos/{id}`
- **Descrição:** Atualiza os detalhes de um veículo existente com base no ID fornecido.
- **Parâmetros da URL:**
  - `{id}`: O ID do veículo a ser atualizado.
- **Cabeçalhos:**
  - `Content-Type: application/json`
- **Corpo da Requisição (JSON):**

```json
{
  "descricao": "Carro SUV",
  "placa": "ABC-1234",
  "anoModelo": 2022,
  "cliente": {
    "id": 1
  }
}
```

- **Exemplo de Resposta (200 OK):**

```json
{
  "id": 1,
  "descricao": "Carro SUV",
  "placa": "ABC-1234",
  "anoModelo": 2022,
  "cliente": {
    "id": 1,
    "nome": "João da Silva",
    "cpf": "123.456.789-00"
  }
}
```

- **Exemplo de Resposta (404 Not Found):**
  ```json
  {
    "error": "Veículo não encontrado para este id :: {id}"
  }
  ```

#### 8. Deletar Veículo

- **Método HTTP:** `DELETE`
- **URL:** `/veiculos/{id}`
- **Descrição:** Deleta um veículo com base no ID fornecido.
- **Parâmetros da URL:**
  - `{id}`: O ID do veículo a ser deletado.
- **Exemplo de Resposta (204 No Content):** Nenhum conteúdo é retornado ao sucesso.
- **Exemplo de Resposta (404 Not Found):**
  ```json
  {
    "error": "Veículo não encontrado para este id :: {id}"
  }


