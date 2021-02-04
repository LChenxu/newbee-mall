package com.chen.newbeemallchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lichenxu
 * @version V1.0
 * @Package com.chen.newbeemallchen.controller
 * @date 2021/2/4 14:31
 * @example:
 * @Description:
 */
@Controller
public class IdeaController {
    @GetMapping("/info")
    @ResponseBody
    public String getInfoFromIdea(){
        return "this is a spring boot project from idea";
    }
}
