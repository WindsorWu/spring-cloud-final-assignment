package org.zdd.bookstore.pay;

import java.util.Map;

/**
 * Author: Darryl
 * Desc:
 * File created at 2020-6-3
 */
public interface WeixinPayService {
    /**
     * 生成微信支付二维码
     * @param outTradeNo 订单交易号
     * @param totalFee 金额(分)
     * @return Map集合
     */
    Map<String, String> genPayCode(PayContext payContext);
}
