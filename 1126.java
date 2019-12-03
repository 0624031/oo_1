interface Shape{
    abstract double getArea();
}

class Rectangle implements Shape{
    double width,length;
    public Rectangle(double w,double l){
        this.width=w;
        this.length=l;
    }
    @Override
    public double getArea(){
       return width*length;
    }
    public String toString(){//overriding the toString() method 
       
        return "width= "+width+" ,length= "+length+" ,area= "+getArea();
       
    }
    
}
class Triangle implements Shape{
    double base;
    double height;
    public Triangle(double b,double h){
        this.base=b;
        this.height=h;
    }
    @Override
    public double getArea(){
        return base*height/2;
    }
    public String toString(){//overriding the toString() method 
        
        return "base= "+base+" ,height= "+height+" ,area= "+getArea();  
    }
   
}
public class app{
    public static void main(String args []){
        Rectangle rect = new Rectangle(5,10);
        System.out.println("Rectangle\n"+rect);
        Triangle tri=new Triangle(5,4);
        System.out.println("Triangle\n"+tri);
    }
} 
