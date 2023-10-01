public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarConversa();
}

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementações dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementações dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarConversa() {
        System.out.println("Iniciando conversa de voz...");
    }

    // Implementações dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba do navegador: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }
}