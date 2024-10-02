# Implementação de API de controle de estoque

Produto (Entidade) é a representação dos produtos no sistema e contém os atributos principais, como nome, quantidade e limites de estoque.

O Repositório (não implementado) permite a interação com o banco de dados, facilitando o CRUD. 

A camada Servico contém a lógica de negócios. Cria novos produtos no sistema, lista produtos classificados como em estoque baixo, e permite a atualização da quantidade em estoque de produtos identificados pelo id.

A camada Controlador expõe a API e seus métodos para clientes externos.
