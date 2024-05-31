/**
 * @class Point
 * @brief Класс Point представляет точку в двумерном пространстве.
 * @details Класс Point содержит координаты x и y, а также методы для их получения и изменения.
 */
class Point {
    private int x;
    private int y;

    /**
     * @brief Конструктор класса Point.
     * @param x координата x
     * @param y координата y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @brief Получить значение координаты x.
     * @return значение координаты x
     */
    public int getX() {
        return x;
    }

    /**
     * @brief Получить значение координаты y.
     * @return значение координаты y
     */
    public int getY() {
        return y;
    }

    /**
     * @brief Установить значение координаты x.
     * @param x новое значение координаты x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @brief Установить значение координаты y.
     * @param y новое значение координаты y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @brief Получить строковое представление точки.
     * @return строковое представление точки
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
