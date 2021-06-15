package june.spring.mvc.dao;

import june.spring.mvc.vo.Pds;

import java.util.List;
import java.util.Map;

public interface pdsDAO {

    int insertPds(Pds p);
    List<Pds> selectPds(int snum);
    int selectCountPds();

    Pds selectOnePds(String pno);
    Pds selectOneFname(Map<String, String> param);
    int downCountPds(Map<String, String> param);

    void updateRecmd(String pno);

    String selectPrvpno(String pno);
    String selectNxtpno(String pno);

    void deletePds(String pno);
}
