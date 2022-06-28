public class Home1 {
    public static void main(String[] args) {
        int a = -115;
        if (a>0) {
            System.out.println("a more then 0");
        }
        if (a<0) {
            System.out.println("a less then 0");
        }
        if (a>0&&a<9) {
            System.out.println("a is one symbol");
        }
        if (a>9&&a<99) {
            System.out.println("a is two symbol");
        }
        if (a>99&&a<999) {
            System.out.println("a is three symbol");
        }
        if (a>999&&a<9999) {
            System.out.println("a is four symbol");
        }
        if (a<0&&a>-9) {
            System.out.println("a is one symbol");
        }
        if (a<-9&&a>-99) {
            System.out.println("a is two symbol");
        }
        if (a<-99&&a>-999) {
            System.out.println("a is three symbol");
        }
        if (a<-999&&a>-9999) {
            System.out.println("a is four symbol");
        }


    }


}
