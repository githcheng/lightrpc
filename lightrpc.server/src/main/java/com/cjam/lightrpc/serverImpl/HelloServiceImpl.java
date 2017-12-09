package com.cjam.lightrpc.serverImpl;

import com.cjam.lightrpc.annotation.RpcService;
import com.cjam.lightrpc.contract.IHelloService;

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
