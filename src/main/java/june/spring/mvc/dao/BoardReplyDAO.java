package june.spring.mvc.dao;

import june.spring.mvc.vo.Reply;

import java.util.List;

public interface BoardReplyDAO {


    List<Reply> selectReply(String bdno);

    int insertComment(Reply r);
    int insertReply(Reply r);



}
