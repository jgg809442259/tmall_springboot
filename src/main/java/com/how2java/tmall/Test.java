package com.how2java.tmall;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.sort();
    }

    public void sort(){
        int a[] = new int[20];
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100);
        }

        System.out.println("初始值");
        printArray(a);

        quickSort(a, 0, a.length - 1);

        System.out.println("结果");
        printArray(a);
    }

    private void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    private void swap(int[] a, int x, int y){
        int temp = a[y];
        a[y] = a[x];
        a[x] = temp;
    }

    private int partition(int[] a, int left, int right){
        int pivot = left;
        int index = pivot + 1;

        for(int i = index; i <= right; i++){
            if(a[i] < a[pivot]){
                swap(a, index, i);
                index++;
            }
        }

        swap(a, pivot, index -1);
        return index - 1;
    }

    private int[] quickSort(int[] a, int left, int right){
        if(left < right) {
            int partitionIndex = partition(a, left, right);
            quickSort(a, left, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, right);
        }
        return a;
    }
}
