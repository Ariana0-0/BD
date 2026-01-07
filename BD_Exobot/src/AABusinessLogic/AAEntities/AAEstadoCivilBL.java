package AABusinessLogic.AAEntities;

import java.util.List;

import AADataAccess.AAEstadoCivilDAO;
import AADataAccess.AADTO.AAEstadoCivilDTO;


public class AAEstadoCivilBL {

    private AAEstadoCivilDTO AAestadoCivil;
    private AAEstadoCivilDAO AAecDAO = new AAEstadoCivilDAO();
    
    public AAEstadoCivilBL() {}

    public List<AAEstadoCivilDTO> getAll() throws Exception {
        List<AAEstadoCivilDTO> lst = AAecDAO.readAll();
        for (AAEstadoCivilDTO ec : lst) {
            ec.setAAnombre(ec.getAAnombre().toUpperCase());
        }
        return lst;
    }

    public AAEstadoCivilDTO getByIdEstadoCivil(int AAid) throws Exception {
        AAestadoCivil = AAecDAO.readById(AAid);
        return AAestadoCivil;
    }

    public boolean create(AAEstadoCivilDTO regDTO)  throws Exception {
        return AAecDAO.create(regDTO);
    }

    public boolean update(AAEstadoCivilDTO regDTO)  throws Exception {
        return AAecDAO.update(regDTO);
    }

    public boolean delete(int AAid)  throws Exception {
        return AAecDAO.delete(AAid);
    }

    public Integer getRowCount() throws Exception {
        return AAecDAO.getRowCount();
    }

}
