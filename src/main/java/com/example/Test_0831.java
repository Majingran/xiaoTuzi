package com.example;


public class Test_0831 {
    static class QQ {
    }

    static class _360 {
    }

    public static class Father {
        public void hardChoice(QQ arg) {
            System.out.println("father choose QQ");
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choose _360");
        }


        public void hardChoice(Object arg) {
            System.out.println("father choose obj");
        }
    }

    public static class Son extends Father {
        @Override
        public void hardChoice(QQ arg) {
            System.out.println("son choose QQ");
        }

        @Override
        public void hardChoice(_360 arg) {
            System.out.println("son choose 360");
        }

        @Override
        public void hardChoice(Object arg) {
            System.out.println("son choose obj");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();
        Object qq = new QQ();
        Object aa = new _360();
        father.hardChoice(qq);
        father.hardChoice(qq);
        son.hardChoice(aa);
//        father.hardChoice(new QQ());
//        son.hardChoice(new _360());

    }
}
