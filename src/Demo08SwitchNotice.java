/*
Switch语句使用的注意事项
1.多个case之后的数值不可以重复


2.Switch后面小括号中只能是下列数据类型：
基本数据类型：byte、short、int、char
引用数据类型：String字符串 enum枚举

3.Switch语句很灵活，前后位置可以颠倒，break可以省略
匹配到哪一个位置，就从哪一个位置向下执行，直到遇到break停止
*/




public class Demo08SwitchNotice {
    public static void main(String[] args) {
        int a=3;
        switch (a){




            case 2:
                System.out.println("wohao");
                break;

            case 3:
                System.out.println("dajiahao");
                break;
            case 1:
                System.out.println("nihao");
                break;
            default:
                System.out.println("tahaodajiahao");
                break;







        }

    }
}
