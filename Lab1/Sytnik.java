/**
 * This class demonstrates first java application
 * @author Artem Sytnik a.sytnik@student.csn.khai.edu
 * @version 1.0
 * @since 2020-10-20
 */
public class Sytnik {
    /**
     * This method demonstrates short student information
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Group: 545 a");
        System.out.println("Sytnik Artem Valerievich");
        System.out.println("Variant 12");
        String[] array = {
                "  *****          ****         **          **",
                " **   **        ******        **          **",
                "**              **  **         **        **",
                " **            **    **        **        **",
                "  **           **    **         **      **",
                "   **         **      **        **      **",
                "    **        **********         **    **",
                "     **      ************        **    **",
                "      **     **        **         **  **",
                "**   **     **          **        ******",
                " *****      **          **         ****"
        };
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}