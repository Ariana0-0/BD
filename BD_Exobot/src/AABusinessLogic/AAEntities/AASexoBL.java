package AABusinessLogic.AAEntities;

import java.util.List;

import AADataAccess.AASexoDAO;
import AADataAccess.AADTO.AASexoDTO;

public class AASexoBL {
    private AASexoDTO AAsexo;
    private AASexoDAO sDAO = new AASexoDAO();
    
    public AASexoBL() {}
    public List<AASexoDTO> getAll() throws Exception {
        List<AASexoDTO> lst = sDAO.readAll();
        for (AASexoDTO s : lst) {
            s.setAAnombre(s.getAAnombre().toUpperCase());
        }
        return lst;
    }

    public AASexoDTO getByIdSexo(int AAidSexo) throws Exception {
        AAsexo = sDAO.readById(AAidSexo);
        return AAsexo;
    }

    public boolean create(AASexoDTO AAsexoDTO)  throws Exception {
        return sDAO.create(AAsexoDTO);
    }

    public boolean update(AASexoDTO AAsexoDTO)  throws Exception {
        return sDAO.update(AAsexoDTO);
    }

    public boolean delete(int AAidSexo)  throws Exception {
        return sDAO.delete(AAidSexo);
    }

    public Integer getRowCount() throws Exception {
        return sDAO.getRowCount();
    }
}
