package cn.com.zlo.service.impl;

import cn.com.zlo.common.enums.StateEnum;
import cn.com.zlo.repository.entity.NoteRemarkEntity;
import cn.com.zlo.repository.mapper.NoteRemarkMapper;
import cn.com.zlo.repository.vo.NoteAddRequest;
import cn.com.zlo.service.NoteRemarkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("noteRemarkService")
public class NoteRemarkServiceImpl extends ServiceImpl<NoteRemarkMapper, NoteRemarkEntity> implements NoteRemarkService {
    @Autowired
    private NoteRemarkMapper noteRemarkMapper;

    @Override
    public void setNote(NoteAddRequest request) {
        NoteRemarkEntity note = NoteRemarkEntity.builder()
                .noteKey(request.getNoteKey())
                .noteValue(request.getNoteValue())
                .shortcut(request.getShortcut())
                .state(StateEnum.ENABLE.getValue())
                .build();
        noteRemarkMapper.insert(note);
    }

    @Override
    public String getNote(String noteKey) {
        return null;
    }
}