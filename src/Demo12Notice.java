/*
编译器的优化

对于byte/short/char 三种类型来说 如果右侧赋值的数值没有超过范围
那么Javac编译器会自动的补上(byte)(short)（char)

1.如果没有超过左侧的范围 编译器会补上强转
2.如果超过左侧的范围 编译器直接报错
 */




public class Demo12Notice {
    public static void main(String[] args) {
        byte a=30;//javac编译器自动补上(byte)
        System.out.println(a);


        char b=65;
        System.out.println(b);//自动补上(char) 转换为A
    }
}
