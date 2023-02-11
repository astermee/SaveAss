package org.com.very.easy.tasks.entity;

public class Point3D {

    private double x;
    private double y;
    private double z;

    //конструктор без параметров (создает точку – начало координат)
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //конструктор по координатам
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //геттеры и сеттеры НАЧАЛО
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    //геттеры и сеттеры КОНЕЦ

    //вывод точки на консоль
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }

    //сравнение двух точек
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return x == point3D.x && y == point3D.y && z == point3D.z;
    }
}
