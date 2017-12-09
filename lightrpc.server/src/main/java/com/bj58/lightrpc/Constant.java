package com.bj58.lightrpc;

/**
 * Created by jam on 2017/12/9.
 */
public interface Constant {
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/registry";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
