import java.util.Objects;
public class DBConn {
	private static DBConn instance;
	private DBConn() {}
	public static synchronized DBConn getInstance() {
		if (Objects.isNull(instance)) {
			instance = new DBConn();
		}
		return instance;
	}
}
