import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Exibicao.exibirBoasVindas();
        int op;
        do {
            op=Exibicao.exibirMenuOpcoes();
            switch (op){
                case 1:
                    Execucao.verificar();
                    break;
                case 2:
                    Execucao.criar();
                    break;
                case 3:
                    Exibicao.exibirMensagemEncerramento();
                    break;
                default:
                    Exibicao.exibirCodigoNaoIdentificado();
                    break;
            }
        }while (op!=3);
    }
}