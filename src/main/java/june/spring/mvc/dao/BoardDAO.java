package june.spring.mvc.dao;

import june.spring.mvc.vo.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

    int insertBoard(Board b);
    int updateBoard(Board b);
    int deleteBoard(String bdno);

    List<Board> selectBoard(int snum);
    List<Board> findSelectBoard(Map<String, Object> param);
    Board selectOneBoard(String bdno);

    int selectcountBoard();
    int selectcountBoard(Map<String, Object> param);
    int viewCountBoard(String bdno);
}
