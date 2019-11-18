public class Loop {
    public static void main(String[] args) {
        String[] name = new String[]{"Ivan", "Petya", "Masha", "Olya", "Roman"};
        int[] age = new int[]{15, 23, 45, 22, 32};

        for(int i = 0; i < 5; ++i) {
            if (age[i] > 20) {
                System.out.println(name[i] + "-" + age[i] + "- старпер");
            } else {
                System.out.println(name[i] + "-" + age[i]);
            }
        }

        for(int j = 0; j < 5; ++j) {
            if (age[j] > 20) {
                System.out.println(name[j] + "-" + age[j] + "- старпер");
            } else {
                System.out.println(name[j] + "-" + age[j]);
            }
        }

    }

}
