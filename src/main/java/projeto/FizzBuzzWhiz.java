package projeto;


public class FizzBuzzWhiz {
    public String fizzBuzzWhiz (int number) {
        if (number % 3 == 0 && numeroPrimo(number)) {
          return "fizzwhiz";
        }
        if (number % 5 == 0 && numeroPrimo(number)) {
          return "buzzwhiz";
        }
        if (number % 3 == 0 && number % 5 == 0) return "fizzbuzz";
        if (number % 3 == 0) return "fizz";
        if (number % 5 == 0) return "buzz";
        if ( numeroPrimo(number) ) {
          return "whiz";
        }
        return "" + number;
      }

  public boolean numeroPrimo (int numero) {
      for (int index = 2; index < numero; index++) {
        if (numero % index == 0) return false;
      }
      return true;
    } 
}
