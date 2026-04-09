class PassengerBogieSorter {

    // Method to perform Bubble Sort
    public static void sortCapacities(int[] capacities) {

        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Sample passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        display(capacities);

        // Perform Bubble Sort
        sortCapacities(capacities);

        System.out.println("After Sorting:");
        display(capacities);

        // Additional test cases

        int[] sortedArray = {24, 56, 60, 70, 72};
        sortCapacities(sortedArray);

        int[] duplicateArray = {72, 56, 56, 24};
        sortCapacities(duplicateArray);

        int[] singleElement = {50};
        sortCapacities(singleElement);

        int[] allEqual = {40, 40, 40};
        sortCapacities(allEqual);
    }
}