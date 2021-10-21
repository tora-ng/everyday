package inheritance;


class SuperCLS {
    protected static int count = 0;

    public SuperCLS() {
        count++;
        System.out.println("호출됨");
    }
}

//SubCLS obj3 = new SubCLS();
//obj3.showCount();
class SubCLS extends SuperCLS {	
	
	public SubCLS() {
		super();		
	} //컴파일러가 넣어준다. 생성자!!
	
	public void showCount() {
        System.out.println(count);
    }
}


class SuperCLSTest {
    public static void main(String[] args) {
    	   SuperCLS obj1 = new SuperCLS();
           SuperCLS obj2 = new SuperCLS();
           
           SubCLS obj3 = new SubCLS();
           obj3.showCount();
    	
    }
}
