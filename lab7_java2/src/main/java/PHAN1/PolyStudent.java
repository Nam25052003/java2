package PHAN1;


public class PolyStudent {
    public String fullname;
    public Career career;
    
    public void print(){
        System.out.println("> fullname: "+ this.fullname);
        
        switch (this.career) {
            case UDPM:
                System.out.println("> Career: ung dung phan mem");
                break;
            case TKTW:
                System.out.println("> Career: thiet ke trang web");
                break;
            case LTDĐ:
                System.out.println("> Career: lap trinh di dong");
                break;
            case TKĐH:
                System.out.println("> Career: thiet ke do hoa");
                break;      
            default:
                throw new AssertionError();
        }
    }
    
    public static void main(String[] args) {
        PolyStudent svpoly = new PolyStudent();
        svpoly.fullname = "ng van a";       
        svpoly.career = Career.valueOf("UDPM");
        svpoly.print();
    }
}
