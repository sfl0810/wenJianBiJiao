import java.util.Scanner;

public class zhengQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // 测试数据数量
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int actions = -1;

            // 尝试优先使用五角星阵型
            for (int y = n / 5; y >= 0; y--) {
                int remaining = n - 5 * y; // 剩余卡片数量
                if (remaining % 3 == 0) {
                    int x = remaining / 3;
                    actions = x + y; // 总行动次数
                    break;
                }
            }
            System.out.println(actions);
        }

        scanner.close();
    }
}