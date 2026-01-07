package AABusinessLogic.AAEntities;

import java.util.List;


import AADataAccess.AAPersonaTipoDAO;
import AADataAccess.AADTO.AAPersonaTipoDTO;


public class AAPersonaTipoBL {

    private AAPersonaTipoDTO AApersonaTipo;
    private AAPersonaTipoDAO AApersonaTipoDAO = new AAPersonaTipoDAO();
    
    public AAPersonaTipoBL() {}

    public List<AAPersonaTipoDTO> getAll() throws Exception {
        return AApersonaTipoDAO.readAll();
    }

    public AAPersonaTipoDTO getByIdPersonaTipo(int AAid) throws Exception {
        AApersonaTipo = AApersonaTipoDAO.readById(AAid);
        return AApersonaTipo;
    }

    public boolean create(AAPersonaTipoDTO regDTO)  throws Exception {
        return AApersonaTipoDAO.create(regDTO);
    }

    public boolean update(AAPersonaTipoDTO regDTO)  throws Exception {
        return AApersonaTipoDAO.update(regDTO);
    }

    public boolean delete(int AAid)  throws Exception {
        return AApersonaTipoDAO.delete(AAid);
    }

    public Integer getRowCount() throws Exception {
        return AApersonaTipoDAO.getRowCount();
    }

}
