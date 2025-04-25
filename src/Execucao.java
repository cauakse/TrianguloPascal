public class Execucao {
    private static TrianguloPascal trianguloPascal;
    public static void verificar (){
        Arquivo arq = new Arquivo(Exibicao.perguntarNomeArquivo());
        String linha = arq.getLine();
        trianguloPascal = new TrianguloPascal(linha.length());
        trianguloPascal.insereLinha(linha);
        while (!arq.eof()){
            linha = arq.getLine();
            trianguloPascal.insereLinha(linha);
        }
        if (trianguloPascal.verificar())
            Exibicao.exibirMensagemArquivoContemTriangulo();
        else
            Exibicao.exibirMensagemArquivoNaoContemTriangulo();
    }
    public static void criar (){
        Arquivo arq = new Arquivo(Exibicao.perguntarNomeArquivo());
        int N = Exibicao.perguntarQuantidadeLinhasTriangulo();
        trianguloPascal = new TrianguloPascal(N);
        trianguloPascal.criarArquivo(arq);
    }
}
