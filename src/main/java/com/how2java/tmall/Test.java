package com.how2java.tmall;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.generateParenthesis(3));
    }

    public String findMinSum(int n, int m, int[] a){
        int[] index = new int[n];
        for(int i = 0; i < n; i++){
            if(a[i] == -1)
                index[i] = -1;
        }

        for(int i = 0; i < n-2; i++){
            int count = 0;
            for(int j=0; j<3; j++){
                if(a[i+j]==-1){
                    count++;
                }
            }

            switch(count){
                case 0:
                    if(a[i]+a[i+1]+a[i+2]<m && index[i]!=-1 && index[i+1]!=-1 && index[i+2]!=-1)
                        return "impossible";
                    else if(a[i]+a[i+1]+a[i+2]<m && index[i+1]==-1){
                        a[i+1]= m-a[i]-a[i+2];
                    }
                    break;

                case 1:
                    int firstPos1 = 0;
                    int subSum1 = 0;
                    for(int j=0; j<3; j++){
                        if(a[i+j] != -1){
                            subSum1 =+ a[i+j];
                        } else
                            firstPos1 = i+j;
                    }
                    a[firstPos1] = m-subSum1<0?0:m-subSum1;
            }
        }

        int sum = 0;
        System.out.println("输出数组");
        for(int b: a){
            sum = sum + b;
            System.out.print(" " + b);
        }
        System.out.println(" ");
        return String.valueOf(sum);
    }

    public List<String> generateParenthesis(int n){
        _generate(0, 2*n, "");
        return null;
    }

    private void _generate(int level, int max, String s){
        if(level >= max){
            System.out.println(s);
            return;
        }

        _generate(level+1, max, s+"(");
        _generate(level+1, max, s+")");
    }
}
