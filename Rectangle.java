/**
 * @class Rectangle
 * @brief Класс Rectangle представляет прямоугольник с заданными координатами верхнего левого и нижнего правого углов.
 * @details Класс Rectangle содержит координаты верхнего левого и нижнего правого углов типа Point, а также методы для их получения и изменения.
 */
class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    /**
     * @brief Конструктор класса Rectangle.
     * @param topLeft координаты верхнего левого угла
     * @param bottomRight координаты нижнего правого угла
     */
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * @brief Получить координаты верхнего левого угла.
     * @return координаты верхнего левого угла
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * @brief Получить координаты нижнего правого угла.
     * @return координаты нижнего правого угла
     */
    public Point getBottomRight() {
        return bottomRight;
    }

    /**
     * @brief Установить координаты верхнего левого угла.
     * @param topLeft новые координаты верхнего левого угла
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * @brief Установить координаты нижнего правого угла.
     * @param bottomRight новые координаты нижнего правого угла
     */
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * @brief Получить строковое представление прямоугольника.
     * @return строковое представление прямоугольника
     */
    public String toString() {
        return "Rectangle: TopLeft = " + topLeft + ", BottomRight = " + bottomRight;
    }
}
