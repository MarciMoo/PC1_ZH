import java.util.Objects;

    public class Waiter extends Chef{
        public void modifyPrice (String recipe, int price){
            for (String[] recipee : recipes){
                if (Objects.equals(recipee[0], recipe)) {
                    recipee[1] = Integer.toString(price);
                }
            }
        }
    }

