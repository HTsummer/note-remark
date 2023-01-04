package cn.com.zlo.service;

import cn.com.zlo.repository.entity.NoteRemarkEntity;
import cn.com.zlo.repository.vo.NoteAddRequest;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * 
 *
 * @author zlo
 * @email 285270214@qq.com
 * @date 2023-01-03 16:26:33
 */
@Service
public interface NoteRemarkService extends IService<NoteRemarkEntity> {

    void setNote(NoteAddRequest request);

    String getNote(String noteKey);


}

