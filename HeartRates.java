import java.time.LocalDate;

/**
 * Representa os dados de uma pessoa relacionados à frequência cardíaca.
 */
public class HeartRates {
    
    private String nome, sobrenome;
    private int dia, mes, ano;
    
    /**
     * Construtor para inicializar os dados da pessoa.
     * 
     * @param nome O nome da pessoa.
     * @param sobrenome O sobrenome da pessoa.
     * @param dia O dia de nascimento da pessoa.
     * @param mes O mês de nascimento da pessoa.
     * @param ano O ano de nascimento da pessoa.
     */
    HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getters e Setters omitidos para brevidade...

    /**
     * Calcula a idade da pessoa com base na data atual.
     * 
     * @return A idade da pessoa.
     */
    int CalcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        int idade =  dataAtual.getYear() - this.ano;
        if(this.mes > dataAtual.getMonthValue() && this.dia > dataAtual.getDayOfMonth()) idade++;
        return idade;
    }

    /**
     * Calcula a frequência cardíaca máxima da pessoa com base na idade.
     * 
     * @param idade A idade da pessoa.
     * @return A frequência cardíaca máxima da pessoa.
     */
    int CalcularFrequenciaCardiacaMax(int idade){
        return (220 - idade);
    }
    
    /**
     * Calcula a frequência cardíaca alvo da pessoa com base na frequência cardíaca máxima.
     * 
     * @param maxFreq A frequência cardíaca máxima da pessoa.
     * @return A frequência cardíaca alvo da pessoa.
     */
    float CalcularFrequenciaCardiacaAlvo(int maxFreq){
        return (float) (maxFreq * 0.85); // 85% da frequência cardíaca máxima
    }
    
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
