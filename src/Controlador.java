import java.util.List;

//classe de controle da api
public class Controlador {

    private Servico produtoServico;

    //abstração do metodo de serviço para criar produtos e salvá-los no repositório
    public Produto criarProduto(Produto produto) {
        return produtoServico.criarProduto(produto);
    }

    //abstração do metodo de serviço para atualizar o estoque de produtos
    public Produto atualizarEstoque(Long id, int quantidade) {
        return produtoServico.atualizarEstoque(id, quantidade);
    }

    //abstração do metodo de serviço para listar produtos com estoque baixo
    public List<Produto> listarProdutosComEstoqueBaixo() {
        return produtoServico.obterProdutosComEstoqueBaixo();
    }
}