package variable;

public class TypeChange2 {

	public static void main(String[] args) {
		char charValue = 'a';
		int intValue;
		
		intValue = charValue;
		//intVal;ue = (int)charValue;
		
		charValue = '¿©';
		charValue = '!';
		intValue = charValue; 
				
				
		System.out.println(charValue);
		System.out.println(intValue);
		
		byte byValue = Byte.MAX_VALUE;
		short shValue = Short.MAX_VALUE;
		int inValue = Integer.MAX_VALUE;
		long loValue = Long.MAX_VALUE;
		
		System.out.println(byValue);
		System.out.println(shValue);
		System.out.println(inValue);
		System.out.println(loValue);
		 
		short s = byValue;
		int i = shValue;
		long l = inValue;
		
		byte b = (byte)shValue;
		System.out.println(b);
		short s2 = (short)inValue;
		System.out.println(s2);
		int i2 = (int)loValue;
		System.out.println(i2);
		

	}

}
