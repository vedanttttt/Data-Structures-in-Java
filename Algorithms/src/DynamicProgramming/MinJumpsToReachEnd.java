package DynamicProgramming;

public class MinJumpsToReachEnd {

	public static int minJumps(int[] arr) {
		if(arr.length==0)
			return -1;
		
		int[] minJumps= new int[arr.length];
		minJumps[0]=0;
		for(int i=1;i<arr.length;i++) {
			minJumps[i]=Integer.MAX_VALUE;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=i+arr[i] && j<arr.length;j++) {
				minJumps[j]=Math.min(1+minJumps[i],minJumps[j]);
			}
		}
		
		return minJumps[arr.length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,1,3,2,1,2,1};
		System.out.println(MinJumpsToReachEnd.minJumps(arr));
	}

}
