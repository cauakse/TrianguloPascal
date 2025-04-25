import javax.swing.JOptionPane;

public class Exibicao {

    public static void exibirBoasVindas() {
        JOptionPane.showMessageDialog(null,
                "Bem-vindo ao Interpretador e Criador de Triângulos de Pascal!\n" +
                        "Este programa permite verificar ou gerar árvores baseadas no Triângulo de Pascal.",
                "Bem-vindo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static  int perguntarQuantidadeLinhasTriangulo() {
        String input = JOptionPane.showInputDialog(
                null,
                "Digite o número de linhas do Triângulo de Pascal que deseja criar:",
                "Criar Triângulo de Pascal",
                JOptionPane.QUESTION_MESSAGE
        );

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int exibirMenuOpcoes() {
        String input = JOptionPane.showInputDialog(
                null,
                "Escolha uma das opções abaixo:\n" +
                        "1 - Verificar se um arquivo possui uma árvore de Pascal\n" +
                        "2 - Criar uma árvore de Pascal\n" +
                        "3 - Encerrar o programa",
                "Menu de Opções",
                JOptionPane.QUESTION_MESSAGE
        );

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void exibirMensagemEncerramento() {
        JOptionPane.showMessageDialog(null,
                "Programa encerrado. Até a próxima!",
                "Encerrando",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void exibirCodigoNaoIdentificado() {
        JOptionPane.showMessageDialog(null,
                "Código não identificado. Por favor, selecione uma opção válida.",
                "Opção Inválida",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public static String perguntarNomeArquivo() {
        String nomeArquivo = JOptionPane.showInputDialog(
                null,
                "Digite o nome do arquivo:",
                "Entrada de Arquivo",
                JOptionPane.QUESTION_MESSAGE
        );
        return nomeArquivo;
    }

    public static void exibirMensagemArquivoContemTriangulo() {
        JOptionPane.showMessageDialog(null,
                "O arquivo contém um triângulo de Pascal válido.",
                "Verificação Bem-Sucedida",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


    public static void exibirMensagemArquivoNaoContemTriangulo() {
        JOptionPane.showMessageDialog(null,
                "O arquivo NÃO contém um triângulo de Pascal.",
                "Verificação Falhou",
                JOptionPane.WARNING_MESSAGE
        );
    }
}