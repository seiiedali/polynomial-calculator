package polyproject;

public class LinkedArr {
	private class Node {
		Poly data;
		Node next;
		public Node(Poly a){
			data = a;
			next = null;
		}
	}
	Node head;
	int size;
	public LinkedArr() {
		head = null;
		size = 0;
	}
	public void addEnd(Node in){
		if(head == null){
			head = in;
			size++;
			in.next = null;
		}
		else{
			Node pointer;
			//System.out.println(pointer.data.num);
			for(pointer = head ; pointer.next != null ; pointer = pointer.next);
			pointer.next = in;
			in.next = null;
			size++;

		}
	}
	public void checkAdd(Poly temp){
		Node pointer = head ; 
		boolean duplicate = false;
		if(head != null)
			while(pointer != null){
				if(pointer.data.xPow == temp.xPow && pointer.data.yPow == temp.yPow){
					pointer.data.num += temp.num;
					if(pointer.data.num > 0)
						pointer.data.sign = '+';
					else
						pointer.data.sign = '-';
					duplicate = true;
				}
				pointer = pointer.next;
			}
		if(!duplicate){
			Node myNode = new Node(temp);
			addEnd(myNode);
		}
	}
	public void multiply(LinkedArr multy) {
		LinkedArr temp = new LinkedArr();
		for(Node pointer = head ; pointer != null ; pointer = pointer.next){
			for(Node mulPoint = multy.head ; mulPoint != null ; mulPoint = mulPoint.next ){
				int x,y;double num;
				if(mulPoint.data.num !=0 ){
					num = mulPoint.data.num * pointer.data.num;
					x = mulPoint.data.xPow + pointer.data.xPow;
					y = mulPoint.data.yPow + pointer.data.yPow;
					Poly ans = new Poly(num, x, y);
					temp.checkAdd(ans);
				}
			}
		}
		this.head = temp.head;
		multy.head = null;
	}
	public void printList(){
		Node pointer = head;
		//int counter = 0;
		while(pointer != null){
			if(pointer.data.num == 0){
				pointer = pointer.next;
				//System.out.println("the zero happened!!!");   testing
				continue;
			}
			else if((pointer.data.num == 1 || pointer.data.num == -1) && 
					pointer.data.xPow == 0 && pointer.data.yPow == 0){
				System.out.print(" " + pointer.data.sign + " " + (int)Math.abs(pointer.data.num));
			}
			else if(pointer.data.num != 1 && pointer.data.num != -1){
				System.out.print(" " + pointer.data.sign + " " + (int)Math.abs(pointer.data.num));
			}
			else{
				System.out.print(" " + pointer.data.sign + " ");
			}
			if(pointer.data.xPow != 0){
				if(pointer.data.xPow == 1)
					System.out.print("(x)");
				else
					System.out.print("(x^" + pointer.data.xPow + ")");
			}
			if(pointer.data.yPow != 0){
				if(pointer.data.yPow == 1)
					System.out.print("(y)");
				else
					System.out.print("(y^" + pointer.data.yPow + ")");
			}
			
			pointer = pointer.next; //counter++;
		}
		
	}
}
