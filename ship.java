import java.util.Scanner;

public class ship{
    int productId;
    String Pname;
}

class customer extends ship{
    String name;
    customer(String n,int p,String pn){
        name=n;
        productId=p;
        Pname=pn;
    }
    public static void main(String[] args){
        customer s=new customer("Ram",25,"pen");
        System.out.println("customer name:"+s.name+" product id:"+s.productId+" product name:"+s.Pname);
    }
}
