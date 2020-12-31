package com.example.test.common.lang;

import lombok.Data;

import javax.xml.rpc.ServiceException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author yd
 * @date 2020/10/27 13:52
 */
@Data
public class Result implements Serializable {


    private int code; // 200是正常，非200表示异常
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }


    public static void main(String[] args) throws ServiceException {
//        BigDecimal bigDecimal=new BigDecimal("123132.220000");
//        String a="0.00000";
//        System.out.println(bigDecimal);
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        System.out.println(decimalFormat.format(new BigDecimal(a)));
//        Integer [] integers={1,1,2,2,2,9,8,7,76,86,54,45};
//        delcom(integers);
//        add("adsd");

//        mod("0xAAAA");

//        System.out.println(Integer.valueOf("A",16));

//        System.out.println((int)((Math.random()*9+1)*100000));
//        getmod(180L);

        getfloor(1.93f);
    }

//1
    public static  void sort(String a){
        String [] b=a.split("");
        Set set = new HashSet();
        for (String s : b) {
            set.add(s);
        }

    }
//2
    public static Integer getCount(String a,String b){
            a=a.toLowerCase();
            b=b.toLowerCase();
            Integer count=0;
            String [] c=a.split("");
            for (String s : c) {
                if (s.equals(b)){
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }

        //3
    public static void delcom(Integer [] data){
        //先使用hashset去重
//        HashSet<Integer> set =new HashSet<>();
//        //遍历数组将数字插入到hashset中
//        for (Integer datum : data) {
//            set.add(datum);
//        }
        //再使用treeset排序
        Set<Integer> treeSet=new TreeSet<>();
        for (Integer datum : data) {
            treeSet.add(datum);
        }
        //使用Integer数组接收通过treeset排序得数组
        Integer[] integers=treeSet.toArray(new Integer[]{});
//
//        int [] results=new int [integers.length];
//        for (int i = 0; i < integers.length; i++) {
//            results[i]=integers[i].intValue();
//        }
        Arrays.stream(integers).forEach(System.out::println);
    }
    //未满6位加0补满 超过截6位
    public static void add(String data){
        if (data.length()<8){
            int need=8-data.length();
            StringBuffer b=new StringBuffer();
            b.append(data);
            for (int i = 0; i < need; i++) {
              b.append("0");
            }
            System.out.println(b);
        }else if (data.length()==8){
            System.out.println(data);
        }else if (data.length()>8){
            String c=data.substring(0,8);
            String d=data.substring(8);
            System.out.println(c);
            add(d);
        }
    }

    //16进制转10进制
    public static void mod(String data){
        String a =data.substring(2);
        Double c=0.0;
        for (int i = a.length()-1; i >=0 ; i--) {
            String b=a.substring(i,i+1);
            c+=Integer.valueOf(b,16)* (Math.pow(16,Double.valueOf(i)));
        }
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(c));
    }

    //取 质因数
    public static void getmod(Long num){
        for (int i = 2; i <=num; i++) {
            if (num%i==0){
                System.out.printf(i+" ");
                getmod(num/i);
                break;
            }
            if (num==i){
                System.out.printf(i+" ");
            }
        }
    }

    //浮点 向上取整
    public static void getfloor(float data){
        String a=String.valueOf(data);
        String [] b=a.split("\\.");
        System.out.println((b[1].charAt(0)-'0'));
        if (b[1].charAt(0)-'0'>=5){
            System.out.println(Integer.parseInt(b[0])+1);
        }else if (b[1].charAt(0)-'0'>=0&&b[1].charAt(0)-'0'<5){
            System.out.println(Integer.parseInt(b[0]));
        }
    }

}
