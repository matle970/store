package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        GoodsService sv = new GoodsService();

        System.out.println("請輸入商品金額:");

        try(BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
            if (str !=null) {
                double input = Double.parseDouble(str);
                double res = sv.balance(input);
                System.out.println("實際支付金額:" + res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
