package com.example.test.ceti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

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
                        //若map中有sArray[i].charAt(0)
//            if(sArray[i].matches(res)){
//            map.put(sArray[i].charAt(0),map.getOrDefault(sArray[i].charAt(0), 0)+Integer.valueOf(sArray[i].substring(1)));
//            }
//            x = x - map.get('A') + map.get('D');
//            y = y - map.get('S') + map.get('W');
//            System.out.println(x+","+y);
//            map.clear();
//        }
//        scanner.close();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[] count = {0, 0, 0, 0, 0, 0, 0};  //个数数组
//
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//
//            String[] strings = str.split("~");
//            String ipStr = strings[0];  //ip
////            System.out.println(ipStr);
//            String codeStr = strings[1];  //掩码
////            System.out.println(codeStr);
//
//            String[] ipCharStr = ipStr.split("\\.");
//            //判断ip是否为空或者首字符是否等于0
//            Boolean isTrue = true;
//            int number = Integer.parseInt(ipCharStr[0]);
//            if (number == 0)
//                continue;              //为0直接跳出本次循环
//            else {
//                for (int i = 0; i < ipCharStr.length; i++) {
//                    if (ipCharStr[i].length() <= 0 || ipCharStr[i] == "") {
//                        isTrue = false;
//                    }
//                }
//            }
//
//            //如果ip地址正确判断掩码是否正确
//            if (isTrue) {
//                //判断掩码是否正确
//                int[] codeRange = {254, 252, 248, 240, 224, 192, 128, 0};
//                List<Integer> list = Arrays.stream(codeRange).boxed().collect(Collectors.toList());//int数组转化为list
//                String[] codeCharStr = codeStr.split("\\.");
//
//                //判断是否前面全为1后面全为0
//                if ("255".equals(codeCharStr[0])) {
//                    if ("255".equals(codeCharStr[1])) {
//                        if ("255".equals(codeCharStr[2])) {
//                            if ("255".equals(codeCharStr[3])) {
//                                isTrue = false;
//                            } else if (list.contains(Integer.parseInt(codeCharStr[3]))) {
//                                isTrue = true;
//                            } else
//                                isTrue = false;
//                        } else if (list.contains(Integer.parseInt(codeCharStr[2]))) {
//                            if (Integer.parseInt(codeCharStr[3]) == 0)
//                                isTrue = true;
//                            else
//                                isTrue = false;
//                        } else
//                            isTrue = false;
//                    } else if (list.contains(Integer.parseInt(codeCharStr[1]))) {
//                        if (Integer.parseInt(codeCharStr[2]) == 0 && Integer.parseInt(codeCharStr[3]) == 0)
//                            isTrue = true;
//                        else
//                            isTrue = false;
//                    } else
//                        isTrue = false;
//                } else if (list.contains(Integer.parseInt(codeCharStr[0]))) {
//                    if (Integer.parseInt(codeCharStr[0]) == 0) {
//                        isTrue = false;
//                    } else {
//                        if (Integer.parseInt(codeCharStr[1]) == 0 && Integer.parseInt(codeCharStr[2]) == 0 && Integer.parseInt(codeCharStr[3]) == 0)
//                            isTrue = true;
//                        else
//                            isTrue = false;
//                    }
//
//                } else
//                    isTrue = false;
//            }
//
//            //调用方法判断地址范围和私网ip
//            if (isTrue) {
//                int first = Integer.parseInt(ipCharStr[0]);
//                int second = Integer.parseInt(ipCharStr[1]);
//                count = judgeIp(first, second, count);
//            } else {
//                count[5]++;
//            }
//        }
//
//        System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3] + " " + count[4] + " " + count[5] + " " + count[6]);
//    }
//
//
//    //判断地址范围和私网ip
//    public static int[] judgeIp(int first, int second, int[] count) {
//        //判断地址范围
//        if (first >= 1 && first <= 126)
//            count[0]++;
//        else if (first >= 128 && first <= 191)
//            count[1]++;
//        else if (first >= 192 && first <= 223)
//            count[2]++;
//        else if (first >= 224 && first <= 239)
//            count[3]++;
//        else if (first >= 240 && first <= 255)
//            count[4]++;
//
//        //判断私网ip
//        if (first == 192 && second == 168)
//            count[6]++;
//        if (first == 10)
//            count[6]++;
//        if (first == 172) {
//            if (second >= 16 && second <= 31)
//                count[6]++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
//        Map<String,Integer> m=new LinkedHashMap<String,Integer>();
//        String tstr=null;
//        while((tstr = cin.readLine()) != null && !tstr.equals("")){      //&& !tstr.equals(""))没有性能影响
//            //相当于split(" ") \s+表示匹配空字符串 但是优势处是不会有空字符串在数组内
//            String[] str=tstr.split("\\s+");
//            String fname=str[0].substring(str[0].lastIndexOf("\\")+1);
//            //math.max(a,b) 表示a大就选择a不然选择b
//            //若fname 大于16就截取后16位字符串  不然就取全部
//            fname=fname.substring(Math.max(fname.length()-16 ,0))+" "+str[1];  //max 最快推荐 ？：也可以 if太麻烦
//            Integer tmp=m.get(fname);  //get==null较快写法
//            if(tmp==null)
//                m.put(fname,1);
//            else
//                m.put(fname, tmp+1);
//        }
//        int cnt=0;
//        //entrySet()表示获取键值的映射关系 之后就可以使用getkey  getvalue
//        for(Map.Entry<String,Integer> it:m.entrySet()){
//            //若linkedhashmap的键值对大于8 就取后8对
//            if(m.size()-cnt<=8)
//                System.out.println(it.getKey()+" "+it.getValue());
//            cnt++;
//        }
//
//    }
//
    //错误记录
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map=new LinkedHashMap<>();
        String str=null;
        while ((str=bf.readLine())!=null&&!str.equals("")){
            String [] fnames=str.split("\\s+");
            String fname=fnames[0].substring(fnames[0].lastIndexOf("\\")+1);
            fname=fname.substring(Math.max(fname.length()-16,0))+" "+fnames[1];
            Integer tmp= map.get(fname);
            if (tmp==null)
                map.put(fname,1);
            else
                map.put(fname,tmp+1);
        }
        int count =0;
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (map.size()-count<=8)
                System.out.println(s.getKey()+" "+s.getValue());
            count++;
        }
    }

