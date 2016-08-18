package abstract_factory;

public interface KingdomFactory {
	public Castle createCastle();
	public King createKing();
	public Army createArmy();
}
