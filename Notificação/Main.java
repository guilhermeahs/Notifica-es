import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ServicoNotificacao servico = new ServicoNotificacao();

        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new NotificacaoEmail());
        notificacoes.add(new NotificacaoSms());
        notificacoes.add(new NotificacaoWhatsApp());

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - WhatsApp");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        
        Notificacao escolhida = notificacoes.get(opcao - 1);
        servico.notificarCliente(escolhida, mensagem);

        scanner.close();
    }
}