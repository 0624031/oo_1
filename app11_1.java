abstract class CShape
{   
    protected String color;
    public void setColor(String s){
        color = s;
    }
    public abstract void show();
}


class CTriangle extends CShape
{
  protected double a,b,c,area;
  public CTriangle(double a,double b, double c){
    a=a;
    b=b;
    c=c;
    area = 0.5*a*b;
  }
  public void show(){
    System.out.print("color = "+color+", ");
    System.out.print("area="+ area +"\n");   
  }
    
}
public class app11_1
{
    
    public static void main(String args [])
    {
        CTriangle tri = new CTriangle(3,4,5);
        tri.setColor("Red");
        tri.show();
    }
}