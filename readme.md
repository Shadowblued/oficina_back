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
   - **Parâmetros de Consulta (Query Parameters)**: 
     - `nome`: Filtra os clientes pelo nome.
     - `cpf`: Filtra os clientes pelo CPF.
   - **Exemplos de Uso**:
     - `/api/clientes?nome=Maria`
     - `/api/clientes?cpf=111.222.333-44`
     - `/api/clientes?nome=Maria&cpf=111.222.333-44`
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
   - **Parâmetros de Consulta (Query Parameters)**: 
     - `nome`: Filtra os mecânicos pelo nome.
     - `cpf`: Filtra os mecânicos pelo CPF.
   - **Exemplos de Uso**:
     - `/api/mecanicos?nome=Maria`
     - `/api/mecanicos?cpf=111.222.333-44`
     - `/api/mecanicos?nome=Maria&cpf=111.222.333-44`
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
     - **404 Not Found**: Mecânico não encontrado com o ID forne

cido.
     - **500 Internal Server Error**: Erro interno do servidor ao processar a requisição.

5. **Deletar um Mecânico por ID**
   - **Endpoint**: `/api/mecanicos/{id}`
   - **Método**: `DELETE`
   - **Parâmetros**:
     - **Path Parameter**: `id` (inteiro) - ID do mecânico a ser deletado.
   - **Descrição**: Deleta um mecânico específico pelo ID.
   - **Respostas**:
     - **204 No Content**: Mecânico deletado com sucesso.
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



1. **Criar um novo serviço**
   - **Rota:** `POST /api/servicos`
   - **Descrição:** Cria um novo serviço com base nos dados fornecidos.
   - **Corpo da Requisição:** 
     ```json
     {
       "descricaoServico": "Descrição do Serviço",
       "valorServico": 100.0
     }
     ```
   - **Resposta de Sucesso:** 
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       {
         "id": 1,
         "descricaoServico": "Descrição do Serviço",
         "valorServico": 100.0
       }
       ```

2. **Listar todos os serviços**
   - **Rota:** `GET /api/servicos`
   - **Descrição:** Retorna uma lista de todos os serviços disponíveis.
   - **Resposta de Sucesso:** 
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       [
         {
           "id": 1,
           "descricaoServico": "Serviço 1",
           "valorServico": 50.0
         },
         {
           "id": 2,
           "descricaoServico": "Serviço 2",
           "valorServico": 75.0
         }
       ]
       ```

3. **Obter um serviço por ID**
   - **Rota:** `GET /api/servicos/{id}`
   - **Descrição:** Retorna os detalhes de um serviço específico pelo seu ID.
   - **Parâmetros:**
     - `id` (int): ID do serviço.
   - **Resposta de Sucesso:**
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       {
         "id": 1,
         "descricaoServico": "Serviço 1",
         "valorServico": 50.0
       }
       ```
   - **Resposta de Erro:**
     - **Código:** 404 Not Found

4. **Buscar serviços por descrição**
   - **Rota:** `GET /api/servicos/descricao`
   - **Descrição:** Retorna uma lista de serviços que correspondem à descrição fornecida.
   - **Parâmetros de Consulta:**
     - `descricao` (String): Descrição parcial ou completa do serviço.
   - **Resposta de Sucesso:**
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       [
         {
           "id": 1,
           "descricaoServico": "Serviço X",
           "valorServico": 100.0
         }
       ]
       ```

