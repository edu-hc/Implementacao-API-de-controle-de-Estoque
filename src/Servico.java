import java.util.stream.Collectors;
import java.util.List;

//classe de servico da api
public class Servico {


    //busca um produto pelo id e caso esse produto exista, atualiza a quantidade em estoque
    public Produto atualizarEstoque(Long id, int quantidadeAlterada) {

        Produto produto = repositorio.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produto.atualizarQuantidade(quantidadeRecebida);
        return repositorio.save(produto);
    }


    //cria um produto e salva ele no sistema de estoque
    public Produto criarProduto(Produto produto) {
        return repositorio.save(produto);

    }

    //função para obter lista com os produtos do repositório classificados como baixo estoque
    public List<Produto> obterProdutosComEstoqueBaixo() {
        return repositorio.findAll().stream().filter(Produto::verificarEstoqueBaixo).collect(Collectors.toList());
    }
}