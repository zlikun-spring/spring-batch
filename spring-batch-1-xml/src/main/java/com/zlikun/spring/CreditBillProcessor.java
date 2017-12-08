package com.zlikun.spring;

import com.zlikun.spring.domain.CreditBill;
import org.springframework.batch.item.ItemProcessor;

/**
 * 批处理操作实现类
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017-12-08 17:18
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {

    @Override
    public CreditBill process(CreditBill creditBill) throws Exception {
        System.err.println(creditBill.toString());
        // XXX 假设作业的目的是为了将金额增加1000
        creditBill.setAmount(creditBill.getAmount() + 1000);
        return creditBill;
    }
}
