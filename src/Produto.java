//classe de entidade da api
public class Produto {


    //atributos da classe Produto
    private Long id;

    private String nome;
    private int quantidadeRecebida;
    private int limiteMinimoEstoque;
    private boolean estoqueBaixo;


    //função para atualizar quantidade do produto
    public void atualizarQuantidade(int quantidadeRecebida) {
        this.quantidade += quantidadeRecebida;
        verificarEstoqueBaixo();
    }

    //função para verificar se o estoque do produto está abaixo do limite minimo
    public boolean verificarEstoqueBaixo() {
        this.estoqueBaixo = this.quantidade < this.limiteMinimoEstoque;
        return this.estoqueBaixo;
    }
}