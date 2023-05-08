package cn.com.zlo.cms.controller;

import cn.com.zlo.repository.vo.NoteAddRequest;
import cn.com.zlo.service.NoteRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright (C), 2023
 * FileName: NoteRemarkController
 * Author: ZL
 * Date: 2023/1/3 17:25:37
 * Description:
 */
@RestController
@RequestMapping("/noteRemark")
public class NoteRemarkController {
    @Autowired
    private NoteRemarkService noteRemarkService;

    @GetMapping("/hello")
    public String getHello(){
        return "START";
    }

    @PostMapping("/setNote")
    public void setNote(@RequestBody NoteAddRequest request){
        noteRemarkService.setNote(request);
    }
}
