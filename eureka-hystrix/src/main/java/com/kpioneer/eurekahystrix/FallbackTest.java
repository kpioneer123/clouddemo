package com.kpioneer.eurekahystrix;

import com.kpioneer.eurekahystrix.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author xionghu
 * @date 2020/5/1 17:37
 * @desc
 */
//从@HystrixCommand(fallbackMethod）中的回调方法转换成回调类
@Component
public class FallbackTest implements StudentService {

    /**
     * 获取所有学生列表
     *
     * @return
     */
    @Override
    public String getAllStudent() {
        return null;
    }

    @Override
    public String getMessage(String name) {
        return "fallback";
    }
}
