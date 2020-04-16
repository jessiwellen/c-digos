
package Logica;

import java.util.Scanner;

/**
 *
 * @author Jéssica Carvalho & Thawanny Oliveira
 */
public class Quiz 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int acerto = 0;
        int erro = 0;
        String opcao;
        int escolha = 0;
                
        System.out.println("*----------------------------------------*");
        System.out.println("|             QUIZ DA PANDEMIA           |");
        System.out.println("*----------------------------------------*");
              
        while(escolha <= 1){
        System.out.println("\n1) O que é o COVID-19? \nA) É uma bactéria perigosa causada pela família dos Bacilos.\nB) É uma doença causada por fungos.\nC) É uma doença causada por um vírus da família do coronavírus, o SARS-Cov-2.\nD) É uma enfermidade com sintomas parecidos com a Gripe Mexicana.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("c".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra C.");
            erro++;
        }
        System.out.println("\n2) Qual é a origem da COVID-19? \nA) Ficou conhecido no final de 1996, na cidade de Austin, capital do Texas, nos EUA.\nB) A manifestação da doença ficou conhecida no final de 2019, na cidade de Wuhan, província de Hubei, na República Popular da China.\nC) Teve origem na cidade de Tóquio, capital do Japão, quando foi relatado vários casos de pneumonia sem causa definida.\nD) Foram registrados os primeiros casos num pais da Europa Ocidental, no ano de 2004.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("b".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra B.");
            erro++;
        }
        System.out.println("\n3)  A COVID-19 se espalhou rapidamente por vários locais do planeta, levando a Organização Mundial de Saúde a classificar a doença como:\nA) Epidemia, caracteriza quando um surto acontece em diversas regiões.\nB) Surto, aumento repentino do número de casos de uma doença em uma região específica.\nC) Endemia, quando acontece com muita frequência no local.\nD) Pandemia, acontece quando uma epidemia se espalha por diversas regiões do planeta.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("d".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra D.");
            erro++;
        }
        System.out.println("\n4) Quais os sintomas da COVID-19? \nA) Febre, tosse, dor de garganta, coriza e dificuldade para respirar(em casos mais grave).\nB) Os sintomas incluem febre, tosse, dor de garganta, calafrios e dores no corpo.\nC) Febre, calafrios, dores musculares, tosse, congestão, coriza, dores de cabeça e fadiga.\nD) Febre alta, erupções cutâneas e dores musculares e articulares.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("a".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra A.");
            erro++;
        }
        System.out.println("\n5) Como é a transmissão da COVID-19? \nA) O contágio acontece pelo consumo alimentos exóticos.\nB) Transmitida pelo aperto de mão. \nC) Se dá pela picada do mosquito aedes aegypti.\nD) Pode ser transmitida de uma pessoa para outra por meio de gotículas respiratórias eliminadas pelo doente ao espirrar ou tossir.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("d".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra D.");
            erro++;
        }
        System.out.println("\n6) Como é feito o diagnóstico da COVID-19? \nA) É feito por meio de coleta de material respiratório. Desse material sãp realizados exames de biologia molecular para detectar o RNA do vírus.\nB) O diagnóstico de certeza é feito com o exame de sangue ou sorologia.\nC) Por meio da hemografia que avalia as principais linhagens de células do sangue.\nD) Quando os sintomas aparecem, o ideal é procurar o médico.");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("a".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra A.");
            erro++;
        }
        System.out.println("\n7) Como é o tratamento da COVID-19? \nA) O tratamento é feito de forma sintomática, sempre de acordo com avaliação do profissional de saúde.\nB) É orientado o repouso, a hidratação e prática de exercício ao ar livre. \nC) Não apresenta tratamento específico, mas a recomendação é o repouso e a hidratação. Como também o uso de analgésicos e antitérmicos em caso de dor e febre alta.\nD) Todas as alternativas estão corretas. ");
        System.out.print("Digite aqui: ");
        opcao = leia.next();
        if("c".equals(opcao))
        {
            System.out.println("Resposta correta!");
            acerto++;
        }
        else
        {
            System.out.println("Resposta errada!");
            System.out.println("A resposta certa é a letra C.");
            erro++;
        }
            System.out.println("                                               ");
            System.out.println("*--------------------------------*");
            System.out.println("|             PLACAR             |");
            System.out.println("*--------------------------------*");
            System.out.println("Total de acertos: "+acerto);
            System.out.println("Total de erros: "+erro);
            System.out.println("                                               ");
        
            System.out.println("*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
            System.out.println("|   OBS.: A COVID-19 é uma doença grave e potencialmente fatal, sendo assim, é fundamental prevenir-se da doença e evitar a transmissão para outras pessoas.\n" +
                               "| - Lave as mãos frequentemente com água e sabão ou faça higienização utilizando álcool em gel 70%;\n" +   
                               "| - Evite tocar olhos, nariz e boca com as mãos sem a devida higienização;\n" +
                               "| - Mantenha distância de pelo menos 1 metro de outra pessoa que esteja com sintomas de gripe, ou seja, tossindo ou espirrando;\n" +
                               "| - Limpe objetos que são utilizados com frequência, como celulares;\n" +
                               "| - Ao tossir ou espirrar, utilize lenço para cobrir o nariz e a boca ou utilize a parte interna do cotovelo;\n" +
                               "| - Se não estiver se sentindo bem, permaneça em casa e, em caso de febre, tosse e dificuldade para respirar, procure um médico;\n" +
                               "| - O uso de máscara é recomendado para profissionais da saúde e pessoas com sintomas de doenças respiratórias, portanto não é necessário para indivíduos saudáveis.");
            System.out.println("*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
            System.out.println("                                               ");
            System.out.println("Deseja jogar novamente? ");
            System.out.println("\n1 - SIM \n2 - NÂO");
            escolha = leia.nextInt();
        }
    }//main
}//class
