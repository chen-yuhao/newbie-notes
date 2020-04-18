package io;

import org.junit.Test;

import java.io.*;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName IOLearner.java
 * @Description TODO
 * @createTime 2020年04月16日 11:39:00
 */
public class IOLearner {

    public static String fileName = "hello.txt";
    @Test
    public void writeTest(){
        File file = new File(fileName);
        try {
            FileOutputStream fop = new FileOutputStream(file);
            String data = "hello";
            fop.write(data.getBytes());
            fop.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readFile(){
        File file = new File(fileName);
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[1];
            fis.read(b);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
