package preVersion.io;

import java.util.Scanner;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName IOLearner.java
 * @Description TODO
 * @createTime 2020年04月15日 15:20:00
 */
public class IOLearner {
    public void scanner() {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println("还有");
            String str = sc.nextLine();
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        IOLearner learner = new IOLearner();
        learner.scanner();
    }

}
