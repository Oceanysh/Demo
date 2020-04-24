

/*  四则运算中“+”法有三种常用方法
1.对于数值来说，就是加法
2.对于字符Char类型来说，先把char转换为int，然后在计算.ASC码表，Unicode表
3.对于字符串String（首字母大写，不是关键字)加号代表字符串连接操作
注意：任何数据类型跟字符串相连都会变成字符串



*/public class Demo5Plus {
    public static void main(String[] args) {
        String str1="Hello";
        System.out.println(str1);
        System.out.println("Hello"+"World");

        String str2="Java";
        //String+int-->String
        System.out.println(str2+20);

        //优先级问题
        //String+int+int
        //String=int
        //String
        System.out.println(str2+20+30);
        System.out.println(str2+(20+30));

}}
