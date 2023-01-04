package com.cmbc.web.controller.system;


import com.cmbc.common.core.domain.R;
import com.cmbc.common.core.domain.model.LoginBody;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Validated
@RequiredArgsConstructor
@RestController
public class SysLoginController {

    @PostMapping("/login")
    public R<Map<String, Object>> login(@Validated @RequestBody LoginBody loginBody){
        Map<String, Object> ajax = new HashMap<>();
        return R.ok();
    }
}
