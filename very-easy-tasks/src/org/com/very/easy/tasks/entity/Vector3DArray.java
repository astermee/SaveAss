package org.com.very.easy.tasks.entity;

import org.com.very.easy.tasks.exception.NotEqualsLengthsOfArraysException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vector3DArray {

    //сам список векторов
    private List<Vector3D> vectorList = new ArrayList<>();

    //конструктор по размеру (создает массив из нулевых векторов)
    public Vector3DArray(int size) {
        for (int i = 0; i < size; i++) {
            vectorList.add(new Vector3D());
        }
    }

    //длина массива
    public int size() {
        return vectorList.size();
    }

    //замена i-го элемента массива на заданный вектор
    public void setVectorByIndex(int index, Vector3D vector) {
        if (index > size()) {
            return;
        }
        vectorList.set(index, vector);
    }

    //наибольша€ длина вектора в массиве,
    public double getLongestVectorLength() {
        double maxLength = 0;
        for (int i = 0; i < vectorList.size(); i++) {
            Vector3D vector = vectorList.get(i);
            double vectorLength = vector.length();
            maxLength = Math.max(maxLength, vectorLength);
        }
        return maxLength;
    }

    //поиск заданного вектора в массиве (результат Ц индекс первого вхождени€ или  Ц1, если не найден)
    public int findVector(Vector3D vector) {
        return vectorList.indexOf(vector);
    }

    //сумма всех векторов в массиве
    public Vector3D sumAll() {
        Vector3D sum = new Vector3D();
        for (int i = 0; i < vectorList.size(); i++) {
            Vector3D vector = vectorList.get(i);
            sum = Vector3DProcessor.sum(sum, vector);
        }
        return sum;
    }

    //метод, который получает на вход массив вещественных чисел (коэффициентов) и вычисл€ет линейную " +
    //"комбинацию векторов с заданными коэффициентами. " +
    //"ѕри несовпадении длин массивов векторов и коэффициентов, результатом считать нулевой вектор " +
    //"(если кто-то знает, как работать с исключени€ми, то выбросить исключение) (—ћќ“–» ѕјѕ ” EXCEPTION)
    public List<Vector3D> linearComb(int[] coef) throws NotEqualsLengthsOfArraysException {
        if (coef.length != vectorList.size())
            throw new NotEqualsLengthsOfArraysException();
        List<Vector3D> result = new ArrayList<>();
        for (int i = 0; i < coef.length; i++) {
            result.add(Vector3DProcessor.scalMult(vectorList.get(i), coef[i]));
        }
        return result;
    }

    //метод, который получает на вход точку P (типа Point3D) и вычисл€ет массив точек,
    //кажда€ из которых Ц результат сдвига точки P, на соответствующий вектор.
    public List<Point3D> calcPoints(Point3D point) {
        List<Point3D> result = new ArrayList<>();
        for (int i = 0; i < vectorList.size(); i++) {
            Vector3D vector = vectorList.get(i);
            result.add(new Point3D(point.getX() * vector.getX(), point.getY() * vector.getY(), point.getZ() * vector.getZ()));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Vector3DArray" + Arrays.toString(vectorList.toArray());
    }
}
