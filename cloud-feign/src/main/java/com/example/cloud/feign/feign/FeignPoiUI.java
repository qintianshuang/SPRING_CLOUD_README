package com.example.cloud.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/***
 * 与Ribbon具有类似功能
 * 用于外部发起的请求
 * 具有软负载均衡功能，轮询机制
 */
@FeignClient(value = "cloud-app")
public interface FeignPoiUI {

    @GetMapping("/downloadFile")
    public void downloadFile(HttpServletResponse response);
}