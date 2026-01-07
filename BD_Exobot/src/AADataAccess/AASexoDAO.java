package AADataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import AADataAccess.AADTO.AADataHelperSQLite;
import AADataAccess.AADTO.AASexoDTO;
import AAFramework.AAException;

public class AASexoDAO extends AADataHelperSQLite implements AAIDAO<AASexoDTO> {

    @Override
    public boolean create(AASexoDTO AAentity) throws Exception {
        //2,             'Masculino',     'tipos de sexualida'
        String query = "INSERT INTO Catalogo (IdCatalogoTipo, Nombre, Descripcion) VALUES (?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 2);
            pstmt.setString(2, AAentity.getAAnombre());
            pstmt.setString(3, AAentity.getAAdescripcion());
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new AAException(e.getMessage(), getClass().getName(), "create");
        }
    }

    @Override
    public List<AASexoDTO> readAll() throws Exception {
        List<AASexoDTO> lst = new ArrayList<>();
        String query = "SELECT IdCatalogo "
                    + ",IdCatalogoTipo "
                    + ",Nombre "
                    + ",Descripcion "
                    + ",Estado "
                    + ",FechaCreacion "
                    + ",FechaModifica "
                    + "FROM Catalogo "
                    + "WHERE Estado ='A' "
                    + "AND IdCatalogoTipo = 2"; // tipos de sexualidad

        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD : select * ...
            ResultSet rs = stmt.executeQuery(query); // ejecutar la
            while (rs.next()) {
                AASexoDTO s = new AASexoDTO(rs.getInt(1) // IdCatalogo
                                        ,rs.getInt(2) // IdCatalogoTipo
                                        ,rs.getString(3) // Nombre
                                        ,rs.getString(4) // Descripcion
                                        ,rs.getString(5) // Estado
                                        ,rs.getString(6) // FechaCrea
                                        ,rs.getString(7)); // FechaModifica
                lst.add(s);
            }
        } catch (SQLException AAe) {
            throw new AAException(AAe.getMessage(), getClass().getName(), "readALL()");
        }
        return lst;
    }

    @Override
    public boolean update(AASexoDTO AAentity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Catalogo SET Nombre = ?, Descripcion = ?, FechaModifica = ? WHERE IdCatalogo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, AAentity.getAAnombre());
            pstmt.setString(2, AAentity.getAAdescripcion());
            pstmt.setString(3, dtf.format(now).toString());
            pstmt.setInt(4, AAentity.getAAidCatalogo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException AAe) {
            throw new AAException(AAe.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(int AAid) throws Exception {
        String query = "UPDATE Catalogo SET Estado = ? WHERE IdCatalogo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "x");
            pstmt.setInt(2, AAid);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException AAe) {
            throw new AAException(AAe.getMessage(), getClass().getName(), "delete()");
        }
    }
    
    @Override
    public AASexoDTO readById(Integer AAid) throws Exception {
        AASexoDTO s = null;
        String query = "SELECT IdCatalogo "
                    + ",IdCatalogoTipo "
                    + ",Nombre "
                    + ",Descripcion "
                    + ",Estado "
                    + ",FechaCreacion "
                    + ",FechaModifica "
                    + "FROM Catalogo "
                    + "WHERE Estado ='A' "
                    + "AND IdCatalogoTipo = 2 "
                    + "AND IdCatalogo = ?"; // tipos de sexualidad

        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, AAid);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                s = new AASexoDTO(rs.getInt(1) // IdCatalogo
                                        ,rs.getInt(2) // IdCatalogoTipo
                                        ,rs.getString(3) // Nombre
                                        ,rs.getString(4) // Descripcion
                                        ,rs.getString(5) // Estado
                                        ,rs.getString(6) // FechaCrea
                                        ,rs.getString(7)); // FechaModifica
            }
        } catch (SQLException e) {
            throw new AAException(e.getMessage(), getClass().getName(), "readById()");
        }
        return s;
    }

    public Integer getRowCount() throws Exception{
        String query = " SELECT COUNT(*) TotalReg"
                     + " FROM Catalogo "
                     + " WHERE Estado = 'A'"
                     + " AND IdCatalogoTipo = 2"; // tipos de sexualidad
        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD : select * ...
            ResultSet rs = stmt.executeQuery(query); // ejecutar la
            while (rs.next()) {
                return rs.getInt(1);
            }
        }
        catch (SQLException e) {
            throw new AAException(e.getMessage(), getClass().getName(), "getRowCount()");
        }
        return 0;
    }
    
}
