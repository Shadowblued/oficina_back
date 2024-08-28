

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

