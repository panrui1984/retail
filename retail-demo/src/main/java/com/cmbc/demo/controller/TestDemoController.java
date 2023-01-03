package com.cmbc.demo.controller;

import com.cmbc.common.core.controller.BaseController;
import com.cmbc.common.core.domain.R;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/demo/demo")
public class TestDemoController extends BaseController {

    /**
     * 获取测试单表详细信息
     *
     * @param id 测试ID
     */
    @GetMapping("/{id}")
    public R<Void> getInfo(@PathVariable("id") Long id) {
        return R.ok();
    }

}
