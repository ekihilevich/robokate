public class Conditins {
        public static void main(String[] args) {


            String[] name = new String[]{"Валера", "Коля", "Маша", "Даша", "Толя", "Вася"};

            for (int i = 0; i < 6; i++){
                switch (name[i]) {
                    case "Валера":
                        System.out.println(name[i] + " привет");
                        break;
                    case "Коля":
                        System.out.println(name[i] + " пока");
                        break;
                    case "Маша":
                        System.out.println(name[i] + " как дела?");
                        break;
                    case "Даша":
                        System.out.println(name[i] + " не наша");
                        break;
                    case "Толя":
                        System.out.println(name[i] + " литр алкоголя");
                        break;
                    default:
                        System.out.println(name[i] + " ты кто?");
                        break;



            }
        }
    }
}
