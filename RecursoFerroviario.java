public class RecursoFerroviario {

    private Vagao[] vagao;
    private Locomotiva[] locomotiva;
    private Trem[] trem;
    private LinhaFerroviaria linha;

    public Vagao[] getVagao() {
        return vagao;
    }

    public void setVagao(Vagao[] vagao) {
        this.vagao = vagao;
    }

    public Locomotiva[] getLocomotiva() {
        return locomotiva;
    }

    public void setLocomotiva(Locomotiva[] locomotiva) {
        this.locomotiva = locomotiva;
    }

    public Trem[] getTrem() {
        return trem;
    }

    public void setTrem(Trem[] trem) {
        this.trem = trem;
    }

    public LinhaFerroviaria getLinha() {
        return linha;
    }

    public void setLinha(LinhaFerroviaria linha) {
        this.linha = linha;
    }

    RecursoFerroviario(LinhaFerroviaria linha){
        this.linha = linha;
    }
}
