/*
复合赋值运算
+=   a+=3 相当于 a=a+3
-=   b-=5 相当于 b=b-5
*=   c*=6 相当于 c=c*6
/*   d/=7 相当于 d=d/7
%=   e%=8 相当于 e=e%7
变量可以赋值运算 常量不能赋值运算
复合赋值运算符隐藏了一个强制转换
 */


public class Demo7Operator {

    public static void main(String[] args) {
        int a = 5;
        a += 5;
        System.out.println(a);
        int x = 10;
        x %= 3;
        System.out.println(x);

        byte y=30;//y=y+5  y=byte+int y=int+int y=int
        y+=5;
        System.out.println(y);

    }
}
