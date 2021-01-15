package com;

public class GoodsService2 {

    /**
     * 結算商品金額
     *
     * @param input 購買商品金額
     * @return 實際支付金額
     */
    double balance(double input) {

        if (input <= 100) {//商品金額不超過100元	1	不打折
            return input;
        } else if (input > 100 && input <= 1000) {//商品金額在大於100元，但不超過至1000元之間	0.9	　
            return input * 0.9;
        } else if (input > 1000 && input <= 5000) { //商品金額在大於1000元，但不超過至5000元之間	0.8
            return input * 0.8;
        } else { //商品金額超過5000元	0.7	　
            return input * 0.7;
        }

    }

}
