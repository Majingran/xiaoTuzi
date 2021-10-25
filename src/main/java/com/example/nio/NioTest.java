package com.example.nio;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class NioTest {
//    public static void main(String[] args) {
//        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(100);
//        ByteBuffer byteBuffer2 = ByteBuffer.allocate(200);
//        System.out.println("byteBuffer1 postion=" +byteBuffer1.position()+"limit=" + byteBuffer1.limit());
//        System.out.println("byteBuffer2 postion=" +byteBuffer2.position()+"limit=" + byteBuffer2.limit());
//        System.out.println("byteBuffer1=" + byteBuffer1 + "isDirect" + byteBuffer1.isDirect());
//        System.out.println("byteBuffer2=" + byteBuffer2 + "isDirect" + byteBuffer2.isDirect());
//    }

//    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        System.out.println("A");
//        ByteBuffer buffer = ByteBuffer.allocateDirect(Integer.MAX_VALUE);
//        System.out.println("B");
//        byte[] byteArray = new byte[]{1};
//        System.out.println(Integer.MAX_VALUE);
//        for(int i = 0;i < Integer.MAX_VALUE;i++){
//            buffer.put(byteArray);
//        }
//        System.out.println("put end ~");
////        Thread.sleep(2000);
////        System.out.println("sleep end");
////        Method cleanerMethod = buffer.getClass().getMethod("cleaner");
////        cleanerMethod.setAccessible(true);
////        Object returnValue = cleanerMethod.invoke(buffer);
////        Method cleanMethod = returnValue.getClass().getMethod("clean");
////        cleanMethod.setAccessible(true);
////        cleanMethod.invoke(returnValue);
//    }
//
//    public static void main(String[] args) {
//        byte [] byteArray1 = { 1,2,3,4,5,6,7,8};
//        byte [] byteArray2 = { 55,66,77,88};
//        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
//        byteBuffer.put(byteArray1);
//        byteBuffer.position(2);
//        byteBuffer.put(byteArray2,1,3);
//        System.out.println("A````");
//        byte []getByte = byteBuffer.array();
//        for(int i = 0; i < getByte.length;i++){
//            System.out.println(getByte[i] + "");
//        }
//        System.out.println();
//        byteBuffer.position(1);
//        byte[ ] byteArrayOut = new byte[byteBuffer.capacity()];
//        byteBuffer.get(byteArrayOut,3,4);
//        System.out.println("B=");
//        for(int i = 0; i < byteArrayOut.length; i++){
//            System.out.println(byteArrayOut[i] + "");
//        }
//    }

}
