import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File wenJian1 = new File("src/wenJian/a.txt");
        File wenJian2 = new File("src/wenJian/b.txt");
        int count = 0;
        try {
            Scanner wenJian1Du = new Scanner(new FileReader(wenJian1));
            Scanner wenJian2Du = new Scanner(new FileReader(wenJian2));
            int line = 1;
            while (wenJian1Du.hasNextLine() && wenJian2Du.hasNextLine()) {
                String line1 = wenJian1Du.nextLine();
                String line2 = wenJian2Du.nextLine();
                if(!line1.equals(line2)){
                    System.out.println("当前行数为第" + line + "行，存在不同");
                    System.out.println("文件a内容为: " + line1);
                    System.out.println("文件b内容为: " + line2);
                    count ++;
                }
                line ++;
            }
            if(!wenJian1Du.hasNextLine() && !wenJian2Du.hasNextLine()){
                System.out.println("两个文件都读取完毕!");
            }
            else if(! wenJian1Du.hasNextLine()){
                System.out.println("文件1读取完毕");
            }
            else if(! wenJian2Du.hasNextLine()){
                System.out.println("文件2读取完毕");
            }
            System.out.println("运行结束，不同的内容有" + count + "行");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
