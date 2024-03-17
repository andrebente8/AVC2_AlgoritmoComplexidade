import java.time.LocalDate;

/**
 * Classe que representa o perfil de saúde de uma pessoa.
 */
public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private LocalDate dataNascimento;
    private double altura; // em metros
    private double peso; // em quilogramas
    
    /**
     * Construtor para inicializar o perfil de saúde com as informações fornecidas.
     * @param nome O nome da pessoa.
     * @param sobrenome O sobrenome da pessoa.
     * @param sexo O sexo da pessoa ('M' para masculino, 'F' para feminino).
     * @param diaNascimento O dia de nascimento da pessoa.
     * @param mesNascimento O mês de nascimento da pessoa.
     * @param anoNascimento O ano de nascimento da pessoa.
     * @param altura A altura da pessoa em metros.
     * @param peso O peso da pessoa em quilogramas.
     */
    public HealthProfile(String nome, String sobrenome, char sexo, int diaNascimento, int mesNascimento, int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        this.altura = altura;
        this.peso = peso;
    }
    
    // Getters e Setters omitidos por brevidade

    /**
     * Calcula a idade da pessoa com base na data de nascimento.
     * @return A idade da pessoa.
     */
    public int calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
    
    /**
     * Calcula o Índice de Massa Corporal (IMC) da pessoa.
     * @return O IMC da pessoa.
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    /**
     * Calcula a frequência cardíaca máxima da pessoa com base na idade.
     * @return A frequência cardíaca máxima da pessoa.
     */
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }
    
    /**
     * Calcula a faixa alvo de frequência cardíaca da pessoa para exercícios.
     * @return A faixa alvo de frequência cardíaca da pessoa como uma string no formato "min - max".
     */
    public String calcularFrequenciaCardiacaAlvo() {
        int maxFreq = calcularFrequenciaCardiacaMaxima();
        double alvoMin = maxFreq * 0.5; // 50% da frequência cardíaca máxima
        double alvoMax = maxFreq * 0.85; // 85% da frequência cardíaca máxima
        return String.format("%.0f - %.0f", alvoMin, alvoMax);
    }

    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
