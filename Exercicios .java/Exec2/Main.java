import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os dados da pessoa:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Dia de nascimento: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Mês de nascimento: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Altura (metros): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (quilogramas): ");
        double peso = scanner.nextDouble();
        
        HealthProfile healthProfile = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);
        
        System.out.println("\nInformações da pessoa:");
        System.out.println("Nome completo: " + healthProfile.getNome() + " " + healthProfile.getSobrenome());
        System.out.println("Sexo: " + healthProfile.getSexo());
        System.out.println("Data de nascimento: " + healthProfile.getDataNascimento());
        System.out.println("Altura: " + healthProfile.getAltura() + " metros");
        System.out.println("Peso: " + healthProfile.getPeso() + " quilogramas");
        System.out.println("Idade: " + healthProfile.calcularIdade() + " anos");
        System.out.println("IMC: " + healthProfile.calcularIMC());
        System.out.println("Intervalo de frequência cardíaca alvo: " + healthProfile.calcularFrequenciaCardiacaAlvo());
        
        scanner.close();
    }
}
