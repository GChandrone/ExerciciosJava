package ExercicioClasse;

public class Main {
    public static void main(String[] args) {
        Time SaoPaulo = new Time();
        Time Palmeiras = new Time();
        Time Santos = new Time();
        Time Corinthians = new Time();

        SaoPaulo.Nome = "São Paulo Futebol Clube";
        SaoPaulo.Dat_Fundacao = "25 de janeiro de 1930";
        SaoPaulo.Presidente = "Julio Casares";
        SaoPaulo.Pais = "Brasil";
        SaoPaulo.titulos_brasileiro = 6;
        SaoPaulo.qtd_Torcedor = 15780000;
        SaoPaulo.Mascote = "Santo Paulo";
        SaoPaulo.Estadio = "Estádio do Morumbi";
        SaoPaulo.Treinador = "Dorival Júnior";
        
        Palmeiras.Nome = "Sociedade Esportiva Palmeiras";
        Palmeiras.Dat_Fundacao = "26 de agosto de 1914";
        Palmeiras.Presidente = "Maurício Galiotte";
        Palmeiras.Pais = "Brasil";
        Palmeiras.titulos_brasileiro = 11;
        Palmeiras.qtd_Torcedor = 12700000;
        Palmeiras.Mascote = "Porco";
        Palmeiras.Estadio = "Allianz Parque";
        Palmeiras.Treinador = "Abel Ferreira";

        Santos.Nome = "Santos Futebol Clube";
        Santos.Dat_Fundacao = "14 de abril de 1912";
        Santos.Presidente = "Andres Rueda";
        Santos.Pais = "Brasil";
        Santos.titulos_brasileiro = 8;
        Santos.qtd_Torcedor = 4570000;
        Santos.Mascote = "Baleia";
        Santos.Estadio = "Vila Belmiro";
        Santos.Treinador = "Marcelo Fernandes";

        Corinthians.Nome = "Sport Club Corinthians Paulista";
        Corinthians.Dat_Fundacao = "1 de setembro de 1910";
        Corinthians.Presidente = "Duilio Monteiro Alves";
        Corinthians.Pais = "Brasil";
        Corinthians.titulos_brasileiro = 7;
        Corinthians.qtd_Torcedor = 32200000;
        Corinthians.Mascote = "Mosqueteiro";
        Corinthians.Estadio = "Arena Corinthians";
        Corinthians.Treinador = "Mano Menezes";
    
        System.out.println("========== TIMES DE FUTEBOL ===========");

        System.out.println("\nNome: " + SaoPaulo.Nome);
        System.out.println("Data de Fundação: " + SaoPaulo.Dat_Fundacao); 
        System.out.println("Presidente: " + SaoPaulo.Presidente); 
        System.out.println("Pais: " + SaoPaulo.Pais);
        System.out.println("Titulos do Brasileirão: " + SaoPaulo.titulos_brasileiro);
        System.out.println("Quantidade de Torcedores: " + SaoPaulo.qtd_Torcedor);
        System.out.println("Mascote: " + SaoPaulo.Mascote);
        System.out.println("Estádio: " + SaoPaulo.Estadio);
        System.out.println("Treinador: " + SaoPaulo.Treinador + "\n");

        System.out.println("---------------------------------------");

        System.out.println("\nNome: " + Palmeiras.Nome);
        System.out.println("Data de Fundação: " + Palmeiras.Dat_Fundacao); 
        System.out.println("Presidente: " + Palmeiras.Presidente); 
        System.out.println("Pais: " + Palmeiras.Pais);
        System.out.println("Titulos do Brasileirão: " + Palmeiras.titulos_brasileiro);
        System.out.println("Quantidade de Torcedores: " + Palmeiras.qtd_Torcedor);
        System.out.println("Mascote: " + Palmeiras.Mascote);
        System.out.println("Estádio: " + Palmeiras.Estadio);
        System.out.println("Treinador: " + Palmeiras.Treinador + "\n");

        System.out.println("---------------------------------------");

        System.out.println("\nNome: " + Santos.Nome);
        System.out.println("Data de Fundação: " + Santos.Dat_Fundacao); 
        System.out.println("Presidente: " + Santos.Presidente); 
        System.out.println("Pais: " + Santos.Pais);
        System.out.println("Titulos do Brasileirão: " + Santos.titulos_brasileiro);
        System.out.println("Quantidade de Torcedores: " + Santos.qtd_Torcedor);
        System.out.println("Mascote: " + Santos.Mascote);
        System.out.println("Estádio: " + Santos.Estadio);
        System.out.println("Treinador: " + Santos.Treinador + "\n");

        System.out.println("---------------------------------------");

        System.out.println("\nNome: " + Corinthians.Nome);
        System.out.println("Data de Fundação: " + Corinthians.Dat_Fundacao); 
        System.out.println("Presidente: " + Corinthians.Presidente); 
        System.out.println("Pais: " + Corinthians.Pais);
        System.out.println("Titulos do Brasileirão: " + Corinthians.titulos_brasileiro);
        System.out.println("Quantidade de Torcedores: " + Corinthians.qtd_Torcedor);
        System.out.println("Mascote: " + Corinthians.Mascote);
        System.out.println("Estádio: " + Corinthians.Estadio);
        System.out.println("Treinador: " + Corinthians.Treinador + "\n");
    }
}
