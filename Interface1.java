public interface Interface1 {
    public abstract void Show();
    }
    interface Interface2 {
        public abstract void Display();
    }
    class Test implements Interface1, Interface2{
        @Override
        public void Display() {
            System.out.println("This is Display Function ");
        }
        @Override
        public void Show() {
         System.out.println("This is Show Function ");
        }
        public static void main(String args []){
            Test obj = new Test();
            obj.Display();
            obj.Show();
        }
    }

