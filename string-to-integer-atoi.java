        string s = "9223372036854775809";
		char[] c = s.toCharArray();
		int num = 0;
		Boolean flag=true;
		if(c[0] == '-')
		{
			flag=false;
			num+=1;
		}
		else if(c[0] == '+')
		{
//			flag=true;
			num+=1;
		}
//		else if(c[0] > '9' || c[0] < '0')
//		else {
////			num += pow(10, c.length) * (c[0] - '0');
//		}
//		ArrayList<Integer> a=new ArrayList<Integer>();
		long result=0;
		for(int i = num; i < c.length; i++)
		{
			if(c[i] >= '0' && c[i] <= '9')
			{
				result*=10;
				result+=c[i] - '0';
				
				if(result>0x7fffffff)
					break;
//				a.add(c[i] - '0');
			}
			else {
				break;
			}
		}
		if(!flag)
			result*=-1;
		if(result <= 0x7fffffff)
		{
			
		}
		else {
			result=0x7fffffff;
		}
