public class Model {
    public static String name(String name) {
        return name;
    }

    public static String getGrade(int grade) {
        switch (grade / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "F";
            default:
                return "(fail)";
        }
    }
}