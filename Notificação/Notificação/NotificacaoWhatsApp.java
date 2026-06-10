public class NotificacaoWhatsApp implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}