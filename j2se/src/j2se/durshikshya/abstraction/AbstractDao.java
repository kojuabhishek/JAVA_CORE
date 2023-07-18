package j2se.durshikshya.abstraction;

public abstract  class AbstractDao implements DAO {
	 
		public void connect() {
			System.out.println("Connected to the database");
		}
		public void disconnect() {
			System.out.println("Disconnected from the database");
		}
		
		public abstract void save();
		public abstract void getOne();
}
