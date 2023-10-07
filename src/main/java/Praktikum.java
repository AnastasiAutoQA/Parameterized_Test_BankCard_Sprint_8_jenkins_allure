
public class Praktikum {
    /* В этом методе заложи логику работы с классом Account.
    Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
    и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
    */
    private static String name;

    public static void main(String[] args) {
        //name = "Timoty Shalame";
        Account account = new Account(name);
        account.checkNameToEmboss();
    }
}
