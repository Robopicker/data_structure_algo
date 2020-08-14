package samsungquestion;

import java.util.Scanner;

class Queue3{
	int f, r;
	Node1 Q[]=new Node1[55*55];
	
	void push(Node1 node){
		Q[r++] = node;
	}
	
	Node1 pop(){
		return Q[f++];
	}
	
	boolean empty(){
		return f==r;
	}
}

class Node1{
	int x;
	int y;
	Node1(){
		x=0;y=0;
	}
	Node1(int x,int y){
		this.x=x;
		this.y=y;
	}
}


public class pipes {
	
	static int up[] = { 0, 1, 1, 0, 1, 0, 0, 1 };
	static int down[] = { 0, 1, 1, 0, 0, 1, 1, 0 }; 
	static int left[] = { 0, 1, 0, 1, 0, 0, 1, 1 };
	static int right[] = { 0, 1, 0, 1, 1, 1, 0, 0 };
	
	static int N, M, X, Y, D;	
	
	static int mat[][] = new int[55][55];
	static int vmat[][] = new int[55][55];
	static int dist[][] = new int[55][55];	
 
	static Queue3 queue1 = new Queue3();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			N = sc.nextInt();
			M = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
			D = sc.nextInt();
			
			for(int i=0;i<55;i++){
				for(int j=0;j<55;j++){
					mat[i][j]=0;
					vmat[i][j]=0;
					dist[i][j]=0;
				}
			}
			
			for (int i = 0; i < N; ++i) 
				for (int j = 0; j < M; ++j)
					mat[i][j] = sc.nextInt();
			
			if(mat[X][Y]==0)
				System.out.println("0");
			
			else{
				bfs(X,Y);
				
				int cnt = 0;
				for(int i=0;i<N;i++){
					for(int j=0;j<M;j++){
						if(dist[i][j] != 0 && dist[i][j] <= D){
							++cnt;
						}
					}
				}		
				System.out.println(cnt);
			}
		}
	}
	
	static void visit(int x1, int y1, int x2, int y2){
		dist[x2][y2] = dist[x1][y1] + 1;
		vmat[x2][y2] = 1;
		queue1.push(new Node1(x2,y2));
	}
	
	static void bfs(int ex,int ey){
		visit(ex,ey,ex,ey);
		while(!queue1.empty()){
			Node1 p = queue1.pop();
			int x = p.x, y = p.y;
			
			//go left
			if(x-1 >= 0 && up[mat[x][y]] == 1 && down[mat[x-1][y]]==1 && vmat[x-1][y]==0){
				visit(x,y,x-1,y);
			}
			
			//go right
			if(x+1 < N  && down[mat[x][y]] == 1 && up[mat[x+1][y]]==1 && vmat[x+1][y]==0){
				visit(x,y,x+1,y);
			}
			
			//go up
			if(y-1 >= 0 && left[mat[x][y]] == 1 && right[mat[x][y-1]]==1 && vmat[x][y-1]==0){
				visit(x,y,x,y-1);
			}
			
			//go down
			if(y+1 < M && right[mat[x][y]] == 1 && left[mat[x][y+1]]==1 && vmat[x][y+1]==0){
				visit(x,y,x,y+1);
			}
		}
	}
}