/**
 * @class Main
 * @brief Класс Main содержит метод main, который является точкой входа в программу.
 * @details В методе main создаются экземпляры классов Point, Circle и Rectangle и выводится информация о них.
 */
public class Main {
    public static void main(String[] args) {
        // Создание экземпляров классов Point, Circle и Rectangle
        Point point = new Point(3, 4);
        Circle circle = new Circle(point, 5.0);
        Rectangle rectangle = new Rectangle(new Point(1, 1), new Point(6, 3));

        // Вывод информации о созданных объектах
        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}

