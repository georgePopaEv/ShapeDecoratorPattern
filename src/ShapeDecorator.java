import java.awt.*;

abstract class ShapeDecorator implements ShapeInterface{
    protected ShapeInterface decoratedShape;

    public ShapeDecorator(ShapeInterface decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }


}

class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(ShapeInterface decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(ShapeInterface decoratedShape) {
        System.out.println("Border Color: Red");
    }


}
