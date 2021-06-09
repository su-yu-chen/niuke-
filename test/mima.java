package com.example.test.ceti;

/**
 * @author yd
 * @date 2021/1/5 17:17
 */
public class mima {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String str = sc.nextLine();
//            int[] judge = new int[3];
//            int len = str.length();
//            //1.长度超过8位
//            if(len > 8){
//                judge[0] = 1;
//            }
//            //2.包括大小写字母.数字.其它符号,以上四种至少三种
//            int[] judgeChar = new int[4];
//            int count = 0;
//            for(int i = 0; i < len; i++){
//                char c = str.charAt(i);
//                if(c >= 'a' && c <= 'z'){
//                    if(judgeChar[0] > 0){
//
//                    }else{
//                        judgeChar[0]++;
//                        count++;
//                    }
//                }else if(c >= 'A' && c <= 'Z'){
//                    if(judgeChar[1] > 0){
//
//                    }else{
//                        judgeChar[1]++;
//                        count++;
//                    }
//                }else if(c >= '0' && c <= '9'){
//                    if(judgeChar[2] > 0){
//
//                    }else{
//                        judgeChar[2]++;
//                        count++;
//                    }
//                }else{
//                    if(judgeChar[3] > 0){
//
//                    }else{
//                        judgeChar[3]++;
//                        count++;
//                    }
//                }
//            }
//            if(count >= 3){
//                judge[1] = 1;
//            }
//            //3.不能有相同长度大于2的子串重复
//            String subStr = new String();
//            int flag = 0;
//            for(int i = 0; i < len - 4; i++){
//                subStr = str.substring(i,i + 3);
//                if(str.substring(i + 1).contains(subStr)){
//                    flag = 1;
//                }
//            }
//            if(flag == 0){
//                judge[2] = 1;
//            }
//
//            if(judge[0] == 1 && judge[1] == 1 && judge[2] == 1){
//                System.out.println("OK");
//            }else{
//                System.out.println("NG");
//            }
//        }
//        sc.close();
//    }
//
//
//
//    public static void main(String[] arg){
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String str=sc.next();
//            if(str.length()<=8){
//                System.out.println("NG");
//                continue;
//            }
//
//            if(getMatch(str)){
//                System.out.println("NG");
//                continue;
//            }
//
//            if(getString(str,0,3)){
//                System.out.println("NG");
//                continue;
//            }
//            System.out.println("OK");
//        }
//    }
//    private static boolean getString(String str,int l,int r) {
//        if (r>=str.length()) {
//            return false;
//        }
//        if (str.substring(r).contains(str.substring(l, r))) {
//            return true;
//        } else {
//            return getString(str,l+1,r+1);
//        }
//    }
//
//    private static boolean getMatch(String str){
//        int count=0;
//        Pattern p1 = Pattern.compile("[A-Z]");
//        if(p1.matcher(str).find()){
//            count++;
//        }
//        Pattern p2 = Pattern.compile("[a-z]");
//        if(p2.matcher(str).find()){
//            count++;
//        }
//        Pattern p3 = Pattern.compile("[0-9]");
//        if(p3.matcher(str).find()){
//            count++;
//        }
//        Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
//        if(p4.matcher(str).find()){
//            count++;
//        }
//        if(count>=3){
//            return false;
//        }else{
//            return true;
//        }
//    }


//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String str=sc.next();
//            if(str.length()<=8){
//                System.out.println("NG");
//                continue;
//            }
//            if (getMatch(str,0,3)){
//                System.out.println("NG");
//                continue;
//            }
//            if (getc(str)) {
//                System.out.println("NG");
//                continue;
//            }
//            System.out.println("OK");
//        }
//    }
//
//    public static boolean getMatch(String str,Integer l,Integer r){
//        if (r>=str.length()){
//            return false;
//        }
//        if (str.substring(r).contains(str.substring(l,r))){
//            return true;
//        }else {
//            return getMatch(str,l+1,r+1);
//        }
//    }
//
//    public static boolean getc(String str){
//        int count=0;
//        Pattern p1=Pattern.compile("[a-z]");
//        if (p1.matcher(str).find()){
//            count++;
//        }
//        Pattern p2=Pattern.compile("[A-Z]");
//        if (p2.matcher(str).find()){
//            count++;
//        }
//        Pattern p3=Pattern.compile("[0-9]");
//        if (p3.matcher(str).find()){
//            count++;
//        }
//        Pattern p4=Pattern.compile("[^a-zA-Z0-9]");
//        if (p4.matcher(str).find()){
//            count++;
//        }
//        if (count>=3){
//            return false;
//        }else {
//            return true;
//        }
//    }
}
