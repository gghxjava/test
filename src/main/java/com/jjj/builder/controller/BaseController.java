package com.jjj.builder.controller;

import com.jjj.builder.model.EnSailorDto;
import com.jjj.builder.model.Insert;
import com.jjj.builder.model.Result;
import com.jjj.builder.model.Update;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试相关
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class BaseController {

    /**
     * 水手 修改
     */
    @PostMapping("/enSailor/update")
    public Result<Boolean> update(@RequestBody @Validated(Update.class) EnSailorDto record) {
        return Result.success();
    }

    /**
     * 水手 新增
     */
    @PostMapping("/enSailor/insert")
    public Result<Boolean> insert(@RequestBody @Validated(Insert.class) EnSailorDto record) {
        return Result.success();
    }
}
