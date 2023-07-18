package j2se.durshikshya.abstraction;

public class ProductDao extends AbstractDao{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("prodect saved to the database!");
		
	}

	@Override
	public void getOne() {
		// TODO Auto-generated method stub
		System.out.println("product fetched");
		
	}
	

}
