package factory;

public class ElfBlackSmith implements BlackSmith{

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) 
	{
		// TODO Auto-generated method stub
		return new ElfWeapon(weaponType);
	}
	
}
