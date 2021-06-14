package june.spring.mvc.dao;

import june.spring.mvc.vo.Pds;

import java.util.List;
import java.util.Map;

public interface pdsDAO {

    int insertPds(Pds p);
    List<Pds> selectPds(int snum);
    int selectCountPds();

    Pds selectOnePds(String pno);
    Pds selectOneFname(String pno, String order);
    int downCountPds(Map<String, String> param);
}
