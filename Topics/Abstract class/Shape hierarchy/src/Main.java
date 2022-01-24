abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();

    public static void main(String[] args) {
        double s1 = 3;
        double s2 = 4;
        double s3 = 5;
        Triangle triangle = new Triangle(s1, s2, s3);
        double length = 5;
        double width = 10;
        Rectangle rectangle = new Rectangle(length, width);
        double radius = 10;
        Circle circle = new Circle(radius);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }

}


class Triangle extends Shape {

    double s1;
    double s2;
    double s3;

    Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    double getArea() {
        double semiPerimeter;
        semiPerimeter = ((s1 + s2 + s3) / 2);
        return Math.sqrt(semiPerimeter * (semiPerimeter - s1) * (semiPerimeter - s2) *
                (semiPerimeter - s3));
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return (length + width) + (length + width);
    }

    @Override
    double getArea() {
        return (length * width);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return (radius * 2) * Math.PI;
    }

    @Override
    double getArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }
}