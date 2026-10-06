
public class Main {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,5,6};
		int left = 0;
		int right=a.length-1;
		while(left<right){
			int t = a[left];
			a[left]=a[right];
			a[right]=t;
			right--;
			left++;
	}
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
}