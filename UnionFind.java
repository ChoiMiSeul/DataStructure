package gonari;

import gonari.Node;

public class UnionFind {//�θ� ã�� ��ġ�� ��
	protected Node[] node; 
	public UnionFind(Node[] arrayname) { 
		node=arrayname;
	}
	//set�ߺ������ʴ°���. �ؽü�. 
	protected int find(int num) { //��� i���� ���� ��Ʈ���� ���ִ̹ٽ�
		if(num!=node[num].getParent()) // �ٸ����������ٵ�?
			node[num].setParent(find(node[num].getParent())); //��λ��� �� ��尡 ����� �θ� �ǵ���
		return node[num].getParent(); //��� ��Ʈ���� �����
	} // ��λ��� ��� ���鿡 ���� �θ��带 ��Ʈ�� �����ϴ� ��� ���� ����
	public void union(int i, int j) {
		int iroot=find(i);
		int jroot=find(j); //�θ�ã��
		if(iroot==jroot) return;
		
		if (node[iroot].getRank()>node[jroot].getRank())
			node[jroot].setParent(iroot);
		else if (node[iroot].getRank()<node[jroot].getRank())
			node[iroot].setParent(jroot);
		else {
			node[jroot].setParent(iroot);
			int r=node[iroot].getRank()+1;
			node[iroot].setRank(r);
		}
	}
	
	public static void main(String[] args) {
		int N=10;
		Node[] nodearray=new Node[N]; 
		
		for(int i=0;i<N;i++) {//��ȣ . i�� �ڱ� �ڽ��� ��(�θ� ã�� ����)
			nodearray[i]=new Node(i,0); //����� ��
		}
		UnionFind UnionFind=new UnionFind(nodearray); //��ü ����
		
		UnionFind.union(2, 1); UnionFind.union(2, 6);
		UnionFind.union(7, 3); UnionFind.union(4, 5);
		UnionFind.union(9, 5); UnionFind.union(7, 2);
		UnionFind.union(7, 8); UnionFind.union(0, 4);
	}
}