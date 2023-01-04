package cn.com.zlo.repository.vo;

import lombok.Data;

/**
 * Copyright (C), 2023, 北京合商云汇科技有限公司
 * FileName: NoteAddRequest
 * Author: ZL
 * Date: 2023/1/4 14:44:34
 * Description:
 */
@Data
public class NoteAddRequest {
    private String noteKey;

    private String noteValue;

    private String shortcut;
}
