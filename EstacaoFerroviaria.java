public class EstacaoFerroviaria {

    private LinhaFerroviaria[] linha;
    private String sigla;
    private String desc;

    public LinhaFerroviaria[] getLinha() {
        return linha;
    }

    public void setLinha(LinhaFerroviaria[] linha) {
        this.linha = linha;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString(){
        String str = "";
        str += "Sigla: " + this.sigla + 
        "\nDescrição: " + this.desc;
        return str;
    }

    EstacaoFerroviaria(LinhaFerroviaria[] linha){
        this.linha = linha;
    }

}
