import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cjam.lightrpc.RpcProxy;
import com.cjam.lightrpc.contract.IHelloService;

/**
 * Created by jam on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring.xml")
public class HelloServiceTest {

    @Autowired
    private RpcProxy rpcProxy;

    @Test
    public void helloTest() {
        IHelloService helloService = rpcProxy.create(IHelloService.class);
        String result = helloService.say("jam");
        System.out.printf("===:%s\n",result);
        Assert.assertEquals("hi,jam", result);
    }
}
