
public class Test {
    static class TwoNum{
        private int x;
        private int y;
        TwoNum()
        {
            this.x=0;
            this.y=0;
        }
        TwoNum(int x,int y)
        {
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
        void printData()
        {
            System.out.println("x=" + this.x + "," + "y=" + this.y);
        }
        int max(int a, int b)
        {
            if(a>b)
                return a;
            return b;
        }
        
    }
    static class Data{
        TwoNum n1;
        TwoNum n2;
        Data(int xn1,int yn1,int xn2,int yn2)
        {
            n1 = new TwoNum(xn1,yn1);
            n2 = new TwoNum(xn2,yn2);
        }
        
    }
    static class ThreeNum extends TwoNum{
        int z;
        ThreeNum(int x,int y,int z)
        {
            super(x,y);
            this.z=z;
        }
        @Override
        void printData()
        {
            System.out.println("x="+getX() + "," + "y=" + getY() + "," + "z=" + this.z);
        }
        int max(int a, int b, int c)
        {
            if(a>b && a>c)
                return a;
            if(b>a && b>c)
                return b;
            return c;
        }
    }
    public static void main(String[] args) {
        TwoNum A = new TwoNum(2,3);
        ThreeNum B = new ThreeNum(2,3,4);
        System.out.println(B.z);
        System.out.println(A.getX() % A.getY());
        A.printData();
        B.printData();
        System.out.println(A.max(4,6));
        System.out.println(B.max(6, 2, 9));
        Data d = new Data(3,6,8,2);
        System.out.println(d);
    }
    
}
