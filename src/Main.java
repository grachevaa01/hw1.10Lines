public class Main {
    public static void main(String[] args) {
        String address = "Address for delivery";
        String street = "Манежная";
        street = "Манежная площадь";
        System.out.println(street);
        System.out.println("Адрес магазина " + street);
        String streetTrue = street.replace("м", "М");
        System.out.println(streetTrue);//

        System.out.println("online class");

        String phone = "960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length()>11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length()<10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("ФИО сотрудника " + fullName);
        System.out.println("task2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println("task3");
        String otherFullName = "Иванов Семён Семёнович";
        String otherFullNameCorrect = otherFullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + otherFullNameCorrect);
}}