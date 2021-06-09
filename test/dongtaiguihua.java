package com.example.test.ceti;

/**
 * @author yd
 * @date 2021/1/6 16:33
 */
public class dongtaiguihua {

//    计算最少出列多少位同学，使得剩下的同学排成合唱队形
//
//说明：
//
//N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
//合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
//
//你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
//
//
//注意不允许改变队列元素的先后顺序
//请注意处理多组输入输出！
//
//输入描述:
//整数N
//
//输出描述:
//最少需要几位同学出列
//
//示例1
//输入
//复制
//8
//186 186 150 200 160 130 197 200
//输出
//复制
//4

//    public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//
//     int n = scan.nextInt();
//     long max = 0;
//     int[][] dp = new int[n][n];
//     dp[0][0] = scan.nextInt();
//
//     for(int i=1;i<n;i++){
//             for(int j=0;j<=i;j++){
//                     int num = scan.nextInt();
//                     if(j==0){
//                             dp[i][j] = dp[i-1][j] + num;
//                         }else {
//                             dp[i][j] = Math.max(dp[i-1][j-1],dp[i - 1][j])+num;
//                         }
//                     max = Math.max(dp[i][j],max);
//                 }
//         }
//     System.out.println(max);
// }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String aStr = scan.nextLine();
//        String bStr = scan.nextLine();
//        int aLen = aStr.length();
//        int bLen = bStr.length();
//        int[][] dp = new int[aLen+1][bLen+1];
//        for(int i=0;i<aLen+1;i++){
//            dp[i][0] = i;
//        }
//        for(int i=0;i<bLen+1;i++){
//            dp[0][i] = i;
//        }
//        for(int i=1;i<aLen+1;i++){
//            for(int j=1;j<bLen+1;j++){
//                if(aStr.charAt(i-1) == bStr.charAt(j-1)){
//                    dp[i][j] = dp[i-1][j-1];
//                }else {
//                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
//                }
//            }
//        }
//        System.out.println(dp[aLen][bLen]);
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] dp = new int[n+1];
//        int[] readMax = new int[n+1];
//
//        for(int i=0;i<n;i++){
//            for(int k=1;k<n+1;k++){
//                readMax[k] = scan.nextInt();
//            }
//            for(int j=1;j<n+1;j++){
//                dp[j] = Math.max(dp[j],dp[j-1])+readMax[j];
//            }
//        }
//        System.out.println(dp[n]);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int v = scan.nextInt();
//        int[] dp = new int[v+1];
//        int[] price = new int[n+1];
//        int[] weight = new int[n+1];
//        long max = 0;
//        for(int i=1;i<n+1;i++){
//            weight[i] = scan.nextInt();
//            price[i] = scan.nextInt();
//        }
//        for(int i = 1;i<n+1;i++){
//            for(int j= v;j>0;j--){
//                if(j-weight[i] >= 0){
//                    dp[j] = Math.max(dp[j],dp[j-weight[i]]+price[i]);
//                 }else {
//                    dp[j] = dp[i];
//                }
//            }
//        }
//        for(int i=0;i<v+1;i++){
//            max = max > dp[i]?max:dp[i];
//        }
//        System.out.println(max);
//    }

//最长递增子序列
//    public static void main(String[] args) {
//        int [] a={10, 22, 9, 33, 21, 50, 41, 60 };
//        int b=a.length;
//        int [] c=new int [b];
//        for (int i = 0; i < c.length; i++) {
//            c[i]=1;
//        }
//        for (int i = 0; i < b; i++) {
//            for (int j = 0; j < i; j++) {
//                if (a[i]>a[j]&&c[i]<c[j]+1){
//                    c[i]=c[j]+1;
//                }
//            }
//        }
//
//        int max=0;
//        for (int i = 0; i < c.length; i++) {
//            System.out.println("c[i]"+c[i]);
//            if (max<c[i]){
//                max=c[i];
//                System.out.println("max"+max);
//            }
//        }
//    }
//
////最大字段和
//    public static void main(String[] args) {
//        int maxnum=0;
//        int nownum=0;
//        int [] a={-2,11,-4,13,-5,-2};
//        for (int i = 0; i < a.length; i++) {
//            nownum=nownum+a[i];
//            if (maxnum<nownum){
//                maxnum=nownum;
//            }
//            if (nownum<0){
//                nownum=0;
//            }
//        }
//        System.out.println(maxnum);
//    }


}
