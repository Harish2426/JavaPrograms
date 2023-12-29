package Harish;

class Triangle
{
    int a=3;
    int b=4;
    int c=5;
    public static void main(String[] args)
      {
             Triangle tc=new Triangle();
             int peri=(tc.a+tc.b+tc.c);
             System.out.println("perimeter of triangle is = "+peri);
             int sp=(peri/2);
             int ar=((((sp*(sp-tc.a))*(sp-tc.b))*(sp-tc.c)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area of triangle is = "+area);
      }
}
