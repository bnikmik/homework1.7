public class Main {
    public static void main(String[] args) {
        String fullName = "Большаков Никита Михайлович";

        char element = ' ';
        int indexA = fullName.indexOf(element);
        int indexB = fullName.lastIndexOf(element);
        int indexC = fullName.length();


        String lastName = fullName.substring(0, indexA);
        String firstName = fullName.substring(indexA+1, indexB);
        String middleName = fullName.substring(indexB + 1, indexC);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        System.out.println(" ");

        char[] a = fullName.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (i==0) {
                System.out.print(Character.toUpperCase(a[i]));
            }
            else if (a[i]==' ') {
                i+=1;
                System.out.print(" " + Character.toUpperCase(a[i]));
            }
            else System.out.print(a[i]);
        }
        System.out.println();

        String firstS = "1357";
        String secondS = "2468";

        StringBuilder sbF = new StringBuilder(firstS);
        StringBuilder sbS = new StringBuilder(secondS);

        int sbLengthF = sbF.length();
        int sbLengthS = sbS.length();

        for (int i = 1, j=0; i < sbLengthF || j < sbLengthS; i+=2,j++) {
            sbF.insert(i,sbS.charAt(j));
        }
        System.out.println(sbF);

        System.out.println();

        String strVariantA = "aabccddefghhiijjkk";
        char[] d = strVariantA.toCharArray();
        for (int i = 0 , j=1; i < d.length && j <= d.length-1;  i++,j++) {
            if (d[i] == d[j]) {
                System.out.print(d[i]);
            }
        }
    }
}