package UT1_PD4;

public class Ej2 {

    public class Rectangle{
        int width;
        int height;
        public Rectangle(int Width, int Height){
            this.width = Width;
            this.height = Height;
        }

        public int area() {
            return width*height;
        }
    }

    //1) Indica qué es lo que está mal en el siguiente programa:
    //main no debe ser static para instanciar objetos
    public void main() {
        Rectangle myRect = new Rectangle(0, 0);
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

