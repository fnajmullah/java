public class Human {
    public static void main(String[] args) {
        try{
            throw new Sneeze();
        }catch (Sneeze s){
            System.out.println("Caught Sneeze fi");
        }
        catch (Annouyance a){
            System.out.println("Caught Annoyance fi");
        }

        try {
            throw new Sneeze();
        }catch (Annouyance a){
            System.out.println("Caught Annoyance");
        }

    }
}
