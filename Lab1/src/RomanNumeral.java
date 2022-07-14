public class RomanNumeral
{
	private int rom;
	public String romanNumeral;
	public RomanNumeral(int num)
	{
		rom = num;
	}
	// mutator method
	public void setNumber(int num)
	{
		num = rom;
	}
	
	//
	public int getNumber()
	{
		return rom;
	}
	public String convertNum()
	{
		if (rom == 1) {
			romanNumeral = "I";
			return romanNumeral;
		}
		else if (rom == 2) {
			romanNumeral = "II";
			return romanNumeral;
		}
		else if (rom == 3) {
			romanNumeral = "III";
			return romanNumeral;
		}
		else if (rom == 4) {
			romanNumeral = "IV";
			return romanNumeral;
		}
		else if (rom == 5) {
			romanNumeral = "V";
			return romanNumeral;
		}
		else if (rom ==6) {
			romanNumeral = "VI";
			return romanNumeral;
		}
		else if (rom == 7) {
			romanNumeral = "VII";
			return romanNumeral;
		}
		else if (rom == 8) {
			romanNumeral = "IIX";
			return romanNumeral;
		}
		else if (rom == 9) {
			romanNumeral = "IX";
			return romanNumeral;
		}
		else if (rom == 10) {
			romanNumeral = "X";
			return romanNumeral;
		}
		else {
			romanNumeral = "Please enter a valid number!";
			return romanNumeral;
		}	
	}
	
}
