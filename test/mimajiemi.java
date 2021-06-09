package com.example.test.ceti;

/**
 * @author yd
 * @date 2021/1/6 14:33
 */
public class mimajiemi {
      //密码解密
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        char [] a=str.toCharArray();
//        String b=new String();
//        for (char c : a) {
//            if (c>='A'&&c<='Z'){
//              b+=(char)(c+33);
//            }
//            if (c>='a'&&c<='c'){
//                b+=2;
//            }
//            if (c>='d'&&c<='f'){
//                b+=3;
//            }
//            if (c>='g'&&c<='i'){
//                b+=4;
//            }
//            if (c>='j'&&c<='l'){
//                b+=5;
//            }
//            if (c>='m'&&c<='o'){
//                b+=6;
//            }
//            if (c>='p'&&c<='s'){
//                b+=7;
//            }
//            if (c>='t'&&c<='v'){
//                b+=8;
//            }
//            if (c>='w'&&c<='z'){
//                b+=9;
//            }
//            if (c>='0'&&c<='9'){
//                b+=(char)c;
//            }
//        }
//        System.out.println(b);
//        sc.close();
//    }

//    //汽水瓶
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            int a=sc.nextInt();
//            if (a==0){
//                break;
//            }
//            System.out.println(getcount(a));
//        }
//    }
//    public static int getcount(int a){
//        if (a>=3){
//           a=a-3+1;
//           return 1+getcount(a);
//        }else if(a==2){
//            a=a-1;
//            return 1+getcount(a);
//        }else {
//            return 0;
//        }
//    }
        //去掉个数最少的字符串
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            Map<Character,Integer> map=new HashMap<>();
//            String a =sc.nextLine();
//            char [] b=a.toCharArray();
//            for (char c : b) {
//               map.put(c,map.getOrDefault(c,0)+1);
//            }
//            int min=Integer.MAX_VALUE;
//            for (Integer value : map.values()) {
//                min=value<min?value:min;
//            }
//            StringBuilder sb=new StringBuilder();
//            for (int i = 0; i < a.length(); i++) {
//                if (map.get(a.charAt(i))!=min){
//                    sb.append(a.charAt(i));
//                }
//            }
//            System.out.println(sb);
//        }
//        sc.close();
//    }



}
