import java.util.Scanner;

public class Main_Enum 
{
	public static TBoja StringToBoja(String s)
	{
		TBoja boja;
		
		switch(s.toLowerCase())
		{
		case "bela":
			boja = TBoja.BELA;
			break;
		
		case "crna":
			boja = TBoja.CRNA;
			break;
		
		default:
			System.out.println("Los unos. Kraj programa!");
			System.exit(1);
		
			boja = TBoja.BELA;
			break;
		
		}
		return boja;
	}
	

	public static void main(String[] args) 
	{
		TBoja boja;
		String sboja;
		
		Scanner in = new Scanner(System.in);
		sboja = in.next();
		
		boja = StringToBoja(sboja);
		in.close();
		
		System.out.println("Izabrana boja je : " + boja);

	}

}
