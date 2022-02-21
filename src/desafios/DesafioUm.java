package desafios;

public class DesafioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 createLadder(6);


    }

    public static String createLadder(int n) {
        int espaces;

        String asterisks = "*";

        String espace = " ";

        for (int i = 1; i <= n; i++) {
            espaces = n - i;
            System.out.println(espace.repeat(espaces) + asterisks.repeat(i));
        }
        return espace;
    }

    /*Test */
    public static String createTestUnitario(int n) {
        int espaces;

        String asterisks = "*";

        String espace = " ";

        for (int i = 1; i <= n; i++) {
            espaces = n - i;
            System.out.println(espace.repeat(espaces) + asterisks.repeat(i));
        }
        return espace;
    }
    /*       "     *\n" +
            "    **\n" +
            "   ***\n" +
            "  ****\n" +
            " *****\n" +
            "******";
            */



	}


