package cn.com.zlo.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (C), 2023
 * FileName: NoteRemarkEntity
 * Author: ZL
 * Date: 2023/1/3 16:28:33
 * Description:
 */
@Data
@Builder
@TableName("note_remark")
public class NoteRemarkEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 键
     */
    private String noteKey;
    /**
     * 值
     */
    private String noteValue;
    /**
     * 状态
     */
    private Integer state;
    /**
     *
     */
    private String shortcut;
    /**
     *
     */
    private Date createTime;
    /**
     *
     */
    private Date updateTime;
}
