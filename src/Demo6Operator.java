/*
自增运算符++
自减运算符--
让一个变量涨/降一个数字1
只有变量才能使用自增自减运算，常量不能使用*/
public class Demo6Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        ++num1;//前++ 单独使用
        System.out.println(num1);
        num1++;//后++ 单独使用
        System.out.println(num1);


        //与打印操作混合
        //混合使用，先++，马上变成21，然后打印
        int num2 = 20;
        System.out.println(++num2);
        System.out.println(num2);

        //混合使用，后++，先用变量的30，然后再加1得到31
        int num3 = 30;
        System.out.println(num3++);
        System.out.println(num3);

        //30++,常量不能使用自增自减运算
    }
}
