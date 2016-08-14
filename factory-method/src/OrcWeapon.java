package factory;

public class OrcWeapon implements Weapon{

	private WeaponType weaponType;
	
	public OrcWeapon(WeaponType weaponType)
	{
		this.weaponType = weaponType;
	}
	
	@Override
	public String toString() 
	{
	    return "Orcish " + weaponType;
	}
	
	@Override
	public WeaponType getWeaponType() 
	{
		// TODO Auto-generated method stub
		return weaponType;
	}
	
	
	
	
}
