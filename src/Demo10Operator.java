/*
一元运算符：  只需要一个数据就能运算 例如：！取反  自增++
二元运算符：  需要两个数据就能运算   例如：加法+ 赋值=
三运运算符：  需要三个数据就能运算。

格式：
数据类型 变量名称=条件判断？表达式A:表达式B；

流程：
首先判断条件是否成立；
若为true 则把A的值赋给左面
若为false 则把B的值赋给左面


三元运算符的结果必须要使用

*/public class Demo10Operator {


    public static void main(String[] args) {

        int a=10;
        int b=20;

        int max=a>b? a:b;
        System.out.println("最大值"+max);
        //int result=3>42.5||10; 错误写法


    }
}
