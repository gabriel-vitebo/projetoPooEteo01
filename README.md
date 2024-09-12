## Trabalho POO 1

## Regras de Negócio

### - [x] Inserção de Produto
- O usuário pode cadastrar um **Produto** fornecendo as seguintes informações:
  - **Título**: Exemplo: "TV"
  - **Preço**: Exemplo: 900.00
  - **Quantidade**: Exemplo: 10
- **Retorno esperado**:
  - `"O preço do produto TV é 900.00 e a quantidade é: 10"`

### - [x] Operações com Produto
- O programa deve perguntar ao usuário se ele deseja:
  1. **Adicionar** uma quantidade ao produto.
  2. **Remover** uma quantidade do produto.

#### - [x] Adicionar Quantidade
- Se o usuário escolher adicionar, o programa deverá:
  - Somar a quantidade inserida pelo usuário à quantidade atual do produto.
  - **Retorno esperado**:
    - `"A nova quantidade é: 50"`

#### - [x] Remover Quantidade
- Se o usuário escolher remover, o programa deverá:
  - Subtrair a quantidade inserida pelo usuário da quantidade atual do produto.
  - **Retorno esperado**:
    - `"A quantidade de produto é: 30"`

### - [ ] Bônus (Opcional)
- Após o cadastro do nome e preço do produto, o programa deve criar um **loop** perguntando ao usuário qual operação deseja realizar:
  - **Opções**:
    1. **Adicionar nova quantidade**
    2. **Remover quantidade**
    3. **Finalizar**
  
- Se o usuário escolher a opção 1 ou 2:
  - O programa deverá executar a operação correspondente e voltar para o início do loop.

- Se o usuário escolher a opção **Finalizar**:
  - O loop será encerrado.
  - **Retorno esperado**:
    - Exibir todas as informações atualizadas do produto cadastrado.