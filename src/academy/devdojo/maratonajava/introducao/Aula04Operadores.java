package academy.devdojo.maratonajava.introducao;

import java.sql.SQLInvalidAuthorizationSpecException;

public class Aula04Operadores {
     public static void main(String[] args) {
     // Operadores Numericos: + - / * %

      int numero01 = 10;
      int numero02 = 20;
      double resultado = numero01 / numero02;
      System.out.println(resultado);
      System.out.println(numero01 / (double) numero02);

      int resto = 3 % 2;
      System.out.println(resto);




      // Operadores Relacionais: < >  <= >=  == !=

      boolean isDezMaiorQueVinte = 10 > 20;
      boolean isDezMenorQueVinte = 10 < 20;
      boolean isDezIgualVinte = 10 == 20;
      boolean isDezIgualDez = 10 == 10;
      boolean isDiferentelDez = 10 != 10;
      System.out.println("10 é maior que 20? "+isDezMaiorQueVinte); //false
      System.out.println("10 é menor que 20? "+isDezMenorQueVinte); //true
      System.out.println("10 é igual a 20? "+isDezIgualVinte); //false
      System.out.println("10 é igual a 10? "+isDezIgualDez); //true
      System.out.println("10 é diferente de 10? "+isDiferentelDez); //false

      // Operadores Logicos: && (and) || (or) ! (not)
      int idade = 25;
      float salario = 3500F;
      boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
      boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
      System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
      System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


     }
}
