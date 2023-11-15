import Controllers.MenuController;
import Model.Entities.Filme;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Like a Dragon", "Akira Kushida", "Alguma descrição", "Ação", 120);
        Filme filme2 = new Filme("Kung Fu", "Sujiro Kifuja", "Outra descrição 2", "Comédia", 90);


        Filme[] filmes = {filme1, filme2};


        MenuController menuController = new MenuController();


        Filme filmeSelecionado = menuController.selecionarFilme(filmes);


        System.out.println("Filme selecionado:");
        System.out.println("Nome: " + filmeSelecionado.getNome());
        System.out.println("Diretor: " + filmeSelecionado.getDiretor());
        System.out.println("Descrição: " + filmeSelecionado.getDescricao());
        System.out.println("Gênero: " + filmeSelecionado.getGenero());
        System.out.println("Duração: " + filmeSelecionado.getDuracaoEmMinutos() + " minutos");


        double valorCompra = menuController.comprarIngresso();

        // Exibir informações da compra
        System.out.println("Resumo da compra:");
        System.out.println("Número de ingressos comprados: 1"); // Neste exemplo, assume-se a compra de um ingresso
        System.out.println("Valor da compra: " + valorCompra);

    }
}
