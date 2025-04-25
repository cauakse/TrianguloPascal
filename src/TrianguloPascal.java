import java.io.RandomAccessFile;

public class TrianguloPascal {
    private int [][] matriz;
    private int N;
    private int TL;

    public TrianguloPascal(int n) {
        matriz = new int[n][];
        TL=n;
        for (int i = 0; i < n; i++) {
            matriz[i]= new int[i+1];
        }
    }

    public void insereLinha (String linha){
        int mpos=0;
        for (int i = 0; i < linha.length(); i++) {
            if (linha.charAt(i)!='-'){
                matriz[N][mpos++]=linha.charAt(i)-48;
            }
        }
        N++;
    }

    public void exibe (){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    public boolean verificar(){
        boolean erro = false;
        for (int i = 0; i <N && !erro; i++) {
            if (matriz[i][0]==1&&matriz[i][matriz[i].length-1]==1){
                for (int j = 1; j < matriz[i].length-1 && !erro; j++) {
                    int valEsperado;
                    if (matriz[i-1].length>=j){
                        valEsperado = matriz[i-1][j-1]+matriz[i-1][j];
                    }else {
                        valEsperado = matriz[i-1][j-1];
                    }
                    if (valEsperado!=matriz[i][j])
                        erro = true;
                }
            }
            else {
                erro = true;
            }
        }
        return !erro;
    }

    private void preencherTriangulo() {
        for (int i = 0; i < TL; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 1;
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        N=TL;
    }

    public void criarArquivo(Arquivo arq) {
        preencherTriangulo();
        int larguraMax = 2 * matriz[N - 1].length - 1;

        for (int i = 0; i < N; i++) {
            StringBuilder linha = new StringBuilder();

            for (int j = 0; j < matriz[i].length; j++) {
                linha.append(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    linha.append('-');
                }
            }

            int totalEspacos = larguraMax - linha.length();
            int espacosEsquerda = totalEspacos / 2;
            int espacosDireita = totalEspacos - espacosEsquerda;

            StringBuilder linhaFinal = new StringBuilder();
            for (int e = 0; e < espacosEsquerda; e++) linhaFinal.append('-');
            linhaFinal.append(linha);
            for (int d = 0; d < espacosDireita; d++) linhaFinal.append('-');

            arq.writeLine(linhaFinal.toString() + "\n");
        }
    }

}


