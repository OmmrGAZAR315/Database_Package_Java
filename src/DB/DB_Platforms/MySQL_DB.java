package DB.DB_Platforms;
import DB.DB;

public class MySQL_DB extends DB {
    @Override
    public void setConnection(String className, String db_connection, String host, String port, String database, String username, String password) throws Exception {
        String url = db_connection + "://" + host + ":" + port + "/" + database;

        getDriverManager(className, url, username, password);
    }
}
