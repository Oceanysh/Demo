/*
首先计算表达式结果，然后打印输出
对于整数表达式来说，只看商不看余数
有不同的数据类型时，结果是数据范围大的那种





 */
public class Demo3Operator {

    public static void main(String[] args) {
        System.out.println(20+30);//常量运算


        int a =15;
        int b=5;
        System.out.println(a-b);//变量运算


        System.out.println(a*10);


        int x=10;
        int y=3;
        int result1=x/y;
        System.out.println(result1);


        int result2=x%y;
        System.out.println(result2);


        double result3=x+2.5;//int+double-->double+double-->double
        System.out.println(result3);

    }
}
