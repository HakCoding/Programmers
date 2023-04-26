class Solution {
    public int solution(int n, String control) {
       
         char[] arr = control.toCharArray();
         for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'w') n+=1;
			if(arr[i] == 's') n-=1;
			if(arr[i] == 'd') n+=10;
			if(arr[i] == 'a') n-=10;
		}       
        return n;
    }
}