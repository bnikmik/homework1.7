public class Main {
    public static void main(String[] args) {
        String fullName = "алена Владимировна большакова";

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
    }
}