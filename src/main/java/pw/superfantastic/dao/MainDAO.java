package pw.superfantastic.dao;

import org.springframework.stereotype.Repository;
import pw.superfantastic.common.AbstractDAO;

import java.util.HashMap;
import java.util.List;

@Repository("mainDAO")
public class MainDAO extends AbstractDAO {

    public List<HashMap<String, Object>> selectTboard() {
        return  select("main.tboard", null);
    }
}
