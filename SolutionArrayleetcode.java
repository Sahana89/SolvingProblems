public class SolutionArrayleetcode {
	public int pivotIndex(int[] nums) {
        int index=-1,l=0,i=0,suml=0,sumr=0,count=0,j=0,k=0;
        l=nums.length;
        for(i=1;i<(l-1);i++)
        {
            count=i;
            for(j=count-1,k=count+1;((j>=0)&&(k<l));j--,k++)
            {
                suml=suml+nums[j];
                sumr=sumr+nums[k];
            }
            if(suml==sumr) 
            {
                index=i-1;
                break;
            }
            suml=0;
            sumr=0;
        }
        return index;
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			SolutionArrayleetcode s1=new SolutionArrayleetcode();
			int num[]= {1,2,3,4,5,6};
			int num1[]= {1,7,3,6,5,6};
			int num2[]= {-1,-1,-1};
			System.out.println(s1.pivotIndex(num2));
			}
}
