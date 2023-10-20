/*
 DZ1
 создать приложение запрашивающее у пользователя наименование товара, количество,
 телефон пользователя и адрес.
 В консоль выводит информацию о заказе, в виде:
 Ваш заказ принят.
 Товар <Наименование товара> в количестве <количество> прибудет к вам в ближайшее время.
 Товар доставим по адресу: <адрес>.
 Ваш контактный номер: <телефон>.
*/


import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        // Объявление переменных
        String name, address, phone;
        int quantity;
        // Запрос данных пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tДобрый день!");
        System.out.println("Введите наименование товара");
        name = scanner.nextLine();
        System.out.println("Введите количество товара");
        quantity = scanner.nextInt();
        System.out.println("Введите телефон пользователя");
        phone = scanner.next();
        System.out.println("Введите адрес");
        address = scanner.next();
        scanner.close();

        // Вывод информации о заказе
        System.out.printf("\tВаш заказ принят.\nТовар %s в количестве %d прибудет к вам в ближайшее время.\n" +
                "Товар доставим по адресу: %s.\nВаш контактный номер: %s.", name, quantity, address, phone);
    }
}