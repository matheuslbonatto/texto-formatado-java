public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Texto que não quebra linha");
        System.out.println("Texto que quebra linha");

       // %s - Substitui no texto uma valor String
        System.out.printf("Vai imprimir %s %s %s \n" , "um texto", "Qualquer", "TESTE");

       // %d - Substitui o coringa %d por um numero interiro no texto
       System.out.printf("Minha Idade é: %d \n", 33 );
       
       // %f - Substitui o coringa %f por um numero flutuante
       System.out.printf("O valor de PI é: %f \n", 3.1415f);

       // %.2f - Substitui o coringa %.2f por um numero flutuante, com duas casas decimais
       System.out.printf("O valor de PI é: %.2f \n", 3.1415);

       // %b -  Substitui o coringa %b por um valor booleano
       System.out.printf("Este valor é: %b \n" , true);
       System.out.printf("Este valor é: %b \n" , false);

       // %c - Substitui o coringa %c por um caractere
       System.out.printf("\nO Caractere é: %c", 'A');
       System.out.printf("\nO Caractere é: %c", '5');
       System.out.printf("\nO Caractere é: %c", '*');
       System.out.printf("\nO Caractere é: %c", '\\');
       System.out.printf("\nO Caractere é: %c", '\"');

       // Printf com todos os tipos usando variaveis

       String texto = "Algum texto";
       Integer numeroInteiro    = 1;
       float   numeroQuebrado   = 123.321f;
       boolean valorVerdadeiro  = true;
       boolean valorFalso       = false;
       char    umCaractere      = 'º';

       System.out.printf("\n%s, %d, %.2f, %b, %b, %c",
                            texto,
                            numeroInteiro,
                            numeroQuebrado,
                            valorVerdadeiro,
                            valorFalso,
                            umCaractere);        
    }
}
