package pw.superfantastic.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class AbstractDAO {

    @Autowired
    private SqlSessionTemplate session;

    public List<HashMap<String, Object>> select(String val1, Object val2) {
        return session.selectList(val1, val2);
    }
}
