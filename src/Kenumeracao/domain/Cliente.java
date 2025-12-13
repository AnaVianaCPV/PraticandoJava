package Kenumeracao.domain;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome +
                " Tipo: " + this.tipoCliente.getNomeRelatorio() +
                " Tipo Cliente: " + this.tipoCliente.getValor() +
                " Tipo Pagamento " + this.tipoPagamento;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}

