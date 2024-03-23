public class Teste {
    public static void main(String[] args) {
    
        LinhaFerroviaria linha = new LinhaFerroviaria();
        LinhaFerroviaria linhas[] = {linha};

        EstacaoFerroviaria est1 = new EstacaoFerroviaria(linhas);
        EstacaoFerroviaria est2 = new EstacaoFerroviaria(linhas);
        
        Vagao vag1 = new Vagao("ACD001", "Carga", 15, 3, 2, linha);
        Vagao vag2 = new Vagao("ACD002", "Carga", 15, 3, 2, linha);
        Vagao vag3 = new Vagao("ACD003", "Carga", 15, 3, 2, linha);
        Vagao vag[] = {vag1, vag2, vag3};

        Locomotiva loc = new Locomotiva("CNF001", 34, 20, linhas);
        Locomotiva locomotivas[] = {loc};

        Trem trem = new Trem(vag, locomotivas, linha, est1, est2);
        Trem trens[] = {trem};

        RecursoFerroviario rec = new RecursoFerroviario(linha);
        rec.setLocomotiva(locomotivas);
        rec.setTrem(trens);
        rec.setVagao(vag);
        RecursoFerroviario recs[] = {rec};
        
        linha.setRecursos(recs);
        linha.setDescricao("Sentido Norte");
        linha.setExtensao(10);
        linha.setNumero(510);

        System.out.println(linha.toString());
    }
}
