package june.spring.mvc.dao;

import june.spring.mvc.vo.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

    boolean insertBoard(Board b);
    boolean updateBoard(Board b);
    boolean deleteBoard(String bdno);

    List<Board> selectBoard(int snum);
    List<Board> findSelectBoard(Map<String, Object> param);
    Board selectOneBoard(String bdno);

    int selectcountBoard();
    int selectcountBoard(Map<String, Object> param);
    boolean viewCountBoard(String bdno);
}
