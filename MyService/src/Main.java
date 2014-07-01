import Services.CableService;
import Utils.CreatingUtil;
import Utils.DBSystemException;

/**
 * Created by javadev on 08.04.14.
 */
public class Main {
    public static void main(String[] args) throws DBSystemException {
        CableService c = new CableService();
        System.out.println(c.readServiceId());
    }
}
