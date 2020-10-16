public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        //Ax2 + Bx + C=0
        int a=1,b=-5,c=-14;
        double x1=0,x2=0;
        
        //Calculating Discriminant(D)
        int d=(b*b)-(4*a*c);
        
        
        //Real & Distinct Roots
        if(d>0)
        {
        x1=((-b)+Math.sqrt(d))/(2*a);
        x2=((-b)-Math.sqrt(d))/(2*a);
        }
        
        
        //Real and Equal Roots
        else if(d==0)
        {x1=((-b)+Math.sqrt(d))/(2*a);
        x2=x1;}
        
        
        //No Real Roots Exits
        else
        System.out.println("Imaginary Roots");
        
        
        System.out.println("Roots are "+x1+" "+x2);
        
        
     }
}
