/*

在给变量进行赋值时 如果右侧的表达式当中全部是常量 没有任何变量
则编译器javac直接计算结果
short resul =5+8;//等号右边都是常量 没有任何变量
编译后.class文件相当于【直接就是】
short result=13;
右侧的常量数值没有超过左侧的范围，所以正确

称为“编译器的常量优化”

但是注意，一旦表达式中有变量参与就不能进行这种优化



*/
public class Demo13Notice {


    public static void main(String[] args) {
        short num1=10;
        System.out.println(num1);//正确写法，右侧没有超过左侧的范围



        short a=5;
        short b=10;
        //short result=a+b;//short+short-->int+int-->int
        //错误写法 左侧需要的是int类型


        //右侧不用变量 用两个常量
        short result=5+8;
        System.out.println(result);
    }
}