//    public static void main(String[] arg) throws IOException {
//        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
//        Stack<String> stack=new Stack<>();
//        HashMap<String,Integer> map=new HashMap<>();
//        String s=null;
//        while((s = cin.readLine()) != null && !s.equals("")){
//            String[] arr=s.split("\\\\");
//            String line=arr[arr.length-1];
//            String l=line.split(" ")[0];
//            String ll=line.split(" ")[1];
//            l=l.length()>16?l.substring(l.length()-16):l;
//            line=l+" "+ll;
//            if(stack.contains(line)){
//                map.put(line,map.get(line)+1);
//            }else{
//                stack.push(line);
//                map.put(line,1);
//            }
//        }
//        Stack<String> stack1=new Stack<>();
//        int i=0;
//        while(!stack.isEmpty()){
//            if(i==8){
//                break;
//            }
//            stack1.push(stack.peek()+" "+map.get(stack.pop()));
//            i++;
//        }
//        while(!stack1.isEmpty()){
//            System.out.println(stack1.pop());
//        }
//    }

//
//    public static void main(String[] args) throws IOException {
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(is);
//        String str = br.readLine();
//        Queue<String> queue = new LinkedList<>();
//        HashMap<String,Integer> map = new HashMap<>();
//        while(str != null) {
//            String[] strs = str.split("\\\\");
//            String info = strs[strs.length - 1];
//            if (map.containsKey(info)) {
//                map.put(info, map.get(info) + 1);
//            } else {
//                map.put(info, 1);
//                queue.add(info);
//            }
//            if(queue.size() > 8){
//                String temp = queue.poll();
//                map.put(temp,0);
//            }
//            str = br.readLine();
//        }
//        while(!queue.isEmpty()){
//            String temp = queue.poll();
//            System.out.println(process(temp)+ " " + map.get(temp));
//        }
//    }
//
//    private static String process(String str){
//        String[] strs = str.split(" ");
//        int len1 = strs[0].length();
//        if(len1 <= 16)
//            return str;
//        else{
//            return strs[0].substring(len1 - 16, len1) + " " +strs[1];
//        }
//    }

}
