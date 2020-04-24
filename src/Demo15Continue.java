/*另一种循环控制语句 continue
一旦执行 跳过当前次循环内容 开始下一次执行*/
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==4){//如果当前是第四层，那么跳过当前循环，开始下一次循环
                continue;
            }
            System.out.println(i+"层到了");
        }
    }
}
