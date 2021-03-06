package phokemon;
/**
 * @version 5-15-17
 * @author Rishabh
 *
 */
public class Grass implements PhokeType{
	@Override
	public String toString() {
		return "grass";
	}

	@Override
	public boolean isSuperEffective(PhokeType op) {
		return op.toString().equals("fire") || op.toString().equals("flying");
	}

	@Override
	public boolean isNotEffective(PhokeType op) {
		return  op.toString().equals("water") || op.toString().equals("electric");
	}
}


