interface ShapeInterface {
    void draw();
}

class Rectangle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("We are in Rectangle::draw() method");
    }
}

class Square implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("We are in Square::draw() method");
    }
}

class Circle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("We are in Circle::draw() method");
    }
}


