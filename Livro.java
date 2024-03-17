/**
 * A classe Livro representa um livro com título, quantidade de páginas e páginas lidas.
 */
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;
    
    
    public Livro (String titulo, int qtdPaginas, int pgLidas){
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = pgLidas;
    }
    /**
     * Obtém o título do livro.
     * 
     * @return O título do livro.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Define o título do livro.
     * 
     * @param titulo O novo título do livro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Obtém a quantidade total de páginas do livro.
     * 
     * @return A quantidade total de páginas do livro.
     */
    public int getQtdPaginas() {
        return qtdPaginas;
    }
    
    /**
     * Define a quantidade total de páginas do livro.
     * 
     * @param qtdPaginas A nova quantidade total de páginas do livro.
     */
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    
    /**
     * Obtém o número de páginas lidas do livro.
     * 
     * @return O número de páginas lidas do livro.
     */
    public int getPaginasLidas() {
        return paginasLidas;
    }
    
    /**
     * Define o número de páginas lidas do livro.
     * 
     * @param paginasLidas O novo número de páginas lidas do livro.
     */
    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    /**
     * Calcula e imprime a porcentagem de leitura do livro até o momento.
     * 
     * @see #getQtdPaginas()
     * @see #getPaginasLidas()
     */
    public void verificarProgresso() {
        double porcentagem = (double) paginasLidas * 100 / qtdPaginas;
        System.out.println("Você já leu " + porcentagem + " por cento do livro");
    }
}
