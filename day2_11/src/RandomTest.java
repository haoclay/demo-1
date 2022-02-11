import java.util.Random;

public class RandomTest {

    //程序的入口
    public static void main(String[] args) {
        //创建了一个可以产生随机数的工具
        Random random = new Random();
        //使用工具产生随机数  4 6

        //拼接数据
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 4; i++) {
            //产生随机数
            int num = random.nextInt(10);//[0~10]
            //每次产生的随机数粘在后面
            sb.append(num);
        }
        System.out.println(sb.toString());














    }
}
