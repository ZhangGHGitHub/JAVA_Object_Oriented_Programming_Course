package niit.edu.cn.java1111;

import java.util.Arrays;

/**
 * @author: 张国豪
 * @date: 2020/11/4 10:10
 * FileName: ComparableRectangle
 * @version: 1.0
 * Description: 矩形类 根据面积
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if(this.getArea()>o.getArea()) {
            return 1;
        }
        else if (this.getArea()<o.getArea())
        {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Width" + getWidth() + " Length" + getLength() + " Area" + getArea();
    }

    public static void main(String[] args) {
    ComparableRectangle [] rectangles = {new ComparableRectangle(4,4),new ComparableRectangle(5,5),new ComparableRectangle(6,6)};
    for(ComparableRectangle rec:rectangles) {
        System.out.println(rec);
    }
    Arrays.sort(rectangles);
        for(ComparableRectangle rec:rectangles) {
            System.out.println(rec);
        }

    }
}

class Rectangle
{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getPerimeter()
    {
        return 2*(this.length + this.width);
    }
    public int getArea()
    {
        return (this.length * this.width);
    }
}