package com.example.test.ceti;

/**
 * @author yd
 * @date 2020/12/25 15:26
 */
public class huawei {
    //还有com.example.test.common.lang下面得

    //坐标移动
//    public static String a="0,0";
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String de=sc.nextLine();
//        String [] des=de.split(";");
//        for (String s : des) {
//            weiyi(s);
//        }
//    }
//
//    public static void weiyi(String b){
//        String d="";
//        String l="";
//        if (b.length()==3){
//            d=String.valueOf(b.charAt(0));
//            if (b.charAt(1)-'0'>=0&&b.charAt(1)-'0'<=9&&b.charAt(2)-'0'>=0&&b.charAt(2)-'0'<=9){
//                l=(b.charAt(1)-'0'+"")+(b.charAt(2)-'0');
//            }else {
//                return;
//            }
//            System.out.println("d:"+d);
//            System.out.println("l:"+l);
//        }
//
//        if(d.equals("W")){
//            String []c=a.split(",");
//            int e=Integer.valueOf(c[1]);
//            a=c[0]+","+(e+Integer.valueOf(l));
//            System.out.println(a);
//        }else if (d.equals("A")){
//            String []c=a.split(",");
//            int e=Integer.valueOf(c[0]);
//            a=(e-Integer.valueOf(l))+","+c[1];
//            System.out.println(a);
//        }else if (d.equals("S")){
//            String []c=a.split(",");
//            int e=Integer.valueOf(c[1]);
//            a=c[0]+","+(e-Integer.valueOf(l));
//            System.out.println(a);
//        }else if (d.equals("D")){
//            String []c=a.split(",");
//            int e=Integer.valueOf(c[0]);
//            a=(e+Integer.valueOf(l))+","+c[1];
//            System.out.println(a);
//        }
//
//    }
    //坐标移动  大佬答案
    //Map.getOrDefault(Object key, V defaultValue)方法的作用是：
    //当Map集合中有这个key时，就使用这个key值；
    //如果没有就使用默认值defaultValue。
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        while(scanner.hasNext()) {
//            String s = scanner.nextLine();
//            int x = 0 , y = 0;
//            String[] sArray = s.split(";");
//            String res = "[ADWS]\\d{1}\\d?";
//            for(int i = 0;i < sArray.length;i ++) {
//                if(sArray[i].matches(res))
//                    map.put(sArray[i].charAt(0),map.getOrDefault(sArray[i].charAt(0), 0)+Integer.valueOf(sArray[i].substring(1)));
//            }
//            x = x - map.get('A') + map.get('D');
//            y = y - map.get('S') + map.get('W');
//            System.out.println(x+","+y);
//            map.clear();
//        }
//        scanner.close();
//    }

}
