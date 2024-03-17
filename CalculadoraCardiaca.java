import java.util.Scanner;

public class CalculadoraCardiaca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nome = ler.next();
        System.out.println("Digite o sobrenome");
        String sobrenome = ler.next();
        System.out.println("Digite o dia nascimento");
        int dia = ler.nextInt();
        System.out.println("Digite o mes nascimento");
        int mes = ler.nextInt();
        System.out.println("Digite o ano nascimento");
        int ano = ler.nextInt();
        
        HeartRates hRates = new HeartRates(nome, sobrenome, dia, mes, ano);
        int idade = hRates.CalcularIdade();
        
        imprimirDadosPaciente(hRates);
        System.out.println("idade: "+idade);
        System.out.println("");
        int freqMax = hRates.CalcularFrequenciaCardiacaMax(idade);
        System.out.println(" Frequencia Maxima: "+freqMax);
        System.out.println(" Frequencia: "+hRates.CalcularFrequenciaCardiacaAlvo(freqMax));
    }
    
    public static void imprimirDadosPaciente(HeartRates hRates){
        System.out.println("Paciente: "+hRates.getNome()+" "+ hRates.getSobrenome()+" ,"+hRates.getDia()+"/"+hRates.getMes()+"/"+hRates.getAno());
    }
    
}
