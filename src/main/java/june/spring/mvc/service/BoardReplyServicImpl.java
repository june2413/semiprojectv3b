package june.spring.mvc.service;

import june.spring.mvc.dao.BoardReplyDAO;
import june.spring.mvc.vo.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("brsrv")
public class BoardReplyServicImpl implements BoardReplyService{

    @Autowired private BoardReplyDAO brdao;

    @Override
    public List<Reply> readReply(String bdno) {
        return brdao.selectReply(bdno);
    }

    @Override
    public boolean newComment(Reply r) {
        boolean isInserted = false;
        if (brdao.insertComment(r)>0) isInserted = true;
        return isInserted;
    }

    @Override
    public boolean newReply(Reply r) { // 대댓글
        boolean isInserted = false;
        if (brdao.insertReply(r)>0) isInserted = true;
        return isInserted;
    }
}
