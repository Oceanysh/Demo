// 题目：使用三元运算符和if else语句实现取两个数字中的最大值


public class Demo06Max {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int max=a>b?a:b;//使用三元运算符
        System.out.println("最大值为"+max);


        int max1;
        if (a>b){
            System.out.println("最大值为"+a);
        }else {
            System.out.println("最大值为"+b);
        }

        int max2;
        if (a>b){
            max2=a;
        }else {
            max2=b;
        }
        System.out.println("最大值为"+max2);

    }

}
