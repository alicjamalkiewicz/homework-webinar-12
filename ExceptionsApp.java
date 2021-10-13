package pl.test.ExceptionExamples;

/*
ZADANIE DOMOWE:
- napisz obsługę własnego wyjątku ImproperNameException - wyjątek rzucany jeśli
String jest null lub pusty
 */
public class ExceptionsApp {
    public static void main(String[] args) throws ImproperNumberException, ImproperNameException, NullPointerException {
        int[] numbers = {1, 2, 3, 4, 5};
        //String name = null;

        // wewnątrz bloku try podajemy fragment kodu, który potencjalnie może rzucić wyjątek
        // w momencie wyjątku wykonuje się odpowiedni blok catch
//        try {
//            System.out.println(numbers[0]); // tutaj idziemy do linii 16
//            //System.out.println(name.length());
//        } catch (NullPointerException exception) {
//            System.out.println("Wywołujesz metodę na obiekcie null");
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Odwołujesz się poza zakres tablicy");
//        } finally { // dodajemy instrukcje, które muszą się wykonać niezależnie czy jest wyjątek czy nie
//            System.out.println("Koniec try...catch");
//        }
//
//        try {
//            System.out.println(numbers[0]);
//        } catch (Exception exception) { // przechwytujemy jakikolwiek wyjątek
//            exception.printStackTrace();
//        }

        String number = "1234677890";

        // jeśli długość > 9 to rzuć wyjątek ImproperNumberException
        try {
            checkNumber(number);
        } catch (ImproperNumberException e) {
            System.out.println("IMPROPER NUMBER EXCEPTION");
            System.out.println("Podany błedny numer: " + e.getNumber());
        }
        System.out.println("Koniec działania programu");

        System.out.println("\n-------ZADANIE DOMOWE 07.10-------\n");


        String name = null;

        try {
            checkNameNotEmpty(name);
            System.out.println("Great, the name is not empty");
        } catch (ImproperNameException e) {
            System.out.println("Incorrect name error");
            System.out.println("Provided name " + e.getName() + "is empty");
        } catch (NullPointerException e){
            System.out.println("Incorrect name error");
            System.out.println("Provided name " + e.getName() + "is empty");
        }
        System.out.println("Finito");
    }

    // throws - przerzucenie obsługi wyjątku w inne miejsce programu
    public static void checkNumber(String number) throws ImproperNumberException {
        if (number.length() > 9) {
            throw new ImproperNumberException(number); // rzucenie wyjątku z parametrem
        }
    }

    public static void checkNameNotEmpty(String name) throws ImproperNameException, NullPointerException {
        if (name.isEmpty() || name == null) {
            throw new ImproperNameException(name);
        }
    }

}