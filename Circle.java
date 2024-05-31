/**
 * @class Circle
 * @brief Класс Circle представляет круг с центром в заданной точке и заданным радиусом.
 * @details Класс Circle содержит центр типа Point и радиус типа double, а также методы для их получения и изменения.
 */
class Circle {
    private Point center;
    private double radius;

    /**
     * @brief Конструктор класса Circle.
     * @param center центр круга
     * @param radius радиус круга
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * @brief Получить центр круга.
     * @return центр круга
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @brief Получить радиус круга.
     * @return радиус круга
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @brief Установить центр круга.
     * @param center новый центр круга
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @brief Установить радиус круга.
     * @param radius новый радиус круга
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @brief Получить строковое представление круга.
     * @return строковое представление круга
     */
    public String toString() {
        return "Circle: Center = " + center + ", Radius = " + radius;
    }
}
