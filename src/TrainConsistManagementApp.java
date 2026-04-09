public class TrainConsistManagementApp {


    public static boolean searchBogie(String[] bogieIds, String searchKey) {


        for (int i = 0; i < bogieIds.length; i++) {


            if (bogieIds[i].equals(searchKey)) {
                System.out.println("✅ Bogie ID " + searchKey + " found at position " + i);
                return true;
            }
        }

        // If not found
        System.out.println("❌ Bogie ID " + searchKey + " not found.");
        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        searchBogie(bogieIds, "BG309");

        searchBogie(bogieIds, "BG999");

        searchBogie(bogieIds, "BG101");

        searchBogie(bogieIds, "BG550");

        String[] single = {"BG101"};
        searchBogie(single, "BG101");
    }
}