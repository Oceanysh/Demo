/*
定义一个方法的格式
public static void 方法名(){

      方法体

}

方法名称的命名规则使用小驼峰式

注意事项：
1.方法定义的先后顺序无所谓
2.方法的定义不能产生嵌套包含关系
3.方法定义好后不会执行 如果要执行要进行方法的【调用】

调用方法格式:
方法名称();


 */


public class Demo11Method {
    public static void main(String[] args) {
        farmer();
        cook();
        seller();
        me();
    }


    public static void farmer(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

    }

    public static void cook(){
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
    }

    public static void seller(){

        System.out.println('g');
        System.out.println('s');
        System.out.println('w');

    }

    public static void me()
        {
            System.out.println('a');//出现的错误：字符没加单引号 字符串没加双引号
    }
}
