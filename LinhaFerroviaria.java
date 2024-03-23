public class LinhaFerroviaria {

    private RecursoFerroviario recursos[];
    private int numero;
    private float extensao;
    private String descricao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public float getExtensao() {
        return extensao;
    }

    public void setExtensao(float extensao) {
        this.extensao = extensao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RecursoFerroviario[] getRecursos() {
        return recursos;
    }
    
    public void setRecursos(RecursoFerroviario[] recursos) {
        this.recursos = recursos;
    }
    
    
    public String toString(){
        String str = "";
        str += "Número da linha: " + this.numero + 
        "\nExtensão: " + this.extensao + 
        "\nDescrição: " + this.descricao;
        return str;
    }
}