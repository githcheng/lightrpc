package com.bj58.lightrpc.serverImpl;

import com.bj58.lightrpc.annotation.RpcService;
import com.bj58.lightrpc.contract.IHelloService;

/**
 * Created by jam on 2017/12/9.
 */
@RpcService(IHelloService.class)
public class HelloServiceImpl implements IHelloService{
    @Override
    public String say(String name) {
        return "hi,"+name;
    }
}
