package org.aidan.log;

import java.io.*;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/24 下午3:28
 * @描述: 编写文件的辅助工具类
 */
public class FileOpeUtil {

    /**
     * 私有化构造方法，避免外部无谓的创建类实例
     * 这个工具类不需要创建实例
     */
    private FileOpeUtil() {

    }

    /**
     * 读文件，从文件中获取存储的List对象
     *
     * @param pathName
     * @return
     */
    public static List readFile(String pathName) {
        File file = new File(pathName);
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) {
            return null;
        }
        List list = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            list = (List) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    /**
     * 写文件，把List对象写到文件中
     *
     * @param pathName
     * @param list
     */
    public static void writeFile(String pathName, List list) {
        File file = new File(pathName);
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
