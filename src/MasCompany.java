import java.util.Scanner;
public class MasCompany {
    public static void main(String[] args) {
        // 1) объявляем ссылку на массив объектов
        // класса Company;
        // 2) выделяем память для массива ссылок
        // на объекты и сохраняем адрес выделенной
        // памяти в ссылочной переменной
        Company[] CityCompany = new Company[5];
        // 3) создаём объекты и записываем ссылки
        // на эти объекты в соответствующие
        // элементы массива
        Scanner scanner = new Scanner(System.in);


        // 3) создаём объекты и записываем ссылки
        // на эти объекты в соответствующие
        // элементы массива
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите информацию о компании " + (i + 1) + ":");
            System.out.print("Название: ");
            String name = scanner.nextLine();
            System.out.print("Количество сотрудников: ");
            int persons = Integer.parseInt(scanner.nextLine());
            System.out.print("Фонд зарплаты: ");
            int money = Integer.parseInt(scanner.nextLine());
            CityCompany[i] = new Company(name, persons, money);
        }

        System.out.println("\nКомпании с средней зарплатой выше 10,000:");
        for (Company company : CityCompany) {
            if (company.averageSalary() > 10000) {
                company.show();
            }// конец описания класса MasCompany
        }

        scanner.close(); // Закрываем сканер
    }
}
