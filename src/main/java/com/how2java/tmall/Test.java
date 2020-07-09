package com.how2java.tmall;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.bubbleSort();
    }

    public void bubbleSort(){
        int a[] = new int[20];
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for(int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - j - 1; i++) {
                if (a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public void selectSort(){
        int a[] = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        for(int j = 0; j < a.length - 1; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    public void bottom(){
        int full = 100;
        int empty = 0;
        int t = 0;
        int a[] = new int[2];
        a[0] = full;
        a[1] = empty;

        while(true) {
            t += a[0];
            int f = (int) (a[0] + a[1]) / 3;
            int e = (int) (a[0] + a[1]) % 3;
            a[0] = f;
            a[1] = e;

            if (a[0] + a[1] < 3) {
                t += a[0];
                System.out.print(t);
                break;
            }
        }
    }
}
