public class Hamming {

	public static Integer compute(String strand1, String strand2) {

		 char[] ncArr1 = strand1.toCharArray();
		 char[] ncArr2 = strand2.toCharArray();
		 
		 int l1 = ncArr1.length;
		 int l2 = ncArr2.length;
		 
		 int count=0;
		 
		 if (l1==l2){
			 
			 for (int i=0;i<l1;i++){
				 if(ncArr1[i] != ncArr2[i])
					 count++;
			 }
		 }
		 else{
			 
			throw new IllegalArgumentException("Sequences are not having equal length");
		 }
		 
		return count;
	}
}
