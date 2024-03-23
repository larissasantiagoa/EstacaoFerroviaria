import java.util.Date;

public class Trem {

    private EstacaoFerroviaria estOrigem;
    private EstacaoFerroviaria estDestino;
    private String prefixo;
    private Date dataFormacao;
    private LinhaFerroviaria linha;
    private Vagao[] vagoes;
    private Locomotiva[] locomotivas;

    public EstacaoFerroviaria getEstOrigem() {
        return estOrigem;
    }

    public void setEstOrigem(EstacaoFerroviaria estOrigem) {
        this.estOrigem = estOrigem;
    }

    public EstacaoFerroviaria getEstDestino() {
        return estDestino;
    }

    public void setEstDestino(EstacaoFerroviaria estDestino) {
        this.estDestino = estDestino;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Date getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(Date dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public LinhaFerroviaria getLinha() {
        return linha;
    }

    public void setLinha(LinhaFerroviaria linha) {
        this.linha = linha;
    }

    public Vagao[] getVagoes() {
        return vagoes;
    }

    public void setVagoes(Vagao[] vagoes) {
        this.vagoes = vagoes;
    }

    public Locomotiva[] getLocomotivas() {
        return locomotivas;
    }

    public void setLocomotivas(Locomotiva[] locomotivas) {
        this.locomotivas = locomotivas;
    }

    public String toString(){
        String str = "";
        str += "Prefixo: " + this.prefixo + 
        "\nData Formação: " + this.dataFormacao +
        "\nOrigem: " + this.estOrigem +
         "\nDestino: " + this.estDestino;
        return str;
    }

    Trem(Vagao[] vagoes, Locomotiva[] locomotivas, LinhaFerroviaria linha, EstacaoFerroviaria estOrigem, EstacaoFerroviaria estDestino){
        this.vagoes = vagoes;
        this.locomotivas = locomotivas;
        this.linha = linha;
        this.estOrigem = estOrigem;
        this.estDestino = estDestino;
    }
}
