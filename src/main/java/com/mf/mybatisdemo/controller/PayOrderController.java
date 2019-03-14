package com.mf.mybatisdemo.controller;

import com.mf.mybatisdemo.to.PayOrderDTO;
import com.mf.mybatisdemo.vo.PayOrderQueryVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maven
 * @since 2018-11-09 15:46
 */
@RestController
@RequestMapping("payOrder")
public class PayOrderController {

    @PostMapping("/query")
    public PayOrderQueryVO queryPayOrder(PayOrderDTO payOrderDTO) {
        // 校验


        //发送请求


        //后置业务处理

        return new PayOrderQueryVO();
    }
 }