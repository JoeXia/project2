package com.example.project2.controller.common;

import org.springframework.stereotype.Controller;

public class CommonController {
    /**
     * @desc 404页面
     * @return
     */

    public String notFoundPage() {
        return "common/404";
    }


    public String notPerms() {
        return "common/401";
    }



    public String errPage() {
        return "common/500";
    }
}
