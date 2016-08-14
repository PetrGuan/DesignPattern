package factory;

public class OrcBlackSmith implements BlackSmith{
	
	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) 
	{
		// TODO Auto-generated method stub
		return new OrcWeapon(weaponType);
	}
	
}
