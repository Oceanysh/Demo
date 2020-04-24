/*题目：求出1到100的偶数和

思路：
1.把1到100所有数都挑出来
2.筛选出偶数
3.制作一个累加器
*/





public class Demo12HundredSum {
    public static void main(String[] args) {
        int sum=0;//累加器
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum+=i;

            }
        }System.out.println(sum);

    }
}
