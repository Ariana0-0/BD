package AADataAccess;

import java.util.List;

public interface AAIDAO<T> {

    public boolean create (T AAentity)    throws Exception;
    public List<T> readAll()            throws Exception;
    public boolean update(T AAentity)     throws Exception;
    public boolean delete(int AAid)   throws Exception;
    
    public T readById(Integer AAid)       throws Exception;
    //public Integer getMaxRow()        throws Exception;
}
