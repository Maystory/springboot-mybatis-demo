package com.mf.mybatisdemo.to;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Maven
 * @since 2018-11-09 15:55
 */
@Data
@AllArgsConstructor
public class PayOrderDTO {

    private String merchantId;
    private String outTradeNo;

}