5. **Buscar serviços por valor**
   - **Rota:** `GET /api/servicos/valor`
   - **Descrição:** Retorna uma lista de serviços que correspondem ao valor fornecido.
   - **Parâmetros de Consulta:**
     - `valor` (Double): Valor do serviço.
   - **Resposta de Sucesso:**
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       [
         {
           "id": 2,
           "descricaoServico": "Serviço Y",
           "valorServico": 150.0
         }
       ]
       ```

6. **Atualizar um serviço existente**
   - **Rota:** `PUT /api/servicos/{id}`
   - **Descrição:** Atualiza um serviço existente com os dados fornecidos.
   - **Parâmetros:**
     - `id` (int): ID do serviço a ser atualizado.
   - **Corpo da Requisição:**
     ```json
     {
       "descricaoServico": "Nova Descrição do Serviço",
       "valorServico": 200.0
     }
     ```
   - **Resposta de Sucesso:**
     - **Código:** 200 OK
     - **Corpo:**
       ```json
       {
         "id": 1,
         "descricaoServico": "Nova Descrição do Serviço",
         "valorServico": 200.0
       }
       ```
   - **Resposta de Erro:**
     - **Código:** 404 Not Found

7. **Deletar um serviço**
   - **Rota:** `DELETE /api/servicos/{id}`
   - **Descrição:** Deleta um serviço com base no ID fornecido.
   - **Parâmetros:**
     - `id` (int): ID do serviço a ser deletado.
   - **Resposta de Sucesso:**
     - **Código:** 200 OK
   - **Resposta de Erro:**
     - **Código:** 404 Not Found

### Resumo dos Filtros Disponíveis

- **Filtragem por Descrição:** Use o endpoint `GET /api/servicos/descricao` com o parâmetro de consulta `descricao` para buscar serviços pela descrição.
- **Filtragem por Valor:** Use o endpoint `GET /api/servicos/valor` com o parâmetro de consulta `valor` para buscar serviços pelo valor.


#### 1. Create a New Marca

- **URL:** `/`
- **Method:** `POST`
- **Request Body:** JSON object representing a Marca
  ```json
  {
    "nomeMarca": "string"
  }
  ```
- **Response:**
  - **Success (200 OK):** Returns the created Marca object
    ```json
    {
      "id": 1,
      "nomeMarca": "string"
    }
    ```
  - **Error (400 Bad Request):** If the request body is invalid

#### 2. Get All Marca or Search by Name

- **URL:** `/`
- **Method:** `GET`
- **Query Parameter:** Optional `nome` parameter to filter by marca name
  - `nome`: *string* - name of the Marca to filter
- **Response:**
  - **Success (200 OK):** Returns a list of Marca objects
    ```json
    [
      {
        "id": 1,
        "nomeMarca": "string"
      },
      {
        "id": 2,
        "nomeMarca": "string"
      }
    ]
    ```

#### 3. Get Marca by ID

- **URL:** `/{id}`
- **Method:** `GET`
- **Path Parameter:** 
  - `id`: *integer* - ID of the Marca
- **Response:**
  - **Success (200 OK):** Returns the Marca object
    ```json
    {
      "id": 1,
      "nomeMarca": "string"
    }
    ```
  - **Error (404 Not Found):** If no Marca is found with the given ID

#### 4. Update Marca by ID

- **URL:** `/{id}`
- **Method:** `PUT`
- **Path Parameter:** 
  - `id`: *integer* - ID of the Marca to update
- **Request Body:** JSON object representing the Marca details to update
  ```json
  {
    "nomeMarca": "string"
  }
  ```
- **Response:**
  - **Success (200 OK):** Returns the updated Marca object
    ```json
    {
      "id": 1,
      "nomeMarca": "string"
    }
    ```
  - **Error (404 Not Found):** If no Marca is found with the given ID

#### 5. Delete Marca by ID

- **URL:** `/{id}`
- **Method:** `DELETE`
- **Path Parameter:** 
  - `id`: *integer* - ID of the Marca to delete
- **Response:**
  - **Success (200 OK):** Marca deleted successfully
  - **Error (404 Not Found):** If no Marca is found with the given ID

### Error Handling

- **404 Not Found:** The resource could not be found.
- **400 Bad Request:** The request was invalid or cannot be served. This could be due to validation errors in the input data.

### Models

#### Marca
```json
{
  "id": "integer",
  "nomeMarca": "string"
}
```
##  Gerenciamento de Peças

### URL Base
Todos os endpoints estão prefixados com `/api/pecas`.

---

### Endpoints

#### 1. **Criar uma Nova Peça**

- **URL**: `/api/pecas`
- **Método**: `POST`
- **Descrição**: Cria uma nova peça no sistema.
- **Corpo da Requisição**:
  ```json
  {
    "descricao": "string",
    "preco": "double",
    "marca": {
      "id": "integer"
    }
  }
  ```
- **Resposta**:
  - **Status**: `200 OK`
  - **Corpo**:
    ```json
    {
      "id": "integer",
      "descricao": "string",
      "preco": "double",
      "marca": {
        "id": "integer",
        "nome": "string"
      }
    }
    ```
- **Erros**:
  - `400 Bad Request` – Se os dados de entrada forem inválidos.

#### 2. **Consultar Peças**

- **URL**: `/api/pecas`
- **Método**: `GET`
- **Descrição**: Recupera todas as peças ou filtra por descrição ou preço.
- **Parâmetros de Consulta** (opcional):
  - `descricao`: Filtra por descrição da peça.
  - `preco`: Filtra por preço da peça.
- **Resposta**:
  - **Status**: `200 OK`
  - **Corpo**:
    ```json
    [
      {
        "id": "integer",
        "descricao": "string",
        "preco": "double",
        "marca": {
          "id": "integer",
          "nome": "string"
        }
      }
    ]
    ```

#### 3. **Consultar Peça por ID**

- **URL**: `/api/pecas/{id}`
- **Método**: `GET`
- **Descrição**: Recupera uma peça específica pelo seu ID.
- **Parâmetro de Caminho**:
  - `id`: O ID da peça que deseja recuperar.
- **Resposta**:
  - **Status**: `200 OK`
  - **Corpo**:
    ```json
    {
      "id": "integer",
      "descricao": "string",
      "preco": "double",
      "marca": {
        "id": "integer",
        "nome": "string"
      }
    }
    ```
  - **Erros**:
    - `404 Not Found` – Se a peça com o ID especificado não for encontrada.

#### 4. **Atualizar Peça**

- **URL**: `/api/pecas/{id}`
- **Método**: `PUT`
- **Descrição**: Atualiza os detalhes de uma peça existente.
- **Parâmetro de Caminho**:
  - `id`: O ID da peça que deseja atualizar.
- **Corpo da Requisição**:
  ```json
  {
    "descricao": "string",
    "preco": "double",
    "marca": {
      "id": "integer"
    }
  }
  ```
- **Resposta**:
  - **Status**: `200 OK`
  - **Corpo**:
    ```json
    {
      "id": "integer",
      "descricao": "string",
      "preco": "double",
      "marca": {
        "id": "integer",
        "nome": "string"
      }
    }
    ```
  - **Erros**:
    - `404 Not Found` – Se a peça com o ID especificado não for encontrada.

#### 5. **Excluir Peça**

- **URL**: `/api/pecas/{id}`
- **Método**: `DELETE`
- **Descrição**: Exclui uma peça pelo seu ID.
- **Parâmetro de Caminho**:
  - `id`: O ID da peça que deseja excluir.
- **Resposta**:
  - **Status**: `204 No Content` – Peça excluída com sucesso.
  - **Erros**:
    - `404 Not Found` – Se a peça com o ID especificado não for encontrada.

---

### Códigos de Erro

- **400 Bad Request**: Os dados da requisição são inválidos ou mal formatados.
- **404 Not Found**: O recurso com o ID especificado não foi encontrado.

### Modelos

#### Modelo Peças
```json
{
  "id": "integer",
  "descricao": "string",
  "preco": "double",
  "marca": {
    "id": "integer",
    "nome": "string"
  }
}
```

### Exemplos de Requisição

1. **Criar uma nova peça**:
   ```bash
   POST /api/pecas
   {
     "descricao": "Peça Exemplo",
     "preco": 99.99,
     "marca": { "id": 1 }
   }
   ```

2. **Obter todas as peças**:
   ```bash
   GET /api/pecas
   ```

3. **Obter uma peça pelo ID**:
   ```bash
   GET /api/pecas/1
   ```

4. **Atualizar uma peça**:
   ```bash
   PUT /api/pecas/1
   {
     "descricao": "Peça Atualizada",
     "preco": 199.99,
     "marca": { "id": 1 }
   }
   ```

5. **Excluir uma peça**:
   ```bash
   DELETE /api/pecas/1
   ```



##  Ordem de Serviço (OS)**


### **Rotas Disponíveis**

#### 1. **Listar todas as OS**
**Descrição**: Retorna todas as ordens de serviço cadastradas.

- **URL**: `/api/os`
- **Método HTTP**: `GET`
- **Resposta**:
  - **Status 200 OK**: Retorna uma lista de todas as OS.
  - **Formato da Resposta**:
    ```json
    [
      {
        "id": 1,
        "numero_os": 1001,
        "aberturaOs": "12/08/2023",
        "encerramentoOs": null,
        "valorTotal": 200.00,
        "cliente": { "id": 1, "nome": "João" },
        "mecanico": { "id": 2, "nome": "Pedro" },
        "veiculo": { "id": 1, "descricao": "Carro Vermelho" },
        "pecas": [
          { "id": 1, "descricao": "Pneu", "preco": 100.00 }
        ],
        "servicos": [
          { "id": 1, "descricaoServico": "Troca de óleo", "valorServico": 100.00 }
        ]
      }
    ]
    ```

---

#### 2. **Buscar OS por ID**
**Descrição**: Retorna uma OS específica pelo seu ID.

- **URL**: `/api/os/{id}`
- **Método HTTP**: `GET`
- **Parâmetros**:
  - `id`: ID da OS (ex: `/api/os/1`)
- **Resposta**:
  - **Status 200 OK**: Retorna os detalhes da OS.
  - **Status 404 Not Found**: OS não encontrada.
  - **Formato da Resposta**:
    ```json
    {
      "id": 1,
      "numero_os": 1001,
      "aberturaOs": "12/08/2023",
      "encerramentoOs": null,
      "valorTotal": 200.00,
      "cliente": { "id": 1, "nome": "João" },
      "mecanico": { "id": 2, "nome": "Pedro" },
      "veiculo": { "id": 1, "descricao": "Carro Vermelho" },
      "pecas": [
        { "id": 1, "descricao": "Pneu", "preco": 100.00 }
      ],
      "servicos": [
        { "id": 1, "descricaoServico": "Troca de óleo", "valorServico": 100.00 }
      ]
    }
    ```

---

#### 3. **Criar uma nova OS**
**Descrição**: Cria uma nova ordem de serviço.

- **URL**: `/api/os`
- **Método HTTP**: `POST`
- **Corpo da Requisição** (JSON):
    ```json
    {
      "numero_os": 1003,
      "cliente": { "id": 1 },
      "mecanico": { "id": 2 },
      "veiculo": { "id": 1 },
      "pecas": [
        { "id": 1 }
      ],
      "servicos": [
        { "id": 1 }
      ]
    }
    ```
- **Resposta**:
  - **Status 201 Created**: Retorna a OS criada.
  - **Formato da Resposta**:
    ```json
    {
      "id": 3,
      "numero_os": 1003,
      "aberturaOs": "14/09/2023",
      "encerramentoOs": null,
      "valorTotal": 200.00,
      "cliente": { "id": 1, "nome": "João" },
      "mecanico": { "id": 2, "nome": "Pedro" },
      "veiculo": { "id": 1, "descricao": "Carro Vermelho" },
      "pecas": [
        { "id": 1, "descricao": "Pneu", "preco": 100.00 }
      ],
      "servicos": [
        { "id": 1, "descricaoServico": "Troca de óleo", "valorServico": 100.00 }
      ]
    }
    ```

---

#### 4. **Atualizar uma OS existente**
**Descrição**: Atualiza os dados de uma ordem de serviço existente.

- **URL**: `/api/os/{id}`
- **Método HTTP**: `PUT`
- **Parâmetros**:
  - `id`: ID da OS a ser atualizada (ex: `/api/os/1`)
- **Corpo da Requisição** (JSON):
    ```json
    {
      "id": 1,
      "numero_os": 1001,
      "cliente": { "id": 1 },
      "mecanico": { "id": 2 },
      "veiculo": { "id": 1 },
      "pecas": [
        { "id": 1 }
      ],
      "servicos": [
        { "id": 1 }
      ]
    }
    ```
- **Resposta**:
  - **Status 200 OK**: Retorna a OS atualizada.
  - **Status 400 Bad Request**: Caso o ID no corpo não corresponda ao ID da URL.
  - **Formato da Resposta**:
    ```json
    {
      "id": 1,
      "numero_os": 1001,
      "aberturaOs": "12/08/2023",
      "encerramentoOs": null,
      "valorTotal": 200.00,
      "cliente": { "id": 1, "nome": "João" },
      "mecanico": { "id": 2, "nome": "Pedro" },
      "veiculo": { "id": 1, "descricao": "Carro Vermelho" },
      "pecas": [
        { "id": 1, "descricao": "Pneu", "preco": 100.00 }
      ],
      "servicos": [
        { "id": 1, "descricaoServico": "Troca de óleo", "valorServico": 100.00 }
      ]
    }
    ```

---

#### 5. **Deletar uma OS**
**Descrição**: Deleta uma ordem de serviço específica pelo ID.

- **URL**: `/api/os/{id}`
- **Método HTTP**: `DELETE`
- **Parâmetros**:
  - `id`: ID da OS a ser deletada (ex: `/api/os/1`)
- **Resposta**:
  - **Status 204 No Content**: OS deletada com sucesso.
  - **Status 404 Not Found**: OS não encontrada.

---

#### 6. **Enviar e-mail com os detalhes da OS**
**Descrição**: Envia um e-mail com os detalhes da OS para o endereço fornecido.

- **URL**: `/api/email/{id_os}`
- **Método HTTP**: `POST`
- **Parâmetros**:
  - `id_os`: ID da OS a ser enviada (ex: `/api/email/1`)
- **Corpo da Requisição** (JSON):
    ```json
    {
      "email": "destinatario@exemplo.com"
    }
    ```
- **Resposta**:
  - **Status 200 OK**: E-mail enviado com sucesso.
  - **Status 404 Not Found**: OS não encontrada.
  - **Formato da Resposta**:
    ```json
    {
      "message": "E-mail enviado com sucesso para: destinatario@exemplo.com"
    }
    ```

---

### **Códigos de Status Comuns**:

- `200 OK`: Requisição bem-sucedida, os dados são retornados ou o e-mail é enviado.
- `201 Created`: A OS foi criada com sucesso.
- `204 No Content`: A OS foi deletada com sucesso.
- `400 Bad Request`: Erro na requisição enviada (ex: ID incorreto ou dados inválidos).
- `404 Not Found`: OS não encontrada ou recurso inexistente.

---
