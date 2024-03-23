public class Vagao {
    
    private String numSerie;
    private String tipo;
    private float capCarga;
    private float compTesteiras;
    private float compEngates;
    private LinhaFerroviaria linha;

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

    public float getCompTesteiras() {
        return compTesteiras;
    }

    public void setCompTesteiras(float compTesteiras) {
        this.compTesteiras = compTesteiras;
    }

    public float getCompEngates() {
        return compEngates;
    }

    public void setCompEngates(float compEngates) {
        this.compEngates = compEngates;
    }

    public LinhaFerroviaria getLinha() {
        return linha;
    }

    public void setLinha(LinhaFerroviaria linha) {
        this.linha = linha;
    }

    public String toString(){
        String str = "";
        str += "Serial: " + this.numSerie + 
        "\nTipo: " + this.tipo + 
        "\nCapacidade de carga: " + this.capCarga +
        "\nComprimento das testeiras: " + this.compTesteiras +
        "\nComprimento dos engates: " + this.compEngates;
        return str;
    }

    Vagao(String numSerie, String tipo, float capCarga, float compTesteiras, float compEngates, LinhaFerroviaria linha){
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.capCarga = capCarga;
        this.compTesteiras = compTesteiras;
        this.compEngates = compEngates;
        this.linha = linha;
    }
}
