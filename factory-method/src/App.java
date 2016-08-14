package factory;

/**
 * 
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * This is done by creating objects via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived classes—rather than by calling a constructor.
 * <p>
 * In this Factory Method example we have an interface ({@link BlackSmith}) with a method for
 * creating objects ({@link BlackSmith#manufactureWeapon}). The concrete subclasses (
 * {@link OrcBlackSmith}, {@link ElfBlackSmith}) then override the method to produce objects of
 * their liking.
 * 
 */

public class App {

	  private final BlackSmith blacksmith;
	  
	  /**
	   * Creates an instance of <code>App</code> which will use <code>blacksmith</code> to manufacture 
	   * the weapons for war.
	   * <code>App</code> is unaware which concrete implementation of {@link Blacksmith} it is using.
	   * The decision of which blacksmith implementation to use may depend on configuration, or
	   * the type of rival in war.
	   * @param blacksmith a non-null implementation of blacksmith
	   */
	  public App(BlackSmith blacksmith) 
	  {
	    this.blacksmith = blacksmith;
	  }
	  
	  /**
	   * Program entry point
	   * 
	   * @param args command line args
	   */
	  public static void main(String[] args) 
	  {
	    // Lets go to war with Orc weapons
	    App app = new App(new OrcBlackSmith());
	    app.manufactureWeapons();
	    
	    // Lets go to war with Elf weapons
	    app = new App(new ElfBlackSmith());
	    app.manufactureWeapons();
	  }
	  
	  private void manufactureWeapons() 
	  {
	    Weapon weapon;
	    weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
	    System.out.println(weapon);
	    weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
	    System.out.println(weapon);
	  }
	}
