package com.example.FileObject;

import java.io.File;

public class FIleTest {
    public static void main(String[] args) {
        File f1 = new File("C:\\");
        File f2 = new File("C:\\Users\\Mr_Ma\\Desktop\\a.txt");
        if(f1.isDirectory()){
            System.out.println("f1对象表示的是根目录");
        }else if (f1.isFile()){
            System.out.println("f1对象表示的是文件");
        }
        if(f2.isDirectory()){
            System.out.println("f2对象表示的是根目录");
        }else if (f2.isFile()){
            System.out.println("f2对象表示的是文件");
        }
        //获取文件名称
        System.out.println(f2.getName());
        System.out.println(f2.delete());
    }
}
