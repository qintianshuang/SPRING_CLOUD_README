package com.example.cloud.app.config;

import com.example.cloud.web.config.IpConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * @author LaZY(李志一)
 * @create 2019-06-08 11:30
 */
@Configuration
public class IndexConfig {

    @Autowired
    IpConfiguration configuration;

    @Value("${server.host:#{null}}")
    private String host;


    /***
     * springboot启动时打开的页面
     * @throws UnknownHostException
     */
    @EventListener({ApplicationReadyEvent.class})
    private void applicationReadyEvent() throws UnknownHostException {
        //获取本机当前的ip
//        InetAddress address = InetAddress.getLocalHost();
        String url = this.getUrl();
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /***
     * 获取当前要请求的url
     * @return
     */
    private String getUrl(){
        int port = configuration.getPort();
        String url = "cmd /c start http://" + host + ":" + port + "/swagger-ui.html";
        return url;
    }
}
