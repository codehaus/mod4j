import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class TemplateUtils {

	public static String timestamp() {
		Date now = new Date(System.currentTimeMillis());
		return now.toString();
	}
}
