package j2se.durshikshya.abstraction;

public class App {
	public static void main(String[] args) {
		//AbstractDao dao = new AbstractDao();
		ProductDao pDao = new ProductDao();
		pDao.connect();
		pDao.save();
		pDao.getOne();
		pDao.disconnect();
	}

}
