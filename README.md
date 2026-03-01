Projeto desenvolvido para a disciplina de **Programação Web Avançada** (2025), com foco no cadastro e na listagem estática de clientes e produtos.

## Autor

- **Lucas Eufrásio Guimarães**

## Descrição do Projeto

O sistema consiste em uma aplicação web simples para **cadastro e listagem de produtos e clientes**, desenvolvida utilizando **Java Server Faces (JSF)**.

## Estrutura do Projeto

O projeto está organizado nesta estrutura:

- **model** – Classes que representam os atributos de clientes e produtos.
- **dao** – Responsável pela inserção e armazenamento de clientes e produtos em uma lista estática.
- **controller** – Responsável por organizar clientes e produtos e realizar a integração com as páginas XHTML.
- **view** – Páginas XHTML responsáveis pela interface visual do sistema.

## Páginas XHTML Implementadas

- **index.xhtml** – Página inicial com menu de navegação  
- **produto.xhtml** – Cadastro de produtos  
- **cliente.xhtml** – Cadastro de clientes  
- **listagem.xhtml** – Exibição de produtos e clientes cadastrados  

## Tecnologias Utilizadas

- **Java**
- **Java Server Faces (JSF)**
- **XHTML**

## Regras de Negócio Implementadas nas páginas XHTML

- Exibe **“Nenhum cliente cadastrado”** quando não houver clientes
- Exibe **“Nenhum produto cadastrado”** quando não houver produtos
- Produtos com **estoque menor que 10** são exibidos em vermelho
- Produtos com **valor maior ou igual a 100** são identificados como **Produto Premium**

## Estrutura de Execução

- Aplicação executada em servidor web compatível com **JSF**
- Acesso via navegador às páginas **XHTML**


