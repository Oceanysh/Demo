/*
与  &&   全部都是true 才是true 否则是false
或  ||   至少一个是true 就是true 全都是false 才是false
非   ！  本来是true 变成false  本来是false 变成true
与&& 或|| 有短路效果  如果根据左边的判断能得到最终结果 右边将不再执行

逻辑运算符只能由于BOOLEAN值 && || 左右都要有boolean值 ！只需要有一个boolean
与 或 如果有多个条件可以连续写
 */
public class Demo9Logic {
    public static void main(String[] args) {
        System.out.println(true&&false);
        System.out.println(3<4&&30>5);


        System.out.println(!true);


        int a=10;
        System.out.println(3>4&&a++>110);
        System.out.println(a);



        int b=30;
        System.out.println(3<4||b++>100);
        System.out.println(b);

    }
}
