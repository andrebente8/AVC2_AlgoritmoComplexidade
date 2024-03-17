/*
 * Classe que representa um livro com título e duração em minutos.
 */
public class Livro_Exec4 {
    private String titulo;
    private int duracaoEmMinutos;

    /**
     * Construtor da classe Livro.
     * @param titulo O título do livro.
     * @param duracaoEmMinutos A duração do livro em minutos.
     */
    public Livro_Exec4(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Obtém o título do livro.
     * @return O título do livro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do livro.
     * @param titulo O novo título do livro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a duração do livro em minutos.
     * @return A duração do livro em minutos.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * Define a duração do livro em minutos.
     * @param duracaoEmMinutos A nova duração do livro em minutos.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Exibe a duração do livro em horas e minutos.
     */
    public void exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("O livro " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração.");
    }

    /**
     * Método principal para testar a classe Livro.
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
        Livro_Exec4 livro1 = new Livro_Exec4("Os Vingadores", 142);
        livro1.exibirDuracaoEmHoras();

        Livro_Exec4 livro2 = new Livro_Exec4("Hotel Transilvânia", 93);
        livro2.exibirDuracaoEmHoras();

        System.out.println("Os livros em cartaz são " + livro1.getTitulo() + " e " + livro2.getTitulo() + ".");
    }
}

