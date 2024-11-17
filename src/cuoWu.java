import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class cuoWu {
    public static void main(String[] args) {
        Scanner shuRu = new Scanner(System.in);
        //在此输入您的代码...
        int n = shuRu.nextInt();
        for(int i = 0; i < n; i ++) {
            boolean pan = false;
            long shuLiang = shuRu.nextLong();
            long count = 0;
            if(shuLiang % 5 == 0 || shuLiang % 3 == 0) {
                count = shuLiang % 5 == 0 ? shuLiang / 5 : shuLiang / 3;
                pan = true;
            }
            else if(shuLiang < 5) {

            }
            else {
                for(int j = 1; j <= shuLiang / 3; j ++) {
                    if((shuLiang - 3 * j) % 5 == 0) {
                        count = j + (shuLiang - 3 * j) / 5;
                        pan = true;
                        break;
                    }
                }
            }
            if(pan == false) {
                System.out.println(-1);
            }
            else {
                System.out.println(count);
            }

        }
        shuRu.close();
    }
}