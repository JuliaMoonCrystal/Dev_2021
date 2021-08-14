package Finally;

import java.nio.file.AccessDeniedException;
import java.rmi.AccessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExemploFinally {
    public static void main(String[] args) {

        metodo();
    }

    private static void metodo() throws AccessException {
      try {
          PreparedStatement stmt = con.preparedStatement(query);
      }catch (SQLException e){
          throw new AccessException("Problema na criação do Statement");
      }finally {
          stmt.close();
      }

    }
}
