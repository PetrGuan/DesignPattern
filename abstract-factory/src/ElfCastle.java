package abstract_factory;

public class ElfCastle implements Castle{
	static final String DESCRIPTION = "This is the Elven castle!";

	@Override
	public String getDescription() {
	  return DESCRIPTION;
	}
}
