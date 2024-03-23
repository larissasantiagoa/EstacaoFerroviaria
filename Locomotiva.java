public class Locomotiva {

    private String numSerie;
    private float tracao;
    private float comprimento;
    private LinhaFerroviaria linha[];

    public String getNumSerie(){
        return numSerie;
    }

    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }

    public float getTracao(){
        return tracao;
    }

    public void setTracao(float tracao){
        this.tracao = tracao;
    }

    public float getComprimento(){
        return comprimento;
    }

    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public LinhaFerroviaria[] getLinha(){
        return linha;
    }

    public void setLinha(LinhaFerroviaria[] linha){
        this.linha = linha;
    }

    public String toString(){
        String str = "";
        str += "Numero de serie: " + this.numSerie + 
        "\nTração: " + this.tracao +
        "\nComprimento: " + this.comprimento; 
        return str;
    }
    
    Locomotiva(String numSerie, float tracao, float comprimento, LinhaFerroviaria[] linha){
        this.numSerie = numSerie;
        this.tracao = tracao;
        this.comprimento = comprimento;
        this.linha = linha;
    }
}
