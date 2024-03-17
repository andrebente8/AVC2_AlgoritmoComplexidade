public class TestarLivros {
    public static void main(String[] args) {
        
        Livro livrofavorito = new Livro();
        livrofavorito.setTitulo("O Pequeno Príncipe");
        livrofavorito.setQtdPaginas(98);
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(20);
        livrofavorito.verificarProgresso();
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();
        for (int i = 1; i <= 10; i++) {
            Livro livro = new Livro();
            livro.setTitulo("Livro " + i);
            livro.setQtdPaginas(100 + i * 10); // Aumenta o número de páginas para cada livro
            livro.setPaginasLidas(i * 10); // Aumenta o número de páginas lidas para cada livro
            livro.verificarProgresso();
        }
    }
}
