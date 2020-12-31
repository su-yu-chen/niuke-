package com.example.test.common.lang;

/**
 * @author yd
 * @date 2020/12/11 15:36
 */
public class Hw {
    //合并列表
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int next=sc.nextInt();
//            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//            for (int i = 0; i < next; i++) {
//                int key=sc.nextInt();
//                int value=sc.nextInt();
//                if (treeMap.containsKey(key)){
//                    treeMap.put(key,value+treeMap.get(key));
//                }else {
//                    treeMap.put(key,value);
//                }
//            }
//
//            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
//                System.out.println(entry.getKey()+" "+entry.getValue());
//            }
//        }
//    }

//
//    //将字符串从右往左输出无重复得新组合成得字符串
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Integer a=scanner.nextInt();
//        char [] b=(a+"").toCharArray();
//        String c="";
//        for (int i = b.length - 1; i >= 0; i--) {
//            if (!c.contains(b[i]+"")){
//                c+=b[i];
//            }
//        }
//        System.out.println(Integer.valueOf(c));
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a =sc.nextLine();
//        char []b=a.toCharArray();
//        Integer count=0;
//        String c="";
//        for (int i = b.length - 1; i >= 0; i--) {
//            if (!c.contains(b[i]+"")){
//                count++;
//                c+=b[i];
//            }
//        }
//        System.out.println(count);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a=scanner.nextInt();
//        char b[] =String.valueOf(a).toCharArray();
//        String c="";
//        for (int i = b.length - 1; i >= 0; i--) {
//            c+=b[i];
//        }
//        System.out.println(c);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        char [] b=a.toCharArray();
//        String c="";
//        for (int i = b.length - 1; i >= 0; i--) {
//            c+=b[i];
//        }
//        System.out.println(c);
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a=scanner.nextLine();
//        String [] b=a.split(" ");
//        String c="";
//        for (int i = b.length - 1; i >= 0; i--) {
//            c+=b[i]+" ";
//        }
//        System.out.println(c);
//    }

    //按字符串得首字母排序
    //如果不加 while (sc.hasNext())
    // 和使用sc.nextLine 会出现输入不到9个字符串就直接结束
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
////        while (sc.hasNext()) {
//            int a = sc.nextInt();
//            String[] c = new String[a];
//            for (int i = 0; i <a; i++) {
//                String b = sc.next();
//                c[i] = b;
//            }
//            Arrays.sort(c);
//            for (int i = 0; i < c.length; i++) {
//                System.out.println(c[i]);
//            }
////        }
//        sc.close();
//    }

//    //输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            Map<Character, Integer> map=new HashMap<>();
//            int a = scanner.nextInt();
//            String b = Integer.toBinaryString(a);
//            char[] c = b.toCharArray();
//            for (char c1 : c) {
//                if (map.containsKey(c1)) {
//                    map.put(c1,map.get(c1)+1);
//                }else {
//                    map.put(c1,1);
//                }
//
//            }
//            System.out.println(map.get('1'));
//        }
//        scanner.close();
//    }

//    public static void main(String[] args) {
//        int [] a={1,3};
//        ch(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//    }
//    public static void ch(int [] a){
//        a[0]=3;
//        a[1]=1;
//    }



//        public static void main(String[] args) {
//            LaoWang wang = new XiaoWang();
//        }
}
//
//class LaoWang{
//    public LaoWang() {
//        write();
//        read();
//    }
//    public void write() {
//        System.out.println("老王写了一本《基督山伯爵》");
//    }
//
//    private void read() {
//        System.out.println("老王在读《哈姆雷特》");
//    }
//}
//class XiaoWang extends LaoWang {
//    @Override
//    public void write() {
//        System.out.println("小王写了一本《茶花女》");
//    }
//
//    private void read() {
//        System.out.println("小王在读《威尼斯商人》");
//    }
//}