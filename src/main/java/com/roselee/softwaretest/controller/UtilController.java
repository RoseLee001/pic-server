package com.roselee.softwaretest.controller;

import com.roselee.softwaretest.utils.ArrayUtil;
import com.roselee.softwaretest.utils.Calculator;
import com.roselee.softwaretest.utils.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RoseLee
 * @date 2025/7/25 17:35
 */
@RestController
public class UtilController {

    @GetMapping("/max")
    public int findMax(){
        return ArrayUtil.findMax(new int[]{1,2,3,4,56,6,7});
    }
    @GetMapping("/sort")
    public int[] sortArray(){
        return ArrayUtil.sort(new int[]{1,2,3,4,56,6,7});
    }

    @GetMapping("/fib")
    public int fibArray(){
        return Calculator.fib(25);
    }
    @GetMapping("/fanzhuan")
    public String reverse(){
        return StringUtil.reverse("软件测试综合实验");
    }
}
