package com.example.test.ceti;

import java.util.Scanner;

/**
 * @author yd
 * @date 2021/1/26 16:21
 */
public class shuju {

//    题目描述
//信息社会，有海量的数据需要分析处理，比如公安局分析身份证号码、 QQ 用户、手机号码、银行帐号等信息及活动记录。
//
//采集输入大数据和分类规则，通过大数据分类处理程序，将大数据分类输出。
//
//请注意本题有多组输入用例。
//输入描述:
//﻿一组输入整数序列I和一组规则整数序列R，I和R序列的第一个整数为序列的个数（个数不包含第一个整数）；整数范围为0~0xFFFFFFFF，序列个数不限
//
//输出描述:
//﻿从R依次中取出R<i>，对I进行处理，找到满足条件的I：
//
//I整数对应的数字需要连续包含R<i>对应的数字。比如R<i>为23，I为231，那么I包含了R<i>，条件满足 。
//
//按R<i>从小到大的顺序:
//
//(1)先输出R<i>；
//
//(2)再输出满足条件的I的个数；
//
//(3)然后输出满足条件的I在I序列中的位置索引(从0开始)；
//
//(4)最后再输出I。
//
//附加条件：
//
//(1)R<i>需要从小到大排序。相同的R<i>只需要输出索引小的以及满足条件的I，索引大的需要过滤掉
//
//(2)如果没有满足条件的I，对应的R<i>不用输出
//
//(3)最后需要在输出序列的第一个整数位置记录后续整数序列的个数(不包含“个数”本身)
//
//
//
//序列I：15,123,456,786,453,46,7,5,3,665,453456,745,456,786,453,123（第一个15表明后续有15个整数）
//
//序列R：5,6,3,6,3,0（第一个5表明后续有5个整数）
//
//输出：30, 3,6,0,123,3,453,7,3,9,453456,13,453,14,123,6,7,1,456,2,786,4,46,8,665,9,453456,11,456,12,786
//
//说明：
//
//30----后续有30个整数
//
//3----从小到大排序，第一个R<i>为0，但没有满足条件的I，不输出0，而下一个R<i>是3
//
//6--- 存在6个包含3的I
//
//0--- 123所在的原序号为0
//
//123--- 123包含3，满足条件
//
//示例1
//输入
//复制
//15 123 456 786 453 46 7 5 3 665 453456 745 456 786 453 123
//5 6 3 6 3 0
//输出
//复制
//30 3 6 0 123 3 453 7 3 9 453456 13 453 14 123 6 7 1 456 2 786 4 46 8 665 9 453456 11 456 12 786
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    while (sc.hasNext()){
//        int rn = sc.nextInt();
//        String[] st = new String[rn];
//        for(int i=0;i<rn;i++){
//            st[i] =sc.next();
//        }
//        int jn = sc.nextInt();
//        TreeSet<Integer> set = new TreeSet<Integer>();
//        for(int i=0;i< jn;i++){
//            set.add(sc.nextInt());
//        }
//        StringBuffer str = new StringBuffer();
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String e = iterator.next().toString();
//            str.append(getRes(e,st));
//        }
//        System.out.println(str.toString().split(" ").length+" "+str);
//    }
//}
//    public static StringBuffer getRes(String e,String[] st){
//        StringBuffer res = new StringBuffer();
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>();
//        for(int i=0;i<st.length;i++){
//            if(st[i].contains(e)){
//                map.put(i,st[i]);
//            }
//        }
//        if(map.size()>0)
//            res.append(e+" "+map.size()+" ");
//        for(Map.Entry entry : map.entrySet()){
//            res.append(entry.getKey()+" "+entry.getValue()+" ");
//        }
//        return res;
//    }


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int a= sc.nextInt();
//            String [] b=new String [a];
//            for (int i = 0; i < a; i++) {
//                b[i]=sc.next();
//            }
//            int c=sc.nextInt();
//            TreeSet<Integer>  treeSet=new TreeSet<>();
//            for (int i = 0; i < c; i++) {
//                treeSet.add(sc.nextInt());
//            }
//            StringBuffer sb=new StringBuffer();
//            Iterator<Integer> iterator = treeSet.iterator();
//            while (iterator.hasNext()){
//                String e=iterator.next().toString();
//                getRes(e,b);
//            }
//        }
//    }
//
//    public static StringBuffer getRes(String e,String[] st){
//        StringBuffer sb=new StringBuffer();
//        LinkedHashMap <Integer,String> map=new LinkedHashMap<>();
//        for (int i = 0; i < st.length; i++) {
//            if (st[i].contains(e)){
//                map.put(i,st[i]);
//            }
//        }
//        if (map.size()>0){
//            sb.append(e+" "+map.size()+" ");
//            for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                sb.append(entry.getKey()+" "+entry.getValue()+" ");
//            }
//        }
//        return sb;
//    }



//    编写一个程序，将输入字符串中的字符按如下规则排序。
//
//规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
//
//如，输入： Type 输出： epTy
//
//规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
//
//如，输入： BabA 输出： aABb
//
//规则 3 ：非英文字母的其它字符保持原来的位置。
//
//
//如，输入： By?e 输出： Be?y

//    public static String sort(String str) {
//        // 先将英文字母收集起来
//        List<Character> letters = new ArrayList<>(str.length());
//        for (char ch : str.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                letters.add(ch);
//            }
//        }
//        // 将英文字母先排序好
//        letters.sort(new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                //升序 o1-o2 降序o2-o1
//                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
//            }
//        });
//
//        // 若是非英文字母则直接添加
//        StringBuilder result = new StringBuilder();
//        for (int i = 0, j = 0; i < str.length(); i++) {
//            if (Character.isLetter(str.charAt(i))) {
//                result.append(letters.get(j++));
//            }
//            else {
//                result.append(str.charAt(i));
//            }
//        }
//        return result.toString();
//    }
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String str = in.nextLine();
//            String res =sort(str);
//            System.out.println(res);
//        }
//    }

//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String a=sc.nextLine();
//            String b=sort(a);
//            System.out.println(b);
//        }
//
//    }
//
//    public static String sort(String a){
//        List<Character> b=new ArrayList<>(a.length());
//        //将字符存入有序数组中
//        for (char c : a.toCharArray()) {
//            if (Character.isLetter(c)){
//                b.add(c);
//            }
//        }
//        //字符排序
//        b.sort((o1, o2) -> {
//            return Character.toLowerCase(o1)-Character.toLowerCase(o2);
//        });
//        StringBuilder result=new StringBuilder();
//        for (int i = 0,j=0; i < a.length(); i++) {
//            if (Character.isLetter(a.charAt(i))){
//                result.append(b.get(j++));
//            }else{
//                result.append(a.charAt(i));
//            }
//        }
//        return result.toString();
//    }


//    定义一个单词的“兄弟单词”为：交换该单词字母顺序，而不添加、删除、修改原有的字母就能生成的单词。
//兄弟单词要求和原来的单词不同。例如：ab和ba是兄弟单词。ab和ab则不是兄弟单词。
//现在给定你n个单词，另外再给你一个单词str，让你寻找str的兄弟单词里，字典序第k大的那个单词是什么？
//注意：字典中可能有重复单词。本题含有多组输入数据。
//输入描述:
//先输入单词的个数n，再输入n个单词。
//再输入一个单词，为待查找的单词x
//最后输入数字k
//输出描述:
//输出查找到x的兄弟单词的个数m
//然后输出查找到的按照字典顺序排序后的第k个兄弟单词，没有符合第k个的话则不用输出。
//示例1
//输入
//复制
//3 abc bca cab abc 1
//输出
//复制
//2
//bca
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            int a =scanner.nextInt();
//           String [] b=new String [a];
//            for (int i = 0; i < a; i++) {
//               b[i]=scanner.next();
//            }
//            String c=scanner.next();
//            int d=scanner.nextInt();
//            int e=0;
//            char [] g=c.toCharArray();
//            Arrays.sort(g);
//            String k="";
//            String h=String.valueOf(g);
//            for (int i = 0; i < b.length; i++) {
//                char [] f=b[i].toCharArray();
//                 Arrays.sort(f);
//                 String j=String.valueOf(f);
//                 //比较f和g先拆成字符数组在转成的字符串
//                //也可以直接使用Arrays.equals(f,g)
//                if (Arrays.equals(f,g)&&!b[i].equals(c)){
////                 if (j.equals(h)&&!b[i].equals(c)){
//                     if (i==d){
//                        k=b[i];
//                     }
//                     e++;
//                 }
//
//            }
//
//            System.out.println(e+" "+k);
//        }
//    }
//
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    while(sc.hasNext()){
//        String a=sc.next();
//        String b=sc.next();
//        char [] a1=a.toCharArray();
//        char [] b1=b.toCharArray();
//        char [] enresult=jiami(a1);
//        char [] deresult=jiemi(b1);
//        System.out.println(new String(enresult));
//        System.out.println(new String(deresult));
//
//    }}
//
//    private static char[] jiemi(char[] b1) {
//        char[] b2 = new char[b1.length];
//        for (int i = 0; i < b1.length; i++) {
//            if (b1[i] >= 'a' && b1[i] <= 'z') {
//                b2[i] = (char) (b1[i] + 'A' - 'a' -1);
//                if (b2[i] < 'A') b2[i] = 'Z';
//            } else if (b1[i] >= 'A' && b1[i] <= 'Z') {
//                b2[i] = (char) (b1[i] + 'a' - 'A' - 1);
//                if (b2[i] < 'a') b2[i] = 'z';
//            } else {
//                b2[i] = (char) (b2[i] + 1);
//                if (b2[i] < '0') b2[i] = '9';
//            }
//        }
//        return b2;
//    }
//
//    private static char[] jiami(char[] a1) {
//        char [] a2=new char[a1.length];
//        for (int i = 0; i < a1.length; i++) {
//            if (a1[i]>='a'&&a1[i]<='z'){
//                a2[i]=(char)(a1[i]+'A'-'a'+1);
//                if (a2[i]>'Z') a2[i]='A';
//            }else if (a1[i]>='A'&&a1[i]<='Z'){
//                a2[i]=(char)(a1[i]+'a'-'A'+1);
//                if (a2[i]>'z') a2[i]='a';
//            }else {
//                a2[i]=(char)(a2[i]+1);
//                if (a2[i]>'9') a2[i]='0';
//            }
//        }
//        return a2;
//    }


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String a=sc.next();
//            String b=sc.next();
//            String c=a+b;
//            char [] d=c.toCharArray();
//            List<Character> e=new ArrayList<>();
//            List<Character> f=new ArrayList<>();
//            for (int i = 0; i < d.length; i++) {
//                //偶数
//                if ((i+1)%2==0){
//                    e.add(d[i]);
//                }else{
//                    f.add(d[i]);
//                }
//            }
//            e.sort(Character::compareTo);
//            f.sort(Character::compareTo);
//            int g=Math.max(e.size(),f.size());
//            String h="";
//            for (int i = 0; i < g; i++) {
//                if (f.get(i)!=null){
//                    h+=gethex(f.get(i));
//                }
//                if (e.get(i)!=null){
//                    h+=gethex(e.get(i));
//                }
//            }
//            System.out.println(h);
//
//        }
//    }

    public static String gethex(char a){
//        char [] b=a.toCharArray();
//        for (int i = 0; i < b.length; i++) {
            String c="0123456789ABCDEF";
            if (!c.contains((a+"").toUpperCase())){
                throw new RuntimeException("包含非法字符");
            }
//        }
        //16进制转10进制
        Integer d=Integer.valueOf(a+"",16);
        //10进制转2进制
        String e=Integer.toBinaryString(d);
        StringBuilder result=new StringBuilder();
        if (e.length()%4!=0){
            for (int i = 0; i < (4 - e.length() % 4); i++) {
                result.append("0");
            }
        }
        result.append(e);
//        System.out.println(result);
        result.reverse();
//        System.out.println(result);
        int f=Integer.valueOf(result.toString(),2);
        String g=Integer.toHexString(f);
//        System.out.println(f+">>>>>>>>>>"+g);
        return g.toUpperCase();
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        if (sc.hasNext()){
//            String a=sc.nextLine();
//            int max=0;
//            for (int i = 0; i < a.length(); i++) {
//                max=getlength(a,i,i)>max?getlength(a,i,i):max;
//                max=getlength(a,i,i+1)>max?getlength(a,i,i+1):max;
//            }
//            System.out.println(max);
//        }
//    }

    public static int getlength(String a,int b,int c){
        int max=0;
        while (b>=0&&c<a.length()&&a.charAt(b)==a.charAt(c)){
            max=c-b+1;
            b--;
            c++;
        }
        return max;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNext()){
//            String a=scanner.nextLine();
//            String [] b=a.split("\\.");
//            String c="";
//            for (int i = 0; i < b.length; i++) {
//                Integer d =Integer.valueOf(b[i]);
//                String e=Integer.toBinaryString(d);
//                if (e.length()<8){
//                    String f="";
//                    for (int j = 0; j < (8 - e.length()); j++) {
//                        f+="0";
//                    }
//                    e=f+e;
//                }
//                c+=e;
//            }
//            String g=Integer.valueOf(c,2).toString();
//            System.out.println(g);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNext()){
//            String a=scanner.nextLine();
//            char [] b=a.toCharArray();
//            Arrays.sort(b);
//            for (char c : b) {
//                System.out.print(c);
//            }
//        }
//    }

// 1 3 6 10
// 2 5 9
// 4 8
// 7
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        if (sc.hasNext()){
//            int a=sc.nextInt();
//            int [][]b=new int[a][a];
//            for (int i = 0; i < a; i++) {
//                b[0][0]=1;
//                if (i>0){
//                    b[i][0]=b[i-1][0]+i;
//                }
//                for (int j = 1; j < a-i; j++) {
//                    if (i<=0){
//                        b[0][j]=b[0][j-1]+j+1;
//                    }else {
//                        if (i>j){
//                            b[i][j]=b[i-1][j]+i+1;
//                        }else{
//                            b[i][j]=b[i-1][j]+j+1;
//                        }
//                    }
//
//                }
//            }
//
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j < a-i; j++) {
//                    System.out.print(b[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }

    //ni le 加密
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (sc.hasNext()){
            String a=sc.nextLine();
            
        }
    }
}

