package hugeinteger;

public class HugeInteger {
	String str;
	HugeInteger(String s) {
		str = s; 
	}
	void input(String s) {
		str = s;
	}
	void output() {
		System.out.println(str);
	}
	void add(HugeInteger h) {
		int len1=str.length();
	    int len2=h.str.length();
	    int sum=0;
	    String result="";
	    while(len1>=1||len2>=1){
	    	if(len1>=1){
	    		sum += Integer.parseInt((str.substring(len1-1,len1)));
	    		len1--;
	            }
	        if(len2>=1){
	            sum += Integer.parseInt((h.str.substring(len2-1,len2)));
	            len2--;
	            }
	        if(sum>=10){
	            result += (sum-10)+"";
	            sum=1;
	            }
	        else {
	        	result += sum+"";
	            sum=0;
	           	}
	    }
	    if(sum==1){
	    	result="1"+result;
	       	}
	    this.str="";
	    for (int i = 0; i < result.length(); i++) {
	    	this.str += result.substring(result.length() - 1 - i, result.length() - i);
        }
	}
	boolean isEqualTo(HugeInteger h) {
		return str.equals(h.str);
	}
	boolean isNotEqualTo(HugeInteger h) {
		return !str.equals(h.str);
	}
	boolean isGreaterThan(HugeInteger h) {
		if (str.length() > h.str.length())
			return true;
		else {
			if (str.length() < h.str.length())
				return false;
			else {
				int k = str.compareTo(h.str);
				return (boolean)(k>0);
			}
		} 		
	}
	boolean isLessThan(HugeInteger h) {
		if (str.length() < h.str.length())
			return true;
		else {
			if (str.length() > h.str.length())
				return false;
			else {
				int k = str.compareTo(h.str);
				return (boolean)(k<0);
			}
		} 		
	}
	boolean isGreaterThanOrEqualTo(HugeInteger h) {
		if (str.length() > h.str.length())
			return true;
		else {
			if (str.length() > h.str.length())
				return false;
			else {
				int k = str.compareTo(h.str);
				return (boolean)(k>=0);
			}
		} 		
	}
	boolean isLessThanOrEqualTo(HugeInteger h) {
		if (str.length() < h.str.length())
			return true;
		else {
			if (str.length() > h.str.length())
				return false;
			else {
				int k = str.compareTo(h.str);
				return (boolean)(k<=0);
			}
		} 		
	}
}
