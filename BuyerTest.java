//package day_10_22;
////reuse
////polymorphism
//
//class Product {
//	int price; // ��ǰ�� ����
//
//	Product(int price) {
//		this.price = price;
//	}
//	
//}
//
//class Tv extends Product {
//	Tv() {
//		super(100);
//	}
//
//	//println ��ü ������ toString �� ���� �Ǵ���.
//	@Override
//	public String toString() {
//		return "Tv";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		super(200);
//	}
//
//	public String toString() {
//		return "Computer";
//	}
//}
//
//class Audio extends Product {
//	Audio() {
//		super(50);
//	}
//
//	public String toString() {
//		return "Audio";
//	}
//}
//
///*
//������
//�ܾ��� �����Ͽ� �� �� ��� �����ϴ� Computer / .
//������ ����:Tv,Computer,Tv,Audio,Computer,Computer,
//����� �ݾ�:850
//���� �ݾ�:150
//*/
//
//class Buyer {
//	int money = 1000;
//	
//	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
//	int i = 0; // Product cart index �迭 �� ����
//
//	void buy(Product p) {
//		/*
//		 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
//		 * 1.1 . ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�
//		  
//		 * 1.2 ,
//		 * ���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ���� 1.3 .(add ) ��ٱ��Ͽ� ������ ������ ��´� �޼��� ȣ�� Java 3 - ��
//		 * ���� �� �������� Ǯ�� ��� 57
//		 */
//		if(money < p.price)	{
//			System.out.println("�ܾ��� �����Ͽ�" + p + "���� ��� �����ϴ�"); 
//			return;
//		}
//		
//		money = money - p.price;
//		add(p);
//		
//	}
//
//	void add(Product p ) {
//		/*
//		 * (2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
//		 *  1.1  i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
//		 *  1.1.1 2 . ������ ��ٱ��Ϻ��� 2��� ū ���ο� �迭�� �����Ѵ� 
//		 *  1.1.2 . ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ� 
//		 *  1.1.3 . ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴� 
//		 *  1.2 (cart) . i 1 . ������ ��ٱ��� �� �����Ѵ� �׸��� �� ���� ������Ų��
//		 */
//		if( cart.length <= i ) {			
//			Product[] temp = new Product[cart.length * 2]; 
//			//               
//			System.arraycopy(cart, 0, temp, 0, cart.length);
//			cart = temp;		
//		}
//		
//		cart[i] =p;
//		i++;
//		
//	}
//
//	void summary() {
//		/*
//		 * (3) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1.1 . ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ� 1.2 . ��ٱ��Ͽ� ���
//		 * ���ǵ��� ������ ��� ���ؼ� ����Ѵ� 1.3 (money) . ������ ��� ���� �ݾ� �� ����Ѵ�
//		 */
//		String itemList="";		
//		int sum=0;
//		
//		for (Product product : cart) {
//			itemList = itemList + product.toString();
//			sum = sum + product.price;
//		}
//		
//		//
//		System.out.println("������ ����" + itemList);
//		System.out.println("����� �ݾ�" + sum);
//		System.out.println("�����ݾ�" + money);	
//		
//	} 
//}
//
//public class BuyerTest {
//	
//	public static void main(String[] args) {
//		Buyer b = new Buyer();
//		
//		b.buy(new Tv());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		
//		b.summary();
//
//	}
//
//}
