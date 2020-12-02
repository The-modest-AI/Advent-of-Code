class Main extends ReadFile{
    /**
     * The method to carry the main tasks of AoC, December 2, 2020
     * @since 02-12-2020
     */
    public static void operations() {
        final var sum = 2020;   //The target which is to be checked
        for (int i = 0; i < getFirst().size(); i++) {
            for (int j = 0; j < getFirst().size(); j++) {
                for (int k = 0; k < getFirst().size(); k++) {
                    int sum1 = getFirst(i);        //Storing value of the ArrayList's particular index in a variable
                    int num2 = getFirst(j);
                    int num3 = getFirst(k);
                    if (sum1 + num2 + num3 == sum) {
                        System.out.println("The First number-> " + sum1 + "\nThe second number-> " + num2 + "\nThe third number-> " + num3);
                        int product = sum1 * num2 * num3;
                        System.out.println("The Product of the numbers which made '2020' as sum is-> " + product);  //Printing the product
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        //Calling the respective methods
        ReadFile.setFirst();
        operations();
        /* The program would terminate :(
         *Sed program noises*
         */
    }
}
